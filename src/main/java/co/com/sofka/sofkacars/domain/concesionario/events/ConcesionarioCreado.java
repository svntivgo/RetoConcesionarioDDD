package co.com.sofka.sofkacars.domain.concesionario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;

public class ConcesionarioCreado extends DomainEvent
{
    private  ConcesionarioId concesionarioId;

    public ConcesionarioCreado(ConcesionarioId concesionarioId)
    {
        super("RetoConcesionarioDDD.consecionarioCreado");
        this.concesionarioId=concesionarioId;
    }

    public ConcesionarioId getConcesionarioId() {
        return concesionarioId;
    }
}
