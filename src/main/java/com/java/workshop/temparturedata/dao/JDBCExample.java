package com.java.workshop.temparturedata.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.java.workshop.temparturedata.beans.Organaization;

public class JDBCExample {
    public static void main(String[] args) {
        Connection dbConnection = null;
        try{
            Class.forName("org.h2.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            dbConnection=
            DriverManager.getConnection(
                "jdbc:h2:mem:tempdataDB","sa",null);
        } catch (SQLException sqlException) {
            System.out.println("Error Creating table db:"+sqlException);
        }
        OrganaizationDAO organaizationDAO = new OrganaizationDAO();
        organaizationDAO.createTable(dbConnection);
        Organaization vet = new Organaization( "VET",
                                    "Vellalar Educational Trust:",
                                    "www.vet.com",
                                    "contact@vet.com",
                                    " 9632587452",
                                    123456);
        organaizationDAO.save(dbConnection, vet);
        Organaization myorganaization = organaizationDAO.findByName(dbConnection, null);
        System.out.println("My Organaization is:"+myorganaization);

       Organaization result = organaizationDAO.findByName(dbConnection,"VET" );
       System.out.println(result);
            
        
    }  

}
