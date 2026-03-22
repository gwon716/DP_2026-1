package practice.ch02.inheritance;

public class PrintBannerAdapter01 extends Banner implements Print {
    // 1. 인자 없는 생성자는 자동으로 생성됨
    // 2. 생성자는 상속되지 않는다

    public PrintBannerAdapter01(String string) {
        super(string);  // 부모 생성자를 호출한다
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
    
}
