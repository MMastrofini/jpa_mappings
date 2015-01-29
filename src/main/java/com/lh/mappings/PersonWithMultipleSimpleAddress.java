package com.lh.mappings;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PersonWithMultipleSimpleAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@OneToMany(cascade = CascadeType.PERSIST)
	private Set<SimpleAddress> addresses;

	protected PersonWithMultipleSimpleAddress() {
		super();
	}

	public PersonWithMultipleSimpleAddress(String name,
			Set<SimpleAddress> addresses) {
		this.name = name;
		this.addresses = addresses;
	}

}
