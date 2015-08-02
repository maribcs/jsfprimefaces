/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.jsfprimefaces.bean;
import com.tecsup.jsfprimefaces.model.Producto;
import com.tecsup.jsfprimefaces.service.GestionProducto;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author alumno
 */
@ManagedBean(name = "productoBean")
@RequestScoped

public class ProductoBean {
    private List<Producto> productos;
    private Producto productoSelecionado;
    
    public ProductoBean(){
        GestionProducto gestion = new GestionProducto();
        this.productos = gestion.listarPorCategoria(0l);
    }
    public void findProductos(Producto producto){
        this.productoSelecionado = producto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Producto getProductoSelecionado() {
        return productoSelecionado;
    }

    public void setProductoSelecionado(Producto productoSelecionado) {
        this.productoSelecionado = productoSelecionado;
    }
    
}
