package co.com.sofka.sofkacars.usecase.taller;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.sofkacars.domain.concesionario.Concesionario;
import co.com.sofka.sofkacars.domain.concesionario.commands.AniadirAdmin;
import co.com.sofka.sofkacars.domain.taller.Taller;
import co.com.sofka.sofkacars.domain.taller.commands.AniadirMecanico;

public class AniadirMecanicoUseCase extends UseCase<RequestCommand<AniadirMecanico>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AniadirMecanico> aniadirMecanicoRequestCommand) {

        var command = aniadirMecanicoRequestCommand.getCommand();

        var taller = new Taller(command.getTallerId(), command.getConcesionarioId());
        taller.aniadirMecanico(command.getMecanicoId(),command.getNombre(),command.getIdentificacion());
        emit().onResponse(new ResponseEvents(taller.getUncommittedChanges()));
    }
}
