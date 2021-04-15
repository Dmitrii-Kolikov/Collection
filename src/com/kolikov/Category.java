package com.kolikov;

import com.fasterxml.jackson.annotation.*;

import java.util.List;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "CATEGORY_NAME")
public class Category {

    @JsonView({CategoryViews.IdView.class, CategoryViews.NameView.class})
    private long id;

    @JsonView(CategoryViews.NameView.class)
    private String name;

    @JsonView(CategoryViews.FullView.class)
    private int countBooks;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    private List<Book> books;

    @JsonIgnore
    public String getPassword() {
        return "password";
    }

    //    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("CATEGORY_ID")
    public void setId(long id) {
        this.id = id;
    }

    //    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("CATEGORY_NAME")
    public void setName(String name) {
        this.name = name;
    }

    public int getCountBooks() {
        return countBooks;
    }

    public void setCountBooks(int countBooks) {
        this.countBooks = countBooks;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countBooks=" + countBooks +
                ", books=" + books +
                '}';
    }
}
