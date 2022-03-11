package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.sofkacars.domain.concesionario.Concesionario;
import co.com.sofka.sofkacars.domain.concesionario.commands.AniadirAsesor;

public class AniadirAsesorUseCase extends UseCase<RequestCommand<AniadirAsesor>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AniadirAsesor> input) {
        var command = input.getCommand();
        var concesionario = new Concesionario(command.getConcesionarioId());
        emit().onResponse(new ResponseEvents(concesionario.getUncommittedChanges()));
    }
}
