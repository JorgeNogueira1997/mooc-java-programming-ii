
public class Book {

    private String name;
    private String author;
    private int publishingYear;
    private int pageCount;

    public Book(String name, int ReleaseYear, int pages, String author) {
        this.name = name;
        this.publishingYear = ReleaseYear;
        this.pageCount = pages;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagecount() {
        return pageCount;
    }

    @Override
    public String toString(){
        return "name: " + this.name + "\n" + 
                "publishing year: " + this.publishingYear + "\n" + 
                "pages: " + this.pageCount + "\n" + 
                "author: " + this.author + "\n";
    }
    
}
