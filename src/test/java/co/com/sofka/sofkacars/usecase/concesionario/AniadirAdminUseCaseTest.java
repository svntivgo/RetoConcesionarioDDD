package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.sofkacars.domain.concesionario.commands.AniadirAdmin;
import co.com.sofka.sofkacars.domain.concesionario.commands.AniadirAsesor;
import co.com.sofka.sofkacars.domain.concesionario.events.AdminAniadido;
import co.com.sofka.sofkacars.domain.concesionario.ids.AdministradorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Email;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Telefono;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AniadirAdminUseCaseTest {
    @Test
    void aniadirAdmin () {
        //arrange
        ConcesionarioId concesionarioId = ConcesionarioId.of(("IDconcesionario"));
        AdministradorId administradorId = AdministradorId.of("IDasesor");
        Nombre nombre = new Nombre("Jaa", "Alimaña");
        Identificacion identificacion = new Identificacion(123456L);
        Email email = new Email("admin@sofka.com");

        var command = new AniadirAdmin(concesionarioId, administradorId, nombre, identificacion, email);
        var usecase = new AniadirAdminUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (AdminAniadido) events.get(0);
        System.out.println(event);
    }
}