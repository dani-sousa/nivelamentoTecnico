package dto;

import enums.Destinos;
import interfaces.CalculadoraDePrevisao;
import utils.ArquivosUtils;

import java.util.List;

public class ViagemInternacional extends Viagem implements CalculadoraDePrevisao {
    private String passaporte;

    public ViagemInternacional(Destinos lugarDeDestino) {
        super(lugarDeDestino);
    }

    public String getPassaporte() {
        return this.passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    //@override esta dizendo que vc esta reescrevendo um comportamento da classe pai
    @Override
    public int setAcompanhantes(List<Acompanhante> acompanhantes) throws  Exception {

        int limiteDeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedade("viagem.internacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limiteDeAcompanhantes) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens internacionais não podem ter mais que " + limiteDeAcompanhantes + " acompanhante");
        }
        return limiteDeAcompanhantes;
    }

        public int calcularPrevisaoDeDiasParaRetorno() {
            if (this.getDestino().equals(Destinos.MIAMI)) {
                return 1;
            }

            return 0;
    }
}
