package com.sathamlet.tarea26.carrosupermercado.interfaces;

import java.util.List;

public interface Ejecutable<T> {
    void addProduct(T product);
    T getProduct(int id);
    List<T> getProducts();
}
