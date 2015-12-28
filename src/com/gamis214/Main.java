package com.gamis214;

public class Main {

    public static void main(String[] args) {
	    Perro perro = new Perro();
        String nombre = perro.mostrarNombre();
        System.out.println(nombre);
        perro.tipoDeAnimal();
        perro.mostrarVida();
    }
}
