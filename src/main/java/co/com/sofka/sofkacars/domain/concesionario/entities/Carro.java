package co.com.sofka.sofkacars.domain.concesionario.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.sofkacars.domain.concesionario.ids.CarroId;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Color;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Marca;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Modelo;
import co.com.sofka.sofkacars.generics.Precio;

import java.util.Objects;

public class Carro extends Entity<CarroId> {

    private Marca marca;
    private Modelo modelo;
    private Color color;
    private Precio precio;

    // se crea un constructor publico para los objectValue

    public Carro(CarroId carroId, Marca marca, Modelo modelo, Color color, Precio precio) {
        // Super --> herencia
        super(carroId);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    // métodos de la entidad Asesor

    public void cambiarMarca (Marca marca) {this.marca = Objects.requireNonNull(marca);}

    public void cambiarModelo (Modelo modelo) {this.modelo = Objects.requireNonNull(modelo);}

    public void cambiarColor (Color color) {this.color = Objects.requireNonNull(color);}

    public void cambiarPrecio (Precio precio) {this.precio = Objects.requireNonNull(precio);}

}
