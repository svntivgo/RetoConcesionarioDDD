package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.sofkacars.domain.concesionario.Concesionario;
import co.com.sofka.sofkacars.domain.concesionario.commands.AniadirCarro;

public class AniadirCarroUseCase extends UseCase<RequestCommand<AniadirCarro>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AniadirCarro> input) {
        var command = input.getCommand();

        var concecionario = new Concesionario(command.getConcesionarioId());

        concecionario.aniadirCarro(command.getCarroId(),command.getMarca(),command.getModelo(),command.getColor(),command.getPrecio());
        emit().onResponse(new ResponseEvents(concecionario.getUncommittedChanges()));
    }
}
