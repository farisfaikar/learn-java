import java.util.ArrayList;

public class PetShop
{
	ArrayList<Kucing> listKucing;
	ArrayList<Adopter> listAdopter;
	
	PetShop()
	{
		listKucing = new ArrayList<Kucing>();
		listAdopter = new ArrayList<Adopter>();
	}
	
	public void addKucing(Kucing meaw)
	{
		listKucing.add(meaw);
	}
	public void addAdopter(Adopter udin)
	{
		listAdopter.add(udin);
	}
	
	public void getAllKucing()
	{
		for(Kucing k:listKucing)
			System.out.println(k.getRas());
	}
	
	public void getAllAdopter()
	{
		for(Adopter a:listAdopter)
			System.out.println(a.getNama());
	}
	
	public void Adopsi(Adopter udin, String raskucing)
	{
		boolean ketemu = false;
		for(Kucing k:listKucing)
		{
			if(k.getRas() == raskucing)
			{
				ketemu = true;
				break;
			}
		}
		if(ketemu)
			System.out.println("Mbak/Mas "+udin.getNama()+" jadi mengadopsi kucing");
		else
			System.out.println("Mbak/Mas "+udin.getNama()+" tidak jadi mengadopsi kucing");
	}
}