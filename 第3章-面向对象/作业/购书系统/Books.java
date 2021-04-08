/****************
 @ PROJECT NAME: IntelliJ IDEA
 @ BUILD TIME: 2021/4/8
 @ AUTHOR: gzasj_000
 @ TYPE: 图书信息类
 ******************/
public class Books {
    private String book_name;
    private int book_id;
    private double book_price;
    int value_of_book=100;//库存

    public String getBook_name() {
        return book_name;
    }
    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getBook_id() {
        return book_id;
    }
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public double getBook_price() {
        return book_price;
    }
    public double setBook_price(double book_price) {
        this.book_price = book_price;
        return book_price;
    }

    public int getCount() {
        return value_of_book;
    }
    public void setCount(int value_of_book) {
        this.value_of_book = value_of_book;
    }
}
