/**
 * @author Manuel Mastrofini
 */
package com.lh.mappings;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class PersonWithMultipleReferencingAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;

	@ManyToMany(cascade = CascadeType.PERSIST)
	private Set<ReferencingAddressM> addresses;

	protected PersonWithMultipleReferencingAddress() {
		super();
	}

	public PersonWithMultipleReferencingAddress(String name,
			Set<ReferencingAddressM> addresses) {
		this.name = name;
		this.addresses = addresses;
		/*
		 * for (ReferencingAddressM r : addresses) r.addPerson(this);
		 */

	}

}
