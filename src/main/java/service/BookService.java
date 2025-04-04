package service;

import model.dao.impl.BookDao;
import model.entity.Author;
import model.entity.Book;
import model.entity.Reservation;

import java.util.List;
import java.util.Set;


public class BookService {
    private final BookDao bookDao;

    public BookService() {
        bookDao = new BookDao();
    }

    public Book getBookById(Long bookId) {
        return bookDao.getBookById(bookId);
    }


    public List<Book> getBooksByAuthorId(Long authorId) {

        return bookDao.getBooksByAuthorId(authorId);
    }

    public List<Book> getAllBooks() {

        return bookDao.getAllBooks();
    }

    public int getBookCount() {

        return bookDao.getBookCount();
    }

    public List<Book> getBooksByTitle(String title, String currentLanguage) {

        return bookDao.getBooksByTitle(title, currentLanguage);
    }

    public List<Book> getBooksByCategory(String genre) {

        return bookDao.getBooksByCategory(genre);
    }
    public Set<Author> getAuthorsByBookId(Long bookId) {
        Book book = bookDao.getBookById(bookId);
        return book != null ? book.getAuthors() : null;
    }

    public List<Book>  getBooksByLanguage(String language) {

        return bookDao.getBooksByLanguage(language);
    }

    public void setBookAvailability(Long bookId, String isAvailable) {
        bookDao.updateBookAvailabilityStatus(bookId, isAvailable);
    }

    public List<Book> searchBooks(String searchTerm, String currentLanguage) {

        return bookDao.searchBooks(searchTerm, currentLanguage);
    }

}
