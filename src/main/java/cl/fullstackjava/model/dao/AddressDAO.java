package cl.fullstackjava.model.dao;

import java.util.List;

import cl.fullstackjava.model.dto.Address;

public interface AddressDAO {
	int create(Address a);
	Address read(int id);
	List<Address> read();
	List<Address> readAndUsers();
	boolean update(Address a);
	boolean delete(int id);
}
