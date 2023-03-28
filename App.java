package datahora;

import java.util.Date;

public class App {
	
	static final long MILIS_POR_DIA = 1000*60*60*24;
	public static void main(String[] args) {
		 
		
		Date date = new Date();
		long tempo = date.getTime();
		
		System.out.println("Milis: " + tempo);
		System.out.println("Milis de um dia: " + MILIS_POR_DIA);
		
		System.out.println("Data2: " + date);
		Date date2 = new Date(date.getTime() + (MILIS_POR_DIA * 10));
		System.out.println("Data2: " + date2);
		
		StringBuilder sb = new StringBuilder();
		/*
		 * sb.append("Milis"); sb.append(date); sb.append("\nDias: "); sb.append(tempo /
		 * MILIS_POR_DIA); sb.append("\nMeses: ");
		 */
		
		System.out.println(sb.toString());
	
	}

}
