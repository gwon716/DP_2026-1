package practice.ch05;

public class Main {
    public static void main(String[] args) {
        
        // Singleton s1 = new Singleton();  --> 컴파일 에러: 생성자가 private이므로 외부에서 객체 생성 불가
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        if (s2 == s3) {
            System.out.println("같은 객체");
        } else {
            System.out.println("다른 객체");
        }

        System.out.println("s2 값 : " + s2);
        System.out.println("s3 값 : " + s3);

        // Singleton2 객체 사용하기
        Singleton2 s4 = Singleton2.INSTANCE;    // Singleton2 객체 얻기
        s4.hello();
    }
}
