package co.com.sofka.sofkacars.domain.factura.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.factura.ids.EstadoId;
import co.com.sofka.sofkacars.domain.factura.valueobjects.EstadoActual;
import co.com.sofka.sofkacars.domain.factura.valueobjects.Fecha;

public class CambiarEstado extends Command {

    private final EstadoId estadoId;
    private final EstadoActual estadoActual;
    private final Fecha fecha;

    public CambiarEstado(EstadoId estadoId, EstadoActual estadoActual, Fecha fecha) {
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
