Scanner scanner = new Scanner(new File("input2.txt"));
List<String> historyOfCycles = new ArrayList<>();
String[] row = scanner.nextLine().split("\\t");
List<String> helper = Arrays.asList(row);
List<Integer> banks = new ArrayList<>();
for (String block : helper) {
	banks.add(Integer.parseInt(block));
}
int indexOfCycle = 0;
while (true) {
	String blocks = "";
	int max = Collections.max(banks);
	int index = banks.indexOf(max);
	int number = max / (banks.size() - 1);
	if(number == 0) number = 1;
	int counter = 0;
	for (int i = index + 1; i < banks.size(); i++) {
		if(counter == max) break;
		banks.set(i, banks.get(i) + number);
		counter += number;
	}
	for (int i = 0; i < index; i++) {
		if(counter == max) break;
		banks.set(i, banks.get(i) + number);
		counter += number;
	}
	if (counter < max) banks.set(index, max - counter);
	else banks.set(index, 0);
	for (int i = 0; i < banks.size(); i++) {
		blocks += banks.get(i);
	}
	if (historyOfCycles.contains(blocks)) {
		indexOfCycle = historyOfCycles.indexOf(blocks);
		break;
	}
	historyOfCycles.add(blocks);
}
System.out.println("CYCLES: " + (historyOfCycles.size()-indexOfCycle));
//RESULT IS: 1610