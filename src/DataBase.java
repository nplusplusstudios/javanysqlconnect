import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author nuzrath
 */
public class DataBase {
    private  String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
//    private  String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    //com.mysql.cj.jdbc.Driver
    private  String DB_URL = "jdbc:mysql://localhost/db_hnd60";
    
    //database credentials
    private String USER = "root";
    private String PASS = "";
    
    private Connection conn = null;
    private Statement stmt  = null;
    
    public DataBase(){
        try{
            //register the JDBC Driver
            Class.forName(JDBC_DRIVER);            
            //open a connection
            conn = DriverManager.getConnection(DB_URL,USER,PASS);            
            //to execute sql statment Stamtent object need to be 
            //created            
            stmt = conn.createStatement();         
            
        }
        catch(SQLException er){
            er.printStackTrace();
        }
        catch(Exception er){
            er.printStackTrace();
        }
    }//end of constructor
    
    //add edit delete will be using this method
    public int executeUpdate(String sql){
        int res = -1;
        try{
            res = stmt.executeUpdate(sql);
        }
        catch(Exception er){
            er.printStackTrace();
        }
        return res;
    }//end of executeUpdate method
    
    //to get values or records from the database 
    //we are using the following mehtod    
    public ResultSet executeQuery(String sql){
        ResultSet res  = null;        
        try{
            res = stmt.executeQuery(sql);
        }
        catch(Exception er){
            er.printStackTrace();
        }        
        return res;            
    }//end of method executeQuery
    
    
    public Connection getConn(){
        return conn;
    }
    
}//end of the class DataBase