package co.com.sofka.sofkacars.domain.concesionario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.concesionario.ids.CarroId;

public class EliminarCarro extends Command {
    private final CarroId carroId;

    public EliminarCarro(CarroId carroId) {
        this.carroId = carroId;
    }

    public CarroId getCarroId() {
        return carroId;
    }
}
