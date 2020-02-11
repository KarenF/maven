package br.com.alura;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

public class CEP {

	public static void main(String[] args) {

		ViaCEPClient cliente = new ViaCEPClient();
		try {
			ViaCEPEndereco endereco = cliente.getEndereco("90610210");
			System.out.println(endereco.getBairro() + " - " + endereco.getLogradouro() + " - " + endereco.getLocalidade() + " - " + endereco.getUf());
		} catch (Exception e) {
			System.out.println("CEP inexistente: " + e);
		}
	}

}
