package co.com.sofka.sofkacars.domain.taller.ids;

import co.com.sofka.domain.generic.Identity;

public class MecanicoId  extends Identity
{
    // constructores
    private MecanicoId(String value) {
        super(value);
    }

    public MecanicoId(){}

    public static MecanicoId of(String value){
        return new MecanicoId(value);
    }
}
