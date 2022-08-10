package com.bancodigital.dio;

public class Main {

	public static void main(String[] args) {
		Cliente guilherme = new Cliente();
		guilherme.setNome("Guilherme");
		
		Conta cc = new ContaCorrente(guilherme, null, null);
		Conta poupanca = new ContaPoupanca(guilherme, null, null);

		cc.depositar(50);
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}