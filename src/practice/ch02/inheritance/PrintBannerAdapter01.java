package practice.ch02.inheritance;

public class PrintBannerAdapter01 extends Banner implements Print {

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
    
}
