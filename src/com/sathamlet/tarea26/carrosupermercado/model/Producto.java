package com.sathamlet.tarea26.carrosupermercado.model;

abstract public class Producto {
    protected String name;
    protected Double price;
    protected int id;
    private static int lastIdLacteo;
    private static int lastIdFruta;
    private static int lastIdLimpieza;
    private static int lastIdNoPerecible;


    public Producto() {
        if(this instanceof  Lacteo)
            this.id = ++lastIdLacteo;
        if(this instanceof Fruta)
            this.id = ++lastIdFruta;
        if(this instanceof Limpieza)
            this.id = ++lastIdLimpieza;
        if(this instanceof NoPerecible)
            this.id = ++lastIdNoPerecible;
    }

    public Producto(String name, Double price) {
        this();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Id de producto: #" + this.id
                +"\nNombre: " + this.name
                +"\nPrecio: " + this.price;
    }
}
