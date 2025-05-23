package org.example.demoapp;
//junije palmotic
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection(){
        //postavite odgovarajući naziv baze podataka, korsnika i password
        String databaseName = "knjiznica";
        String databaseUser = "root";
        String databasePassword = "";

        //postaviti url do baze
        String url = "jdbc:mysql://localhost:3306/" + databaseName;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return databaseLink;
    }
}
