public class Item {
    //atribut milik dari object Item.
    private double itemPrice;
    private String itemName;
    private String itemCode;
    private int itemStock;

    //Default constructor 
    public Item(){}

    public Item(String name, String code){
        this.itemName = name;
        this.itemCode = code;
    }

    public Item(double price, String code, String name){

    }

    public Item(String name, double price, String code){

    }

    //Konstruktor: dijalankan saat proses instansiasi. 
    public Item(String code, String name, double price) {
        this.itemCode = code;
        this.itemName = name;
        this.itemPrice = price;
    }

    public int updateStock(int stockUpdate){
        this.itemStock += stockUpdate;
        return itemStock;
    }

    public double getPrice() {
        return itemPrice;
    }

    public String getCode(){
        return itemCode;
    }

    public String getName(){
        return itemName;
    }

    public int getStock(){
        return itemStock;
    }

    
}
