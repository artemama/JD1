package workclasspvtnot.class15desemb;

public class Car {
	private int id;
	private int model;
	private int brans;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + brans;
		result = prime * result + id;
		result = prime * result + model;
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
		Car other = (Car) obj;
		if (brans != other.brans)
			return false;
		if (id != other.id)
			return false;
		if (model != other.model)
			return false;
		return true;
	}

}
