// Name: Bryce Doyle

package publicationproject;

public class Publication implements Comparable<Publication> {
    
    protected String title;
    protected String genre;
    protected int edition;
    protected int year;
    
    // Constructor
    public Publication(String publicationTitle, String publicationGenre, int publicationEdition, int publicationYear) 
    {
        title = publicationTitle;
        genre = publicationGenre;
        edition = publicationEdition;
        year = publicationYear;
    } 
    
    // Prints out the information that is not the footer
    public void printInfo()
    {
        System.out.println(title + ". Edition (" + edition + ") published in " + year + ".");
    }
    
    // Prints out the footer
    public void printFooter()
    {
        System.out.println("All rights reserved!\n------------------------------");
    }
    
    @Override
    public int compareTo(Publication other)
    {
        // If the genres are unsorted, this sorts them.
        if (genre.compareTo(other.genre) != 0)
        {
            return genre.compareTo(other.genre);
        }
        // If the genres are the same, sort by title.
        else
        {
            return title.compareTo(other.title);
        }
    }
}
