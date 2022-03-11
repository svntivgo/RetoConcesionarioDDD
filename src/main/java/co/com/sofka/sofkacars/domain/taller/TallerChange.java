package co.com.sofka.sofkacars.domain.taller;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.sofkacars.domain.taller.entities.BaulHerramientas;
import co.com.sofka.sofkacars.domain.taller.entities.Mecanico;
import co.com.sofka.sofkacars.domain.taller.entities.Servicio;
import co.com.sofka.sofkacars.domain.taller.events.*;

public class TallerChange extends EventChange
{
    public TallerChange (Taller taller)
    {

        apply((TallerCreado event) -> {
            taller.tallerId = event.getTallerId();
        });

        //añadiendo BaulHerramientas

        apply((BaulHerramientasAniadido event) -> taller.baulHerramientas.add(new BaulHerramientas(
                event.getBaulHerramientasId(),
                event.getAlicates(),
                event.getGatos(),
                event.getLlavesInglesas()

        )));

        //cambiando  BaulHerramientas

        apply((BaulHerramientasCambiado event) -> taller.baulHerramientas.add(new BaulHerramientas(
                event.getBaulHerramientasId(),
                event.getAlicates(),
                event.getGatos(),
                event.getLlavesInglesas()

        )));


        //eliminando BaulHerramientas


        apply((BaulHerramientasEliminado event) -> {
            taller.baulHerramientas.forEach(baulHerramientas -> {
                if (baulHerramientas.identity().equals(event.getBaulHerramientasId())) {
                    taller.baulHerramientas.remove(baulHerramientas);
                }
            });
        });


        //añadiendo Mecanico

        apply((MecanicoAniadido event) -> taller.mecanicos.add(new Mecanico(
                event.getMecanicoId(),
                event.getNombre(),
                event.getIdentificacion()

        )));

        //cambiando Mecanico
        apply((MecanicoCambiado event) -> taller.mecanicos.add(new Mecanico(
                event.getMecanicoId(),
                event.getNombre(),
                event.getIdentificacion()

        )));

        //eliminando mecanico

        apply((MecanicoEliminado event) -> {
            taller.mecanicos.forEach(mecanico -> {
                if (mecanico.identity().equals(event.getMecanicoId())) {
                    taller.mecanicos.remove(mecanico);
                }
            });
        });

        //añadir servicio


        apply((ServicioAniadido event) -> {
            taller.servicio = new Servicio(
                    event.getServicioId(),
                    event.getMantenimiento()


            );
        });

        //Cambiar servicio


        apply((ServicioCambiado event) -> {
            taller.servicio = new Servicio(
                    event.getServicioId(),
                    event.getMantenimiento()

            );
        });

        //Eliminar servicio
        apply((ServicioEliminado event) ->
        {
            taller.servicio = null;
        });



    }
}
