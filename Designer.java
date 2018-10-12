public class Designer extends Karyawan{
	public void addgaji(int money){
		if(gaji+money<=maxgajidesigner){
			System.out.println("Gaji Designer :"+gaji);
			gaji+=money;
			System.out.println("Gaji Designer ditambah:"+money);
			System.out.println("Gaji Designer sekarang:"+gaji);
		}else 
		{
			gaji=maxgajidesigner;
			System.out.println("Gaji sudah maximal");
		}
	}
	public void addgaji(int money, String pesan){
			if(gaji+money<=maxgajidesigner){		
				gaji+=money;
				System.out.println("Gaji Designer ditambah:"+money);
				System.out.println("Gaji Designer sekarang:"+gaji);
				System.out.println("pesan:"+pesan);

			}else 
			{
				gaji=maxgajidesigner;
				System.out.println("Gaji sudah maximal");
			}
		}
	}