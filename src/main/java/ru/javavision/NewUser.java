package ru.javavision;

import java.io.Serializable;

public class NewUser implements Serializable {
    private static String stateNumber;
    private static String driver_license;
    private static String owner;
    private static String auto;

    public NewUser() {
    }

    public NewUser(String stateNumber, String driver_license, String owner, String auto){
        this.stateNumber = stateNumber;
        this.driver_license = driver_license;
        this.owner = owner;
        this.auto = auto;

    }

    public static String getStateNumber() {
        return stateNumber;
    }

    public static void setStateNumber(String stateNumber) {
        NewUser.stateNumber = stateNumber;
    }

    public static String getDriver_license() {
        return driver_license;
    }

    public static void setDriver_license(String driver_license) {
        NewUser.driver_license = driver_license;
    }

    public static String getOwner() {
        return owner;
    }

    public static void setOwner(String owner) {
        NewUser.owner = owner;
    }

    public static String getAuto() {
        return auto;
    }

    public static void setAuto(String auto) {
        NewUser.auto = auto;
    }


}
