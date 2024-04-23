package controller;

import entity.Conta;
import repository.IRepositorioConta;
import repository.RepositorioConta;
import exception.ExcecaoElementoInexistente;

public class ControladorConta implements IControladorConta {
    private IRepositorioConta repositorioConta;

    public ControladorConta() {
        inicializarRepositorioConta();
    }

    private void inicializarRepositorioConta() {
        this.repositorioConta = new RepositorioConta();
    }

    public void inserirConta(Conta conta) {
        this.repositorioConta.inserirConta(conta);
    }

    public void alterarConta(String numero) {
        this.repositorioConta.alterarConta(numero);
    }

    public void removerConta(String numero) {
        repositorioConta.removerConta(numero);
    }

    public Conta buscarConta(String numero) throws ExcecaoElementoInexistente {
        return repositorioConta.buscarConta(numero);
    }

    public boolean verificarExistenciaConta(String numero) {
        return repositorioConta.verificarExistenciaConta(numero);
    }

    public void mostrarContas() {
        this.repositorioConta.mostrarContas();
    }
}
