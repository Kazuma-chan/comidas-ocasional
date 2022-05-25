package entidades;

import java.util.ArrayList;

public class Cliente {
    String nome;
    Cadastro cadastro;
    ArrayList<Endereco> enderecos = new ArrayList<Endereco>();

    public Cliente(String nome, Cadastro cadastro) {
        this.nome = nome;
        this.cadastro = cadastro;
    }

    public Cadastro getCadastro() {
        return this.cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public Endereco getEndereco(int index) {
        return this.enderecos.get(index);
    }

    public void setEndereco(int index, Endereco endereco) {
        this.enderecos.set(index, endereco);
    }

    public void deleteEndereco(int index) {
        this.enderecos.remove(index);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
