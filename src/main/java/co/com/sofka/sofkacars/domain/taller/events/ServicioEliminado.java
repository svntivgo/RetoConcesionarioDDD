package co.com.sofka.sofkacars.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.taller.ids.ServicioId;

public class ServicioEliminado extends DomainEvent
{
    private final ServicioId servicioId;

    public ServicioEliminado(ServicioId servicioId) {
        super("RetoConcesionarioDDD.ServicioEliminado");
        this.servicioId = servicioId;
    }
}
