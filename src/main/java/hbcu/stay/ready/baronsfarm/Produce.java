package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.edible.Edible;

public abstract class Produce {

    protected boolean hasBeenFertilized = false;
    protected boolean hasBeenHarvested = false;

    public abstract Edible yield();
    public abstract void setHasBeenFertilized();
    public abstract void setHasBeenHarvested();

    public abstract Boolean getHasBeenFertilized();
    public abstract Boolean getHasBeenHarvested();
}
