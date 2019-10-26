/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etutorsoftwer;

/**
 *
 * @author ASUS
 */
public class AllcommentGeter {
    private String name;
    private String comment;

    public AllcommentGeter(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    public AllcommentGeter() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "AllcommentGeter{" + "name=" + name + ", comment=" + comment + '}';
    }
    
  
}
