package co.com.sofka.sofkacars.domain.taller.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.sofkacars.domain.taller.ids.BaulHerramientasId;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Alicates;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Gatos;
import co.com.sofka.sofkacars.domain.taller.valueobjects.LlavesInglesas;
import co.com.sofka.sofkacars.generics.Nombre;

import java.util.Objects;

public class BaulHerramientas extends Entity<BaulHerramientasId>
{
    private Alicates alicates;
    private Gatos gatos;
    private LlavesInglesas llavesInglesas;

    public BaulHerramientas(BaulHerramientasId baulHerramientasId  , Alicates alicates, Gatos gatos, LlavesInglesas llavesInglesas) {
        super(baulHerramientasId);
        this.alicates = alicates;
        this.gatos = gatos;
        this.llavesInglesas = llavesInglesas;
    }

    // cambiarAlicates()
    public void cambiarAlicates(Alicates alicates) {
        this.alicates = Objects.requireNonNull(alicates);
    }

    // cambiarGatos()
    public void cambiarGatos(Gatos gatos) {
        this.gatos = Objects.requireNonNull(gatos);
    }

    // cambiarLlavesInglesas()
    public void cambiarLlavesInglesas(LlavesInglesas llavesInglesas) {
        this.llavesInglesas = Objects.requireNonNull(llavesInglesas);
    }
}
