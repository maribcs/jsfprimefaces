/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.jsfprimefaces.bean;
import com.tecsup.jsfprimefaces.model.Categoria;
import com.tecsup.jsfprimefaces.model.Producto;
import com.tecsup.jsfprimefaces.service.GestionProducto;
import java.util.List;
import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.CellEditEvent;
/**
 *
 * @author alumno
 */
@ManagedBean(name = "categoriaBean")
@RequestScoped
public class CategoriaBean {

    private Long idCategoria;
    private List<Categoria> categorias;
    private List<Producto> productos;

    public CategoriaBean() {
        GestionProducto gestion = new GestionProducto();
        this.categorias = gestion.listar();
        System.out.println("Total categoria "+this.categorias.size());
    }

    public void cargarProductos(Long categoria) {
        GestionProducto gestion = new GestionProducto();
        this.productos = gestion.listarPorCategoria(categoria);
        System.out.println("Total productos "+this.productos.size());
    }
    
    public void onCellEdit(CellEditEvent event) {

		Object newValue = event.getNewValue();
		Object oldValue = event.getOldValue();

		DataTable o = (DataTable) event.getSource();
		Categoria objeto = (Categoria) o.getRowData();
		System.out.println(objeto.getId());

		if (newValue != null && !newValue.equals(oldValue)) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Actualizado", "Antes: " + oldValue + ", Después:"
							+ newValue);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}


    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    
}
