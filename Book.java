package come.epam.hometask;

import java.io.Serializable;

public class Book implements Serializable {
    private int number_ID;
    private String name;
    private String author;
    private String publishing_house;
    private int year_of_publication;
    private int page_count;
    private int price;

    public Book(int number_ID, String name, String author, String publishing_house,
                int year_of_publication, int page_count, int price) {
        this.number_ID = number_ID;
        this.name = name;
        this.author = author;
        this.publishing_house = publishing_house;
        this.year_of_publication = year_of_publication;
        this.page_count = page_count;
        this.price = price;
    }
    public int getNumber_ID() { return number_ID; }
    public void setNumber_ID(int number_ID) { this.number_ID = number_ID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAuthor() {return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getPublishing_house() { return publishing_house; }
    public void setPublishing_house(String publishing_house) { this.publishing_house = publishing_house; }
    public int getYear_of_publication() { return year_of_publication; }
    public void setYear_of_publication(int year_of_publication) { this.year_of_publication = year_of_publication; }
    public int getPage_count() { return page_count;}
    public void setPage_count(int page_count) { this.page_count = year_of_publication; }
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    @Override
    public String toString() {
        return "number_ID=" + number_ID
                + ", name=" + name + ", author=" + author
                + ", publishing_house=" + publishing_house
                + ", year_of_publication=" + year_of_publication
                + ", page_count=" + page_count
                + ", price=" + price;
    }
}
