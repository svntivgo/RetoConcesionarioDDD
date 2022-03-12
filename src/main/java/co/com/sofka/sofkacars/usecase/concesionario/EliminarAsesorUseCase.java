package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.sofkacars.domain.concesionario.Concesionario;
import co.com.sofka.sofkacars.domain.concesionario.commands.EliminarAsesor;

public class EliminarAsesorUseCase extends UseCase<RequestCommand<EliminarAsesor>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EliminarAsesor> input) {

        var command = input.getCommand();

        var concesionario = new Concesionario(command.getConcesionarioId());
        concesionario.eliminarAsesor(command.getAsesorId());
        emit().onResponse(new ResponseEvents(concesionario.getUncommittedChanges()));
    }
}
