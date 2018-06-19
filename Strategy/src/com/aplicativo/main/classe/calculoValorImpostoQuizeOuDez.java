package com.aplicativo.main.classe;

import com.aplicativo.main.interfaces.CalculoValor;

public class calculoValorImpostoQuizeOuDez implements CalculoValor {

	public double calcularSalarioComImposto(Funcionario funcionario) {
			if(funcionario.getSalarioBase() >  2000) {
				return funcionario.getSalarioBase() * 0.85;
			}
				return funcionario.getSalarioBase() * 0.90;
		}

}
