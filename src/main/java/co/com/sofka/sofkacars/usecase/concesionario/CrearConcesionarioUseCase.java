package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.sofkacars.domain.concesionario.Concesionario;
import co.com.sofka.sofkacars.domain.concesionario.commands.CrearConcesionario;

public class CrearConcesionarioUseCase extends UseCase<RequestCommand<CrearConcesionario>, ResponseEvents> {

//    public static final int CATINDAD_PERMITIDA_DE_JUGADORES = 2;

    @Override
    public void executeUseCase(RequestCommand<CrearConcesionario> crearConcesionarioRequestCommand) {
        var command = crearConcesionarioRequestCommand.getCommand();
        var concesionario = new Concesionario(command.getConcesionarioId());
        emit().onResponse(new ResponseEvents(concesionario.getUncommittedChanges()));

//
    }
}

