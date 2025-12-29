package generaltasksforOOP;

public class Book {
    private String title;
    private String author;
    private int year;
    private  boolean isAvailable;

    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    private void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void borrow(){
        if(isAvailable == true){
            setAvailable(false);
            System.out.println("Book has been borrowed");
        }
        else{
            System.out.println("Book is not available");
        }

    }

    public void returnBook(){
        setAvailable(true);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isAvailable=" + isAvailable +
                '}';
    }

}
