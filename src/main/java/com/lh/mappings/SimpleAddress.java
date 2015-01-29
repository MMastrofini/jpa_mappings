/**
 * @author Manuel Mastrofini
 */
package com.lh.mappings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SimpleAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String street;

	protected SimpleAddress() {
		super();
	}

	public SimpleAddress(String street) {
		this.street = street;
	}

}
