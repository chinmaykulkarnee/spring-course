package com.upgrad.course.juice;

import com.upgrad.course.fruit.Banana;

public class BananaJuice implements Juice {
    private Banana banana;

    // TODO: inject Banana dependency via setter

    @Override
    public String get() {
        return "Juice prepared using - " + this.banana;
    }
}
