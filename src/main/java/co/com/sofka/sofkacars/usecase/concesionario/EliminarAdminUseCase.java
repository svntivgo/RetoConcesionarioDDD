package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.sofkacars.domain.concesionario.Concesionario;
import co.com.sofka.sofkacars.domain.concesionario.commands.EliminarAdmin;

public class EliminarAdminUseCase extends UseCase<RequestCommand<EliminarAdmin>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EliminarAdmin> input) {

        var command = input.getCommand();

        var concesionario = new Concesionario(command.getConcesionarioId());
        concesionario.eliminarAdmin(command.getAdministradorId());
        emit().onResponse(new ResponseEvents(concesionario.getUncommittedChanges()));
    }
}