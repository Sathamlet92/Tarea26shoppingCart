package com.sathamlet.tarea26.carrosupermercado.model;

public enum Color {
    VERDE("Verde"),
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    CAFE("Cafe"),
    MORADO("Morado"),
    AZUL("Azul");
    private String name;
    Color(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
