Scanner scanner = new Scanner(new File("input.txt"));
List<String> towers = new ArrayList<>();
List<String> progNames = new ArrayList<>();
String bottomProgram = "";
while (scanner.hasNextLine()) {
	String program = scanner.nextLine();
	if (program.contains("->")) {
		String progName = program.substring(0, program.indexOf(" "));
		progNames.add(progName);
		program = program.substring(program.lastIndexOf(">") + 2, program.length());
		towers.add(program);
	}
}
for (String program : progNames) {
	int counter = 0;
	for (String tower : towers) {
		if (tower.contains(program)) {
			counter++;
		}
	}
	if (counter == 0) {
		bottomProgram = program;
	}
}
System.out.println("BOTTOM PROGRAM: " + bottomProgram);
//RESULT IS: vgzejbd