# Interfaces Java
Ejemplo aplicando Interfaces en Java

##Ejemplo

> Una interfaz en Java es una colección de métodos abstractos y propiedades, se especifica qué se debe hacer pero no su implementación. 
[WikiPedia](https://es.wikipedia.org/wiki/Interfaz_(Java))

Para poder trabajar con una interface primero debemos generarlo esto sea por medio del IDE o simplemente cambiando el nombre **class**
por **interface**
```java
public interface Animal
```

Para realizar este ejercicio crearemos una interfaz llamada **Animal** y dentro de ella debera contener dos metodos llamados:
* tipoAnimal
* mostrarNombre

Nos queda de la siguiente manrea:
```java
public interface Animal {

    public void tipoDeAnimal();

    public String mostrarNombre();

} 
```

A continuacion creamos otra interfaz llamada **serVivo** y quedara de la siguiente manera:
```java
public interface serVivo {

    public void mostrarVida();

}
```

La accion de cada metodo no se define ya que las interfaces solo se encargan de definir los metodos a usar, pero las acciones de cada
uno es definido por la clase que quieran implementar la interfaz.

Crearemos una clase llamada **Perro** la cual hara uso de las dos interfaces creadas:
```java
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
```

Al final nuestro metodo **Main** debe quedar de la siguiente manera:
```java
public class Main {

    public static void main(String[] args) {
	    Perro perro = new Perro();
        String nombre = perro.mostrarNombre();
        System.out.println(nombre);
        perro.tipoDeAnimal();
        perro.mostrarVida();
    }
}
```

Al compilar nuestro ejercicio debe de darnos el siguiente resultado:
```java
Tyson
Soy un mamifero
Estoy vivo
```

Una clase puede tener infinidad de Interfaces implementadas en ella a diferencia de la clase **Abstracta** nos obliga a usar la herencia.

