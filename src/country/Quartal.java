package country;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Shoma on 03.05.2017.
 */
public class Quartal implements Cloneable {
    public int countPeople;
    List<House> houses;

    public Quartal() throws CloneNotSupportedException {
        this.houses = new ArrayList<>();
        Random random = new Random();
        House house1 = new House(random.nextInt(7));
        House house2 = house1.clone();
          house2.setPeopleCount(random.nextInt(7));
        House house3 = house1.clone();
        house3.setPeopleCount(random.nextInt(7));
        House house4 = house1.clone();
        house4.setPeopleCount(random.nextInt(7));
          houses.add(house1);
          houses.add(house2);
          houses.add(house3);
          houses.add(house4);
        for (int i = 0; i < houses.size(); i++) {
            this.countPeople+=houses.get(i).getPeopleCount();
        }


    }

    public Object clone() throws CloneNotSupportedException {
        List<House> temp = new ArrayList<>();
        int countP = 0;
        for (House s : this.houses) {
            temp.add(s);
            countP += s.getPeopleCount();
        }
        this.countPeople = getCountPeople();
        Quartal q = new Quartal();
        q.setHouses(temp);
        q.setCountPeople(countP);
        return q;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public int getCountPeople() {
        for (int i = 0; i < houses.size(); i++) {
            countPeople += houses.get(i).getPeopleCount();
        }
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

}
