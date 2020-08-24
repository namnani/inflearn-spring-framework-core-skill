package me.whiteship.ioccontainerautowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BookService {

    // 필드 주입.
    @Autowired //@Qualifier("myBookRepository")
//    List<BookRepository> bookRepositories;
    //@Autowired는 타입만 보는 것이아니고, 이름도 한번 본다.
    BookRepository keesunBookRepository;

    public void printBookRepository() {
        System.out.println(keesunBookRepository.getClass());
//        System.out.println(bookRepository.getClass());
//        this.bookRepositories.forEach(System.out::println);
    }

    @PostConstruct
    public void setUp() {
        System.out.println(keesunBookRepository.getClass());
        System.out.println("hello, nani");
    }

//    public BookService() {
//        System.out.println("hello");
//    }

    // 생성자 주입.
    // 디폴트 생성자가 없을때는, required 옵션 사용불가! 왜냐하면, 무조건 실패니까!
//    @Autowired(required = false)
//    public BookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

    // setter 주입.
//    @Autowired(required = false)
//    public void setBookRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
}
