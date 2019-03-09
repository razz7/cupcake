/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import Data.DBConnector;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rh
 */
public class MakeNewUser {

    public User generateUser(int idUser, String email, String userName, String password, double balance) {
        User user = new User(idUser, userName, password, balance);
        return user;
    }

    public void createNewUser(User user) throws Exception {

        try {
            
            Connection connection = DBConnector.getConnection();

            String query = "INSERT INTO cupcake.user (username, password, balance) VALUES (?,?,?)";

            PreparedStatement pstmt = connection.prepareStatement(query);
//            Statement statement = connection.createStatement();
            System.out.println("here");
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getPassword());
            pstmt.setDouble(3, user.getBalance());
            
//            statement.executeUpdate(query);

            System.out.println(query);
            pstmt.executeUpdate();
            System.out.println("er her ");
//            connection.close();
            System.out.println("forbindelse lukket ");
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

//    public static void main(String[] args) throws Exception {
//        User user = generateUser(0, "ral@hemmingsen.com", "Raller", "raller123", 0.0);
//        System.out.println(user.getUserName() + user.getPassword());
//        System.out.println("INSERT INTO `cupcake`.`user` `username`,`password`,`balance`) VALUES" + "('" + user.getUserName() + "', '" + user.getPassword() + "', " + user.getBalance() + ");");
//        createNewUser(user);
//
//    }
    public static void main(String[] args) throws Exception {
        MakeNewUser mn = new MakeNewUser();
        User user = mn.generateUser(0, "ral@hemmingsen.com", "Raller", "raller123", 0.0);
        System.out.println(user.getUserName() + user.getPassword());

        mn.createNewUser(user);

    }

}
