package com.romellpineda.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.romellpineda.mvc.models.Book;
import com.romellpineda.mvc.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	// returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    // update
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
    	if(optionalBook.isPresent()) {
//    		optionalBook.setTitle(title);
//    		optionalBook.setDescription(desc);
//    		optionalBook.setLanguage(lang);
//    		optionalBook.setNumberOfPages(numOfPages);

//    		optionalBook.set();
//    		return bookRepository.save(optionalBook);
    		return null;

    	} else {
        	return null;

    	}
	}
    
    // delete
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }

}
