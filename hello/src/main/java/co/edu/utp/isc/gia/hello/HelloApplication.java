package co.edu.utp.isc.gia.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@RequestMapping(value="hello")
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
        @GetMapping("/{firstName}/{lastName}")
        public String hello( @PathVariable("firstName") String firstName,
                            @PathVariable("lastName") String lastName) {
            return String.format("Hello %s %s", firstName, lastName);  }


}

