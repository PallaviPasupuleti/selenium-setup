import java.util.ArrayList;

public class Lists{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <ProductDetails> pd=new ArrayList<>();
		pd.add(new ProductDetails(899,"Pigeon"));
		pd.add(new ProductDetails(999,"Signoraware"));
		for(ProductDetails pd1:pd)
		{
			System.out.println("Productname:"+pd1.getProductname()+"ProductPrice"+pd1.getProductPrice());
		}
		ArrayList <PractlceSheet> ps=new ArrayList<>();
		ps.add(new PractlceSheet(1994,"Lunchbox"));
		ps.add(new PractlceSheet(2000,"Boxes"));
		for(PractlceSheet ps1:ps)
		{
			System.out.println("ManufacturedYear:"+ps1.getManfyear()+"Productlabel:"+ps1.getProductinfo());
		}
	}

	
}

class ProductDetails
{
	int Price;
	String Productname;
	
	public ProductDetails(int p,String name)
	{
		Price=p;
		Productname=name;
	}
	
	public int getProductPrice()
	{
		return Price;
	}
	public String getProductname()
	{
		return Productname;
	}
	
}