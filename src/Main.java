public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Максим Горький");
        Author secondAuthor = new Author();
        secondAuthor.setAuthorFullName("Виктор Пелевин");

        Book firstBook = new Book("На дне", firstAuthor.getAuthorFullName(), 1902);
        firstBook.printInfo();

        Book secondBook = new Book("Generation «П»", secondAuthor.getAuthorFullName());
        secondBook.printInfo();
        secondBook.setYearPublication(1999);
        secondBook.printInfo();

        System.out.println("\n" + secondBook.toString());
        System.out.println(secondAuthor.toString() + "\n");

        var tempFirstBook =  new Book("На дне", firstAuthor.getAuthorFullName(), 1902);

        System.out.println("Хэш код певрой книги: " + firstBook.hashCode());
        System.out.println("Хэш код временной книги: " + tempFirstBook.hashCode());
        System.out.println("Сравнение певрой и временной книги: " + firstBook.equals(tempFirstBook) + "\n");

        tempFirstBook.setYearPublication(1901);

        System.out.println("Хэш код певрой книги: " + firstBook.hashCode());
        System.out.println("Хэш код временной книги: " + tempFirstBook.hashCode());
        System.out.println("Сравнение певрой и временной книги: " + firstBook.equals(tempFirstBook));
    }
}