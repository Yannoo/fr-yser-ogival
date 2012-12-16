package fr.yser.bike.ogival.pojo;

/**
 * Pojo du plateau Ogival
 * @author yannoo
 *
 */
public class PlateauOgival extends PlateauRond {
	private double nbDentOgival;
	private double angleArcOgival;
	private double grandRayonPlateau;
	private double petitRayonPlateau;

	public PlateauOgival(double nbDentPlateau, double nbDentOgival) {
		super(nbDentPlateau);
		this.nbDentOgival = nbDentOgival;

		angleArcOgival = (getArcDent() * nbDentOgival / 2) / getRayon();
		grandRayonPlateau = 2 * getRayon() * Math.sin(angleArcOgival / 2);
		petitRayonPlateau = getRayon() - Math.sqrt(getRayon() * getRayon() - grandRayonPlateau * grandRayonPlateau / 4);
	}
	
	public void infos() {
		super.infos();
		System.out.println("Pour un plateau Ogival de " + nbDentOgival + " dents :");
		System.out.println("\tArc de " + nbDentOgival / 2 + " dents : " + getArcDent() * nbDentOgival / 2);
		System.out.println("\tAngle de l'arc formé par " + nbDentOgival / 2 + " dents : " + Math.toDegrees(angleArcOgival));
		System.out.println("\tPetit rayon du plateau : " + petitRayonPlateau);
		System.out.println("\tGrand rayon du plateau : " + grandRayonPlateau / 2);
		System.out.println();
	}

	/**
	 * @return the nbDentOgival
	 */
	public double getNbDentOgival() {
		return nbDentOgival;
	}

	/**
	 * @return the angleArc
	 */
	public double getAngleArcOgival() {
		return angleArcOgival;
	}

	/**
	 * @return the grandRayonPlateau
	 */
	public double getGrandRayonPlateau() {
		return grandRayonPlateau;
	}

	/**
	 * @return the petitRayonPlateau
	 */
	public double getPetitRayonPlateau() {
		return petitRayonPlateau;
	}
	
	
}
