package practice1;

public class IcecreamInfo {
Icecream icecream;
String name;



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public Icecream getIcecream() {
	return icecream;
}



public void setIcecream(Icecream icecream) {
	this.icecream = icecream;
}



public void getinfo() {
	icecream.talkname();
	System.out.println("dgdgd"+name+"$$$$$$$$$$$");
	icecream.tasteice();
}
}
