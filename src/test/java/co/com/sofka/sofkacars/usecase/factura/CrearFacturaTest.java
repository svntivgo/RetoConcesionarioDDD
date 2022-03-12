package co.com.sofka.sofkacars.usecase.factura;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.sofkacars.domain.concesionario.commands.CrearConcesionario;
import co.com.sofka.sofkacars.domain.concesionario.events.ConcesionarioCreado;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.factura.Factura;
import co.com.sofka.sofkacars.domain.factura.commands.CrearFactura;
import co.com.sofka.sofkacars.domain.factura.events.FacturaCreada;
import co.com.sofka.sofkacars.domain.factura.ids.FacturaId;
import co.com.sofka.sofkacars.usecase.concesionario.CrearFacturaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrearFacturaTest
{
    @Test
    void crearFactura () {
        //arrange
        ConcesionarioId concesionarioId = ConcesionarioId.of("1");
        FacturaId facturaId = FacturaId.of("1");
        var command = new CrearFactura(facturaId,concesionarioId);
        var usecase = new CrearFacturaUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        var event=(FacturaCreada)events.get(0);
        Assertions.assertEquals("RetoConcesionarioDDD.FacturaCreada",event.type);
        Assertions.assertEquals("1",event.getFacturaId().value());
        Assertions.assertEquals("1",event.getConcesionarioId().value());




    }
}
