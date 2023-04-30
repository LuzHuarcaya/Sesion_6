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
public class Curso {
    private String codigo;
    private String nombre; 
    private Integer creditos; 

    public Curso(String codigo, String nombre, Integer creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public Curso() {
        this.codigo = null;
        this.nombre = null;
        this.creditos = 0;
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

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
    
     public String getDatos(){
        
       return "Codigo : " +codigo +"  Nombre : "+nombre+"  Creditos : "+creditos;
    } 
}
