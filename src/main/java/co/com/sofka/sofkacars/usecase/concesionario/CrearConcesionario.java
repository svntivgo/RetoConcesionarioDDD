package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearConcesionario extends UseCase<RequestCommand<co.com.sofka.sofkacars.domain.concesionario.commands.CrearConcesionario>, ResponseEvents> {

//    public static final int CATINDAD_PERMITIDA_DE_JUGADORES = 2;

    @Override
    public void executeUseCase(RequestCommand<co.com.sofka.sofkacars.domain.concesionario.commands.CrearConcesionario> input) {
        var command = input.getCommand();

//        var factory = JugadorFactory.builder();
//        command.getTuplaJugadores().forEach(tuplaJugador -> factory.nuevoJugador(
//                tuplaJugador.getJugadorId(), tuplaJugador.getNombre(), tuplaJugador.getCapital()
//        ));
//
//        if (factory.jugadores().size() < CATINDAD_PERMITIDA_DE_JUGADORES) {
//            throw new BusinessException(command.getJuegoId().value(), "No se puede crear el juego por que no tiene la cantidad necesaria de jugadores");
//        }
//
//        var juego = new Juego(command.getJuegoId(), factory);
//
//        emit().onResponse(new ResponseEvents(juego.getUncommittedChanges()));
    }
}

