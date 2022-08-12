package com.sathamlet.tarea26.carrosupermercado;

import com.sathamlet.tarea26.carrosupermercado.interfaces.Ejecutable;
import com.sathamlet.tarea26.carrosupermercado.model.Color;
import com.sathamlet.tarea26.carrosupermercado.model.Fruta;
import com.sathamlet.tarea26.carrosupermercado.model.Limpieza;
import com.sathamlet.tarea26.carrosupermercado.model.Producto;

public class Main {
    public static void main(String[] args) {
        Ejecutable<Fruta> comprasFrutas = new BolsaSuperMercado<>();
        comprasFrutas.addProduct(new Fruta("Manzana", 13.50, 200, Color.AMARILLO));
        comprasFrutas.addProduct(new Fruta("Naranja", 5.50, 450, Color.AMARILLO));
        comprasFrutas.addProduct(new Fruta("Fresa", 62.20, 1000, Color.ROJO));
        comprasFrutas.addProduct(new Fruta("Uvas", 55.20, 650, Color.MORADO));
        comprasFrutas.addProduct(new Fruta("Aguacate", 98.20, 450, Color.VERDE));

        Ejecutable<Limpieza> comprasLimpieza = new BolsaSuperMercado<>();
        comprasLimpieza.addProduct(new Limpieza("Pinol", 21.50, "Amonio, etc...", 1));
        comprasLimpieza.addProduct(new Limpieza("Clorox", 18.20, "Limons etc...", 1.8));
        comprasLimpieza.addProduct(new Limpieza("Zote", 14.50, "Colorante rosa, etc...", .500));
        comprasLimpieza.addProduct(new Limpieza("Pinol", 21.50, "Amonio, etc...", 1));
        comprasLimpieza.addProduct(new Limpieza("Pinol", 21.50, "Amonio, etc...", 1));



        var listcomprasFr = comprasFrutas.getProducts();
        System.out.println("Bolsa de Frutas");
        listcomprasFr.forEach(f -> {
            System.out.println("Nombre: " + f.getName());
            System.out.println("Peso: " + f.getWeight());
            System.out.println("Color: " + f.getColor());
            System.out.println("Precio: " +f.getPrice());
            System.out.println();
        });
        var listcomprasLim = comprasLimpieza.getProducts();
        System.out.println("Bolsa de limpieza");
        listcomprasLim.forEach(l ->{
            System.out.println("Nombre: " + l.getName());
            System.out.println("Peso: " + l.getComponent());
            System.out.println("Litros: " + l.getLiter());
            System.out.println("Precio: " +l.getPrice());
            System.out.println();
        });
    }
}
