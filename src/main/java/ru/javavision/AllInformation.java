package ru.javavision;

public class AllInformation {
    private static String stateNumber;
    private static String driver_license;
    private static String owner;
    private static String auto;
    private static String InsuranceNow;
    private static int id;

    public AllInformation() {

    }

    public AllInformation(String stateNumber, String driver_license, String owner, String auto, String InsuranceNow, int id){
        this.stateNumber = stateNumber;
        this.driver_license = driver_license;
        this.owner = owner;
        this.auto = auto;
        this.InsuranceNow = InsuranceNow;
        this.id = id;
    }

    public AllInformation(String state_number, String driver_license, String owner, String auto, String ins) {

    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        AllInformation.id = id;
    }

    public static String getStateNumber() {
        return stateNumber;
    }

    public static void setStateNumber(String stateNumber) {
        AllInformation.stateNumber = stateNumber;
    }

    public static String getDriver_license() {
        return driver_license;
    }

    public static void setDriver_license(String driver_license) {
        AllInformation.driver_license = driver_license;
    }

    public static String getOwner() {
        return owner;
    }

    public static void setOwner(String owner) {
        AllInformation.owner = owner;
    }

    public static String getAuto() {
        return auto;
    }

    public static void setAuto(String auto) {
        AllInformation.auto = auto;
    }

    public static String getInsuranceNow() {
        return InsuranceNow;
    }

    public static void setInsuranceNow(String insuranceNow) {
        InsuranceNow = insuranceNow;
    }
}
