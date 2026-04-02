package practice.ch05;

public enum Singleton2 {
    // 상수
    INSTANCE;   // 클래스 로드 시 Singleton2 객체가 하나 만들어진다

    public void hello() {
        System.out.println("Singleton2 객체가 사용되었습니다.");
    }
}
