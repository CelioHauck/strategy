package com.aplicativo.main.classe;

import com.aplicativo.main.interfaces.CalculoValor;

public class Funcionario {
	public static final int DESENVOLVEDOR = 1;
	public static final int GERENTE = 2;
	public static final int DBA = 3;
	protected double salarioBase;
	protected int cargo;
	protected CalculoValor estrategiaDeCalculo;

	public Funcionario(int cargo, double salarioBase) {
		this.salarioBase = salarioBase;
		this.cargo = cargo;

	}
	
	public double calcularSalarioComImposto() {
		aplicarEstrategia();
		return estrategiaDeCalculo.calcularSalarioComImposto(this);
	}
	
	public void aplicarEstrategia() {
		switch (cargo) {
		case DESENVOLVEDOR:
			estrategiaDeCalculo = new calculoValorImpostoQuizeOuDez();
			break;
		case DBA:
			estrategiaDeCalculo = new calculoValorImpostoVinteOuQuinze();
			break;
		default:
			throw new RuntimeException("Cargo não encontrado");
		}
	}

	public double getSalarioBase() {
		return salarioBase;
}

}
