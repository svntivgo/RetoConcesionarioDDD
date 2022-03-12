package co.com.sofka.sofkacars.usecase.taller;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.sofkacars.domain.concesionario.Concesionario;
import co.com.sofka.sofkacars.domain.concesionario.commands.CrearConcesionario;
import co.com.sofka.sofkacars.domain.taller.Taller;
import co.com.sofka.sofkacars.domain.taller.commands.CrearTaller;

public class CrearTallerUseCase extends UseCase<RequestCommand<CrearTaller>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearTaller> crearTallerRequestCommand) {
        var command = crearTallerRequestCommand.getCommand();
        var taller = new Taller(command.getTallerId(), command.getConcesionarioId());
        emit().onResponse(new ResponseEvents(taller.getUncommittedChanges()));

    }
}