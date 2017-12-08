Scanner scanner = new Scanner(new File("input.txt"));        
int valid = 0;
while (scanner.hasNextLine()) {
	Boolean bool = true;
	String[] passphrase = scanner.nextLine().split(" ");        
	for (int j = 0; j < passphrase.length; j++) {
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
//RESULT IS: 386