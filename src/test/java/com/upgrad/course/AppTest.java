package com.upgrad.course;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    App underTest = new App();

    @Test
    public void shouldGetOrangeJuice() {
        Assert.assertTrue(underTest.getOrangeJuice().contains("Orange"));
    }

    @Test
    public void shouldGetStrawberryJuice() {
        System.out.println(underTest.getStrawberryJuice());
        Assert.assertTrue(underTest.getStrawberryJuice().contains("Strawberry"));
    }

    @Test
    public void shouldGetBananaJuice() {
        Assert.assertTrue(underTest.getBananaJuice().contains("Banana"));
    }
}
