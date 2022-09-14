package ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Elfo {

	private String nombre;
	private Integer edad;

	private final Equipamiento equipamiento;
	private final Arma arma;

//	public Elfo() {
//		this.equipamiento = null;
//		this.arma = null;
//	}

	@Autowired
	public Elfo(String nombre, Integer edad, Equipamiento equipamiento, Arma arma) {
		this.nombre = nombre;
		this.edad = edad;
		this.equipamiento = equipamiento;
		this.arma = arma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Equipamiento getEquipamiento() {
		return equipamiento;
	}

	public Arma getArma() {
		return arma;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	@PostConstruct
	public void init() {
		System.out.println("inicializando elfo...");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("matando elfo...");
	}

	public void atacar() {
		arma.disparar();
	}

	public void usar() {
		equipamiento.usar();
	}
}
