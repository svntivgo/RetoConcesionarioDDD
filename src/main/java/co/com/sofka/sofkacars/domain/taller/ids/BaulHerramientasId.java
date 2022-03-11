package co.com.sofka.sofkacars.domain.taller.ids;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.sofkacars.domain.concesionario.ids.AdministradorId;

public class BaulHerramientasId extends Identity
{
    // constructores
    private BaulHerramientasId(String value) {
        super(value);
    }

    public BaulHerramientasId(){}

    public static BaulHerramientasId of(String value){
        return new BaulHerramientasId(value);
    }
}
