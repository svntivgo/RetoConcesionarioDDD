package co.com.sofka.sofkacars.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.taller.ids.ServicioId;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Mantenimiento;

public class CambiarServicio extends Command {
    private final ServicioId servicioId;
    private final Mantenimiento mantenimiento;

    public CambiarServicio(ServicioId servicioId, Mantenimiento mantenimiento) {
        this.servicioId = servicioId;
        this.mantenimiento = mantenimiento;
    }

    public ServicioId getServicioId() {
        return servicioId;
    }

    public Mantenimiento getMantenimiento() {
        return mantenimiento;
    }
}
