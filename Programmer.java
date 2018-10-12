public class Programmer extends Karyawan{
	public void addgaji(int money){
		if(gaji+money<=maxgajiprogrammer){
			System.out.println("Gaji Programmer :"+gaji);
			gaji+=money;
			System.out.println("Gaji Programmer ditambah:"+money);
			System.out.println("Gaji Programmer sekarang:"+gaji);
		}else 
		{
			gaji=maxgajiprogrammer;
			System.out.println("Gaji sudah maximal");
		}
	}
	public void addgaji(int money, String pesan){
			if(gaji+money<=maxgajiprogrammer){		
				gaji+=money;
				System.out.println("Gaji Programmer ditambah:"+money);
				System.out.println("Gaji Programmer sekarang:"+gaji);
				System.out.println("pesan:"+pesan);

			}else 
			{
				gaji=maxgajiprogrammer;
				System.out.println("Gaji sudah maximal");
			}
		}
	}