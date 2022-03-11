package co.com.sofka.sofkacars.domain.concesionario;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.sofkacars.domain.concesionario.entities.Administrador;
import co.com.sofka.sofkacars.domain.concesionario.entities.Asesor;
import co.com.sofka.sofkacars.domain.concesionario.entities.Carro;
import co.com.sofka.sofkacars.domain.concesionario.events.*;

public class ConsecionarioChange extends EventChange
{
    public ConsecionarioChange(Concesionario concesionario)
    {
        apply((ConcesionarioCreado event) -> concesionario.concesionarioId = event.getConcesionarioId());

        //métodos de cada uno de las entidades
        //añadiendo carros

        apply((CarroAniadido event) -> concesionario.carros.add(new Carro(
                event.getCarroId(),
                event.getMarca(),
                event.getModelo(),
                event.getColor(),
                event.getPrecio()
        )));

        //cambiandoCarros
        apply((CarroCambiado event) -> {
            concesionario.carros.add(new Carro(
                    event.getCarroId(),
                    event.getMarca(),
                    event.getModelo(),
                    event.getColor(),
                    event.getPrecio()
            ));
        });

        // eliminarCaro()
        apply((CarroEliminado event) -> {
            concesionario.carros.forEach(carro -> {
                if (carro.identity().equals(event.getCarroId())) {
                    concesionario.carros.remove(carro);
                }
            });
        });


        //añadir Admin
        apply((AdminAniadido event) -> {
            concesionario.administrador = new Administrador(
                    event.getAdministradorId(),
                    event.getNombre(),
                    event.getIdentificacion(),
                    event.getEmail()
            );
        });

        //Cambiar Admin
        apply((AdminCambiado event) -> {
            concesionario.administrador = new Administrador(
                    event.getAdministradorId(),
                    event.getNombre(),
                    event.getIdentificacion(),
                    event.getEmail()
            );
        });

        //Eliminar Admin
        apply((AdminEliminado event) ->
        {
            concesionario.administrador = null;
        });

        // añadirAsesor()

        apply((AsesorAniadido event) -> {
            concesionario.asesores.add(new Asesor(
                    event.getAsesorId(),
                    event.getNombre(),
                    event.getIdentificacion(),
                    event.getTelefono()
            ));
        });

        // cambiarAsesor()

        apply((AsesorCambiado event) -> {
            Asesor nuevoAsesor = new Asesor(event.getAsesorId(),
                    event.getNombre(),
                    event.getIdentificacion(),
                    event.getTelefono());


            concesionario.asesores.forEach((asesor) -> {
                if(asesor.equals(nuevoAsesor)){
                    concesionario.asesores.remove(asesor);
                    concesionario.asesores.add(nuevoAsesor);
                }
            });
        });

        // eliminarAsesor()

        apply((AsesorEliminado event) -> {
            concesionario.asesores.forEach(asesor -> {
                if (asesor.identity().equals(event.getAsesorId())) {
                    concesionario.asesores.remove(asesor);
                }
            });
        });





    }





}
