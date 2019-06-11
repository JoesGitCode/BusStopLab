import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus(3, "Gala");
        person = new Person();
        busStop = new BusStop();
    }

    @Test
    public void aBusHasACapacity(){
        assertEquals(3, bus.getCapacity());
    }

    @Test
    public void aBusStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void aBusCanPickUpAPassenger(){
        busStop.addPersonToQueue(person);
        bus.jumpOn(busStop);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void aFullBusCantTakeNewPassengers(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        bus.jumpOn(busStop);
        bus.jumpOn(busStop);
        bus.jumpOn(busStop);
        bus.jumpOn(busStop);
        assertEquals(3, bus.passengerCount());
    }
}



