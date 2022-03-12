package co.com.sofka.sofkacars.usecase.taller;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.commands.AniadirAdmin;
import co.com.sofka.sofkacars.domain.concesionario.commands.AniadirAsesor;
import co.com.sofka.sofkacars.domain.concesionario.events.AdminAniadido;
import co.com.sofka.sofkacars.domain.concesionario.events.ConcesionarioCreado;
import co.com.sofka.sofkacars.domain.concesionario.ids.AdministradorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Email;
import co.com.sofka.sofkacars.domain.taller.Taller;
import co.com.sofka.sofkacars.domain.taller.commands.AniadirMecanico;
import co.com.sofka.sofkacars.domain.taller.events.MecanicoAniadido;
import co.com.sofka.sofkacars.domain.taller.events.TallerCreado;
import co.com.sofka.sofkacars.domain.taller.ids.MecanicoId;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.usecase.concesionario.AniadirAdminUseCase;
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
class AniadirMecanicoUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void aniadirMecanico () {
        //arrange
        ConcesionarioId concesionarioId = ConcesionarioId.of("1");
        TallerId tallerId = TallerId.of("1");
        MecanicoId mecanicoId = MecanicoId.of("2");
        Nombre nombre = new Nombre("Jaa", "Alimaña");
        Identificacion identificacion = new Identificacion(123456L);

        var command = new AniadirMecanico(concesionarioId,tallerId,mecanicoId,nombre, identificacion);
        var usecase = new AniadirMecanicoUseCase();

        Mockito.when(repository.getEventsBy(tallerId.value())).thenReturn(historial());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("1")
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event=(MecanicoAniadido)events.get(1);
        Assertions.assertEquals("RetoConcesionarioDDD.MecanicoAniadido",event.type);
        Assertions.assertEquals(mecanicoId,event.getMecanicoId());
        Assertions.assertEquals(nombre,event.getNombre());
        Assertions.assertEquals(identificacion,event.getIdentificacion());



    }

    public List<DomainEvent> historial() {

        return List.of(
                new TallerCreado(TallerId.of("1"), ConcesionarioId.of("1"))
        );
    }

}