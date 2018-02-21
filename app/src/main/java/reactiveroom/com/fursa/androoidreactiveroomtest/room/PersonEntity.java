package reactiveroom.com.fursa.androoidreactiveroomtest.room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Person")
public class PersonEntity {
    @ColumnInfo(name = "personId")
    @PrimaryKey(autoGenerate = true)
    private int personId;
    @ColumnInfo(name = "personName")
    private String personName;
    @ColumnInfo(name = "personAge")
    private int personAge;

    public PersonEntity(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", personAge=" + personAge +
                '}';
    }
}
