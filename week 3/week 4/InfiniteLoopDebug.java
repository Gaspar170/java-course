public class InfiniteLoopDebug {
    
}public static void main(String[] args) {

System.out.println("=== BUG 1 ===");

int x = 1;
while (x <= 5) {
System.out.println("x = " + x);
}
System.out.println("\n=== BUG 2 ===");
for (int i = 5; i >= 1; i++) {
System.out.println("i = " + i);
}
System.out.println("\n=== BUG 3 ===");

int y = 10;
while (y > 0) {
System.out.println("y = " + y);
// Missing: y--;
}
}
