public class Author {
    private Book book;
    private String name;
    private String email;
    private char gender;
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}
