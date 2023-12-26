package org.example;

public class Bike {

    private String handle;

    public Bike() {
        handle = "Short";
    }

    public Bike(String engine, int wheels, int seats, int fuelTank, String lights, String handle) {
        super(
        );
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    //@Override
    public String run(){
        return "Running bike";
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' +
                "} " + super.toString();
    }
}
