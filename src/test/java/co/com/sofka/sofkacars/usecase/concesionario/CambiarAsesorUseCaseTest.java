package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.commands.CambiarAdmin;
import co.com.sofka.sofkacars.domain.concesionario.commands.CambiarAsesor;
import co.com.sofka.sofkacars.domain.concesionario.events.AdminCambiado;
import co.com.sofka.sofkacars.domain.concesionario.events.AsesorAniadido;
import co.com.sofka.sofkacars.domain.concesionario.events.AsesorCambiado;
import co.com.sofka.sofkacars.domain.concesionario.events.ConcesionarioCreado;
import co.com.sofka.sofkacars.domain.concesionario.ids.AdministradorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Email;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Telefono;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class CambiarAsesorUseCaseTest
{


    @Mock
    private DomainEventRepository repository;

    @Test
    void cambiarAsesor () {
        //arrange
        ConcesionarioId concesionarioId = ConcesionarioId.of("1");
        AsesorId asesorId = AsesorId.of("2");
        Nombre nombre = new Nombre("Jaa", "Alimaña");
        Identificacion identificacion = new Identificacion(123456L);
        Telefono telefono = new Telefono("3104567896");

        var command = new CambiarAsesor(concesionarioId,asesorId,nombre, identificacion, telefono);
        var usecase = new CambiarAsesorUseCase();

        Mockito.when(repository.getEventsBy(concesionarioId.value())).thenReturn(historial());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(concesionarioId.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event=(AsesorCambiado)events.get(1);
        Assertions.assertEquals("RetoConcesionarioDDD.AsesorCambiado",event.type);
        Assertions.assertEquals(asesorId,event.getAsesorId());
        Assertions.assertEquals(nombre,event.getNombre());
        Assertions.assertEquals(identificacion,event.getIdentificacion());
        Assertions.assertEquals(telefono,event.getTelefono());


    }

    public List<DomainEvent> historial() {

        return List.of(
                new ConcesionarioCreado(ConcesionarioId.of("1"))
        );
    }
}