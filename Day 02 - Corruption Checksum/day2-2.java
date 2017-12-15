Scanner scanner = new Scanner(new File("input.txt"));
int sum = 0;
while (scanner.hasNextLine()) {
	String[] row = scanner.nextLine().split("\\t");
	List<String> helper = Arrays.asList(row);
	List<Integer> numbers = new ArrayList<>();
	for (String number : helper) {
		numbers.add(Integer.parseInt(number));
	}
    Collections.sort(numbers);
    for (int j = numbers.size() - 1; j > 0; j--) {
        for (int i = j-1; i >= 0; i--) {
            if (numbers.get(j) % numbers.get(i) == 0) {
                sum += numbers.get(j) / numbers.get(i);
            }
        }
    }
}
System.out.println("SUM: " + sum);
//RESULT IS: 250