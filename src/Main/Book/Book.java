package main.book;

public class Book {
    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return this.id == book.id && this.name == book.name;
    }

    public int hashCode() {
        return id * 21;
    }

    public String toString() {
        return "id:" + id + " name:" + name;
    }
}
