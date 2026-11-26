public class BooleanAnalysis {
    /**
     * @param args
     */
    public static void main(String[] args) {
        boolean part1 = (5 > 3);
        boolean part2 = (4 < 2);
        int value = 10;
        boolean part3 = (value == 10);
        System.out.println("5 > 3: " + part1);
System.out.println("4 < 2: " + part2);
System.out.println("10 == 10: " + part3);
boolean intermediate = part1 && part2; // true && false = false
System.out.println("part1 && part2: " + intermediate);

boolean finalResult = intermediate || part3; // false || true = true
System.out.println("Final result: " + finalResult);
boolean directResult = (5 > 3) && (4 < 2) || (10 == 10);
System.out.println("Direct result: " + directResult);
}
}
