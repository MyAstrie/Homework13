import java.util.Objects;

public class Book{

    //region Variables
    private String bookName;
    private Integer yearPublication;
    private Author author;
    //endregion

    //region Constructors
    Book(String bookName, String authorFullName) {
        try {
            this.author = new Author(authorFullName);
            this.bookName = bookName;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    Book(String bookName, String authorFullName, Integer yearPublication) {
        try {
            this.author = new Author(authorFullName);
            this.bookName = bookName;
            this.yearPublication = yearPublication;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //endregion

    //region print
    public void printInfo(){
        System.out.println("------Информация------");
        System.out.println("Название книги: " + getBookName() +
                "\nАвтор книги: " + author.getAuthorFullName() +
                "\nГод книги: " + getYearPublication());
        System.out.println("----------------------");
    }
    //endregion

    //region bookName
    public void setBookName(String bookName) {this.bookName = bookName;}
    public String getBookName() {return this.bookName;}
    //endregion

    //region yearPublication
    public void setYearPublication(int yearPublication) {this.yearPublication = yearPublication;}
    public Integer getYearPublication() {return this.yearPublication;}
    //endregion

    //region change Author Full Name
    public void setAuthorFullName(String author) {this.author.setAuthorFullName(author);}
    public String getAuthorFullName() {return this.author.getAuthorFullName();}
    //endregion

    //region change Author First Name
    public void setAuthorFirstName(String author) {this.author.setAuthorFirstName(author);}
    public String getAuthorFirstName() {return this.author.getAuthorFullName();}
    //endregion

    //region change Author Second Name
    public void setAuthorSecondName(String author) {this.author.setAuthorSecondName(author);}
    public String getAuthorSecondName() {return this.author.getAuthorSecondName();}
    //endregion

    //region toString
    @Override
    public String toString() {
        String separator = ", ";
        return String.join(separator, this.author.toString(), this.bookName, this.yearPublication.toString());
    }
    //endregion

    //region equals
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book tempBook = (Book) other;
        return this.toString().equals(tempBook.toString());
    }
    //endregion

    //region hashCode
    @Override
    public int hashCode() {
        String separator = ", ";
        String fullBookInfo = String.join(separator, this.author.toString(), this.bookName, this.yearPublication.toString());
        return  Objects.hash(fullBookInfo);
    }
    //endregion
}