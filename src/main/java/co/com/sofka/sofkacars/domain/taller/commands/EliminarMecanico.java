package co.com.sofka.sofkacars.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.taller.ids.MecanicoId;

public class EliminarMecanico extends Command {
    private final MecanicoId mecanicoId;

    public EliminarMecanico(MecanicoId mecanicoId) {
        this.mecanicoId = mecanicoId;
    }
}
