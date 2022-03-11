package co.com.sofka.sofkacars.domain.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.factura.ids.ClienteId;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Telefono;

import java.util.Set;

public class ClienteCambiado extends DomainEvent {

    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Set<Telefono> telefono;
    private final Identificacion identificacion;

    public ClienteCambiado(ClienteId clienteId, Nombre nombre, Set<Telefono> telefono, Identificacion identificacion) {
        super("RetoConcesionarioDDD.ClienteCambiado");
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.identificacion = identificacion;
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
