package com.gamis214;


public class Perro implements Animal,serVivo {

    @Override
    public void tipoDeAnimal() {
        System.out.println("Soy un mamifero");
    }

    @Override
    public String mostrarNombre() {
        return "Tyson";
    }

    @Override
    public void mostrarVida() {
        System.out.println("Estoy vivo");
    }
}
