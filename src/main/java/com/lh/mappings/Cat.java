package com.lh.mappings;

import javax.persistence.Entity;

@Entity
public class Cat extends Animal {

	private int remainingNumberOfLives;
	private boolean diedForever;

	protected Cat() {
		super();
	}

	public Cat(int age, int remainingNumberOfLives) {
		super(age);
		this.remainingNumberOfLives = remainingNumberOfLives;
		diedForever = false;
	}

	public void catFatality() {
		double chance = Math.random();
		if (chance < 0.9) {
			if (remainingNumberOfLives > 0)
				remainingNumberOfLives = remainingNumberOfLives - 1;
			else
				diedForever = true;
		}
	}

	public boolean isAlive() {
		return !diedForever;
	}

}
