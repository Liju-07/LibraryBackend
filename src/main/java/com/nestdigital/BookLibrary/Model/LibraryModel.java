package com.nestdigital.BookLibrary.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "books")
@Entity
public class LibraryModel {
    @Id
    @GeneratedValue
    public int id;
    public String name;
    public String Pdate;
    public String author;
    public int price;

    public LibraryModel(int id, String name, String pdate, String author, int price) {
        this.id = id;
        this.name = name;
        Pdate = pdate;
        this.author = author;
        this.price = price;
    }

    public LibraryModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPdate() {
        return Pdate;
    }

    public void setPdate(String pdate) {
        Pdate = pdate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
