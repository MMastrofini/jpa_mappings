package com.lh.mappings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;

	private int age;

	protected Animal() {
		super();
	}

	public Animal(int age) {
		this.age = age;
	}

}
