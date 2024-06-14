package ev2.recuperacion;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Consulta {
	private Date fecha;
	private Animal idAnimal;
	private String diagnostico;
	Set<Medicamento> medicamentos;

	public Consulta(Animal idAnimal, String diagnostico) {
		this.fecha = new Date();
		this.idAnimal = idAnimal;
		this.diagnostico = diagnostico;
		this.medicamentos = new TreeSet<Medicamento>();
	}
	
	@Override
	public String toString() {
		return "Consulta [fecha=" + fecha + ", idAnimal=" + idAnimal + ", diagnostico=" + diagnostico
				+ ", medicamentos=" + medicamentos + "]";
	}

	public void addMedicamento(Medicamento medicamento) {
		medicamentos.add(medicamento);
	}

	public void delMedicamento(Medicamento medicamento) {
		medicamentos.remove(medicamento);
	}

	public Set<Medicamento> getMedicamentos() {
		return medicamentos;
	}
	
	//Si no funciona cambiamos e el comparador el 1- por 1 y el otro al reves
	public void getMedicamentosByGramos() {
		System.out.println("Usando TreeSet"+medicamentos);
	}
	
	/*
	public void getMedicamentosByPeso(){
		//Ordenar por peso descendente (de mayor a menor)
		System.out.println("\nMedicamentos ordenados por peso (desc) de la consulta realizada a "+this.animal);
		
		//Convierto la lista a un TreeSet para poder usar el comparador de Medicina que ordena por peso
		Set<Medicamento> setMedicinas= new TreeSet<Medicamento>(listaMedicinas);	
		System.out.println("\n\t-Usando TreeSet: "+setMedicinas);
		
		//O bien comparo manteniendo el ArrayList
		listaMedicinas.sort((o1, o2) -> o1.compareTo(o2));
		System.out.println("\n\t-Usando ArrayList: "+listaMedicinas);
		
	}
	*/
	
	public Date getFecha() {
		return fecha;
	}

	public Animal getIdAnimal() {
		return idAnimal;
	}

	public String getDiagnostico() {
		return diagnostico;
	}
}

