// Name: Bryce Doyle

package publicationproject;


public class Magazine extends Publication {
    
    private String publisher;
    
    // Constructor that also initalizes the attributes of Publication.
    public Magazine(String magazinePublisher, String publicationTitle, String publicationGenre, int publicationEdition, int publicationYear)
    {
        super(publicationTitle, publicationGenre, publicationEdition, publicationYear);
        publisher = magazinePublisher;
    }
    
    // Prints out everything from Publication, as well as the genre and publisher.
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println(genre + " magazine by " + publisher + ".");
        printFooter();
    }
}
