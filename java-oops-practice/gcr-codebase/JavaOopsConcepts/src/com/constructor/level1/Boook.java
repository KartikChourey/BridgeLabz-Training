package com.constructor.level1;

class Boook {
    public String ISBN;
    protected String title;
    private String author;

    // setter for private variable
    public void setAuthor(String author) {
        this.author = author;
    }

    // getter for private variable
    public String getAuthor() {
        return author;
    }
}

class EBook extends Boook {
    void showEBook() {
        // ISBN and title are accessible
        System.out.println(ISBN + " - " + title);
    }
}
