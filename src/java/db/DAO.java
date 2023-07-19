/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Contacto;

/**
 *
 * @author Francisco
 */
public class DAO {

    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mariadb://localhost:3306/storage";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection conn = null;
    private static Statement stmt = null;
    private static PreparedStatement pstmt = null;
    private static ResultSet rs = null;

    private static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println("Error al conectar a la base de datos\nDETALLES: " + ex.getMessage());
        }
        return conn;
    }

    public static void doPost(Contacto c) {

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement("INSERT INTO contactos(apodo,nombre,apellido,telefono,correo,genero,fecha_nacimiento) VALUES(?,?,?,?,?,?,?);");
            pstmt.setString(1, c.getApodo());
            pstmt.setString(2, c.getNombre());
            pstmt.setString(3, c.getApellido());
            pstmt.setString(4, c.getTelefono());
            pstmt.setString(5, c.getCorreo());
            pstmt.setString(6, c.getGenero());
            pstmt.setString(7, c.getFechaNacimiento());
            pstmt.execute();
        } catch (SQLException ex) {
            System.err.println("Error al guardar datos en la base de datos\nDETALLES: " + ex.getMessage());
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex) {

            }
        }
    }

}
