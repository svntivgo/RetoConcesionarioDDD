package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.sofkacars.domain.concesionario.Concesionario;
import co.com.sofka.sofkacars.domain.concesionario.commands.CambiarAdmin;

public class CambiarAdminUseCase  extends UseCase <RequestCommand<CambiarAdmin>, ResponseEvents>
{

    @Override
    public void executeUseCase(RequestCommand<CambiarAdmin> cambiarAdminRequestCommand)
    {
        var command = cambiarAdminRequestCommand.getCommand();
        var concesionario = Concesionario.from(command.getConcesionarioId(),retrieveEvents());

        concesionario.cambiarAdmin(command.getAdministradorId(),command.getNombre(),command.getIdentificacion(),
                command.getEmail());
        emit().onResponse(new ResponseEvents(concesionario.getUncommittedChanges()));
    }
}
