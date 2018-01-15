package workclasspvtnot.class15january;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		List<Sample> list = new ArrayList<>();

		while (true) {
			list.add(new Sample());

			/* new Sample(); */
		}
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Меня отправляют в мусорку" + hashCode());
	}

}
