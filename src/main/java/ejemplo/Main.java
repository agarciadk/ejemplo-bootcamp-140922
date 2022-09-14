package ejemplo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String ...args) {
		System.out.println("Inicio");

		// Forma tradicional
		// final Elfo elfo = new Elfo();
		// elfo.setNombre("Galadriel");

		// Usando spring
		final AbstractApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		final Elfo elfo = context.getBean(Elfo.class);
		 final String myString = context.getBean(String.class);
		 final Integer myInteger = context.getBean(Integer.class);

		elfo.atacar();
		elfo.usar();

		System.out.println("CLOSE");
		context.close();
		System.out.println(elfo.getNombre());
		System.out.println(myString);
		System.out.println(elfo.getEdad());
		// System.out.println(myInteger);

	}
}
