package com.sathamlet.tarea26.carrosupermercado.model;

public class Lacteo extends Producto {
    private int quanty;
    private int proteinas;

    public Lacteo() {}

    public Lacteo(String name, Double price) {
        super(name, price);
    }

    public Lacteo(String name, Double price, int quanty, int proteinas) {
        this(name, price);
        this.quanty = quanty;
        this.proteinas = proteinas;
    }

    public int getQuanty() {
        return quanty;
    }

    public void setQuanty(int quanty) {
        this.quanty = quanty;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
}
