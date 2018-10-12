public class KaryawanTest{
public static void main(String[] args) {
	Designer a= new Designer();
	a.setNama("Liza april");
	System.out.println("Nama Karyawan:"+a.getNama());
	a.setAlamat("Indramayu");
	System.out.println("Alamat Karyawan:"+a.getAddress());
	a.addgaji(50);
	a.addgaji(20, "dapat bonus karena lembur");
	a.addgaji(30);

	System.out.println("=====================================");

	Programmer b= new Programmer();
	b.setNama("Daniel Kang");
	System.out.println("Nama Karyawan:"+b.getNama());
	b.setAlamat("Medan");
	System.out.println("Alamat Karyawan:"+b.getAddress());
	b.addgaji(50);
	b.addgaji(30, "dapat bonus karena lembur");
	b.addgaji(20);

	System.out.println("=====================================");
	
	PM c = new PM();
	c.setNama("Bang Kai");
	System.out.println("Nama Karyawan:"+c.getNama());
	c.setAlamat("Jakarta");
	System.out.println("Alamat Karyawan:"+c.getAddress());
	c.addgaji(80);
	c.addgaji(20,"dapat bonus karena lembur");
	c.addgaji(20);
	
}
}