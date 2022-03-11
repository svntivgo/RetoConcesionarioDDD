package co.com.sofka.sofkacars.domain.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.factura.ids.EstadoId;
import co.com.sofka.sofkacars.domain.factura.valueobjects.EstadoActual;
import co.com.sofka.sofkacars.domain.factura.valueobjects.Fecha;

public class EstadoCambiado extends DomainEvent {

    private final EstadoId estadoId;
    private final EstadoActual estadoActual;
    private final Fecha fecha;

    public EstadoCambiado(EstadoId estadoId, EstadoActual estadoActual, Fecha fecha) {
        super("RetoConcesionarioDDD.EstadoCambiado");
        this.estadoId = estadoId;
        this.estadoActual = estadoActual;
        this.fecha = fecha;
    }

    public EstadoId getEstadoId() {
        return estadoId;
    }

    public EstadoActual getEstadoActual() {
        return estadoActual;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
