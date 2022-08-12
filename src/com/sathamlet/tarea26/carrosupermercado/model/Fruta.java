package com.sathamlet.tarea26.carrosupermercado.model;

public class Fruta extends Producto{
    private double weight;
    private Color color;

    public Fruta() {
    }

    public Fruta(String name, Double price) {
        super(name, price);
    }

    public Fruta(String name, Double price, double weight, Color color) {
        this(name, price);
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
