package ejemplo2;

import ejemplo.Arma;
import org.springframework.stereotype.Component;

@Component
public class Arco implements Arma {

	public Arco() {
		System.out.println("Creando arco");
	}

	@Override
	public void disparar() {
		System.out.println("Disparando arma");
	}
}
