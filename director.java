package proxypackage;

public class director extends user {
	
	private String name;
	private int priority = 4;
	
	director e1;
	
	public director(String n, int p){
		name = n;
		priority = p;
	
	   
	}

	@Override
	user makeuser() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
