package com.company.Books;

public class Book {
    private String title;
    private int cost;
    private int amountOfPage;

    public Book(String title, int cost, int amountOfPage) {
        this.title = title;
        this.cost = cost;
        this.amountOfPage = amountOfPage;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }

    public int getAmountOfPage() {
        return amountOfPage;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setAmountOfPage(int amountOfPage) {
        this.amountOfPage = amountOfPage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", cost=").append(cost);
        sb.append(", amountOfPage=").append(amountOfPage);
        sb.append('}');
        return sb.toString();
    }
}
