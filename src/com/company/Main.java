package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(SupermarketUtils.generarPersona());
        System.out.println(SupermarketUtils.generarProducto() + " = " +  SupermarketUtils.generarPrecio() + " €");
    }
}
