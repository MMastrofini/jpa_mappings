package com.lh.mappings;

import java.util.HashSet;
import java.util.Set;

import com.lh.mappings.dao.CatDAO;
import com.lh.mappings.dao.DogDAO;
import com.lh.mappings.dao.PersonWithMultipleReferencingAddressDAO;
import com.lh.mappings.dao.PersonWithMultipleSimpleAddressDAO;
import com.lh.mappings.dao.PersonWithReferencingAddressDAO;
import com.lh.mappings.dao.PersonWithSingleSimpleAddressDAO;

public class JPAMain {

	public static void main(String[] args) {
		JPAInitializer.initJPA();

		SimpleAddress address = new SimpleAddress("Via Roma");
		PersonWithSingleSimpleAddress persona = new PersonWithSingleSimpleAddress(
				"Leo", address);

		PersonWithSingleSimpleAddressDAO.salvaPersona(persona);

		ReferencingAddress address2 = new ReferencingAddress("Via Milano");
		PersonWithReferencingAddress persona2 = new PersonWithReferencingAddress(
				"Manuel", address2);

		PersonWithReferencingAddressDAO.salvaPersona(persona2);

		SimpleAddress address1A = new SimpleAddress("Via Torino");
		SimpleAddress address2A = new SimpleAddress("Via Venezia");
		Set<SimpleAddress> addressesA = new HashSet<>();
		addressesA.add(address1A);
		addressesA.add(address2A);
		PersonWithMultipleSimpleAddress personA = new PersonWithMultipleSimpleAddress(
				"Un altro", addressesA);

		PersonWithMultipleSimpleAddressDAO.salvaPersona(personA);

		ReferencingAddressU address1B = new ReferencingAddressU("Via Genova");
		ReferencingAddressU address2B = new ReferencingAddressU("Via Napoli");
		Set<ReferencingAddressU> addressesB = new HashSet<>();
		addressesB.add(address1B);
		addressesB.add(address2B);
		PersonWithMultipleReferencingAddressU personB = new PersonWithMultipleReferencingAddressU(
				"Un altro ancora", addressesB);
		PersonWithMultipleReferencingAddressDAO.salvaPersona(personB);

		ReferencingAddressM address1C = new ReferencingAddressM("Via Latina");
		ReferencingAddressM address2C = new ReferencingAddressM("Via Frosinone");
		Set<ReferencingAddressM> addresses1C = new HashSet<>();
		addresses1C.add(address1C);
		addresses1C.add(address2C);
		PersonWithMultipleReferencingAddress person1C = new PersonWithMultipleReferencingAddress(
				"uno con due indirizzi", addresses1C);

		Set<ReferencingAddressM> addresses2C = new HashSet<>();
		addresses2C.add(address2C);
		PersonWithMultipleReferencingAddress person2C = new PersonWithMultipleReferencingAddress(
				"uno con un indirizzo", addresses2C);

		PersonWithMultipleReferencingAddressDAO.salvaPersona(person1C);
		PersonWithMultipleReferencingAddressDAO.salvaPersona(person2C);

		Dog d1 = new Dog(3, 88);
		Dog d2 = new Dog(2, 48);
		Cat c1 = new Cat(1, 7);
		Cat c2 = new Cat(4, 1);
		// Animal a = new Animal(99);

		DogDAO.salva(d1);
		DogDAO.salva(d2);
		CatDAO.salva(c1);
		CatDAO.salva(c2);
		// AnimalDAO.salva(a);

		JPAInitializer.shutdown();
	}
}
