package br.com.alura;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.NITFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatacaoDocumento {

	public static void main(String[] args) {

		String cpf = "862.883.667-57";
		String cnpj = "82588641000173";
		String tituloEleitor = "417453530116";
		String nit = "19381226833";

		String cpfSemFormatacao = desformatarDocumentos(new CPFFormatter(), cpf);
		System.out.println(cpf);
		System.out.println(cpfSemFormatacao);
		
		String cnpjComFormatacao = formatarDocumentos(new CNPJFormatter(), cnpj);
		System.out.println(cnpj);
		System.out.println(cnpjComFormatacao);

		String tituloComFormatacao = formatarDocumentos(new TituloEleitoralFormatter(), tituloEleitor);
		System.out.println(tituloEleitor);
		System.out.println(tituloComFormatacao);
		
		String nitComFormatacao = formatarDocumentos(new NITFormatter(), nit);
		System.out.println(nit);
		System.out.println(nitComFormatacao);
	}

	public static String formatarDocumentos(Formatter formatador, String documento) {
		return formatador.format(documento);
	}
	
	public static String desformatarDocumentos(Formatter desformatador, String documento) {
		return desformatador.unformat(documento);
	}
}
