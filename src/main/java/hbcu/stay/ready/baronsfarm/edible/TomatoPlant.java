package hbcu.stay.ready.baronsfarm.edible;

import hbcu.stay.ready.baronsfarm.Crop;

public class TomatoPlant extends Crop {
    @Override
    public Tomato yield() {
        if((hasBeenHarvested && hasBeenFertilized) == true){
            Tomato tomato = new Tomato();
            return tomato;
        }
        return null;
    }

    @Override
    public void setHasBeenFertilized() {
        hasBeenFertilized = true;
    }

    @Override
    public void setHasBeenHarvested() {
        hasBeenHarvested = true;
    }

    @Override
    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    @Override
    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }
}
