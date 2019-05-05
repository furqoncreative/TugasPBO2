/*author : Deden Muhamad Furqon*/

public class Barang{
	protected int id;
	protected String nama;
	protected String merk;
	protected int harga;
	protected String kondisi;
	protected int berat;
	protected int stock;
	protected String kategori;
	protected String subkategori;
	protected String childkategori;

	public Barang(int id, String nama, String merk, int harga, String kondisi, int berat, int stock,
		String kategori, String subkategori, String childkategori){
		this.id = id;
		this.nama = nama;
		this.merk = merk;
		this.harga = harga;
		this.kondisi = kondisi;
		this.berat = berat;
		this.stock = stock;
		this.kategori = kategori;
		this.subkategori = subkategori;
		this.childkategori = childkategori;
	}

	public void deskripsi() {
		System.out.println("Ini adalah deskripsi");
	}
	public void spesifikasi(String spesifikasi) {
		System.out.println(spesifikasi);
	}
	
	public int getId(){ return id; }

	public String getNama(){ return nama; }

	public String getMerk(){ return merk; }

	public int getHarga(){ return harga; }

	public String getKondisi(){ return kondisi; }

	public int getBerat(){ return berat; }

	public int getStock(){ return stock; }

	public String getKategori(){ return kategori; }

	public String getSubkategori(){ return subkategori; }

	public String getChildkategori(){ return childkategori; }


}