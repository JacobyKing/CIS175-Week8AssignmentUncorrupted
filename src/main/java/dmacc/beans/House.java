/**
 * @author jacoby - jking11@dmacc.edu
 * CIS175 - Spring 2023
 * Mar 19, 2023
 */
package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class House {
	@Id
	@GeneratedValue
	private long id;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private double price;
	public House() {
		super();
	}
	public House(String address) {
		super();
		this.address = address;
	}
	public House(String address, String city, String state, int zipCode) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public House(String address, String city, String state, int zipCode, double price) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.price = price;
	}
	public House(long id, String address, String city, String state, int zipCode, double price) {
		super();
		this.id = id;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "House [id=" + id + ", address=" + address + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", price=" + price + "]";
	}
}
