/**
 * @author Manuel Mastrofini
 */
package com.lh.mappings;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PersonWithMultipleReferencingAddressU {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private Set<ReferencingAddressU> addresses;

	protected PersonWithMultipleReferencingAddressU() {
		super();
	}

	public PersonWithMultipleReferencingAddressU(String name,
			Set<ReferencingAddressU> addresses) {
		this.name = name;
		this.addresses = addresses;
		/*
		 * for (ReferencingAddressU r : addresses) r.setPerson(this);
		 */
	}

}
