List<Integer> numbers = new ArrayList<>();
int steps = 0;
int number = Integer.parseInt(args[0]);
numbers.add(2);
int j = 2;
for (int i = 0; i < 100000; i += 4) {
	if (numbers.get(i) <= number) {
		numbers.add(numbers.get(i) + j);
		numbers.add(numbers.get(i + 1) + j);
		numbers.add(numbers.get(i + 2) + j);
		j++;
		numbers.add(numbers.get(i + 3) + j);
		j++;
	} else {
		break;
	}
}
for (int i = 0; i < numbers.size(); i++) {
	if (number >= numbers.get(i) && number <= numbers.get(i + 1)) {
		int diff = Math.abs(numbers.get(i) - number);
		int diff2 = Math.abs(numbers.get(i + 1) - number);
		int value;
		if (diff < diff2) {
			value = i;
			steps += diff;
		} else {
			value = i + 1;
			steps += diff2;
		}
		steps += (value / 4 + 1);
		break;
	}
}
System.out.println("STEPS: " + steps);
//RESULT: 430
}