package co.com.sofka.sofkacars.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.taller.ids.ServicioId;

public class EliminarServicio extends Command {
    private final ServicioId servicioId;

    public EliminarServicio(ServicioId servicioId) {
        this.servicioId = servicioId;
    }
}
