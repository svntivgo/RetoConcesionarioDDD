package co.com.sofka.sofkacars.domain.concesionario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Telefono;

public class AsesorAniadido extends DomainEvent {

    private final AsesorId asesorId;
    private final Nombre nombre;
    private final Identificacion identificacion;
    private final Telefono telefono;

    public AsesorAniadido(AsesorId asesorId, Nombre nombre, Identificacion identificacion, Telefono telefono) {
        super("RetoConcesionarioDDD.AsesorAniadido");
        this.asesorId = asesorId;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
    }

    public AsesorId getAsesorId() {
        return asesorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
