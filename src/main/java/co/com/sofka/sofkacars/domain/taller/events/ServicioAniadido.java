package co.com.sofka.sofkacars.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.taller.ids.ServicioId;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Mantenimiento;

public class ServicioAniadido extends DomainEvent
{
    private final ServicioId servicioId;
    private final Mantenimiento mantenimiento;

    public ServicioAniadido(ServicioId servicioId, Mantenimiento mantenimiento) {
        super("RetoConcesionarioDDD.ServicioAniadido");
        this.servicioId = servicioId;
        this.mantenimiento = mantenimiento;
    }

    public ServicioId getServicioId() {
        return servicioId;
    }

    public Mantenimiento getMantenimiento() {
        return mantenimiento;
    }
}

