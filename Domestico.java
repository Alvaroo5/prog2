package ev2.recuperacion;

public abstract class Domestico extends Animal{
	private String nombre;
	private int edad;
	protected String raza;
	protected double peso;
	private String chip;
	public Domestico(Integer idAnimal, SEXO sexo, double peso, Propietario propietario, String nombre, int edad,
			String raza, String chip) {
		super(idAnimal, sexo, peso, propietario);
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.chip = chip;
	}
	
	public abstract void cortaUñas();

	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}
}
