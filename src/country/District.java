package country;

import java.util.List;
import java.util.Random;

/**
 * Created by Shoma on 03.05.2017.
 */
public class District implements Cloneable{
    public int peopleCount;
List<Quartal> quartals;
    int balance;



    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public List<Quartal> getQuartals() {
        return quartals;
    }

    public void setQuartals(List<Quartal> quartals) {
        this.quartals = quartals;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
