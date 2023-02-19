package dto;

import enums.Destinos;

import java.util.List;

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
       if (acompanhantes.size() <= 4) {
        super.setAcompanhantes(acompanhantes);
    } else {
           throw  new Exception("Viagens nacionais não permitem mais que 4 acompanhantes");
       }
    }
}
