package hbcu.stay.ready.baronsfarm.animaltest;

import hbcu.stay.ready.baronsfarm.animal.Chicken;
import hbcu.stay.ready.baronsfarm.edible.Edible;
import hbcu.stay.ready.baronsfarm.edible.EdibleEgg;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    @Test
    public void makeNoiseTest(){

        //Given
        Chicken chicken = new Chicken();

        //When
        String expected = "Cukaw";
        String actual = chicken.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        //Given
        Chicken chicken = new Chicken();
        Edible edible = new Edible();

        //When
        String expected = "Chicken just ate an Edible, and is now high >_<";
        String actual = chicken.eat(edible);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testYield(){ //Test is failing for assertion error, not sure why
        //Given
        Chicken chicken = new Chicken();

        //When
        EdibleEgg edibleEgg = chicken.yield();

        //Then
        Assert.assertNotNull(edibleEgg);

    }
}
