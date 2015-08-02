/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.jsfprimefaces.model;

/**
 *
 * @author alumno
 */
public class Producto {
    private Long id;
 
    private String nombre;
 
    private String descripcion;
 
    private Categoria categoria;
    
    private String img;
 
    public Producto(Long id, String nombre, String descripcion, String img) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
    }
 
    public Producto() {
    }
 
     
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getDescripcion() {
        return descripcion;
    }
 
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 
    public Categoria getCategoria() {
        return categoria;
    }
 
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
}
