package cl.fullstackjava.model.service;

import java.util.List;

import cl.fullstackjava.model.dao.AddressDAO;
import cl.fullstackjava.model.dao.AddressDAOImpl;
import cl.fullstackjava.model.dto.Address;

public class AddressService {
	private AddressDAO addressDAO = new AddressDAOImpl();
	
	public List <Address> read() {
		return addressDAO.read();
	}
	
	public List <Address> readWithUsers() {
		return addressDAO.readAndUsers();
	}

}
