package co.com.sofka.sofkacars.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.taller.ids.ServicioId;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Mantenimiento;

public class AniadirServicio extends Command {
    private final ConcesionarioId concesionarioId;
    private final TallerId tallerId;
    private final ServicioId servicioId;
    private final Mantenimiento mantenimiento;

    public AniadirServicio(ConcesionarioId concesionarioId, TallerId tallerId,ServicioId servicioId, Mantenimiento mantenimiento) {
        this.concesionarioId = concesionarioId;
        this.tallerId = tallerId;
        this.servicioId = servicioId;
        this.mantenimiento = mantenimiento;
    }

    public ConcesionarioId getConcesionarioId() {
        return concesionarioId;
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
