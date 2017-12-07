List<Integer> numberList = new ArrayList<>();
Scanner scanner = new Scanner(new File("input.txt"));
scanner.useDelimiter("");
while (scanner.hasNext()) {
    String s = scanner.next();
    numberList.add(Integer.parseInt(s));
}
int jump = numberList.size()/2;
int sum = 0;
for (int i = 0; i < numberList.size() - jump; i++) {
    if (numberList.get(i).equals(numberList.get(i + jump))) {
        sum += numberList.get(i);
    }
}
List<Integer> part1 = numberList.subList(0,numberList.size()-jump);
List<Integer> part2 = numberList.subList(numberList.size()-jump, numberList.size());
List<Integer> newNumberList = new ArrayList<>(part2);
newNumberList.addAll(part1);
for (int i = 0; i < newNumberList.size() - jump; i++) {
    if (newNumberList.get(i).equals(newNumberList.get(i + jump))) {
        sum += newNumberList.get(i);
    }
}
System.out.println("SUM: " + sum);
//RESULT IS: 1238