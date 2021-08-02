package TampilanAwal;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class myConnection {
    
    /**
     *
     * @return
     */
    public static Connection getConnection() {
        
        
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/appraka", "root", "");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
 