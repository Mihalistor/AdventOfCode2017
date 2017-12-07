List<Integer> numberList = new ArrayList<>();
Scanner scanner = new Scanner(new File("input.txt"));
scanner.useDelimiter("");
while (scanner.hasNext()) {
    String s = scanner.next();
    numberList.add(Integer.parseInt(s));
}
int sum = 0;
for (int i = 0; i < numberList.size() - 1; i++) {
    if (numberList.get(i).equals(numberList.get(i + 1))) {
        sum += numberList.get(i);
    }
}
if (numberList.get(numberList.size() - 1).equals(numberList.get(0))) {
    sum += numberList.get(numberList.size() - 1);
}
System.out.println("SUM: " + sum);
//RESULT IS: 1228