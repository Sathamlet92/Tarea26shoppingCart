package com.sathamlet.tarea26.carrosupermercado.model;

public class NoPerecible extends Producto{
    private int content;
    private int calorie;

    public NoPerecible() {}

    public NoPerecible(String name, Double price) {
        super(name, price);

    }

    public NoPerecible(String name, Double price, int content, int calorie) {
        this(name, price);
        this.content = content;
        this.calorie = calorie;

    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }
}
