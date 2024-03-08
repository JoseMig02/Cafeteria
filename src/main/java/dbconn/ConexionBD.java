package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:sqlserver://deceabr01;databaseName=dbApec;encrypt=true;trustServerCertificate=true;";
    private static final String USUARIO = "iso610";
    private static final String CONTRASENA = "iso610610";

    public static Connection obtenerConexion() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se pudo cargar el controlador JDBC", e);
        }

        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }

    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
