package ev2.recuperacion;

public class Gato extends Domestico implements Contacta{

	public Gato(Integer idAnimal, SEXO sexo, double peso, Propietario propietario, String nombre, int edad, String raza,
			String chip) {
		super(idAnimal, sexo, peso, propietario, nombre, edad, raza, chip);
	}

	@Override
	public String toString() {
		return "Gato [getNombre()=" + getNombre() + ", cuantosAnimales()=" + cuantosAnimales() + ", getPeso()="
				+ getPeso() + ", getPropietario()=" + getPropietario() + ", getIdAnimal()=" + getIdAnimal() + "]";
	}

	@Override
	public void cortaUñas() {
		//int pesoTotal=(int) (getPeso()-20);
		this.peso-=20;
	}

	@Override
	public void contactaPropietario() {
		//System.out.println("Contactando al "+getPropietario().getNombre()+" del "+this.getClass().getName());
		System.out.println("Contactando al propietario del "+this.getClass().getName());
	}
	
}
