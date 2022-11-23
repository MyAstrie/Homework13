import java.util.Arrays;
import java.util.Objects;

public class Author{

    //region Variables
    private String authorFirstName;
    private String authorSecondName;
    private String authorFullName;
    //endregion

    //region Constructors
    Author(){}

    Author(String authorFullName){
        try {
            if(authorFullName.split(" ").length > 2 || authorFullName.matches(".*\\d.*"))
                throw new IllegalArgumentException("Автор должен содержать только имя и фамилию без чисел");

            this.authorFullName = authorFullName;
            this.authorFirstName = authorFullName.split(" ")[0];
            this.authorSecondName = authorFullName.split(" ")[1];
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //endregion

    //region authorFirstName
    public void setAuthorFirstName(String authorFirstName) {this.authorFirstName = authorFirstName;}
    public String getAuthorFirstName() {return this.authorFirstName;}
    //endregion

    //region authorSecondName
    public void setAuthorSecondName(String authorSecondName) {this.authorSecondName = authorSecondName;}
    public String getAuthorSecondName() {return this.authorSecondName;}
    //endregion

    //region authorFullName
    public void setAuthorFullName(String authorFullName) {this.authorFullName = authorFullName;}
    public String getAuthorFullName() {return this.authorFullName;}
    //endregion

    //region toString
    @Override
    public String toString() {
        return getAuthorFullName();
    }
    //endregion

    //region equals
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author tempAuthor = (Author) other;
        return this.toString().equals(tempAuthor.getAuthorFullName());
    }
    //endregion

    //region hashCode
    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }
    //endregion
}