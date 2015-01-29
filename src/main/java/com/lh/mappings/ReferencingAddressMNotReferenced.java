/**
 * @author Manuel Mastrofini
 */
package com.lh.mappings;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ReferencingAddressMNotReferenced {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String street;

	@ManyToOne(targetEntity = PersonNotReferencingMultipleReferencingAddress.class)
	private Set<PersonNotReferencingMultipleReferencingAddress> people;

	protected ReferencingAddressMNotReferenced() {
		super();
	}

	public ReferencingAddressMNotReferenced(String street) {
		this.street = street;
		people = new HashSet<>();
	}

	public void addPerson(
			PersonNotReferencingMultipleReferencingAddress personWithReferencingAddress) {
		people.add(personWithReferencingAddress);
	}
}
