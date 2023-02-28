public class Kucing
{
	//property
	private String ras;
	//konstruktor
	public Kucing()
	{
		ras = "N/A";
	}
	public Kucing(String nras)
	{
		ras = nras;
	}
	//method setter
	void setRas(String nras)
	{
		ras = nras;
	}
	//method getter
	String getRas()
	{
		return ras;
	}
}