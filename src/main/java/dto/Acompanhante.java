package dto;

public class Acompanhante {
    private String nome;
    //boolean verdadeiro ou falso
    private boolean confirmouCadastro;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //para boleanos uma boa pratica vc escrever o "is" ao invés do get porque vc esta fazendo uma
    //pergunta para a sua classe
    public boolean isConfirmouCadastro() {
        return this.confirmouCadastro;
    }

    public void setConfirmouCadastro(boolean confirmouCadastro) {
        this.confirmouCadastro = confirmouCadastro;
    }
}
