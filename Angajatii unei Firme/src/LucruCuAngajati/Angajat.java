package LucruCuAngajati;

public abstract class Angajat {

	private String nume;

	public Angajat(String nume) {
		this.nume = nume;
	}
	
	public String getNume() {
		return nume;
	}
	
	public abstract double calculSalar();

	public boolean equals(Angajat angajat) {
		
		if(this.nume.equals(angajat.nume))
			return true;
		else
			return false;
	}

}
