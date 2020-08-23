package me.whiteship.springapplicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ApplicationConfig {

    @Bean
    public BookRepository bookRepository() {
        BookRepository bookRepository = new BookRepository();
        bookRepository.nani = "bean";
//        return new BookRepository();
        return bookRepository;
    }

//    @Bean
//    public BookService bookService() {
//        BookService bookService = new BookService();
//        bookRepository().nani = "custom2";
//        bookService.setBookRepository(bookRepository());
//        return bookService;
//    }


    // 결국 위랑, 아래랑 똑같은 의미인가 본데... 그치만 파라미터있는 빈이 마지막으로 덮어 써지나보다.. 아 덮어 써지는 개념이구나.
    @Bean
    public BookService bookService(BookRepository bookRepository) {
        bookRepository.nani = "custom4";
        return new BookService();
        // 파라미터로 안넣어줄거면은, BookService의 필드에 @Autowired 어노테이션을 달아줘야함.
//        return new BookService(bookRepository);

//        BookService bookService = new BookService();
//        bookRepository.nani = "custom";
//        bookService.setBookRepository(bookRepository);
//        return bookService;
    }
}
