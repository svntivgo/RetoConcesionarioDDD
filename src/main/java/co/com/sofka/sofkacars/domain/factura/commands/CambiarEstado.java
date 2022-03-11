package co.com.sofka.sofkacars.domain.factura.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.factura.ids.EstadoId;
import co.com.sofka.sofkacars.domain.factura.ids.FacturaId;
import co.com.sofka.sofkacars.domain.factura.valueobjects.EstadoActual;
import co.com.sofka.sofkacars.domain.factura.valueobjects.Fecha;

public class CambiarEstado extends Command {

    private final FacturaId facturaId;
    private final EstadoId estadoId;
    private final EstadoActual estadoActual;
    private final Fecha fecha;

    public CambiarEstado(FacturaId facturaId,EstadoId estadoId, EstadoActual estadoActual, Fecha fecha) {
        this.facturaId=facturaId;
        this.estadoId = estadoId;
        this.estadoActual = estadoActual;
        this.fecha = fecha;
    }

    public FacturaId getFacturaId() {
        return facturaId;
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
