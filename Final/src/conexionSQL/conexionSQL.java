
package conexionSQL;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class conexionSQL {
    Connection conectar = null;
        String dbServer = "204.2.63.32"; 
        int dbPort = 10242; 
        String dbName = "maingco";
        String userName = "admin";
        String password = "9FMN97Zx";
        String url = String.format("jdbc:mysql://%s:%d?user=%s&password=%s" , 
                                    dbServer, dbPort, userName, password);
    
    public Connection conexion(){
      
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection(url);
            Statement stmt = conectar.createStatement();
            String sqlusedb = "use " + dbName;
            int result = stmt.executeUpdate(sqlusedb);
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa" +dbName);
         
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Conexion Erronea" +e.getMessage());
        }
        return conectar;    
    }
    
    
   
}
