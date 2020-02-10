/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * Damian Nunez
 * February 7,2020
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private String refNumber;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }
    
    //Accessor for the author.
    public String getAuthor()
    {
        return author;
    }
    
    //Accessor for the title.
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    //This will print the author.
    public void printDetail()
    {
        System.out.println("Author: " + author);
    }
    
    //This will print the title.
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
    
    public void printDetails()
    {
        System.out.println("Title: ," + title + "Author: ," + author + "Pages: ," + pages);
    }
    // Add the methods here ...
}
