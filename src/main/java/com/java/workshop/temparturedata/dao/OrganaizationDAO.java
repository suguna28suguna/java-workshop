package com.java.workshop.temparturedata.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.workshop.temparturedata.beans.Organaization;



public class OrganaizationDAO {
    public void createTable(Connection dbConnection){
         try(Statement statement = dbConnection.createStatement()){
              statement.execute("""
                        create table organization(
                        id int AUTO_INCREMENT PRIMARY KEY,
                        NAME VARCHAR(100),
                        DESCRIPTION VARCHAR(255),
                        WEBSITE VARCHAR(100),
                        EMAIL VARCHAR(100),
                        CONTACT_NUMBER VARCHAR(100),
                        REGISTRATION_NO INT)
                    """);
        }catch(SQLException sqlException){
            System.out.println("Error creating table:"+sqlException.getMessage());
        }
    }
    public int save(Connection dbConnection,Organaization vet){
        try(PreparedStatement preparedStatement = dbConnection.prepareStatement("""
                insert into organization(NAME,WEBSITE,EMAIL,CONTACT_NUMBER,
                REGISTRATION_NO,DESCRIPTION)values(?,?,?,?,?,?)                
                """)){
                    preparedStatement.setString(1, vet.name());
                    preparedStatement.setString(2, vet.website());
                    preparedStatement.setString(3, vet.email());
                    preparedStatement.setString(4, vet.contactnumber());
                    preparedStatement.setInt(5, vet.registrationNumber());
                    preparedStatement.setString(6, vet.description());
                    preparedStatement.executeUpdate();
                }catch(SQLException sqlException){
                    System.out.println("Error inserting into table:"+sqlException);
                }
                return 0;
    }
    public Organaization findByName(Connection dbConnection,String name){
        Organaization organaization = null;
        try(PreparedStatement preparedStatement = dbConnection.prepareStatement("""
                select * from organization where name =?
                """)){
                    preparedStatement.setString(1, name);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet !=null&& resultSet.next()){
                        organaization = new Organaization(resultSet.getString("NAME"),
                        resultSet.getString("DESCRIPTION"),
                        resultSet.getString("WEBSITE"),
                        resultSet.getString("EMAIL"),
                        resultSet.getString("CONTACT_NUMBER"),
                        resultSet.getInt("REGISTRATION_NO"));
                    }

                }catch(SQLException exception){
                    System.out.println("Exception While fetching the data"+exception);
                }     
                return organaization;       
        }
    }

