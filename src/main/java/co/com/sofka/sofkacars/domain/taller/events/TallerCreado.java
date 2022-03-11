package co.com.sofka.sofkacars.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;

public class TallerCreado  extends DomainEvent
{
    private TallerId tallerId;

    public TallerCreado(TallerId tallerId)
    {
        super("RetoConcesionarioDDD.TallerCreado");
        this.tallerId=tallerId;
    }





    public TallerId getTallerId() {
        return tallerId;
    }
}
