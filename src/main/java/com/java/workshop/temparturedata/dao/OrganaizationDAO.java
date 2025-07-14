package com.java.workshop.temparturedata.dao;
import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class OrganaizationDAO {
    public void createTable(){
        JdbcDataSource h2DataSource = new JdbcDataSource();
        h2DataSource.setUrl("Jbdc:h2:mem:tempdataDB");
        h2DataSource.setUser("sa");
        try(Connection dbConnection = h2DataSource.getConnection()){
            Statement statement=dbConnection.createStatement();
            statement.execute("""
                        create table organization(
                        id int AUTO_INCREMENT PRIMARY KEY,
                        NAME VARCHAR(100),
                        WEBSITE VARCHAR(100),
                        EMAIL VARCHAR(100),
                        CONTACT_NUMBER VARCHAR(100),
                        REGISTRATION_NO INT,
                        ADDRESS VARCHAR(255) 
                    """);
        }catch(SQLException e){
            System.out.println("error creating table"+e.g);
        }
    }
}
