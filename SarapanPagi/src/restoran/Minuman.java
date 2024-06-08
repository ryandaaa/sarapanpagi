package restoran;

//pewarisan kelas Item.java sebagai parent child kepada kelas Makanan.java sebagai child (inheritance)
public class Minuman extends Item {
 
    int hargaItem, totalItem;
    
    public Minuman(String nama) {
        //pemanggilan constructor parent class Item.java menggunakan keyword super
        super(nama);
    }
    
    //overriding method displayInfo() pada kelas Item.java
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
}
