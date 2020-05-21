import java.util.Scanner;

public class main {


	static Playground_owner g = new Playground_owner();
	static Player p = new Player(); 
    static booking bo = new booking();
    static LoginUser d1 = new LoginUser() ;
    static Person p1=new Person();
    static Scanner input = new Scanner(System.in);
    public static void menuplayer()
    {
    	int order=0;
    	do {
    	System.out.println("WELCOME TO MENU PLAYER\n");
    	System.out.println("[1]View playgrounds");
    	System.out.println("[2]Book playground");
    	System.out.println("[3]Filter");
    	System.out.println("[4]Create team");
    	System.out.println("[5]Exit");
    	order=input.nextInt();
    	switch(order)
    	{
    	case 1:
    	{
    		g.view();
    		break;
    	}
    	case 2:
    	{
    		g.bookPlayground();
    		p.payPyEwallet();
    		break;
    	}
    	case 3:
    	{
    		g.filter();
    		break;
    	}
    	case 4:
    	{
    		g.team();
    		break;
    	}
    	case 5:
    	{
    		System.out.println("GOODBYE\n");
    		break;
    	}
    	default:
    	{
    		System.out.println("NOT VALID CHOICE\n");
    		break;
    	}
    	}
    	}while(order!=5);
    }
    public static void menuplayground_owner()
    {
    	int choose=0;
    	do {
    	System.out.println("WELCOME TO MENU PLAYGROUND OWNER");
    	System.out.println("[1]Create playground");
    	System.out.println("[2]Exit");
    	choose=input.nextInt();
    	switch(choose)
    	{
    	case 1:
    	{
      	    Playground_owner owner = new Playground_owner(); 
            owner.Addplayground();
            g.add_Playgrounds(owner);
            //g.approve();
            System.out.println("congratulations! acceptable playground \n");
    		break;
    	}
    	case 2:
    	{
    		System.out.println("GOODBYE");
    		break;
    	}
    	default:
    	{
            System.out.println("INVALID CHOICE PLEASE ENTER AGAIN");
            break;
       	}
    	}
    	}while(choose!=2);
    }
    public static void main(String[] args) {
        // TODO code application logic here
    	
        Scanner input = new Scanner(System.in); 
         p1.setUsername("admin");
         p1.setPassword("admin");

         d1.user.setUsername("admin");
         d1.user.setPassword("admin");
         d1.add_USERS(d1);
         //d1.print_users();
         int check=0;
         int choice = 0;
         do{
        	 System.out.println("[1]login");
        	 System.out.println("[2]Create account");
        	 System.out.println("[3]logout");
        	 choice =input.nextInt();
        	 switch(choice)
        	 {
        	 case 1:
        	 {
                 do{
                   p1.login(); 
                   check = d1.check(p1);
                   System.out.println(check);
  				 if(check !=0)
  				  {
  				System.out.println("welcome to gofo\n");
  				  if(check==1)
  				  {
  					  menuplayer();
  				  }
  				  else if(check==2)
  				  {
  					  menuplayground_owner();
  				  }
  				  else
  				  {
  					g.approve();  
  				  }
  				  }
  				   else
  				  {
  				System.out.println("notvalid\n");
  				  }
  				  }while(check == 0);
        		 break;
        	 }
        	 case 2:
        	 {
        		 int b=0;
               	 LoginUser u1 = new LoginUser() ;
                  b=u1.register();
                  d1.add_USERS(u1);
                  
        		 break;
        	 }
        	 case 3:
        	 {
        		 System.out.println("GOODBYE");
        		 break;
        	 }
        	 default :
        	 {
        		 p1.logout();
        		 System.out.println("not valid number");
        	 }
        	 }
         }while(choice!=3);
}
}