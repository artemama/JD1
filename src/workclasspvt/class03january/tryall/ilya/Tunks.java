package workclasspvt.class03january.tryall.ilya;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Tunks {

	private FuelType fuelType;

	private AtomicInteger quantity = new AtomicInteger();

	private static CopyOnWriteArrayList<Tunks> tunks = new CopyOnWriteArrayList<Tunks>();

	public Tunks(int quantity, FuelType fuelType) {
		this.setQuantity(quantity);
		this.fuelType = fuelType;
		tunks.add(this);
	}

	public AtomicInteger getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity.set(quantity);
	}

	public static boolean tunksIsEmpty() {
		int qnt = 0;
		for (int i = 0; i < tunks.size(); i++) {
			qnt += tunks.get(i).getQuantity().get();
		}
		if (qnt > 0) {
			return true;
		} else {
			return false;
		}
	}

	public static CopyOnWriteArrayList<Tunks> getTunks() {
		return tunks;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

}
