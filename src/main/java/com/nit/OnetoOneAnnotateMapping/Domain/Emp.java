package com.nit.OnetoOneAnnotateMapping.Domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Emp {

	@Id
	int empid;
	String Aufname;
	String Aulname;
	@OneToOne(targetEntity=Account.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="ac_number",referencedColumnName="ac_no")
	Account account;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getAufname() {
		return Aufname;
	}
	public void setAufname(String aufname) {
		Aufname = aufname;
	}
	public String getAulname() {
		return Aulname;
	}
	public void setAulname(String aulname) {
		Aulname = aulname;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", Aufname=" + Aufname + ", Aulname=" + Aulname + ", account=" + account + "]";
	}
	
	

}
