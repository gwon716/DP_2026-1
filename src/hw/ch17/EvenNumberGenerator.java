package hw.ch17;

public class EvenNumberGenerator extends NumberGenerator {
    private int number;                   		// 현재 수 

    // 수를 취득한다 
    @Override
    public int getNumber() {
        return number;
    }

    // 수를 생성한다 
    @Override
    public void execute() {
        for (int i = 0; i < 20; i += 2) {
            number += 2;
            notifyObservers();
        }
    }
    
}
