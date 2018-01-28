package workclasspvt.class03january.tryall.ermak;


import java.util.List;

public class Station {
	private List<Tank> tanks;

	public Station(List<Tank> tanks) {
		this.tanks = tanks;
	}

	public boolean isEmptyTank() {
		int vol = 0;
		synchronized (tanks) {
			for (Tank tank : tanks) {
				vol += tank.getQuantityFuel();
			}
			if (vol == 0) {
				return true;
			} else {
				return false;
			}
		}

	}

}