package com.upgrad.course.juice;

import com.upgrad.course.fruit.Banana;

public class BananaJuice {
    private Banana banana;

    // TODO: inject Banana dependency via constructor

    public String get() {
        return "Juice prepared using - " + this.banana;
    }
}
