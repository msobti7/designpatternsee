package proxypackage;

import java.util.Scanner;

public class client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cn=0;
	
	do {
		System.out.println("Act as : (1) employee  (2) director (3) manager (4) clerk (5)admin ");
		int choice = in.nextInt();
		switch(choice)
		{
		case 1 : employee u1= new employee("n",2);
		        System.out.println("1. access resources 2. logout ");
		        int c = in.nextInt();
		        if(c==1)
		        {System.out.println("1. network 2. database 3. application 4. files");
		           
		           int ch= in.nextInt();
		           
		           if(ch==1){ 
		           networkproxy nw= new networkproxy();
		           nw.access(2);
		           }
		           else if(ch==2) {
		        	   databaseproxy dw =new databaseproxy();
		        	   dw.access(2);
		           }
		           else if(ch==3){
		        	   applicationproxy aw=new applicationproxy();
		        	   aw.access(2);
		           }
		           else {
		        	   filesproxy fp = new filesproxy();
		        	   fp.access(2);
		           }
		        }
		        else { break;}
		        
		case 2 : director d1 = new director("n",4);    
		 
		 System.out.println("1. access resources 2. logout");
	        int a = in.nextInt();
	        if(a==1)
	        {System.out.println("1. network 2. database 3. application 4. files");
	           
	           int ch= in.nextInt();
	           
	           if(ch==1){ 
	           networkproxy nw= new networkproxy();
	           nw.access(4);
	           }
	           else if(ch==2) {
	        	   databaseproxy dw =new databaseproxy();
	        	   dw.access(4);
	           }
	           else if(ch==3){
	        	   applicationproxy aw=new applicationproxy();
	        	   aw.access(4);
	           }
	           else {
	        	   filesproxy fp = new filesproxy();
	        	   fp.access(4);
	           }
	        }
	        else { break;}
	        
		case 3 : manager m1 = new manager("n",3);
		 System.out.println("1. access resources 2. logout ");
	        int b = in.nextInt();
	        if(b==1)
	        {System.out.println("1. network 2. database 3. application 4. files");
	           
	           int ch= in.nextInt();
	           
	           if(ch==1){ 
	           networkproxy nw= new networkproxy();
	           nw.access(3);
	           }
	           else if(ch==2) {
	        	   databaseproxy dw =new databaseproxy();
	        	   dw.access(3);
	           }
	           else if(ch==3){
	        	   applicationproxy aw=new applicationproxy();
	        	   aw.access(3);
	           }
	           else {
	        	   filesproxy fp = new filesproxy();
	        	   fp.access(3);
	           }
	        }
	        else {break;}
		case 4 : clerk c1 = new clerk("n",1);
		 System.out.println("1. access resources 2. logout");
	        int d = in.nextInt();
	        if(d==1)
	        {System.out.println("1. network 2. database 3. application 4. files");
	           
	           int ch= in.nextInt();
	           
	           if(ch==1){ 
	           networkproxy nw= new networkproxy();
	           nw.access(1);
	           }
	           else if(ch==2) {
	        	   databaseproxy dw =new databaseproxy();
	        	   dw.access(1);
	           }
	           else if(ch==3){
	        	   applicationproxy aw=new applicationproxy();
	        	   aw.access(1);
	           }
	           else {
	        	   filesproxy fp = new filesproxy();
	        	   fp.access(1);
	           }
	        }
	        else {break;}
		}}while(cn==0);
	
	
	}
}

	
		 
			  
		  
		
	

	


