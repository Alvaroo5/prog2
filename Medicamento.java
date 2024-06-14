package ev2.recuperacion;

public class Medicamento implements Comparable<Medicamento>{
	private String nombre;
	private int gramos;
	private double precio;
	
	public Medicamento(String nombre, int gramos, double precio) {
		this.nombre = nombre;
		this.gramos = gramos;
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Medicamento [nombre=" + nombre + ", gramos=" + gramos + ", precio=" + precio + "]";
	}

	public int getGramos() {
        return gramos;
    }

	@Override
	public int compareTo(Medicamento o) {
		//return Integer.compare(o.gramos, this.gramos);
		if(this.gramos>o.gramos)
			return -1;
		else if(o.gramos>this.gramos)
			return 1;
		return 0;
	}
	
}
