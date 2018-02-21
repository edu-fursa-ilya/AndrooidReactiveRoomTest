package reactiveroom.com.fursa.androoidreactiveroomtest.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by Fursa Ilya on 21.02.2018.
 */
@Dao
public interface PersonDAO {

    @Insert
    void insert(PersonEntity person);

    @Query("SELECT * FROM Person")
    Flowable<List<PersonEntity>> selectAll();
}
