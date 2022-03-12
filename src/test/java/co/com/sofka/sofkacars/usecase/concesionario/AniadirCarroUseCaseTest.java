package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.commands.AniadirAdmin;
import co.com.sofka.sofkacars.domain.concesionario.commands.AniadirCarro;
import co.com.sofka.sofkacars.domain.concesionario.events.AdminAniadido;
import co.com.sofka.sofkacars.domain.concesionario.events.CarroAniadido;
import co.com.sofka.sofkacars.domain.concesionario.events.ConcesionarioCreado;
import co.com.sofka.sofkacars.domain.concesionario.ids.CarroId;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Color;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Email;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Marca;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Modelo;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Precio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.time.LocalDate;
import java.util.List;


@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class AniadirCarroUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void crearAdmin () {
        //arrange
        ConcesionarioId concesionarioId = ConcesionarioId.of("1");
        CarroId carroId = CarroId.of("2");
        Marca marca = new Marca(Marca.Value.Mazda);
        Modelo modelo = new Modelo(2021,03, 03);
        Color color = new Color(Color.Value.Blanco);
        Precio precio = new Precio(8000.00);

        var command = new AniadirCarro(concesionarioId,carroId,marca,modelo,color,precio);
        var usecase = new AniadirCarroUseCase();

        Mockito.when(repository.getEventsBy(concesionarioId.value())).thenReturn(historial());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("1")
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event=(CarroAniadido)events.get(1);
        Assertions.assertEquals("RetoConcesionarioDDD.CarroAniadido",event.type);
        Assertions.assertEquals(carroId,event.getCarroId());
        Assertions.assertEquals(marca,event.getMarca());
        Assertions.assertEquals(modelo,event.getModelo());
        Assertions.assertEquals(color,event.getColor());
        Assertions.assertEquals(precio,event.getPrecio());


    }

    public List<DomainEvent> historial() {

        return List.of(
                new ConcesionarioCreado(ConcesionarioId.of("1"))
        );
    }

}