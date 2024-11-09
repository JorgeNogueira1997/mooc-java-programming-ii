/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class Book {
    
    String bookName;
    String age;
    
    public Book(String bookName, String age ){
        this.bookName = bookName;
        this.age = age;
    }
    
    public String getBookName(){ return this.bookName; };
    public String getBookAge(){ return this.age; };
    
    @Override
    public String toString(){
        return this.bookName + " (recommended for " + 
                this.age + " year-olds or older)";
    }
    
}
