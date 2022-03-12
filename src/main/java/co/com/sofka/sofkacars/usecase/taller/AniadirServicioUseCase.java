package co.com.sofka.sofkacars.usecase.taller;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.sofkacars.domain.taller.Taller;
import co.com.sofka.sofkacars.domain.taller.commands.AniadirServicio;

public class AniadirServicioUseCase extends UseCase<RequestCommand<AniadirServicio>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AniadirServicio> aniadirMecanicoRequestCommand) {

        var command = aniadirMecanicoRequestCommand.getCommand();

        var taller = new Taller(command.getTallerId(), command.getConcesionarioId());
        taller.aniadirServicio(command.getServicioId(),command.getMantenimiento());
        emit().onResponse(new ResponseEvents(taller.getUncommittedChanges()));
    }
}