/**
 * @author Manuel Mastrofini
 */
package com.lh.mappings;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PersonWithSingleSimpleAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfBirth;

	@OneToOne(cascade = CascadeType.PERSIST)
	private SimpleAddress address;

	protected PersonWithSingleSimpleAddress() {
		super();
	}

	public PersonWithSingleSimpleAddress(String name, SimpleAddress address) {
		this.name = name;
		this.address = address;
		this.dateOfBirth = new Date();
	}

}
