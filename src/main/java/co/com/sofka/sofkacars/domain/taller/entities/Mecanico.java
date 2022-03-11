package co.com.sofka.sofkacars.domain.taller.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.sofkacars.domain.taller.ids.MecanicoId;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;

import java.util.Objects;

public class Mecanico extends Entity<MecanicoId> {
    private Nombre nombre;
    private Identificacion identificacion;


    public Mecanico(MecanicoId mecanicoId, Nombre nombre, Identificacion identificacion) {
        super(mecanicoId);
        this.nombre = nombre;
        this.identificacion = identificacion;
    }


// métodos de la entidad Mecanico

    // cambiarNombre()
    public void cambiarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    // cambiarIdentificacion()
    public void cambiarIdentificacion(Identificacion identificacion) {
        this.identificacion = Objects.requireNonNull(identificacion);
    }
}