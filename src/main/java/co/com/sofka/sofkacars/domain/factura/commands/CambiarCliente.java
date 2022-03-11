package co.com.sofka.sofkacars.domain.factura.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.factura.ids.ClienteId;
import co.com.sofka.sofkacars.domain.factura.ids.FacturaId;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Telefono;

import java.util.Set;

public class CambiarCliente extends Command {

    private final FacturaId facturaId;
    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Set<Telefono> telefono;
    private final Identificacion identificacion;

    public CambiarCliente(FacturaId facturaId,ClienteId clienteId, Nombre nombre, Set<Telefono> telefono, Identificacion identificacion) {
        this.facturaId= facturaId;
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.identificacion = identificacion;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Set<Telefono> getTelefono() {
        return telefono;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }
}
