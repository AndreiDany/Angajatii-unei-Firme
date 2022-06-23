package LucruCuAngajati;

public class AngajatCuOra extends Angajat {

	private int nrOrePeLuna;
	private double salarPeOra;
	private int nrOreInPlul = 0;
	
	public AngajatCuOra(String nume, int nrOrePeLuna, double salarPeOra) {
		super(nume);
		this.nrOrePeLuna = nrOrePeLuna;
		this.salarPeOra = salarPeOra;
	}
	
	public void adaugaOre(int nrOreInPlul) {
		
		this.nrOreInPlul = nrOreInPlul;
	}
	
	public void schimbaSalarPeOra(double salarPeOra) {
		
		this.salarPeOra = salarPeOra;
	}
	
	public double calculSalar() {
		
		double salar = this.salarPeOra * (this.nrOrePeLuna + this.nrOreInPlul);
		
		return salar;
	}
}
