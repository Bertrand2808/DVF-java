package fr.esgi.dvf;

import fr.esgi.dvf.service.ImportationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
@SpringBootApplication
public class DvfApplication {
	@Autowired
	private ImportationService importationService;

	public static void main(String[] args) {
		SpringApplication.run(DvfApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() {
		importationService.importerDonnees();
	}
}