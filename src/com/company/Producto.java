package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Producto {
    public String producto;
    public String precio;

    public Producto(String producto, String precio) {
        this.producto = producto;
        this.precio = precio;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
