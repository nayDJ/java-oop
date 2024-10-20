
public class Cashier {
    private ArrayList<Item> items;

    public Cashier() {
        items = new ArrayList<>();
    }

    public void addItem(double p, String c, String name, int qty) {
        items.add(new Item(c, n, p, qty));
        System.out.println("Barang ditambahkan.");
    }

    public void removeItem(String code) {
        for (Item item : items) {
            if (item.getCode().equals(code)) { 
                items.remove(item);
                System.out.println("Barang dihapus.");
                return;
            }
        }
        System.out.println("Barang tidak ditemukan.");
    }

   public void displayTotal() {
        System.out.println("------------------------------------------------");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "Kode", "Nama Barang", "Harga", "Jumlah", "SubTotal");
        System.out.println("------------------------------------------------");
        double total = 0.0;
        for (Item item : items) {
            double subTotal = item.getSubTotal();
            total += subTotal;
            System.out.printf("%-10s %-20s %-10.2f %-10d %-10.2f\n",
                    item.getCode(), item.getName(), item.getPrice(), item.getQty(), subTotal);
        }
        System.out.println("------------------------------------------------");
        System.out.printf("%-40s %-10.2f\n", "Total Belanja:", total);
    }

    public void processPayment(int payment) {
        int total = (int) items.stream().mapToDouble(Item::getSubTotal).sum();
        int change = payment - total;
        System.out.println("Total bayar: " + total);
        System.out.println("Dibayar: " + payment);

        if (payment < total) {
            int shortage = total - payment;
            System.out.println("Kekurangan bayar: " + shortage);
        } else {
            System.out.println("Kembalian: " + change);
        }
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
