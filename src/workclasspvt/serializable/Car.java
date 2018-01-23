package workclasspvt.serializable;

import java.io.Serializable;

public class Car implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String brand;
	private Integer year;
	
	private transient Object object = new Object();
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}


}
