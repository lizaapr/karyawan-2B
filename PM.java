public class PM extends Karyawan{
	public void addgaji(int money){
		if(gaji+money<=maxgajipmanager){
			System.out.println("Gaji Projek Manager :"+gaji);
			gaji+=money;
			System.out.println("Gaji Projek Manager ditambah:"+money);
			System.out.println("Gaji Projek Manager sekarang:"+gaji);
		}else 
		{
			gaji=maxgajipmanager;
			System.out.println("Gaji sudah maximal");
		}
	}
	public void addgaji(int money, String pesan){
			if(gaji+money<=maxgajipmanager){		
				gaji+=money;
				System.out.println("Gaji Projek Manager ditambah:"+money);
				System.out.println("Gaji Projek Manager sekarang:"+gaji);
				System.out.println("pesan:"+pesan);

			}else 
			{
				gaji=maxgajipmanager;
				System.out.println("Gaji sudah maximal");
			}
		}
	}