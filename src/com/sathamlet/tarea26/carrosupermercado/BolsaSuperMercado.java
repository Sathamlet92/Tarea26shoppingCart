package com.sathamlet.tarea26.carrosupermercado;

import com.sathamlet.tarea26.carrosupermercado.interfaces.Ejecutable;
import com.sathamlet.tarea26.carrosupermercado.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class BolsaSuperMercado<T extends Producto> implements Ejecutable<T> {
    private List<T> products;

    public BolsaSuperMercado() {
        this.products = new ArrayList<>();
    }

    @Override
    public void addProduct(T product) {
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
