/*
 * 
 * @author (Deden Muhamad Furqon)
 * @version (16/4/2019)
 * 
*/
public class Laptop extends Barang{
	
	private String merk;
	private String type;
	private int ram;
	private String processor;
	private String vga;

	public Laptop(int id, String nama, String merk, int harga, String kondisi, int berat, int stock, String kategori,
			String subkategori, String childkategori, String type, int ram, String processor, String vga) {
		super(id, nama, merk, harga, kondisi, berat, stock, kategori, subkategori, childkategori);
		this.type = type;
		this.ram = ram;
		this.processor = processor;
		this.vga =vga;
		this.merk = merk;
	}
	
	
	public int getRam(){ return ram; }

	public String getType(){ return type; }

	public String getProcessor(){ return processor; }

	public String getVga(){ return vga; }

	//Override dari class barang
	@Override
	public void deskripsi() {
		System.out.println("Ini adalah laptop");
		
	}
	//Overload dari class barang
	public void spesifikasi(int ram, String processor, String vga) {
		System.out.println("RAM = "+ ram);
		System.out.println("Processor = "+ processor);
		System.out.println("VGA = " + vga);
		
		
		
	}
}
