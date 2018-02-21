package reactiveroom.com.fursa.androoidreactiveroomtest;

import android.app.Application;
import android.arch.persistence.room.Room;

import reactiveroom.com.fursa.androoidreactiveroomtest.room.PersonDAO;
import reactiveroom.com.fursa.androoidreactiveroomtest.room.PersonDatabase;

/**
 * Created by Fursa Ilya on 21.02.2018.
 */

public class RoomApplication extends Application {

    private static PersonDatabase sPersonDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        sPersonDatabase = Room
                .databaseBuilder(getApplicationContext(), PersonDatabase.class, "person.db")
                .allowMainThreadQueries()
                .build();
    }

    public static PersonDAO getDAO() {
       return sPersonDatabase.getPersonDAO();
    }
}
