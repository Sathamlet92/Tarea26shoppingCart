package com.sathamlet.tarea26.carrosupermercado.model;

public class NoPerecible extends Producto{
    private int content;
    private int calorie;

    public NoPerecible() {}

    public NoPerecible(int content, int calorie) {
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
