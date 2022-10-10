package evaluation_1.question3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public static void addBook(Book book)throws BookException{

    }

    public static List viewAllBooks()throws BookException{

        return null;
    }

   public static List viewBooksByAuthor(String author)throws BookException{

       return null;
   }

    public static Book getBookByISBN(int isbn)throws BookException{

        return null;
    }
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book(1,"Java","Aristotle"));
        bookList.add(new Book(11,"Python","Peter"));
        bookList.add(new Book(7,"Rubi","Hendry"));
        bookList.add(new Book(7,"JavaScript","Bean_Diesel"));
    }
}
