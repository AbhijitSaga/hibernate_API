package com.hiberProject1Pract.HiberPractice1;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "student_address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int addressId;
	@Column(length = 50, name = "STREET")
	private String aStreet;
	private String aCity;
	private boolean aIsOpenCity;
	@Transient
	private double ax;
	@Temporal(TemporalType.DATE)
	private Date aDate;
	@Lob
	private byte[] aImage;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressId, String aStreet, String aCity, boolean aIsOpenCity, double ax, Date aDate,
			byte[] aImage) {
		super();
		this.addressId = addressId;
		this.aStreet = aStreet;
		this.aCity = aCity;
		this.aIsOpenCity = aIsOpenCity;
		this.ax = ax;
		this.aDate = aDate;
		this.aImage = aImage;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getaStreet() {
		return aStreet;
	}

	public void setaStreet(String aStreet) {
		this.aStreet = aStreet;
	}

	public String getaCity() {
		return aCity;
	}

	public void setaCity(String aCity) {
		this.aCity = aCity;
	}

	public boolean isaIsOpenCity() {
		return aIsOpenCity;
	}

	public void setaIsOpenCity(boolean aIsOpenCity) {
		this.aIsOpenCity = aIsOpenCity;
	}

	public double getAx() {
		return ax;
	}

	public void setAx(double ax) {
		this.ax = ax;
	}

	public Date getaDate() {
		return aDate;
	}

	public void setaDate(Date aDate) {
		this.aDate = aDate;
	}

	public byte[] getaImage() {
		return aImage;
	}

	public void setaImage(byte[] aImage) {
		this.aImage = aImage;
	}

}
