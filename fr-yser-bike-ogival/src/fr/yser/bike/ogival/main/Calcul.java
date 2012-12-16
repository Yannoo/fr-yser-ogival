package fr.yser.bike.ogival.main;

import java.util.Arrays;
import java.util.List;

import fr.yser.bike.ogival.pojo.PlateauOgival;
import fr.yser.bike.ogival.pojo.PlateauRond;

public class Calcul {
	public static void main(String[] args) {
		List<String> params = Arrays.asList(args);

		try {
			switch (params.size()) {
			case 1:
				PlateauRond plateauRond = new PlateauRond(Integer.parseInt(params.get(0)));
				plateauRond.infos();
				break;
			case 2:
				PlateauOgival plateauOgival = new PlateauOgival(Integer.parseInt(params.get(0)), Integer.parseInt(params.get(1)));
				plateauOgival.infos();
				break;
			default:
				System.out.println("Usage : nb dents plateau rond [, nb dents plateau ogival]");
			}
		} catch (NumberFormatException e) {
			System.out.println("Usage : nb dents plateau rond [, nb dents plateau ogival]");
			System.out.println("Saisir des entiers !!");
		}
		
		// plateau 26 >> pignon 33
		// plateau 30 >> pignon 38
		// plateau 38 >> pignon 48
		// plateau 42 >> pignon 53 
	}
}
