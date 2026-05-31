package hw.ch20;

public class Main {

    static final String RED     = "[31m"; 
    static final String GREEN   = "[32m"; 
    static final String YELLOW  = "[33m"; 
    static final String BLUE    = "[34m"; 
    static final String MAGENTA = "[35m"; 
    static final String CYAN    = "[36m"; 
    static final String RESET   = "[0m"; 

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        BigString bs = new BigString(args[0]);
        bs.print();
    }
}
