package com.ccpg2;

/**
 * Created by chendom on 2017/7/17.
 */
public class Domain {
    private String BookId;
    private String BookName;
    private String BookPrice;
    public Domain(String bookId, String bookName, String bookPrice) {
        BookId = bookId;
        BookName = bookName;
        BookPrice = bookPrice;
    }
    public String getBookId() {
        return BookId;
    }
    public void setBookId(String bookId) {
        BookId = bookId;
    }
    public String getBookName() {
        return BookName;
    }
    public void setBookName(String bookName) {
        BookName = bookName;
    }
    public String getBookPrice() {
        return BookPrice;
    }
    public void setBookPrice(String bookPrice) {
        BookPrice = bookPrice;
    }
    @Override
    public String toString() {
        return "Domain{" +
                "BookId='" + BookId + '\'' +
                ", BookName='" + BookName + '\'' +
                ", BookPrice='" + BookPrice + '\'' + '}';
    }
}
