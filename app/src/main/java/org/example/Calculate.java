package org.example;

public class Calculate {
	public int sum(int x, int y) {
		return x + y;
	}

	public int getIndividualFee(int age) {
		if (age <= 12) {
			return 1000;
		} else {
			return 2000;
		}
	}

	public int getTotalFee(int age, int groupSize) {
		int fee = getIndividualFee(age) * groupSize;
		if (groupSize >= 10) {
			fee *= 0.9;
		}
		return fee;
	}
}
