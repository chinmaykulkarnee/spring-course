package com.upgrad.course.juice;

import com.upgrad.course.fruit.Orange;

public class OrangeJuice {
    private Orange orange;

    // TODO: inject Orange dependency via setter

    public String get() {
        return "Juice prepared using - " + this.orange;
    }
}
