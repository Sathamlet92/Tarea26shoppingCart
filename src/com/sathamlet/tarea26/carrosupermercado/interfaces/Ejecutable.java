package com.sathamlet.tarea26.carrosupermercado.interfaces;

import com.sathamlet.tarea26.carrosupermercado.model.Producto;

import java.util.List;

public interface Ejecutable<T> {
    void addProduct(T product);
    T getProduct(int id);
    List<T> getProducts();
}
