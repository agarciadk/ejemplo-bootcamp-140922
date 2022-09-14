package ejemplo;

import org.springframework.stereotype.Component;

@Component
public class Escudo implements Equipamiento {
	public Escudo() {
		System.out.println("Creando escudo");
	}

	@Override
	public void usar() {
		System.out.println("Usando escudo");
	}
}
