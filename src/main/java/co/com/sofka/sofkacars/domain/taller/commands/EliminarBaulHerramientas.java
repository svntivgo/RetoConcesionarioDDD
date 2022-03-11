package co.com.sofka.sofkacars.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.taller.ids.BaulHerramientasId;

public class EliminarBaulHerramientas extends Command {
    private final BaulHerramientasId baulHerramientasId;

    public EliminarBaulHerramientas(BaulHerramientasId baulHerramientasId) {
        this.baulHerramientasId = baulHerramientasId;
    }
}
