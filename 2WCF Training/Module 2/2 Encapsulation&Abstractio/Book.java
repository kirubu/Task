public class Book 
{
    String name;
    Author author;
    double price;
    int qtyInStock;
    Book(){}
    Book(String name, Author author, double price, int qtyInStock)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public void setName(String name)
    {
        if(name!=null)
            this.name = name;
    }
    public void getName(){return this.name;}

}
