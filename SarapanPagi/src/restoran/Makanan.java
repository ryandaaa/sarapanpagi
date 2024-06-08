package restoran;

//pewarisan kelas Item.java sebagai parent child kepada kelas Makanan.java sebagai child (inheritance)
public class Makanan extends Item {

    private int hargaItem, totalItem;

    public Makanan(String nama) {
        //pemanggilan constructor parent class Item.java menggunakan keyword super
        super(nama);
    }

    @Override
    public void setHargaItem(int total) {
        hargaItem = total;
    }

    @Override
    public int getHargaItem() {
        return hargaItem;
    }

    @Override
    public void setTotalItem(int total) {
        totalItem = total;
    }

    @Override
    public int getTotalItem() {
        return totalItem;
    }

    protected class Topping {

        private int hargaTopping;

        public void setHargaTopping(int harga) {
            hargaTopping = harga;
        }

        public int getHargaTopping() {
            return hargaTopping;
        }

        public void setTotalTopping(int total) {
            totalItem = total;
        }

        public int getTotalTopping() {
            return totalItem;
        }
    }
}
