package proxypackage;

public class employee extends user {
	
	private String name;
	private int priority =2;

	
	employee e1;
	
	public employee(String n, int p){
		name = n;
		priority = p;
	
	   
	}

	@Override
	user makeuser() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	
	

	

