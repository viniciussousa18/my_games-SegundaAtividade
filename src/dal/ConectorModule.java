package dal;

// Importa a classe de manipulação de SQL
import java.sql.*;

/**
 *
 * @author Banda
 */
public class ConectorModule {
    
    //Conexão como o MySQL
    public static Connection conect(){
        
        // Variável de conexão
        java.sql.Connection conn = null;
        
        // Driver de conexão
        String driver = "com.mysql.jdbc.Driver";
        
        // Nome do banco de dados
        String url = "jdbc:mysql://localhost:3306/mygames";
        
        // Usuário e senha do MySQL
        String user = "root";
        String passwd = "";
        
        // Conexão com o MySQl
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, passwd);
            return conn;
        } catch (Exception e){
            //Somente para teste
            //System.out.println(e);
            return null;
        }
    }
}
