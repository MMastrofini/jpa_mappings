package com.lh.mappings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ReferencingAddressU {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String street;

	@ManyToOne
	private PersonWithMultipleReferencingAddressU person;

	protected ReferencingAddressU() {
		super();
	}

	public ReferencingAddressU(String street) {
		this.street = street;
	}

	public void setPerson(
			PersonWithMultipleReferencingAddressU personWithReferencingAddress) {
		this.person = personWithReferencingAddress;
	}
}
