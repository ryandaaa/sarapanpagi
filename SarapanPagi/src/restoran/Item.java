package restoran;

//deklarasi kelas abstrak bernama Item.java
public abstract class Item {
    
    private String nama;
    private double harga;
    private int totalItem;
    
    //deklarasi constructor Item()
    public Item(String name) {
        this.nama = name;
        this.harga = harga;
    }

    public abstract void setHargaItem(int total);
    public abstract int getHargaItem();
    
    public abstract void setTotalItem(int total);
    public abstract int getTotalItem();
}
