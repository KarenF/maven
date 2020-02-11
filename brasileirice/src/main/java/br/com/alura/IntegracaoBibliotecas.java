package br.com.alura;

import java.math.BigDecimal;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.NumberValue;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryOperators;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class IntegracaoBibliotecas {

	public static void main(String[] args) {

		CurrencyUnit moeda = Monetary.getCurrency("BRL");
		BigDecimal valor = new BigDecimal("10.89");
		BigDecimal percent = new BigDecimal("12");
		MonetaryAmount valorParcela = Money.of(valor.doubleValue(), moeda);
		MonetaryAmount valorTotal = valorParcela.multiply(percent);
		System.out.println(valorParcela);
		System.out.println(valorTotal);
		MonetaryAmount desconto = valorTotal.with(MonetaryOperators.percent(10));
		System.out.println(desconto);

		NumberValue descontoSemMoeda = desconto.getNumber();

		NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
		String valorExtenso = conversor.toWords(descontoSemMoeda.doubleValue());
		System.out.println(valorExtenso);
	}

}