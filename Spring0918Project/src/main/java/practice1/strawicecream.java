package practice1;

public class strawicecream implements Icecream{

	private String name;
	private String price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public void tasteice() {
		System.out.println("냠냠  "+name);
	}

	@Override
	public void talkname() {
		System.out.println("딸기맛"+price);
		
	}
	

}
