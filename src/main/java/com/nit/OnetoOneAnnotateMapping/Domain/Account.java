package com.nit.OnetoOneAnnotateMapping.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
int ac_no;
	String actype;
	public int getAc_no() {
		return ac_no;
	}
	public void setAc_no(int ac_no) {
		this.ac_no = ac_no;
	}
	public String getActype() {
		return actype;
	}
	public void setActype(String actype) {
		this.actype = actype;
	}
	@Override
	public String toString() {
		return "Account [ac_no=" + ac_no + ", actype=" + actype + "]";
	}
	
}
