package workclasspvt.class03january.tryall.shumaher.gs;

import java.util.List;

public class GasStation {
	private List<Tank> tanks;
	// private List<Column> columns;

	public List<Tank> getTanks() {
		return tanks;
	}

	public GasStation(List<Tank> tanks) {
		this.tanks = tanks;
		// this.columns = columns;
	}

	public boolean isEmpty() {
		int volume = 0;
		synchronized (tanks) {
			for (FuelHolder tank : tanks) {
				volume += tank.getSizeTank();
			}
			if (volume == 0) {
				return true;
			} else {
				return false;
			}
		}
	}

}