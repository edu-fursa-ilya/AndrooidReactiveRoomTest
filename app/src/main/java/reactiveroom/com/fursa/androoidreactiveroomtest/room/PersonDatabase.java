package reactiveroom.com.fursa.androoidreactiveroomtest.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Fursa Ilya on 21.02.2018.
 */
@Database(entities = {PersonEntity.class}, version = 1)
public abstract class PersonDatabase extends RoomDatabase {
    public abstract PersonDAO getPersonDAO();
}
