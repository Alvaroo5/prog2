package ev2.recuperacion;

public class Serpiente extends Animal implements Contacta{
	private String especie;
	private boolean esVenenosa;
	
	public Serpiente(Integer idAnimal, SEXO sexo, double peso, Propietario propietario, String especie,
			boolean esVenenosa) {
		super(idAnimal, sexo, peso, propietario);
		this.especie = especie;
		this.esVenenosa = esVenenosa;
	}

	@Override
	public String toString() {
		return "Serpiente [especie=" + especie + ", esVenenosa=" + esVenenosa + "]";
	}

	@Override
	public void contactaPropietario() {
		//System.out.println("Contactando al "+getPropietario().getNombre()+" del "+this.getClass().getName());
		System.out.println("Contactando al propietario del "+this.getClass().getName());
	}
}
