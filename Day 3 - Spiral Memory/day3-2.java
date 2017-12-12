int result = 0;
int number = Integer.parseInt(args[0]);
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,4,5,10,11,23,25,26,54,57,59));
int i = 12;
int a = 2;
int counter = 1;
int cycles = 2;
while(numbers.get(i)<number){
	if(cycles==0) {
		cycles = 2;
		counter++;
	}
	int nextNumber = numbers.get(i) + numbers.get(i-1) + numbers.get(a) + numbers.get(a+1);
	numbers.add(nextNumber);
	for(int b = 0; b<counter;b++){
		nextNumber = numbers.get(++i) + numbers.get(a) + numbers.get(++a) + numbers.get(++a);
		numbers.add(nextNumber);
		a--;
	}
	nextNumber = numbers.get(++i) + numbers.get(a) + numbers.get(++a);
	numbers.add(nextNumber);
	nextNumber = numbers.get(++i) + numbers.get(a);
	numbers.add(nextNumber);
	i++;
	cycles--;
}
for(int b = numbers.size()-1;b>0;b--){
	if(numbers.get(b)>number && numbers.get(b-1)<number) {
		result = numbers.get(b);
	}
}
System.out.println("LARGER NUMBER: " + result);
//RESULT IS: 312453