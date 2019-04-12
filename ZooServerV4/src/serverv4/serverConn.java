package serverv4;

import java.net.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
/**
 * @author James
 * 08/04/2019
 * A Client-Server application that allows the storage, retrieval, display and manipulation of data
 * using a SQL database. Zoo Register.
 */

/*
*This class houses the sockets and while loop that is used to accept multiple clients
*It also house all methods that will be required by the client application and runs
*these methods in tangent with the database, returning the result to the client 
*handler
*/
public class serverConn {
    
    /*The method below; OpenServer, calls the ServerSocket class and creates an object from it, 
     *It then calls the accept() method onto the ServerSocket Object and assigns that object
     *as a value to the Server object that is created,
     *The Socket object is then passed as a parameter to the constructor of the ClientHandler Class
     *as the method instantiates the ClientHandler class.
     */
    public void openServer() {
        
        try {
            ServerSocket ss = new ServerSocket(7777);
            
            while (true) {
                Socket s;
                
                try {
                    s = ss.accept();
                    clientHandler incomingClient = new clientHandler(s);
                    incomingClient.start();
                } catch (IOException se) {
                    JOptionPane.showMessageDialog(null, "Error occured establishing connection from client.");
                }
            }
        } catch (IOException sse) {
            JOptionPane.showMessageDialog(null, "Error occured creating the Server Socket");
        }
    }
    
    /*This method returns a Connection value, the method simply connects to the database.*/
    public Connection connectDatabase() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoobase", "root", null);
            return connection;
        } catch(SQLException | ClassNotFoundException e) {
            System.exit(0);
        }
        return null;
    }
    
    /*
    *This methods purpose is to check the users credetials against the database to determine
    *whether they should be allowed to access the admin page, and the returns a string
    *value representing whether the credentials exist or not. 
    */
    public String checkAgainstAdmins(String username, String password) {
        String loginSuccess = "";
        serverConn dbConnect;
        
        try{
            dbConnect = new serverConn();
            Connection connect = dbConnect.connectDatabase();
            
            Statement st = connect.createStatement();
            ResultSet rec = st.executeQuery("SELECT username, password FROM adminTable WHERE username = '" + username + "'");
            
            while(rec.next()) {
                String pw = rec.getString("password");
                
                if(password.equals(pw)) {
                    loginSuccess="true";
                } else {
                    loginSuccess="false";
                    JOptionPane.showMessageDialog(null, "Incorrect login details");
                }
            }
        } catch(SQLException ioe) {
            JOptionPane.showMessageDialog(null, "Connection to the database was unable to establish.");
        }
        return loginSuccess;
    }
    
    /*
    *This methods purpose is to use the keyword parameter in a query that searches
    *through the animals table in my database to return all rows that have their animals
    *name match in anyway with the keyword.
    *The rows are saved in an ArrayList object, and that variable gets returned.
    */
    public animal[] searchAnimal(String keyword) {
        serverConn dbConnect;
        animal animal;
        ArrayList<animal> animalList = new ArrayList();
        
        try {
            dbConnect = new serverConn();
            Connection connect = dbConnect.connectDatabase();
            
            Statement st = connect.createStatement();
            ResultSet rec = st.executeQuery("SELECT * FROM animals WHERE name LIKE %" + keyword + "%");
            
            while(rec.next()) {
                int ID = rec.getInt("ID");
                String name = rec.getString("name");
                String description = rec.getString("description");
                int specID = rec.getInt("speciesID");
                
                animal = new animal(ID, name, description, specID);
                animalList.add(animal);
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error occured connecting to the database.");
        }
        animal[] animals = (animal[]) animalList.toArray();
        return animals;
    }
    
    /*
    *This methods purpose is to use the keyword parameter in a query that searches
    *through the species table in my database to return all rows that have their species
    *name match in anyway with the keyword.
    *The rows are saved in a String variable, and that variable gets returned.
    */
    public String searchSpecies(String keyword) {
        serverConn dbConnect;
        int specID;
        String specName = "";
        String concat = "-";
        
        try {
            dbConnect = new serverConn();
            Connection connect = dbConnect.connectDatabase();
            
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * from speciestable WHERE speciesName LIKE %" + keyword + "%");
            
            while(rs.next()) {
                specID = rs.getInt("speciesID");
                specName = rs.getString("speciesName");
                
                concat += String.valueOf(specID) + "-" + specName;
            }   
        } catch (SQLException ioe) {
            JOptionPane.showMessageDialog(null, "Error occured searching species table");
        }
        return concat;
    }
    
    /*
    *This method's purpose is to accept enough details as parameters to save 
    *them into the animals table. It returns true if the save was successful, 
    *and false otherwise.
    */
    public String addAnimal(String name, String description, int speciesID) {
        String bool = "false";
        serverConn dbConnection;
        
        try {
            dbConnection = new serverConn();
            Connection connection = dbConnection.connectDatabase();
            
            Statement dbStatement = connection.createStatement();
            ResultSet rs = dbStatement.executeQuery("INSERT INTO animals (name, description, speciesID) VALUES ('" + name + "', '" + description + "', " + speciesID + ")");
            bool = "true";
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error inserting the animal details into the database.");
        } 
        return bool;
    }
    
    /*
    *This method's purpose is to accept enough details as parameters to save 
    *them into the Species table. It returns true if the save was successful, 
    *and false otherwise.
    */
    public String addSpecies(String species) {
        String bool = "false";
        serverConn dbConnection;
        
        try {
            dbConnection = new serverConn();
            Connection connection = dbConnection.connectDatabase();
            
            Statement dbStatement = connection.createStatement();
            ResultSet rs = dbStatement.executeQuery("INSERT INTO speciestable (speciesName) VALUES('" + species + "')");
            bool = "true";
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error occured adding new species to the database via ServerConn.");
        }
        return bool;
    }
    
    /*
    *This method's purpose is to accept a keyword that will be used to search
    *through the animal table and delete what ever row it has returned.  
    *If it was successful, it will return a String variable stating true.
    *It will return a string variable stating false otherwise.
    */
    public String delAnimal(String name) {
        String bool = "false";
        serverConn dbConnection;
        
        try {
            dbConnection = new serverConn();
            Connection connection = dbConnection.connectDatabase();
            
            Statement dbStatement = connection.createStatement();
            ResultSet rsr = dbStatement.executeQuery("DELETE FROM animals WHERE name = '" + name + "'");
            bool = "true";
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error occured in ServerConn while executing delAnimal");
        }
        return bool; 
    }
    
    /*
    *This method's purpose is to accept a keyword that will be used to search
    *through the animal table and delete what ever row it has returned.  
    *If it was successful, it will return a String variable stating true.
    *It will return a string variable stating false otherwise.
    */
    public String delSpecies(String species) {
        String bool = "false";
        serverConn dbConnection;
        
        try {
            dbConnection = new serverConn();
            Connection connection = dbConnection.connectDatabase();
            
            Statement dbStatement = connection.createStatement();
            ResultSet rs = dbStatement.executeQuery("DELETE FROM speciestable WHERE speciesID = '" + species + "'" );
            bool = "true";
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error occured in ServerConn while executing delSpecies");
        }
        return bool;
    }
}
