package co.com.sofka.sofkacars.domain.taller.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.sofkacars.domain.taller.ids.ServicioId;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Mantenimiento;


import java.util.Objects;

public class Servicio extends Entity<ServicioId>
{
    private Mantenimiento mantenimiento;


    public Servicio(ServicioId servicioId, Mantenimiento mantenimiento) {
        super(servicioId);
        this.mantenimiento = mantenimiento;
    }

    //--------------FALTA TERMINAR-------------------

    public void nuevoMantenimiento(Mantenimiento mantenimiento)
    {
        this.mantenimiento= Objects.requireNonNull(mantenimiento);
    }
}
