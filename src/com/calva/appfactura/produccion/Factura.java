package com.calva.appfactura.produccion;

import java.util.Date;

public class Factura {

    private Cliente cliente;
    private ItemFactura[] items;// por que es tipo arreglo??
    private int folio;
    private String descripcion;
    private Date fecha;
    private int indeceItems;

    public Factura(Cliente cliente, String descripcion) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.items=new ItemFactura[12];
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }


    public void addItemFactura(ItemFactura items){
        this.items[indeceItems++]=items;// indice donde incrementa los items con post incremento




    }
    public void calcularTotal(){

    }
    public void verDetalle(){

    }




}
