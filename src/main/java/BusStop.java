import java.util.ArrayList;

public class BusStop {

    private ArrayList<Person> queue;

    public BusStop(){
        this.queue = new ArrayList<Person>();
    }

    public void addPersonToQueue(Person person){
        this.queue.add(person);
    }

    public int queueCount(){
        return this.queue.size();
    }

    public Person removePerson(){
        return this.queue.remove(0);
    }

}
