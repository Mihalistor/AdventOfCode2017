Scanner scanner = new Scanner(new File("input.txt"));
List<String> instructions = new ArrayList<>();
HashMap<String, Integer> registers = new HashMap<>();
int max = 0;
while (scanner.hasNextLine()) {
	String[] row = scanner.nextLine().split(" ");
	instructions.add(row[0]);
	registers.put(row[0], 0);
	instructions.add(row[1]);
	instructions.add(row[2]);
	instructions.add(row[3]);
	instructions.add(row[4]);
	instructions.add(row[5]);
	instructions.add(row[6]);
}
for (int i = 0; i < instructions.size(); i += 7) {
	boolean status = false;
	switch (instructions.get(i + 5)) {
		case "==":
			if (registers.get(instructions.get(i + 4)) == Integer.parseInt(instructions.get(i + 6))) status = true;
			break;
		case ">=":
			if (registers.get(instructions.get(i + 4)) >= Integer.parseInt(instructions.get(i + 6))) status = true;
			break;
		case "<=":
			if (registers.get(instructions.get(i + 4)) <= Integer.parseInt(instructions.get(i + 6))) status = true;
			break;
		case "!=":
			if (registers.get(instructions.get(i + 4)) != Integer.parseInt(instructions.get(i + 6))) status = true;
			break;
		case ">":
			if (registers.get(instructions.get(i + 4)) > Integer.parseInt(instructions.get(i + 6))) status = true;
			break;
		case "<":
			if (registers.get(instructions.get(i + 4)) < Integer.parseInt(instructions.get(i + 6))) status = true;
			break;
	}
	if (status) {
		if (instructions.get(i + 1).equals("inc")) {
			registers.put(instructions.get(i), registers.get(instructions.get(i)) + Integer.parseInt(instructions.get(i + 2)));
		} else {
			registers.put(instructions.get(i), registers.get(instructions.get(i)) - Integer.parseInt(instructions.get(i + 2)));
		}
		int a = Collections.max(registers.values());
		if ( a > max) max = a;
	}
}
System.out.println("LARGEST VALUE: " + max);
//RESULT IS: 6209