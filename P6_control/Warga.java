public class Warga
{
	protected String nama;
	
	public Warga()
	{
		nama = "NA";
	}
	
	public void setNama(String nama)
	{
		this.nama = nama;
	}
	
	public String getNama()
	{
		return nama;
	}
	
	public void printBeratBadan(int berat)
	{
		System.out.println("Berat badan warga biasa: "+berat);
	}
		
}