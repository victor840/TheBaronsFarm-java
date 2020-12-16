package hbcu.stay.ready.baronsfarm.edibletest;

import hbcu.stay.ready.baronsfarm.edible.Tomato;
import hbcu.stay.ready.baronsfarm.edible.TomatoPlant;
import org.junit.Test;

public class TomatoPlantTest {
    @Test
    public void testYield(){
        //Given
        TomatoPlant tomatoPlant = new TomatoPlant();

        //When
        tomatoPlant.getHasBeenFertilized();
        tomatoPlant.getHasBeenHarvested();
        Tomato tomato = tomatoPlant.yield();

    }
}
