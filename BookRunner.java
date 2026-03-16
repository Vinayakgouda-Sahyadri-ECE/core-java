class BookRunner {

    public static void main(String[] args) {

        Book b1 = new Book("Java Programming","James Gosling","Oracle Press",750,500,
                           "English","Programming",3,"ISBN12345",true,0.8,"Blue");

        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.publisher);
        System.out.println(b1.price);
        System.out.println(b1.pages);
        System.out.println(b1.language);
        System.out.println(b1.genre);
        System.out.println(b1.edition);
        System.out.println(b1.isbn);
        System.out.println(b1.hardcover);
        System.out.println(b1.weight);
        System.out.println(b1.color);

    }
}