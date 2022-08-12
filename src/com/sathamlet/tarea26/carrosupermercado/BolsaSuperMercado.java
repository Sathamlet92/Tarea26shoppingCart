package com.sathamlet.tarea26.carrosupermercado;

import com.sathamlet.tarea26.carrosupermercado.interfaces.Ejecutable;
import com.sathamlet.tarea26.carrosupermercado.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class BolsaSuperMercado<T extends Producto> implements Ejecutable<T> {
    private List<T> products;
    private static final int max = 5;

    public BolsaSuperMercado() {
        this.products = new ArrayList<>();
    }

    @Override
    public void addProduct(T product) {
        if(this.products.size() < 5)
            this.products.add(product);
    }

    @Override
    public T getProduct(int id) {
        return this.products.get(id);
    }

    @Override
    public List<T> getProducts() {
        return this.products;
    }
}
