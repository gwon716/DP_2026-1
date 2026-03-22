package practice.ch02.inheritance;

public class Main {
    public static void main(String[] args) {
        Banner banner = new Banner("Hello");
        banner.showWithParen();
        banner.showWithAster();

        System.out.println();
        
        // 어댑터 이용
        Print print = new PrintBannerAdapter01("Hello");
        print.printWeak();
        print.printStrong();
    }
}
