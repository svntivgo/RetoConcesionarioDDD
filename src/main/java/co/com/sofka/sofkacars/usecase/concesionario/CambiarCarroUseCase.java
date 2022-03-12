package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.sofkacars.domain.concesionario.Concesionario;

import co.com.sofka.sofkacars.domain.concesionario.commands.CambiarCarro;

public class CambiarCarroUseCase extends UseCase<RequestCommand<CambiarCarro>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarCarro> cambiarCarroRequestCommand)
    {
        var command = cambiarCarroRequestCommand.getCommand();
        var concesionario = Concesionario.from(command.getConcesionarioId(),retrieveEvents());

        concesionario.cambiarCarro(command.getCarroId(),command.getMarca(),command.getModelo(),
                command.getColor(),command.getPrecio());
        emit().onResponse(new ResponseEvents(concesionario.getUncommittedChanges()));

    }
}
