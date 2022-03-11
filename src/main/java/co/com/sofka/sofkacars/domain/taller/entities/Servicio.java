package co.com.sofka.sofkacars.domain.taller.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.sofkacars.domain.taller.ids.ServicioId;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Mantenimiento;
import com.sun.jdi.Value;

public class Servicio extends Entity<ServicioId>
{
    private Mantenimiento mantenimiento;
    private Mantenimiento.Value value;

    public Servicio(ServicioId servicioId, Mantenimiento mantenimiento) {
        super(servicioId);
        this.mantenimiento = mantenimiento;
    }

    //--------------FALTA TERMINAR-------------------

//    public void nuevoMantenimiento(Mantenimiento mantenimiento)
//    {
//        this.mantenimiento= new Mantenimiento(Mantenimiento.Value.MantenimientoGeneral,Mantenimiento.Value.CambiarLlantas,Mantenimiento.Value.CambiarAceite, Mantenimiento.Value.value);
//    }
}
