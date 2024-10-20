class Item {
    //atribut milik dari object Item.
    private double itemPrice;
    private String itemName;
    private String itemCode;
    private int itemQty;

    //Default constructor 
    public Item(String code, String name, double price, int qty) {
        // Konstruktor untuk menginisialisasi barang dengan kode, nama, harga, dan jumlah.
        this.itemCode = code;
        this.itemName = name;
        this.itemPrice = price;
        this.itemQty = qty;
    }


    public int getSubTotal(){
        return itemPrice * itemQty;
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

    public int getQty(){
        return itemQty;
    }

    
}
