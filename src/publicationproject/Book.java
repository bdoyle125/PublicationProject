// Name: Bryce Doyle

package publicationproject;


public class Book extends Publication {
    
    private String author;
    
    // Constructor that also initalizes the attributes of Publication.
    public Book(String bookAuthor, String publicationTitle, String publicationGenre, int publicationEdition, int publicationYear)
    {
        super(publicationTitle, publicationGenre, publicationEdition, publicationYear);
        author = bookAuthor;
    }
    
    // Prints out everything from Publication, as well as the genre and author.
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println(genre + " book by " + author + ".");
        printFooter();
    }
}
