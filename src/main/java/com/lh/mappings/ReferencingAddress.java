/**
 * @author Manuel Mastrofini
 */
package com.lh.mappings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "street", "number" }))
public class ReferencingAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "street")
	private String street;
	@Column(name = "number")
	private String number;

	@OneToOne
	private PersonWithReferencingAddress person;

	protected ReferencingAddress() {
		super();
	}

	public ReferencingAddress(String street) {
		this.street = street;
	}

	public void setPerson(
			PersonWithReferencingAddress personWithReferencingAddress) {
		this.person = personWithReferencingAddress;
	}
}
