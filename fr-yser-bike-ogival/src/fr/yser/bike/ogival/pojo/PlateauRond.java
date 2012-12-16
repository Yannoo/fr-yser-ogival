package fr.yser.bike.ogival.pojo;

/**
 * Pojo du plateau rond
 * @author yannoo
 *
 */
public class PlateauRond {
	private static final double corde = 12.7;

	private double nbDentPlateauRond;
	private double angleDent;
	private double rayon;
	private double arcDent;
	private double perimetre;
	
	public PlateauRond(double nbDentPignon) {
		super();
		this.nbDentPlateauRond = nbDentPignon;

		angleDent = 2 * Math.PI / nbDentPignon;
		rayon = corde / (2 * Math.sin(angleDent / 2));
		arcDent = 2 * rayon * Math.asin(corde / (2 * rayon));
		perimetre = Math.PI * rayon * 2;
	}
	
	public void infos() {
		System.out.println("##########################################");
		System.out.println("Entrant : ");
		System.out.println("\tCorde : " + corde);
		System.out.println("\tNombre de dents du plateau rond : " + nbDentPlateauRond);

		System.out.println("\nInfos : ");
		System.out.println("\tAngle entre 2 dents : " + Math.toDegrees(angleDent) + "°");
		System.out.println("\tArc d'une dent : " + arcDent);
		System.out.println("\tPérimètre : " + perimetre + ", somme des arcs : " + arcDent * nbDentPlateauRond);

		System.out.println("\nPour un plateau rond de " + nbDentPlateauRond + " dents :");
		System.out.println("\tRayon : " + rayon);
		System.out.println();
	}

	/**
	 * @return the nbDentPignon
	 */
	public double getNbDentPlateauRond() {
		return nbDentPlateauRond;
	}

	/**
	 * @return the angleDent
	 */
	public double getAngleDent() {
		return angleDent;
	}

	/**
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * @return the arcDent
	 */
	public double getArcDent() {
		return arcDent;
	}

	/**
	 * @return the perimetre
	 */
	public double getPerimetre() {
		return perimetre;
	}
	
}
