public class Karyawan{
	private String nama;
	private String alamat;
	protected int gaji;
	final int maxgajidesigner=70;
	final int maxgajiprogrammer=90;
	final int maxgajipmanager=100;

	public void addgaji(int money){
		gaji+=money;
		System.out.println("Gaji yang diterima:"+gaji);
	} 
	public void addgaji(int money, String pesan){
		gaji+=money;
		System.out.println("Gaji yang diterima:"+gaji);
		System.out.println("Pesan:"+ pesan);
	} 

	public void setNama(String newName){
		nama=newName;

	}

	public void setAlamat(String newAddress){
		alamat=newAddress;
	}
	public String getNama(){
		return nama;
	}
	public String getAddress(){
		return alamat;
	}


}