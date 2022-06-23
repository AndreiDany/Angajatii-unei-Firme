package LucruCuAngajati;

public class AngajatCuSalarFix extends Angajat {

	private double salarFix;
	
	public AngajatCuSalarFix(String nume, double salarFix) {
		super(nume);
		this.salarFix = salarFix;
	}
	
	public double calculSalar() {
		
		return this.salarFix;
	}
	
	public void schimbaSalarFix(double SalarFix) {
		
		this.salarFix = SalarFix;
	}
}
