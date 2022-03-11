package co.com.sofka.sofkacars.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.taller.ids.MecanicoId;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;

public class EliminarMecanico extends Command {
    private final TallerId tallerId;
    private final MecanicoId mecanicoId;

    public EliminarMecanico(TallerId tallerId, MecanicoId mecanicoId) {
        this.tallerId = tallerId;
        this.mecanicoId = mecanicoId;
    }
}
