package co.com.sofka.sofkacars.domain.concesionario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.concesionario.ids.CarroId;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Color;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Marca;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Modelo;
import co.com.sofka.sofkacars.generics.Precio;

public class AniadirCarro extends Command {

    private final ConcesionarioId concesionarioId;
    private final CarroId carroId;
    private final Marca marca;
    private final Modelo modelo;
    private final Color color;
    private final Precio precio;

    public AniadirCarro(ConcesionarioId concesionarioId,CarroId carroId, Marca marca, Modelo modelo, Color color, Precio precio) {
        this.concesionarioId=concesionarioId;
        this.carroId = carroId;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public ConcesionarioId getConcesionarioId() {
        return concesionarioId;
    }

    public CarroId getCarroId() {
        return carroId;
    }

    public Marca getMarca() {
        return marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Color getColor() {
        return color;
    }

    public Precio getPrecio() {
        return precio;
    }
}
