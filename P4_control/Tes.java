import java.util.ArrayList;

public class Tes
{
	public static void main(String[] as)
	{
		Kucing meaw1 = new Kucing();
		Kucing meaw2 = new Kucing("Persimed");
		Kucing meaw3 = new Kucing("BSH");
		
		Adopter ad1 = new Adopter();
		Adopter ad2 = new Adopter();
		ad1.setNama("Linda");
		ad2.setNama("Dama");
		
		PetShop nekoneko = new PetShop();
		nekoneko.addKucing(meaw1);
		nekoneko.addKucing(meaw2);
		nekoneko.addKucing(meaw3);
		nekoneko.getAllKucing();
		nekoneko.addAdopter(ad1);
		nekoneko.getAllAdopter();
		nekoneko.Adopsi(ad1,"BSH");
	}
}