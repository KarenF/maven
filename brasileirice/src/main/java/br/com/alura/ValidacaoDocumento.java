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
			System.out.println("CPF válido");
		} catch (Exception e) {
			System.out.println("CPF inválido: " + e);
		}

		String cnpj = "82588641000173";
		try {
			validarDocumentos(new CNPJValidator(), cnpj);
			System.out.println("CNPJ válido");
		} catch (Exception e) {
			System.out.println("CNPJ inválido: " + e);
		}

		String tituloEleitor = "417453530116";
		try {
			validarDocumentos(new TituloEleitoralValidator(), tituloEleitor);
			System.out.println("Título de eleitor válido");
		} catch (Exception e) {
			System.out.println("Título de eleitor inválido: " + e);
		}

		String NIT = "19381226833";
		try {
			validarDocumentos(new NITValidator(), NIT);
			System.out.println("NIT válido");
		} catch (Exception e) {
			System.out.println("NIT inválido" + e);
		}
	}

	private static void validarDocumentos(Validator<String> validador, String documento) {
		validador.assertValid(documento);
	}
}