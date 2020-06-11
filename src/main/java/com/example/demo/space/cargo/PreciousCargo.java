package com.example.demo.space.cargo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public sealed class PreciousCargo permits Banana, Gold, Asteroid {
	
	public void sellCargo() {
		System.out.println("Cargo sold...");
	}
	
	public void dumpCargo() {
		System.out.println("Cargo dumped...");
	}
}
