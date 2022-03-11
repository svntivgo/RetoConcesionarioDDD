package co.com.sofka.sofkacars.domain.factura.ids;

import co.com.sofka.domain.generic.Identity;

public class TransaccionId extends Identity {

    // constructores
    private TransaccionId(String value) {
        super(value);
    }

    public TransaccionId(){}

    public static TransaccionId of(String value){
        return new TransaccionId(value);
    }
}
