package practice.ch11;

public class Main {
    public static void main(String[] args) {
        // 디렉토리 트리를 만든다
        // Directory root = new Directory("root");
        Entry root = new Directory("root");  // 업 캐스팅 : 자동으로 일어난다

        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        // 다운 캐스팅
        ((Directory)root).add(bin);   // .연산자가 터압 캐스팅 연산자보다 우선 순위가 높다
        // 부모로 호출을 하면 코드가 유연하긴 하지만
        // 부모에 없는 메소드를 호출할 때는 형변환을 해줘야하는 번거로움이 있다
        root.add(tmp);
        root.add(usr);
        
        // 파일 생성 및 추가
        bin.add(new File("vi", 10000));
        bin.add(new File("latex", 20000));

        // 디렉토리 리스트 추가
        root.printList();
    }
}
