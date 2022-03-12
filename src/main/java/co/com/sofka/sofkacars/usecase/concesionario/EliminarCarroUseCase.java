package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.sofkacars.domain.concesionario.Concesionario;
import co.com.sofka.sofkacars.domain.concesionario.commands.EliminarCarro;

public class EliminarCarroUseCase extends UseCase<RequestCommand<EliminarCarro>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EliminarCarro> input) {

        var command = input.getCommand();

        var concesionario = new Concesionario(command.getConcesionarioId());
        concesionario.eliminarCarro(command.getCarroId());
        emit().onResponse(new ResponseEvents(concesionario.getUncommittedChanges()));
    }
}
