package hbcu.stay.ready.baronsfarm.animaltest;

import hbcu.stay.ready.baronsfarm.animal.Horse;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {
    @Test
    public void makeNoiseTest(){
        //Given
        Horse horse = new Horse();

        //When
        String expected = "**Neighhhhh**";
        String actual = horse.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);

    }
}
