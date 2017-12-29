package bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ATM {

	private List<Slot> slots;

	public ATM(List<Slot> slots) {
		super();
		this.slots = slots;

		Collections.sort(this.slots, new Comparator<Slot>() {
			@Override
			public int compare(Slot o1, Slot o2) {
				return o2.getNominal() - o1.getNominal();
			}
		});
	}

	public void addMoney(int nominal, int quantity) {
		for (Slot slot : slots) {
			if (slot.isApplicable(nominal)) {
				slot.add(quantity);
				return;
			}
		}
		throw new RuntimeException("not supported nominal");

	}

	public WithdrawResult withdrawMoney(int requiredSum) {
		String message;
		List<WithdrawResultItem> items = new ArrayList<>();

		for (Slot slot : slots) {
			WithdrawResultItem currentSlotResult = slot.prepareWithdraw(requiredSum);
			requiredSum -= currentSlotResult.getTotal();
			items.add(currentSlotResult);
		}

		if (requiredSum == 0) {
			message = "success";
			for (WithdrawResultItem withdrawResultItem : items) {
				withdrawResultItem.withdrawFromSlot();
			}
		} else {
			message = "fail";
		}
		return new WithdrawResult(message, items);
	}

	public void printCurrentSlots() {
		System.out.print("current slots:");
		for (Slot slot : slots) {
			System.out.print(slot.toString());
		}

		System.out.println();

	}

}
