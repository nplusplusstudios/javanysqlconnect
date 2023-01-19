//abstract means u cant create object from this class
public abstract class Product {
    protected String pid,title;
    protected float price;
    
    public Product(String id, String ti, float pri){
        pid = id;
        title = ti;
        price = pri;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    //this is will be half coded
    public void showInfo(){
        System.out.println("Product Details");
        System.out.println("Product ID : " + pid);
        System.out.println("Title      : " + title);
        System.out.println("Price      : " + price);
    }
    
}
