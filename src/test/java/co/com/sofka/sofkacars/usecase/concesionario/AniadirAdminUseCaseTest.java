package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.commands.AniadirAdmin;
import co.com.sofka.sofkacars.domain.concesionario.events.AdminAniadido;
import co.com.sofka.sofkacars.domain.concesionario.events.ConcesionarioCreado;
import co.com.sofka.sofkacars.domain.concesionario.ids.AdministradorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Email;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.List;


@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class AniadirAdminUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void crearAdmin () {
        //arrange
        ConcesionarioId concesionarioId = ConcesionarioId.of("1");
        AdministradorId administradorId = AdministradorId.of("2");
        Nombre nombre = new Nombre("Jaa", "Alimaña");
        Identificacion identificacion = new Identificacion(123456L);
        Email email = new Email("admin@concesionario.com");

        var command = new AniadirAdmin(concesionarioId,administradorId,nombre, identificacion, email);
        var usecase = new AniadirAdminUseCase();

        Mockito.when(repository.getEventsBy(concesionarioId.value())).thenReturn(historial());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("1")
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event=(AdminAniadido)events.get(1);
        Assertions.assertEquals("RetoConcesionarioDDD.AdminAniadido",event.type);
        Assertions.assertEquals(administradorId,event.getAdministradorId());
        Assertions.assertEquals(nombre,event.getNombre());
        Assertions.assertEquals(identificacion,event.getIdentificacion());
        Assertions.assertEquals(email,event.getEmail());


    }

    public List<DomainEvent> historial() {

        return List.of(
                new ConcesionarioCreado(ConcesionarioId.of("1"))
        );
    }

}