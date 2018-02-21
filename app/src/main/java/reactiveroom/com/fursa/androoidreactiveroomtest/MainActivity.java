package reactiveroom.com.fursa.androoidreactiveroomtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import reactiveroom.com.fursa.androoidreactiveroomtest.room.PersonEntity;

public class MainActivity extends AppCompatActivity {
    private Button btnNewPerson;
    private Button btnSelectAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewPerson = (Button) findViewById(R.id.btnAddPerson);
        btnSelectAll = (Button) findViewById(R.id.btnSelectAll);

        btnNewPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RoomApplication.getDAO().insert(new PersonEntity("Test person", 3290));
            }
        });

        btnSelectAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectAll();
            }
        });
    }

    private void selectAll() {
        RoomApplication.getDAO().insert(new PersonEntity("Alex Dee", 30));
        Flowable<List<PersonEntity>> personEntityList = RoomApplication.getDAO().selectAll();
        personEntityList.forEach(new Consumer<List<PersonEntity>>() {
            @Override
            public void accept(List<PersonEntity> personEntities) throws Exception {
                for (PersonEntity entity: personEntities) {
                    Log.d(MainActivity.class.getSimpleName(), entity.getPersonName());
                }
            }
        });
    }
}
