package co.com.sofka.sofkacars.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.taller.ids.ServicioId;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;

public class EliminarServicio extends Command {
    private final TallerId tallerId;
    private final ServicioId servicioId;

    public EliminarServicio(TallerId tallerId, ServicioId servicioId) {
        this.tallerId = tallerId;
        this.servicioId = servicioId;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public ServicioId getServicioId() {
        return servicioId;
    }
}
