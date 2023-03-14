import java.util.ArrayList;
public class Tes
{
	public static void main(String[] a)
	{
		Warga w1 = new Warga();
		System.out.println(w1.getNama()); //NA
		w1.printBeratBadan(140);//Berat badan warga biasa: 140
		
		WargaRT w2 = new WargaRT();
		w2.setNama("Dama");//dapat warisan ?? bisa* 093:bisa ;; 
		System.out.println(w2.getNama()); // Dama bisa kayaknya*
		w2.printBeratBadan(45); //warga rw 45
		
		WargaRW w3 = new WargaRW();
		w3.setNama("Michel");// jelas dapat warisan
		System.out.println(w3.getNama()); //jelas output Michel
		w3.printBeratBadan(40); //warga rw 40?
		
		Kelurahan patemon = new Kelurahan();
		//polymorpic call
		patemon.pendaftaran(w1);
		patemon.pendaftaran(w2);
		patemon.pendaftaran(w3);
		
		ArrayList<Warga> listWarga = new ArrayList<Warga>();
		listWarga.add(w1);
		listWarga.add(w2);
		listWarga.add(w3);
		
		Kelurahan.printSemuaWarga(listWarga);

		
		
	}
}