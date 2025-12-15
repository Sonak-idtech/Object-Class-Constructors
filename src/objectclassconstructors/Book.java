package objectclassconstructors;

public class Book {
    public String title;
    public String  author;
    public int price;
   public Book (String title, String author, int price){
      this.title = title;
      this.author = author;
      this.price = price;
   }
    public Book (String title, String author){
        this.title = title;
        this.author = author;
    }
    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

}
