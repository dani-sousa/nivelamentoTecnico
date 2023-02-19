package app;

import dto.Viagem;
import enums.Destinos;

public class App {
    public static void main(String[] args) {
        Viagem viagem = new Viagem(Destinos.OSASCO);

        viagem.setDestino(Destinos.MARINGA);

       //  viagem.setDestino(Destinos.MANAUS);

        System.out.println(viagem.getDestino().getCidade());
    }
}
