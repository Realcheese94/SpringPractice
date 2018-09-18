package practice1;

public class bananaicecream implements Icecream{
	private String name;
	private String price;
	 public bananaicecream(String name,String price) {
		 this.name = name;
		 this.price = price;
	}
	@Override
	public void tasteice() {
		 System.out.println("냠");	}

	@Override
	public void talkname() {

		System.out.println("바나나 아이스크림 맛");
	}
	

}
