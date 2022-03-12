package co.com.sofka.sofkacars.domain.factura.ids;

import co.com.sofka.domain.generic.Identity;

public class FacturaId extends Identity {

    // constructores
    private FacturaId(String value) {
        super(value);
    }

    public FacturaId(){}

    public static FacturaId of(String value){
        return new FacturaId(value);
    }


}