package co.com.sofka.sofkacars.domain.factura.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.sofkacars.domain.factura.ids.EstadoId;
import co.com.sofka.sofkacars.domain.factura.valueobjects.EstadoActual;
import co.com.sofka.sofkacars.domain.factura.valueobjects.Fecha;

import java.util.Objects;

public class Estado extends Entity<EstadoId> {

    // se crean variables para los objectValue

    private EstadoActual estadoActual;
    private Fecha fecha;

    // se crea un constructor publico para los objectValue

    public Estado(EstadoId entityId, EstadoActual estadoActual, Fecha fecha) {

        // Super --> herencia
        super(entityId);
        this.estadoActual = estadoActual;
        this.fecha = fecha;
    }

    // métodos de la entidad Estado

    // cambiarEstadoActual()
    public void cambiarEstadoActual(EstadoActual estadoActual){
        this.estadoActual = Objects.requireNonNull(estadoActual);
    }

    // cambiarFecha()
    public void cambiarFecha(Fecha fecha){
        this.fecha = Objects.requireNonNull(fecha);
    }
}