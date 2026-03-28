package hw.ch03;

public class CharDisplay extends AbstractDisplay {
    private char ch; // 표시해야 하는 문자 

    // 생성자 
    public CharDisplay(char ch, int loop) {
        super(loop);
        this.ch = ch;
    }

    public CharDisplay(char ch) {
        this(ch, 5);
    }

    @Override
    public void open() {
        System.out.print("<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">");
    }
}
