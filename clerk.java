package proxypackage;

public class clerk extends user{
	
	private String name;
	private int priority = 1;
	
	clerk e1;
	
	public clerk(String n, int p){
		name = n;
		priority = p;
	
	   
	}

	@Override
	user makeuser() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
