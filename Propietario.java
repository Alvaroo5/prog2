package ev2.recuperacion;

public class Propietario {
	private String telefono;
	private String nombre;
	
	public Propietario(String telefono, String nombre) {
		this.telefono = telefono;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Propietario [telefono=" + telefono + ", nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}
}
