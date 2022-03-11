package co.com.sofka.sofkacars.domain.concesionario.commands;

import co.com.sofka.sofkacars.domain.concesionario.entities.Carro;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.CarroId;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Color;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Marca;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Modelo;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Precio;
import co.com.sofka.sofkacars.generics.Telefono;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static co.com.sofka.sofkacars.domain.concesionario.valueobjects.Color.Value.Blanco;
import static co.com.sofka.sofkacars.domain.concesionario.valueobjects.Marca.Value.Mazda;
import static org.junit.jupiter.api.Assertions.*;

class AniadirCarroTest
{
    CarroId carroId = CarroId.of("Este es un id de carro");
    Marca marca = new Marca(Mazda);
    Color color = new Color(Blanco);
    Precio precio = new Precio(25.56);
    Modelo  modelo= new Modelo(new Date(25/5/2026));

    Carro carro = new Carro(carroId,marca, modelo, color,precio);


    @Test
    void getCarroId() {
    }

    @Test
    void getMarca() {
    }

    @Test
    void getModelo() {
    }

    @Test
    void getColor() {
    }

    @Test
    void getPrecio() {
    }
}