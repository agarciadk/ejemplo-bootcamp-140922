package ejemplo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"ejemplo2", "ejemplo"})
public class ProjectConfig {

//	@Bean(name = "galadriel")
//	@Primary
//	public Elfo elfo() {
//		final Elfo elfo = new Elfo();
//		elfo.setNombre("Galadriel");
//		return elfo;
//	}
//
//	@Bean(name = "legolas")
//	public Elfo elfo2() {
//		final Elfo elfo = new Elfo();
//		elfo.setNombre("Légolas");
//		return elfo;
//	}

	@Bean
	public String cadena() {
		return "HOLA";
	}

	@Bean
	public Integer entero() { return 987; }
}
