package country;

/**
 * Created by Shoma on 03.05.2017.
 */
public class House implements Cloneable {
    int peopleCount;

    public House(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }
    public House clone() throws CloneNotSupportedException {
        return (House) super.clone();
    }
}
