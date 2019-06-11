import java.util.ArrayList;

public class Bus {

    private ArrayList<Person> passengers;
    private int capacity;
    private String destination;

    public Bus(int capacity, String destination){
        this.capacity = capacity;
        this.destination = destination;
        this.passengers = new ArrayList<Person>();


    }

    public int getCapacity(){
        return this.capacity;
    }


    public int passengerCount() {
        return this.passengers.size();

    }

    public void jumpOn(BusStop busStop) {
        Person person = busStop.removePerson();
        if(this.passengerCount() < this.capacity){
            this.passengers.add(person);
        }
    }
}
