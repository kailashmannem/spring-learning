package com.application.spring_boot;

public class Course {
    private int id;
    private String title;
    private String author;
    Course(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    @Override
    public String toString() {
        return "Course{id=" + id + ", title='" + title + "', author='" + author + "'}";
    }
}
