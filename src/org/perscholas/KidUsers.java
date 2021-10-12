package org.perscholas;

public class KidUsers implements LibraryUser{
private int age;
private String bookType;

    @Override
    public void registerAccount() {
        if(age<12){
            System.out.println("You have successfully registered under a Kids Account");
        }
        else {
            System.out.println("Sorry, Age must be less than 12 register as a kid");
        }

    }

    @Override
    public void requestBook() {

        if(bookType == "Kids"){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }
        else
            System.out.println("Oops, you are allowed to take only kids books");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
