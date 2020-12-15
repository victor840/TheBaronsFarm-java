package hbcu.stay.ready.baronsfarm.animal;

import hbcu.stay.ready.baronsfarm.Produce;
import hbcu.stay.ready.baronsfarm.edible.Edible;
import hbcu.stay.ready.baronsfarm.edible.EdibleEgg;


public class Chicken extends Produce implements Animal {

    public void setHasBeenFertilized() {
    hasBeenFertilized = false;
    }

    public void setHasBeenHarvested() {
    hasBeenHarvested = true;
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public EdibleEgg yield() {
        if((hasBeenFertilized) == false && (hasBeenHarvested) == true){
            EdibleEgg egg = new EdibleEgg();
            System.out.println("Yum! this Egg is edible :-)");
            return egg;
        }

        return null;
    }

    public String makeNoise(){
        return "Cukaw";
    }

    @Override
    public String eat(Edible edible) {
        String msg = "";
        if(edible!=null){
            msg += "Chicken just ate an Edible, and is now high >_<";
        }
        return msg;
    }
}
