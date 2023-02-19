package app;

import dto.Acompanhante;
import dto.Viagem;
import enums.Destinos;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Viagem viagem = new Viagem(Destinos.OSASCO);

        viagem.setDestino(Destinos.MARINGA);

        viagem.setDestino(Destinos.MANAUS);

        Acompanhante acompanhante1 = new Acompanhante();
        acompanhante1.setNome("Harlyson Biscardi");
        acompanhante1.setConfirmouCadastro(true);

        Acompanhante acompanhante2 = new Acompanhante();
        acompanhante2.setNome("Amora Karoline");
        acompanhante2.setConfirmouCadastro(false);

        List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante2);

        viagem.setAcompanhantes(acompanhantes);

        System.out.println(viagem.getDestino().getCidade());
        //size() mostra a quantidade de acompanhantes na viagem
        System.out.println(viagem.getAcompanhantes().size());
        //get(0) significa que eu quero saber quem foi o primeiro acompanhante add na lista
        System.out.println(viagem.getAcompanhantes().get(0).getNome());
        //0,1,2,3,4.....
        //0 = "Harlyson"
        //1 = "Amora"
        System.out.println(viagem.getAcompanhantes().get(1).getNome());

    }
}
