package co.com.sofka.sofkacars.domain.concesionario.ids;

import co.com.sofka.domain.generic.Identity;

public class ConcesionarioId extends Identity
{
    // constructores
    private ConcesionarioId(String value) {
        super(value);
    }

    public ConcesionarioId(){}

    public static ConcesionarioId of(String value){
        return new ConcesionarioId(value);
    }

}
