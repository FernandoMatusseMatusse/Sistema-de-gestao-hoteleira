package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Connector {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/gestaohoteleira";
    private static final String USER = "root";
    private static final String PASS = "cfm212507";

    public static Connection getConnection() {
        
        try {
            Class.forName(DRIVER);
            System.out.println("Entrou na Base de dados");
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar a base de dados\n" + ex, "", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
               
                con.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encerrar conexao" + ex, "", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encerrar conexao" + ex, "", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con, stmt);
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encerrar conexao" + ex, "", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        getConnection();
    }

    public Object getConexao() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
  
}
