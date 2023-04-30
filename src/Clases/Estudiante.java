/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author USER
 */
public class Estudiante {
    private String nombre;
    private String codigo;
    
    public Estudiante(String nombre, String codigo){
        this.nombre=nombre;
        this.codigo=codigo;
    }
    public Estudiante(){
        this.codigo=null;
        this.nombre=null;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public String getDatos(){
        
       return "Codigo : " +codigo +"  Nombre : "+nombre;
    } 
}
