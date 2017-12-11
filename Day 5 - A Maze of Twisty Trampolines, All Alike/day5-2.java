Scanner scanner = new Scanner(new File("input.txt"));        
List<Integer> numbers = new ArrayList<>();
int steps = 0;
while (scanner.hasNextLine()) {
   numbers.add(scanner.nextInt());
}
for (int i = 0; i<numbers.size();){
   int jump = numbers.get(i);
   if(jump >= 3) {
	   numbers.set(i, jump-1);
   } else {
	   numbers.set(i, jump+1);
   }          
   i += jump;
   steps++;
}
System.out.println("STEPS: " + steps);
//RESULT IS: 24774780