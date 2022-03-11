package co.com.sofka.sofkacars.domain.concesionario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.concesionario.ids.CarroId;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;

public class EliminarCarro extends Command {
    private final ConcesionarioId concesionarioId;
    private final CarroId carroId;

    public EliminarCarro(ConcesionarioId concesionarioId, CarroId carroId) {
        this.concesionarioId = concesionarioId;
        this.carroId = carroId;
    }

    public ConcesionarioId getConcesionarioId() {
        return concesionarioId;
    }

    public CarroId getCarroId() {
        return carroId;
    }
}
