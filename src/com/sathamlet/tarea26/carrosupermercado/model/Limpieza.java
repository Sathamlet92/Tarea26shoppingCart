package com.sathamlet.tarea26.carrosupermercado.model;

public class Limpieza extends Producto{
    private String component;
    private double liter;

    public Limpieza() {}

    public Limpieza(String name, Double price, String component, double liter) {
        super(name, price);
        this.component = component;
        this.liter = liter;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public double getLiter() {
        return liter;
    }

    public void setLiter(double liter) {
        this.liter = liter;
    }
}
