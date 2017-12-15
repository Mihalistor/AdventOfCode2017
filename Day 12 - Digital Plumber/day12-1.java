List<String> lines = new ArrayList<>();
Scanner scanner = new Scanner(new File("input.txt"));
while (scanner.hasNext()) {
	String line = scanner.nextLine();
	lines.add(line);
}
int result = 0;
List<Integer> programs = new ArrayList<>();
programs.add(0);
boolean check = true;
while (check) {
	check = false;
	for (String line : lines) {
		int num = Integer.parseInt(line.substring(0, line.indexOf(" ")));
		if (programs.contains(num)) {
			String[] arrayNumbers = line.substring(line.indexOf(">") + 1, line.length()).replaceAll(" ", "").split(",");
			for (int i = 0; i < arrayNumbers.length; i++) {
				if (!programs.contains(Integer.parseInt(arrayNumbers[i]))) {
					programs.add(Integer.parseInt(arrayNumbers[i]));
					check = true;
				}
			}
		}
	}
}
result = programs.size();
System.out.println("RESULT: " + result);
//RESULT IS: 288