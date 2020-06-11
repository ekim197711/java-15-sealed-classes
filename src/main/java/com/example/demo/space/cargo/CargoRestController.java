package com.example.demo.space.cargo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/space")
public class CargoRestController {

	@GetMapping("/cargo")
	public String findCargo() {
		PreciousCargo c = new PreciousCargo();
		c.dumpCargo();
		c.sellCargo();
		Gold gold = new Gold();
		gold.dumpCargo();
		gold.sellCargo();
		return "test 123";
	}

}
