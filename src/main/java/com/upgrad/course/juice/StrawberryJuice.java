package com.upgrad.course.juice;

import com.upgrad.course.fruit.Strawberry;

public class StrawberryJuice {
    private Strawberry strawberry;

    // TODO: inject Strawberry dependency via setter

    public String get() {
        return "Juice prepared using - " + this.strawberry;
    }
}
