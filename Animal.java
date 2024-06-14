package ev2.recuperacion;

import java.io.Serializable;

public abstract class Animal implements Serializable{
	protected int idAnimal=0;
	public enum SEXO{MACHO, HEMBRA};
	private SEXO sexo;
	private double peso;
	private Propietario propietario;
	private static int numAnimales=0;
	
	public Animal(Integer idAnimal, SEXO sexo, double peso, Propietario propietario) {
		this.idAnimal = numAnimales+1;
		this.sexo = sexo;
		this.peso = peso;
		this.propietario = propietario;
		numAnimales++;
	}
	
	public static int cuantosAnimales() {
		return numAnimales;
	}

	public double getPeso() {
		return peso;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public Integer getIdAnimal() {
		return idAnimal;
	}
}
