package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.sofkacars.domain.concesionario.Concesionario;
import co.com.sofka.sofkacars.domain.concesionario.commands.CambiarAsesor;

public class CambiarAsesorUseCase  extends UseCase<RequestCommand<CambiarAsesor>, ResponseEvents>
{

    @Override
    public void executeUseCase(RequestCommand<CambiarAsesor> cambiarAsesorRequestCommand)
    {
        var command = cambiarAsesorRequestCommand.getCommand();
        var concesionario = Concesionario.from(command.getConcesionarioId(),retrieveEvents());

        concesionario.cambiarAsesor(command.getAsesorId(),command.getNombre(),command.getIdentificacion(),command.getTelefono());
        emit().onResponse(new ResponseEvents(concesionario.getUncommittedChanges()));
    }
}