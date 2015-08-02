/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.jsfprimefaces.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author alumno
 */
@ManagedBean(name = "ventasBean")
@RequestScoped
public class VentasBean {

    private PieChartModel ventas;

    public VentasBean() {
        ventas = new PieChartModel();
        ventas.set("Adidas", 1200);
        ventas.set("Puma", 1520);
        ventas.set("Sketcher", 890);
        ventas.set("Umbro", 9230);
        ventas.setTitle("Simple Pie");
        ventas.setLegendPosition("w");
    }

    public PieChartModel getVentas() {
        return ventas;
    }

    public void setVentas(PieChartModel ventas) {
        this.ventas = ventas;
    }
    
}
