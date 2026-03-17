package practice.ch01;

public class Main {
    public static void main(String[] args) {
        // 책 테스트
        Book book = new Book("Java Programming");
        System.out.println("Book name: " + book.getName());
    
        // 책장 테스트
        BookShelf bookShelf = new BookShelf(5); 
        bookShelf.appendBook(new Book("Java Programming"));
        bookShelf.appendBook(new Book("Data Structures"));
        bookShelf.appendBook(new Book("Algorithms"));
        
        // 책장에 있는 책들을 출력

        // 방법1 : 클라이언트가 책꽂이에 직접 접근하여 책을 가져오는 방법
        for (int i = 0; i < bookShelf.getLength(); i++) {
            System.out.println("Book " + (i + 1) + ": " + bookShelf.getBookAt(i).getName());
        }

        // 방법2 : Iterator를 통해서 책꽂이의 책을 가져오는 방법
        
    }
}
