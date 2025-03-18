package cn.bhu.domain;

public class University {
	private String uname;
	private String address;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "University [uname=" + uname + ", address=" + address + "]";
	}

}
