package com.lh.mappings;

import javax.persistence.Embeddable;

@Embeddable
public class DogHouse {

	private String address;

	public DogHouse() {
		super();
		this.address = "street";
	}

}
