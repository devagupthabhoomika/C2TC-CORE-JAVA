package com.tnsif.daysix.singleInheritence;

public class Citizen 
{
		private String name;
	private String aadharNo;
	private String address;
	private long phonenumber;
	
	
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phonenumber="
				+ phonenumber + "]";
	}
	public Citizen() {
		super();
		
	}
	public Citizen(String name, String aadharNo, String address, long phonenumber) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phonenumber = phonenumber;

}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
}