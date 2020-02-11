package br.com.alura;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Data {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje); //2020-02-11
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatador)); //11/02/2020
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora); //2020-02-11T08:50:08.743
		
		DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		System.out.println(agora.format(formatadorHora)); //11/02/2020 08:52
		DateTimeFormatter formatadorHoraA = DateTimeFormatter.ofPattern("dd/MM/yyyy kk:mm");
		System.out.println(agora.format(formatadorHoraA)); //11/02/2020 20:52
		
		DateTimeFormatter formatadorCurto = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("pt", "br"));
		System.out.println(agora.format(formatadorCurto)); //11/02/20 09:09
		
		DateTimeFormatter formatadorMedio = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(new Locale("pt", "br"));
		System.out.println(agora.format(formatadorMedio)); //11/02/2020 09:09:25
		
		System.out.println(agora.minusHours(5)); //2020-02-11T04:13:20.083
		System.out.println(agora.plusHours(5)); //2020-02-11T14:13:20.083
	}
}