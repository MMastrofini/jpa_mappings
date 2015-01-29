package com.lh.mappings;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonNotReferencingMultipleReferencingAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(unique = true)
	private String name;

	protected PersonNotReferencingMultipleReferencingAddress() {
		super();
	}

	public PersonNotReferencingMultipleReferencingAddress(String name,
			Set<ReferencingAddressM> addresses) {
		this.name = name;
	}

}
