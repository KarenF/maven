package br.com.alura;

import java.math.BigDecimal;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class criarComprovantePagamento {

	public static void main(String[] args) {
		
		NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
		BigDecimal valor = new BigDecimal("60.08");
		String valorPorExtenso = conversor.toWords(valor.doubleValue());
		System.out.println(valorPorExtenso);
	}
}
