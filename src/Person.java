

import java.util.Scanner;

public class Person {
	protected String username;
	protected String password;

	
	Scanner input = new Scanner (System.in);
	public Person() 
    {        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void login()
    {
    	String name,password;
    	System.out.println("Enter your Name");
    	name=input.next();
    	setUsername(name);
    	
    	System.out.println("Enter your Password");
        password=input.next(); 
        setPassword(password);
        
    }
    
    public void logout()
    {
    	System.out.println("GOODBYE");
    }
}
