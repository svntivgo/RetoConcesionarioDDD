package co.com.sofka.sofkacars.domain.concesionario;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.sofkacars.domain.concesionario.events.ConcesionarioCreado;

public class ConsecionarioChange extends EventChange
{
    public ConsecionarioChange(Concesionario concesionario)
    {
        apply((ConcesionarioCreado event) -> {
            concesionario.concesionarioId = event.getConcesionarioId();
        });

        //métodos de cada uno de las entidades
        //añadiendo carros




    }





}
