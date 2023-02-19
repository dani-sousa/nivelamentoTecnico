package dto;

import enums.Destinos;
import utils.ArquivosUtils;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.util.List;
import java.util.Properties;

//extends quer dizer que o viagem nacional tera tudo que tem em viagem
public class ViagemNacional extends Viagem {
    private String cpf;

    public ViagemNacional(Destinos lugarDeDestino) {
        super(lugarDeDestino);
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {

        int limiteDeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedade("viagem.nacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limiteDeAcompanhantes) {
        super.setAcompanhantes(acompanhantes);
    } else {
           throw new Exception("Viagens nacionais não permitem mais que " + limiteDeAcompanhantes + " acompanhantes");
       }
    }
}
