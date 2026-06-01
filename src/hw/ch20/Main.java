package hw.ch20;

public class Main {

    static final String RED     = "\u001B[31m"; 
    static final String GREEN   = "\u001B[32m"; 
    static final String YELLOW  = "\u001B[33m"; 
    static final String BLUE    = "\u001B[34m"; 
    static final String MAGENTA = "\u001B[35m"; 
    static final String CYAN    = "\u001B[36m"; 
    static final String RESET   = "\u001B[0m"; 

    public static void main(String[] args) {
        System.out.println("20221310 이지원");
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        BigString bs = new BigString(args[0]);

        String[] colors = new String[args[0].length()];
        String[] colorCycle = {RED, BLUE, GREEN, MAGENTA, CYAN, YELLOW, BLUE};
       
       for (int i = 0; i < colors.length; i++) {
            colors[i] = colorCycle[i % colorCycle.length];
        }
        
        bs.print(colors);
    }
}
