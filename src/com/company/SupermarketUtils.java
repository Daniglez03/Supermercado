package com.company;

public class SupermarketUtils {
    private static final String[]GENERADOR_PERSONAS = {
            "Lucrecia",
            "Roberto",
            "Sonia",
            "Tu padre",
            "Tolete",
    };
    private static final String[]GENERADOR_PRODUCTO = {
            "Papaya",
            "Pomelo",
            "Petisui",
            "Galletas María",
            "Papas del norte",
    };
    private static final float[]GENERADOR_PRECIO = {
            12.99f,
            01.50f,
            3.13f,
            1.92f,
            5.99f,
    };
    public static String generarPersona() {
        return GENERADOR_PERSONAS[(int) (Math.random()) * GENERADOR_PERSONAS.length];
    }
    public static String generarProducto() {
        return GENERADOR_PRODUCTO[(int) (Math.random()) * GENERADOR_PRODUCTO.length];
    }
    public static float generarPrecio() {
        return GENERADOR_PRECIO[(int) (Math.random()) * GENERADOR_PRECIO.length];
    }
}
