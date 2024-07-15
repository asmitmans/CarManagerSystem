package cl.fullstackjava.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.fullstackjava.model.conexion.Conexion;
import cl.fullstackjava.model.dto.Address;
import cl.fullstackjava.model.dto.User;

public class AddressDAOImpl implements AddressDAO {

	@Override
	public int create(Address a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Address read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> read() {
		
		List<Address> addresses = new ArrayList<Address>();
		
		String sql = "SELECT d.id, d.nombre, d.numeracion, d.usuario_id, u.nombre AS user_name,"
				+ "u.correo AS user_email, u.nick AS user_nick "
				+ "FROM direcciones d "
				+ "JOIN usuarios u On d.usuario_id = u.id";
		
		try (Connection c = Conexion.getCon();
				PreparedStatement ps = c.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			
			while (rs.next()) {
				
				Address address = new Address();
				address = new Address();
				address.setId(rs.getInt("id"));
				address.setStreet(rs.getString("nombre"));
				address.setNumber(rs.getString("numeracion"));
				address.setUserId(rs.getInt("usuario_id"));
				
				User user = new User();
				user.setId(rs.getInt("usuario_id"));
				user.setUsername(rs.getString("user_name"));
				user.setEmail(rs.getString("user_email"));
				user.setNick(rs.getString("user_nick"));
				address.setUser(user);
				
				addresses.add(address);
			}
			
		} catch (SQLException e) {
			System.out.println("ERROR en metodo read()");
			e.printStackTrace();
		}
		
		return addresses;
	}

	@Override
	public boolean update(Address a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Address> readAndUsers() {
		List<Address> addresses = new ArrayList<Address>();
		
		String sql = "SELECT d.id AS address_id, d.nombre AS street, d.numeracion AS number, u.id AS user_id, "
				+ "u.nombre AS user_name, u.correo AS user_email, u.nick AS user_nick "
				+ "FROM direcciones d "
				+ "RIGHT JOIN usuarios u On d.usuario_id = u.id";
		
		try (Connection c = Conexion.getCon();
				PreparedStatement ps = c.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			
			while (rs.next()) {
				Address address = new Address();
				
				User user = new User();
		        user.setId(rs.getInt("user_id"));
		        user.setUsername(rs.getString("user_name"));
		        user.setEmail(rs.getString("user_email"));
		        user.setNick(rs.getString("user_nick"));
		        
		        int addressId = rs.getInt("address_id");
		        if (!rs.wasNull()) {
		        	address.setId(addressId);
		        	address.setStreet(rs.getString("street"));
		        	address.setNumber(rs.getString("number"));
		        	address.setUserId(rs.getInt("user_id"));
		        }
		        
		        address.setUser(user);
		        addresses.add(address);
		        
			}
			
		} catch (SQLException e) {
			System.out.println("ERROR en metodo read()");
			e.printStackTrace();
		}
		
		return addresses;	
		
	}
	

}
