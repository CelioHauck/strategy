package com.aplicativo.main;

import com.aplicativo.main.classe.Funcionario;

public class Main {

	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR, 2100);
		System.out.println(umFuncionario.calcularSalarioComImposto());

		Funcionario outroFuncionario = new Funcionario(Funcionario.DBA, 1700);
		System.out.println(outroFuncionario.calcularSalarioComImposto());
	}

}
