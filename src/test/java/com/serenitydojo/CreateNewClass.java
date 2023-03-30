package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class CreateNewClass {
    @Test

    public void createDogClass(){
        String name;
        String favtoy;
        int age = 2;


        Dog alex = new Dog("Alex", favtoy = "Ball", age = 2);


        Assert.assertEquals(alex.getname(), "Alex");
        Assert.assertEquals(alex.getFavtoy(), "Ball");
        Assert.assertEquals(alex.getAge(), 2);


    }
}
