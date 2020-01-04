package com.ls.pojo;

import java.io.Serializable;

public class Goods implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5554505737205476072L;
	private int gid;
	private String gname;
	private String gEnglishName;
	private String gsize;
	private double gprice;
	private String gnumber;
	private String gtip;
	private String gpic;

	private String bname;
	private String sname;

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getgEnglishName() {
		return gEnglishName;
	}

	public void setgEnglishName(String gEnglishName) {
		this.gEnglishName = gEnglishName;
	}

	public String getGsize() {
		return gsize;
	}

	public void setGsize(String gsize) {
		this.gsize = gsize;
	}

	public double getGprice() {
		return gprice;
	}

	public void setGprice(double gprice) {
		this.gprice = gprice;
	}

	public String getGnumber() {
		return gnumber;
	}

	public void setGnumber(String gnumber) {
		this.gnumber = gnumber;
	}

	public String getGtip() {
		return gtip;
	}

	public void setGtip(String gtip) {
		this.gtip = gtip;
	}

	public String getGpic() {
		return gpic;
	}

	public void setGpic(String gpic) {
		this.gpic = gpic;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
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
		result = prime * result + ((bname == null) ? 0 : bname.hashCode());
		result = prime * result + ((gEnglishName == null) ? 0 : gEnglishName.hashCode());
		result = prime * result + gid;
		result = prime * result + ((gname == null) ? 0 : gname.hashCode());
		result = prime * result + ((gnumber == null) ? 0 : gnumber.hashCode());
		result = prime * result + ((gpic == null) ? 0 : gpic.hashCode());
		long temp;
		temp = Double.doubleToLongBits(gprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((gsize == null) ? 0 : gsize.hashCode());
		result = prime * result + ((gtip == null) ? 0 : gtip.hashCode());
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
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
		Goods other = (Goods) obj;
		if (bname == null) {
			if (other.bname != null)
				return false;
		} else if (!bname.equals(other.bname))
			return false;
		if (gEnglishName == null) {
			if (other.gEnglishName != null)
				return false;
		} else if (!gEnglishName.equals(other.gEnglishName))
			return false;
		if (gid != other.gid)
			return false;
		if (gname == null) {
			if (other.gname != null)
				return false;
		} else if (!gname.equals(other.gname))
			return false;
		if (gnumber == null) {
			if (other.gnumber != null)
				return false;
		} else if (!gnumber.equals(other.gnumber))
			return false;
		if (gpic == null) {
			if (other.gpic != null)
				return false;
		} else if (!gpic.equals(other.gpic))
			return false;
		if (Double.doubleToLongBits(gprice) != Double.doubleToLongBits(other.gprice))
			return false;
		if (gsize == null) {
			if (other.gsize != null)
				return false;
		} else if (!gsize.equals(other.gsize))
			return false;
		if (gtip == null) {
			if (other.gtip != null)
				return false;
		} else if (!gtip.equals(other.gtip))
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}

	public Goods(int gid, String gname, String gEnglishName, String gsize, double gprice, String gnumber, String gtip,
			String gpic, String bname, String sname) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gEnglishName = gEnglishName;
		this.gsize = gsize;
		this.gprice = gprice;
		this.gnumber = gnumber;
		this.gtip = gtip;
		this.gpic = gpic;
		this.bname = bname;
		this.sname = sname;
	}

	public Goods() {
		super();
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gEnglishName=" + gEnglishName + ", gsize=" + gsize
				+ ", gprice=" + gprice + ", gnumber=" + gnumber + ", gtip=" + gtip + ", gpic=" + gpic + ", bname="
				+ bname + ", sname=" + sname + "]";
	}

}
