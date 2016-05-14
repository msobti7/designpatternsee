package proxypackage;

public class manager extends user{
	
	private String name;
	private int priority = 3;
	
	manager e1;
	
	public manager(String n, int p){
		name = n;
		priority = p;
	
	}

	@Override
	user makeuser() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
