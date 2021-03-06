package co.com.sofka.sofkacars.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.Concesionario;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;

public class TallerCreado  extends DomainEvent
{
    private TallerId tallerId;
    private ConcesionarioId concesionarioId;

    public TallerCreado(TallerId tallerId,ConcesionarioId concesionarioId)
    {
        super("RetoConcesionarioDDD.TallerCreado");
        this.tallerId=tallerId;
        this.concesionarioId=concesionarioId;
    }


    public ConcesionarioId getConcesionarioId() {
        return concesionarioId;
    }

    public TallerId getTallerId() {
        return tallerId;
    }
}
