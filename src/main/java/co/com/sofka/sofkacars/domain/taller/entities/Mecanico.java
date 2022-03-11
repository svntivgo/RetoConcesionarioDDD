package co.com.sofka.sofkacars.domain.taller.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.sofkacars.domain.taller.ids.MecanicoId;
import co.com.sofka.sofkacars.generics.Alicate;
import co.com.sofka.sofkacars.generics.Nombre;

public class Mecanico extends Entity<MecanicoId>
{
    private Nombre nombre;
    private Alicate identificacion;


    public Mecanico(MecanicoId mecanicoId, Nombre nombre, Alicate identificacion) {
        super(mecanicoId);
        this.nombre = nombre;
        this.identificacion = identificacion;
    }
}
