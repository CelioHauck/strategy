package com.aplicativo.main.classe;

import com.aplicativo.main.interfaces.CalculoValor;

public class calculoValorImpostoVinteOuQuinze implements CalculoValor {

	@Override
	public double calcularSalarioComImposto(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 3500) {
			return funcionario.getSalarioBase() * 0.80;
		}
		return funcionario.getSalarioBase() * 0.85;
	}
	
	

}
