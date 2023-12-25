package org.example;
//import java.lang.String;
public class Car {

    /*private int doors;
    private String driver;
    public int speed;
    // get and set
    public int getdoors(int doors){
        return doors;
    }
    */

    // constructor


    private String doors;
    private String engine;
    private String driver;
    private int speed;

    public Car(){
        doors="Closed";
        engine="on";
        driver="seated";
        speed=100;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        //this.doors = doors;
        doors=doors;
    }


    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        //this.engine = engine;
        engine=engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        //this.driver = driver;
        driver=driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String run(){
        if(doors.equals("closed") && engine.equals("on")
                && driver.equals("seated") && speed >0	){
            return "running";
        }else{
            return "not running";
        }
    }



}
