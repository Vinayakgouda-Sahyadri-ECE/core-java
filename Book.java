class Book {

    String title;
    String author;
    String publisher;
    int price;
    int pages;
    String language;
    String genre;
    int edition;
    String isbn;
    boolean hardcover;
    double weight;
    String color;

    Book(String title,String author,String publisher,int price,int pages,String language,
         String genre,int edition,String isbn,boolean hardcover,double weight,String color){

        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.pages = pages;
        this.language = language;
        this.genre = genre;
        this.edition = edition;
        this.isbn = isbn;
        this.hardcover = hardcover;
        this.weight = weight;
        this.color = color;
    }
}