package integers;

import java.util.HashMap;
import java.util.Set;

public class ToFindRepeatedDigit {

	public static void getDigitCount(long number) {

		HashMap<Long, Integer> digitCount = new HashMap<Long, Integer>();
		if (String.valueOf(number).length() == 1) {
			System.out.println(number + "is single digit");
			return;
		}
		while (number != 0) {
			Long lastDigit = number% 10;
			if (digitCount.containsKey(lastDigit)) {
				digitCount.put(lastDigit, digitCount.get(lastDigit) + 1);
			} else {
				digitCount.put(lastDigit, 1);
			}
			number = number / 10;
		}
		Set<Long> keys = digitCount.keySet();
		for (Long key : keys) {
			System.out.println(key + " :" + digitCount.get(key));
		}
	}

	public static void main(String[] args) {
		getDigitCount(561644L);
	}

}
