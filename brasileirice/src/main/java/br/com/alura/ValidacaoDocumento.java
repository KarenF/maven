package br.com.alura;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.NITValidator;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidacaoDocumento {

	public static void main(String[] args) {

		String cpf = "86288366757";
		try {
			validarDocumentos(new CPFValidator(), cpf);
			System.out.println("CPF v�lido");
		} catch (Exception e) {
			System.out.println("CPF inv�lido: " + e);
		}

		String cnpj = "82588641000173";
		try {
			validarDocumentos(new CNPJValidator(), cnpj);
			System.out.println("CNPJ v�lido");
		} catch (Exception e) {
			System.out.println("CNPJ inv�lido: " + e);
		}

		String tituloEleitor = "417453530116";
		try {
			validarDocumentos(new TituloEleitoralValidator(), tituloEleitor);
			System.out.println("T�tulo de eleitor v�lido");
		} catch (Exception e) {
			System.out.println("T�tulo de eleitor inv�lido: " + e);
		}

		String NIT = "19381226833";
		try {
			validarDocumentos(new NITValidator(), NIT);
			System.out.println("NIT v�lido");
		} catch (Exception e) {
			System.out.println("NIT inv�lido" + e);
		}
	}

	private static void validarDocumentos(Validator<String> validador, String documento) {
		validador.assertValid(documento);
	}
}