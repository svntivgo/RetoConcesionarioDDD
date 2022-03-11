package co.com.sofka.sofkacars.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.taller.ids.ServicioId;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Mantenimiento;

public class CambiarServicio extends Command {
    private final TallerId tallerId;
    private final ServicioId servicioId;
    private final Mantenimiento mantenimiento;

    public CambiarServicio(TallerId tallerId, ServicioId servicioId, Mantenimiento mantenimiento) {
        this.tallerId = tallerId;
        this.servicioId = servicioId;
        this.mantenimiento = mantenimiento;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public ServicioId getServicioId() {
        return servicioId;
    }

    public Mantenimiento getMantenimiento() {
        return mantenimiento;
    }
}
