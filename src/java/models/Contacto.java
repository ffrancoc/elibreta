/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Francisco
 */
public class Contacto {

    private String apodo;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String genero;
    private String fechaNacimiento;

    public Contacto() {
    }

    public Contacto(String apodo, String nombre, String apellido, String telefono, String correo, String genero, String fechaNacimiento) {
        this.apodo = apodo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "APODO: " + apodo + "\nNOMBRE: " + nombre + "\nAPELLIDO: " + apellido + "\nTELEFONO: " + telefono + "\nCORREO: " + correo + "\nGENERO: " + genero + "\nFECHA NACIMIENTO: " + fechaNacimiento;
    }
}
