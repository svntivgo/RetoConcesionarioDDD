package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.sofkacars.domain.factura.Factura;
import co.com.sofka.sofkacars.domain.factura.commands.CrearFactura;

public class CrearFacturaUseCase extends UseCase<RequestCommand<CrearFactura>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearFactura> crearFacturaRequestCommand)
    {
        var command = crearFacturaRequestCommand.getCommand();
        var factura = new Factura(command.getFacturaId(),command.getConcesionarioId());
        emit().onResponse(new ResponseEvents(factura.getUncommittedChanges()));

    }
}
