package com.sathamlet.tarea26.carrosupermercado;

import com.sathamlet.tarea26.carrosupermercado.interfaces.Ejecutable;
import com.sathamlet.tarea26.carrosupermercado.model.*;

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

        Ejecutable<Lacteo> comprasLacteos = new BolsaSuperMercado<>();
        comprasLacteos.addProduct(new Lacteo("Leche Santa Clara", 25.50, 2, 75));
        comprasLacteos.addProduct(new Lacteo("Queso Oaxaca", 68.0, 1, 250));
        comprasLacteos.addProduct(new Lacteo("Yogurt", 23.20, 4, 110));
        comprasLacteos.addProduct(new Lacteo("Leche Santa Clara", 25.50, 2, 75));
        comprasLacteos.addProduct(new Lacteo("Leche Santa Clara", 25.50, 2, 75));

        Ejecutable<NoPerecible> comprasNoprecible = new BolsaSuperMercado<>();
        comprasNoprecible.addProduct(new NoPerecible("Frijoles enladatado", 22.50, 450, 100));
        comprasNoprecible.addProduct(new NoPerecible("Lentejas", 18.20, 1000, 100));
        comprasNoprecible.addProduct(new NoPerecible("Arroz", 21.90, 1000, 170));
        comprasNoprecible.addProduct(new NoPerecible("Atun", 20.25, 320, 100));
        comprasNoprecible.addProduct(new NoPerecible("Sardina", 33.50, 490, 100));




        var listcomprasFr = comprasFrutas.getProducts();
        System.out.println("Bolsa de Frutas-------------------");
        listcomprasFr.forEach(f -> {
            System.out.println("Nombre: " + f.getName());
            System.out.println("Peso: " + f.getWeight());
            System.out.println("Color: " + f.getColor());
            System.out.println("Precio: " +f.getPrice());
            System.out.println();
        });
        var listcomprasLim = comprasLimpieza.getProducts();
        System.out.println("Bolsa de limpieza-------------");
        listcomprasLim.forEach(l ->{
            System.out.println("Nombre: " + l.getName());
            System.out.println("Peso: " + l.getComponent());
            System.out.println("Litros: " + l.getLiter());
            System.out.println("Precio: " +l.getPrice());
            System.out.println();
        });

        var listcomprasLac = comprasLacteos.getProducts();
        System.out.println("Bolsa de Lacteos---------------");
        listcomprasLac.forEach(l ->{
            System.out.println("Nombre: " + l.getName());
            System.out.println("Cantidad: " + l.getQuanty());
            System.out.println("Proteinas: " + l.getProteinas());
            System.out.println("Precio: " +l.getPrice());
            System.out.println();
        });

        var listcomprasNP = comprasNoprecible.getProducts();
        System.out.println("Bolsa de No Perecible---------------");
        listcomprasNP.forEach(np ->{
            System.out.println("Nombre: " + np.getName());
            System.out.println("Contenido: " + np.getContent());
            System.out.println("Calorias: " + np.getCalorie());
            System.out.println("Precio: " + np.getPrice());
            System.out.println();
        });
    }
}
