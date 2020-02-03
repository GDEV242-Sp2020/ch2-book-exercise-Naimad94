/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
public class Book
{
     // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    
    //Added the Accessor for author
    public String getauthor()
    {
        return author;
    }
    
    //Added the Accessor for title
    public String gettitle()
    {
        return title;
    }
    
    //This will print th author
    public void printAuthor()
    {
        System.out.println (author);
    }
    
    //This will print the title
    public void printTitle()
    {
        System.out.println (title);
    }
    
}
