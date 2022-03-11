package co.com.sofka.sofkacars.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.taller.ids.BaulHerramientasId;

public class BaulHerramientasEliminado extends DomainEvent {
    private final BaulHerramientasId baulHerramientasId;

    public BaulHerramientasEliminado(BaulHerramientasId baulHerramientasId) {
        super("RetoConcesionarioDDD.BaulHerramientasEliminado");
        this.baulHerramientasId = baulHerramientasId;
    }

    public BaulHerramientasId getBaulHerramientasId() {
        return baulHerramientasId;
    }
}
