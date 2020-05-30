package com.upgrad.course.bakery;

import com.upgrad.course.inventory.BreadInventory;
import com.upgrad.course.inventory.CakeInventory;

public class OnlineBakery {

    private BreadInventory breadInventory;
    private CakeInventory cakeInventory;

    // TODO: define constructor which takes CakeInventory as an argument
    public OnlineBakery(CakeInventory cakeInventory) {
        this.cakeInventory = cakeInventory;
    }

    // TODO: define setter for BreadInventory
    public void setBreadInventory(BreadInventory breadInventory) {
        this.breadInventory = breadInventory;
    }

    public int getBreadsRemaining() {

        // TODO: call getTotal method of BreadInventory class
        return breadInventory.getTotal();
    }

    public int getCakesRemaining() {

        // TODO: call getTotal method of CakeInventory class
        return cakeInventory.getTotal();
    }
}
