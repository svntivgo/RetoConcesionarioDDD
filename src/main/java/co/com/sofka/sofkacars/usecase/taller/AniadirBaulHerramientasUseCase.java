package co.com.sofka.sofkacars.usecase.taller;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.sofkacars.domain.taller.Taller;
import co.com.sofka.sofkacars.domain.taller.commands.AniadirBaulHerramientas;

public class AniadirBaulHerramientasUseCase extends UseCase<RequestCommand<AniadirBaulHerramientas>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AniadirBaulHerramientas> aniadirBaulHerramientasRequestCommand) {

        var command = aniadirBaulHerramientasRequestCommand.getCommand();

        var taller = new Taller(command.getTallerId(), command.getConcesionarioId());
        taller.aniadirBaulHerramientas(command.getBaulHerramientasId(),command.getLlavesInglesas(),command.getGatos(),command.getAlicates());
        emit().onResponse(new ResponseEvents(taller.getUncommittedChanges()));
    }
}
