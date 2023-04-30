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
public class Profesor {
    private String codigo;
    private String nombre;
    
    public Profesor(String codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
    }
    
    public Profesor(){
        this.codigo=null;
        this.codigo=null;
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
