package com.ls.pojo;

import java.io.Serializable;

public class Brand implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1228549030442084826L;
	private int bid;
	private String bname;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Brand other = (Brand) obj;
		if (bid != other.bid)
			return false;
		return true;
	}

	public Brand(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}

	public Brand() {
		super();
	}

}
