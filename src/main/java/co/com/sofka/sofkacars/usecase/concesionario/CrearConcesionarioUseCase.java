package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.sofkacars.domain.concesionario.Concesionario;
import co.com.sofka.sofkacars.domain.concesionario.commands.CrearConcesionario;

public class CrearConcesionarioUseCase extends UseCase<RequestCommand<CrearConcesionario>, ResponseEvents> {

//    public static final int CATINDAD_PERMITIDA_DE_JUGADORES = 2;

    @Override
    public void executeUseCase(RequestCommand<CrearConcesionario> input) {
        var command = input.getCommand();
        var concesionario = new Concesionario(command.getConcesionarioId());
        emit().onResponse(new ResponseEvents(concesionario.getUncommittedChanges()));

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

