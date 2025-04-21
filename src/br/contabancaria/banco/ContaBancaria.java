package src.br.contabancaria.banco;

import java.util.ArrayList;

public class ContaBancaria {
    private double saldo;
    private Usuario usuario;
    private ArrayList<String> historico; // Lista para o extrato

    public ContaBancaria(Usuario usuario) {
        this.saldo = 0.0;
        this.usuario = usuario;
        this.historico = new ArrayList<>();
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            historico.add("Depósito: R$" + valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            historico.add("Saque: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void transferir(double valor, ContaBancaria contaDestino) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            contaDestino.depositar(valor);
            historico.add("Transferência: R$" + valor + " para " + contaDestino.getUsuario().getEmail());
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void verExtrato() {
        System.out.println("Extrato da conta:");
        for (String transacao : historico) {
            System.out.println(transacao);
        }
        System.out.println("Saldo atual: R$" + saldo);
    }

    public Usuario getUsuario() {
        return usuario;
    }
}

