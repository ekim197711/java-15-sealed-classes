package com.example.demo.space;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShip {
	@Id
	private Integer id;
	private String name;
	private Double fuel;

}
