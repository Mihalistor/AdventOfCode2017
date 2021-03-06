Scanner scanner = new Scanner(new File("input.txt"));
scanner.useDelimiter("");
int score = 0;
int group = 0;
boolean garbage = false;
boolean jump = false;
while (scanner.hasNext()) {
	String s = scanner.next();
	if(!jump){
		if (s.equals("{") && !garbage) {
			group++;
			score += group;
		} else if (s.equals("}") && !garbage) {
			group--;
		} else if (s.equals("<")) {
			garbage = true;
		} else if (s.equals(">")) {
			garbage = false;
		} else if (s.equals("!") && garbage) {
			jump = true;                 
		}
	} else jump = false;
}
System.out.println("SCORE: " + score);
//RESULT IS: 10616