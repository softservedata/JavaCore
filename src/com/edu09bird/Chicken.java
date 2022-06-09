package com.edu09bird;

public class Chicken extends NonFlyingBird {

    public Chicken() {
        super(true);
    }

    public int getMaxSpeed() {
        return 20;
    }

    @Override
    public String toString() {
        return "\nI am Chicken,  " + super.toString();
    }

}