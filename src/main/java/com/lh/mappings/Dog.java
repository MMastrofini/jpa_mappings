/**
 * @author Manuel Mastrofini
 */
package com.lh.mappings;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Dog extends Animal {

	private double weight;

	@Enumerated(EnumType.STRING)
	private DogSize type;
	
	@Embedded
	private DogHouse dogHouse;

	protected Dog() {
		super();
	}

	public Dog(int age, double weight) {
		super(age);
		this.weight = weight;
		type = DogSize.MEDIUM;
		this.dogHouse = new DogHouse();
	}

	public void kill(Cat cat) {
		cat.catFatality();
	}

}
