package co.com.sofka.sofkacars.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.taller.ids.MecanicoId;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;

public class AniadirMecanico extends Command {
    private final MecanicoId mecanicoId;
    private final Nombre nombre;
    private final Identificacion identificacion;


    public AniadirMecanico(MecanicoId mecanicoId, Nombre nombre, Identificacion identificacion ) {
        this.mecanicoId = mecanicoId;
        this.nombre = nombre;
        this.identificacion = identificacion;

    }

    public MecanicoId getMecanicoId() {
        return mecanicoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }
}
