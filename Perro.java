package ev2.recuperacion;

public class Perro extends Domestico implements Contacta, Comparable<Perro>{

	public Perro(Integer idAnimal, SEXO sexo, double peso, Propietario propietario, String nombre, int edad,
			String raza, String chip) {
		super(idAnimal, sexo, peso, propietario, nombre, edad, raza, chip);
	}

	@Override
	public String toString() {
		return "Perro [getNombre()=" + getNombre() + ", cuantosAnimales()=" + cuantosAnimales() + ", getPeso()="
				+ getPeso() + ", getPropietario()=" + getPropietario() + ", getIdAnimal()=" + getIdAnimal() + "]";
	}

	@Override
	public void cortaUñas() {
		// int pesoTotal=(int) (getPeso()-50);
		//this.peso=this.peso-50
		this.peso-=50;
	}
	
	public void damePatita() {
		System.out.println("El perro "+getNombre()+" te da la patita");
	}

	@Override
	public void contactaPropietario() {
		//System.out.println("Contactando al "+getPropietario().getNombre()+" del "+this.getClass().getName());
		System.out.println("Contactando al propietario del "+this.getClass().getName());
	}

	@Override
	public int compareTo(Perro o) {
		return this.getRaza().compareTo(o.getRaza());
	}
	
}
