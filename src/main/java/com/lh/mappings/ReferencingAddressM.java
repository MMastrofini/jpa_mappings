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
import javax.persistence.Index;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(indexes = @Index(columnList = "street"))
public class ReferencingAddressM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String street;

	@ManyToMany(mappedBy = "addresses")
	private Set<PersonWithMultipleReferencingAddress> people;

	protected ReferencingAddressM() {
		super();
	}

	public ReferencingAddressM(String street) {
		this.street = street;
		people = new HashSet<>();
	}

	public void addPerson(
			PersonWithMultipleReferencingAddress personWithReferencingAddress) {
		people.add(personWithReferencingAddress);
	}
}
