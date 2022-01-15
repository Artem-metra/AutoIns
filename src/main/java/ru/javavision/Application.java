package ru.javavision;

import java.sql.*;



public class Application {

    static final String userr = "postgres";
    static final String password = "admin";
    static final String url = "jdbc:postgresql://localhost:5432/auto_insurance";


    public static User isUserBD(String state_number, String driver_license){
        try (Connection connection = DriverManager.getConnection(url, userr, password);) {
            String sql = "";
            sql = "SELECT state_number,driver_license,id FROM Auto WHERE state_number = '" + state_number + "' AND driver_license = '" + driver_license + "'";

            Statement statement = connection.createStatement();
            final ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                String byState_number =  resultSet.getString("state_number");
                String byDriver_license = resultSet.getString("driver_license");
                int byId = resultSet.getInt("id");
//                String byOwner = resultSet.getString("owner");
//                System.out.println(byState_number);
//                System.out.println(byDriver_license);
//                System.out.println(byOwner);
                User user1 = new User(byState_number, byDriver_license, byId);
                return user1;
            }
            return null;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }


    public static int insert(NewUser newUser) {

        try{
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, userr, password)){

                String sql = "INSERT INTO auto" +  "(state_number, driver_license, owner, auto)" + "VALUES(?, ?, ?, ?)";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                    preparedStatement.setString(1, newUser.getStateNumber());
                    preparedStatement.setString(2, newUser.getDriver_license());
                    preparedStatement.setString(3, newUser.getOwner());
                    preparedStatement.setString(4, newUser.getAuto());

                    return  preparedStatement.executeUpdate();

            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }

    public static int buyIns(Insurance insurance) {

        try{
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, userr, password)){

                String sql = "INSERT INTO Insurance" +  "(name_insurance)" + "VALUES(?)";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, insurance.getNameIns());
                return  preparedStatement.executeUpdate();

            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }


    public static AllInformation selectOne(int id) {

        AllInformation allInformation = null;
        try{
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, userr, password);) {
                String sql = "";
//            sql = "SELECT * FROM Auto WHERE state_number = '" + state_number + "' AND driver_license = '" + driver_license + "'";
                sql = "SELECT Auto.state_number, Auto.driver_license, Auto.owner, Auto.auto, Auto.id AS id, Insurance.name_insurance FROM Insurance" +
                        " INNER JOIN Auto on Insurance.id = Auto.id WHERE Auto.id = '" + id + "'";

                Statement statement = connection.createStatement();
                final ResultSet resultSet = statement.executeQuery(sql);
                if (resultSet.next()) {
                    String byState_number =  resultSet.getString("state_number");
                    String byDriver_license = resultSet.getString("driver_license");
                    String byOwner = resultSet.getString("owner");
                    String byAuto = resultSet.getString("auto");
                    String byIns = resultSet.getString("name_insurance");
//                String byOwner = resultSet.getString("owner");
//                System.out.println(byState_number);
//                System.out.println(byDriver_license);
//                System.out.println(byOwner);
                    AllInformation info = new AllInformation(byState_number, byOwner ,byDriver_license, byAuto, byIns);
                    return info;
                }
                return null;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                return null;
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return allInformation;
    }

//    public static AllInformation getInfo(int userid) {
//
//        try (Connection connection = DriverManager.getConnection(url, userr, password);) {
//            String sql = "";
////            sql = "SELECT * FROM Auto WHERE state_number = '" + state_number + "' AND driver_license = '" + driver_license + "'";
//            sql = "SELECT Auto.state_number, Auto.driver_license, Auto.owner, Auto.auto, Auto.id AS id, Insurance.name_insurance FROM Insurance" +
//                    " INNER JOIN Auto on Insurance.id = Auto.id WHERE Auto.id = '" + userid + "'";
//
//            Statement statement = connection.createStatement();
//            final ResultSet resultSet = statement.executeQuery(sql);
//            if (resultSet.next()) {
//                String byState_number =  resultSet.getString("state_number");
//                String byDriver_license = resultSet.getString("driver_license");
//                String byOwner = resultSet.getString("owner");
//                String byAuto = resultSet.getString("auto");
//                String byIns = resultSet.getString("name_insurance");
////                String byOwner = resultSet.getString("owner");
////                System.out.println(byState_number);
////                System.out.println(byDriver_license);
////                System.out.println(byOwner);
//                AllInformation info = new AllInformation(byState_number, byOwner ,byDriver_license, byAuto, byIns);
//                return info;
//            }
//            return null;
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//            return null;
//        }
//    }

}