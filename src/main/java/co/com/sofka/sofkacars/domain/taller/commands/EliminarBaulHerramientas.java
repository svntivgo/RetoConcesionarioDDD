package co.com.sofka.sofkacars.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.taller.ids.BaulHerramientasId;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;

public class EliminarBaulHerramientas extends Command {
    private final TallerId tallerId;
    private final BaulHerramientasId baulHerramientasId;

    public EliminarBaulHerramientas(TallerId tallerId, BaulHerramientasId baulHerramientasId) {
        this.tallerId = tallerId;
        this.baulHerramientasId = baulHerramientasId;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public BaulHerramientasId getBaulHerramientasId() {
        return baulHerramientasId;
    }
}
