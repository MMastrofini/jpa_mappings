package com.lh.mappings;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PersonWithReferencingAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@OneToOne(cascade = CascadeType.PERSIST)
	private ReferencingAddress address;

	protected PersonWithReferencingAddress() {
		super();
	}

	public PersonWithReferencingAddress(String name, ReferencingAddress address) {
		this.name = name;
		this.address = address;
		address.setPerson(this);
	}
}
