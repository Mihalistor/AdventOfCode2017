Scanner scanner = new Scanner(new File("input.txt"));
int sum = 0;
while (scanner.hasNextLine()) {
    String[] row = scanner.nextLine().split("\\t");
    List<String> helper = Arrays.asList(row);
    List<Integer> numbers = new ArrayList<>();
    for (String number : helper) 
        { 
            numbers.add(Integer.parseInt(number)); 
        }
    sum += (Collections.max(numbers) - Collections.min(numbers));
}
System.out.println("SUM: " + sum);
//RESULT IS: 47136