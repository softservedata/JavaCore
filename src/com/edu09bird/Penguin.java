package com.edu09bird;

public class Penguin extends NonFlyingBird{

    public Penguin() {
        super(false);
        //super(true);
    }

    public int getMaxSpeed() {
        return 70;
    }

    @Override
    public String toString() {
        return "\nI am Penguin,  " + super.toString();
    }
    
}