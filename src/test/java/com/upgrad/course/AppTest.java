package com.upgrad.course;

import com.upgrad.course.bakery.OnlineBakery;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    App underTest = new App();

    @Test
    public void shouldInitializeOnlineBakeryUsingXMLBasedDI() {
        Assert.assertNotNull(underTest.setUpOnlineBakery());
    }

    @Test
    public void shouldInitializeOnlineBakeryWithBreadInventory() {
        OnlineBakery onlineBakery = underTest.setUpOnlineBakery();
        Assert.assertEquals(50, onlineBakery.getBreadsRemaining());
    }

    @Test
    public void shouldInitializeOnlineBakeryWithCakeInventory() {
        OnlineBakery onlineBakery = underTest.setUpOnlineBakery();
        Assert.assertEquals(10, onlineBakery.getCakesRemaining());
    }
}
