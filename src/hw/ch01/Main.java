package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("20221310 이지원");
        System.out.println();

        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("클린코드", "기술", 2008, 30000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
        bookShelf.appendBook(new Book("사피엔스", "역사", 2011, 18000));
        bookShelf.appendBook(new Book("이펙티브 자바", "기술", 2018, 36000));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000));
        bookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000));
        bookShelf.appendBook(new Book("총균쇠", "역사", 1997, 22000));
        bookShelf.appendBook(new Book("리펙터링", "기술", 2018, 34000));
        bookShelf.appendBook(new Book("로마인 이야기", "역사", 1992, 25000));
        bookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000));

    // 장르별 테스트
    Iterator<Book> it1 = bookShelf.iteratorByGenre("소설");
    while (it1.hasNext()) {
        Book b = it1.next();
        System.out.println("제목: " + b.getName() + " | 장르: " + b.getGenre() + 
                           " | 출판: " + b.getYear() + "년 | 가격: " + (int)b.getPrice() + "원");
    }

    System.out.println();

    // 출판연도 역순 테스트
    Iterator<Book> it2 = bookShelf.iteratorByYear("소설"); 
    while (it2.hasNext()) {
        Book b = it2.next(); 
        System.out.println("제목: " + b.getName() + " | 장르: " + b.getGenre() + 
                           " | 출판: " + b.getYear() + "년 | 가격: " + (int)b.getPrice() + "원");
    }
    
    }
}
