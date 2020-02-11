package br.com.alura;

import java.math.BigDecimal;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.NumberValue;

import org.javamoney.moneta.Money;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;
import br.com.caelum.stella.validation.CPFValidator;

public class ValidaCPF {

	public static void main(String[] args) {

		String cpf = "51720155232";
		CPFValidator validaCPF = new CPFValidator();
		try {
			validaCPF.assertValid(cpf);
			BigDecimal valor = new BigDecimal("900.00");
			CurrencyUnit real = Monetary.getCurrency("BRL");
			MonetaryAmount valorFaturaCartao = Money.of(valor, real);
			
			NumberValue valorFaturaCartaoSemMoeda = valorFaturaCartao.getNumber();
			
			NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
			String valorFaturaExtenso = conversor.toWords(valorFaturaCartaoSemMoeda.doubleValue());
			
			System.out.println("Valor da fatura é de R$" + valor + " (" + valorFaturaExtenso + ")");
			
		} catch (Exception e) {
			System.out.println("CPF inválido: " + e);
			System.out.println("Favor atualizar os dados");
		}		
	}
}
