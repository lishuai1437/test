package com.ls.pojo;

import java.io.Serializable;

public class Goodskind implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6561394559115636089L;
	private int sid;
	private String sname;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sid;
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
		Goodskind other = (Goodskind) obj;
		if (sid != other.sid)
			return false;
		return true;
	}

	public Goodskind(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public Goodskind() {
		super();
	}

}
