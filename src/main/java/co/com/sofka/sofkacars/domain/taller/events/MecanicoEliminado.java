package co.com.sofka.sofkacars.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.taller.ids.MecanicoId;

public class MecanicoEliminado extends DomainEvent
{
    private final MecanicoId mecanicoId;

    public MecanicoEliminado(MecanicoId mecanicoId) {
        super("RetoConcesionarioDDD.MecanicoEliminado");
        this.mecanicoId = mecanicoId;
    }

    public MecanicoId getMecanicoId() {
        return mecanicoId;
    }
}

