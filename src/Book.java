public class Book {

    private String name;
    private String autuor;
    private String category;
    private double price;
    private boolean state;


    //  通过构造方法定义书的属性


    public Book(String name, String autuor, String category, double price, boolean state) {
        this.name = name;
        this.autuor = autuor;
        this.category = category;
        this.price = price;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutuor() {
        return autuor;
    }

    public void setAutuor(String autuor) {
        this.autuor = autuor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Book(){
        this(10);
    }

    public Book(int i){
        Person.books = new Book[i];
    }


}
