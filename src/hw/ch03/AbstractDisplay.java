package hw.ch03;

public abstract class AbstractDisplay {

    public abstract void open();
    public abstract void print();
    public abstract void close();

    protected int count;

    public AbstractDisplay() {
        this(5);
    }

    public AbstractDisplay(int count) {
        this.count = count;
    }
    
    public final void display() {
        display(this.count);
    }

    public final void display(int repeatCount) {
        open();
        for (int i = 0; i < repeatCount; i++) {
            print();
        }
        close();
    }
}
