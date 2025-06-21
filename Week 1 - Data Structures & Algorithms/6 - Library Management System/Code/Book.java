public class Book{
    private String bookId;
    private String title;
    private String author;

    public Book(String id, String tit, String auth){
        this.bookId = id;
        this.title = tit;
        this.author = auth;
    }
    public String getId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    @Override
    public String toString(){
        return "Book [Book ID=" + bookId + ", Title=" + title + ", Author=" + author + "]";
    }
}