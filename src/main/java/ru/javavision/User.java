package ru.javavision;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;


@ToString
@EqualsAndHashCode
public class User implements Serializable {
//    public final String stateNumber;
//    public final String driver_license;
//    public final int id;
//
//    public User(String stateNumber, String driver_license, int id){
//        this.stateNumber = stateNumber;
//        this.driver_license = driver_license;
//        this.id = id;
//    }
//
//    public int getID(){return id;}

    private String state_number;
    private String driver_license;
    private int id;

    public User() {

    }

    public User(String state_number, String driver_license, int id) {
        this.state_number = state_number;
        this.driver_license = driver_license;
        this.id = id;
    }

    public String getState_number() {
        return state_number;
    }

    public void setState_number(String state_number) {
        this.state_number = state_number;
    }

    public String getDriver_license() {
        return driver_license;
    }

    public void setDriver_license(String driver_license) {
        this.driver_license = driver_license;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getID(){return id;}
}
