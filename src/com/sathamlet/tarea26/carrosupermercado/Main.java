package com.sathamlet.tarea26.carrosupermercado;

import com.sathamlet.tarea26.carrosupermercado.interfaces.Ejecutable;
import com.sathamlet.tarea26.carrosupermercado.model.Color;
import com.sathamlet.tarea26.carrosupermercado.model.Fruta;
import com.sathamlet.tarea26.carrosupermercado.model.Producto;

public class Main {
    public static void main(String[] args) {
        Ejecutable<Producto> compras = new BolsaSuperMercado<>();
        compras.addProduct(new Fruta("Manzana", 13.50, 200, Color.AMARILLO));
        var listcompras = compras.getProducts();
        listcompras.forEach(System.out::println);
    }
}
