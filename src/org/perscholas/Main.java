package org.perscholas;

public class Main {

    public static void main(String[] args) {
	KidUsers ku = new KidUsers();
   //ku.setAge(10);
   ku.registerAccount();
    ku.setAge(18);
    //ku.setBookType("Kids");
    ku.setBookType("Fiction");
    ku.requestBook();
    AdultUsers au = new AdultUsers();
    au.setAge(5);
    //au.setAge(23);
    au.registerAccount();
    //au.setBookType("Fiction");
    au.setBookType("Kids");
    au.requestBook();

    }
}
