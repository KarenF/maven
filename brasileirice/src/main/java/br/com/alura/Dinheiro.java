package br.com.alura;

import java.math.BigDecimal;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;

import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.Money;
import org.javamoney.moneta.convert.ExchangeRateType;

public class Dinheiro {

	public static void main(String[] args) {

		CurrencyUnit real = Monetary.getCurrency("BRL");
		BigDecimal valor = new BigDecimal("10");
		MonetaryAmount valorDaParcela = Money.of(valor.doubleValue(), real);
		System.out.println(valorDaParcela);
		
		MonetaryAmount valorTotal = valorDaParcela.multiply(10);
		System.out.println(valorTotal);
		
		CurrencyUnit dolar = Monetary.getCurrency("USD");
		BigDecimal valorDolar = new BigDecimal("100");
		MonetaryAmount valorProdutoDolar = FastMoney.of(valorDolar.doubleValue(), dolar);
		MonetaryAmount valorImpostoReal = FastMoney.of(valor.doubleValue(), real);
		
		//provider pega a cotação
		ExchangeRateProvider provider = MonetaryConversions.getExchangeRateProvider(ExchangeRateType.ECB);
		
		//conversão atual(do dia)
		CurrencyConversion conversaoAtual = provider.getCurrencyConversion(dolar);
		
		//Agora vamos transformar o valor do imposto em Real para dólar
		MonetaryAmount valorImpostoDolar = conversaoAtual.apply(valorImpostoReal);
		
		MonetaryAmount valorFinalProdutoDolar = valorProdutoDolar.add(valorImpostoDolar);
		System.out.println(valorFinalProdutoDolar);
	}

}
