package dto;

import enums.Destinos;
import java.util.List;

//private serve para proteger atributos
public class Viagem {
    private Destinos destino;
    private List<Acompanhante> acompanhantes;

    public Viagem(Destinos lugarDeDestino) {
        this.destino = lugarDeDestino;
    }

    //get é um pegador tem que devolver algo
    public Destinos getDestino() {
        return this.destino;
    }
    //void não recebe nada apenas envia não tem retorno
    //set é um configurador ele joga a informação
    public void setDestino(Destinos lugarDeDestino) {
        this.destino = lugarDeDestino;
    }

    public List<Acompanhante> getAcompanhantes() {
        return this.acompanhantes;
    }

    public int setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {
        this.acompanhantes = acompanhantes;
        return 0;
    }
}

//aula encapsulamento:
//metodos tem esse formato: public (modificador), tipo (string), nome do metodo (getDestino) e parametros
//porque usar encapsulamento? Porque eu não quero que qualquer um tenha acesso ao destino

//aula enums:
//são tipos predefinidos para ser utilizados pelo código

//