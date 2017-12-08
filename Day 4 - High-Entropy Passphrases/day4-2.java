Scanner scanner = new Scanner(new File("input.txt"));        
int valid = 0;
while (scanner.hasNextLine()) {
	Boolean bool = true;
	String[] line = scanner.nextLine().split(" ");
	String[] passphrase = new String[line.length];
	int index = 0;
	for(String word : line){
		char[] charArray = word.toCharArray();
		Arrays.sort(charArray);
		String newWord = new String(charArray);
		passphrase[index] = newWord;
		index++;
	}
	for (int j = 0; j < passphrase.length-1; j++) {
		int counter = 0;
		for (int i = 0; i < passphrase.length; i++) {
			if (passphrase[j].equals(passphrase[i])) {
				counter++;
			}
		}
		if (counter > 1) {
			bool = false;
			break;
		}
	}
	if(bool){
		valid++;
	}
}
System.out.println("VALID: " + valid);
//RESULT IS: 208