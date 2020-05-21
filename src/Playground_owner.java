import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Playground_owner extends USER
{
	
   public Playground ground=new Playground();
  public booking b = new booking();
   public String []arr =new String[1000];
  ArrayList<Playground_owner>array_ground=new ArrayList<Playground_owner>();
   //ArrayList<Playground_owner>();
  public AdministratorService a;
  public availableHours []available =new availableHours[1000];

  public  void Addplayground()
{
    String name,location;
    int bookingnumber,available_hours = 0;
    String hour;
    double price;
   System.out.println("enter playground information");
   Scanner input = new Scanner (System.in);
   System.out.println("Enter playground name :");
   name=input.next();
   ground.setNamePlayground(name);
   
   System.out.println("Enter playground location:");
   location=input.next();
   ground.setLocationPlayground(location);
   
   System.out.println("Enter bookingnumber for playground");
   bookingnumber=input.nextInt();
   ground.setBookingNumber(bookingnumber);
   
   System.out.println("Enter price for playground");
   price=input.nextDouble();
   ground.setPrice(price);
   
   System.out.println("Enter available hour for playground");
   System.out.println("How many free hours do you have\n");
   available_hours=input.nextInt();
   ground.setAvailable_hour(available_hours);
   System.out.println("ENTER THIS AVAILABLE HOURS FROM WHAT TO WHAT");
   for(int i=0;i<available_hours;i++)
   {
   hour=input.next();
   available[i]=new availableHours(hour);
   }
   ground.setavailable(available);
}
 public void add_Playgrounds(Playground_owner ground)
{
	array_ground.add(ground);
}
 
      public void bookPlayground()
{
    int c=0,h=0;
    System.out.println("enter playground");
    String name = input.next();
    b.set_playground(name);
    for(int i=0 ; i<array_ground.size(); i++)
    {
        String n=array_ground.get(i).ground.getNamePlayground();
        if(name.equals(n))
        {
            System.out.println("this playground  exist");
            System.out.println("Information of this playground is following:");
            System.out.println("                     *******");
            System.out.println("playground name is : " + array_ground.get(i).ground.getNamePlayground());
            System.out.println("playground location is : " +array_ground.get(i).ground.getLocationPlayground());
            System.out.println("playground booking number is : " +array_ground.get(i).ground.getBookingNumber());
            System.out.println("playground hours is :  ");
            availableHours[] available = array_ground.get(i).ground.getavailable();
            //System.out.println(available.length);
            for (int j = 0; j <array_ground.get(i).ground.getAvailable_hour(); j++) {
                System.out.println(available[j].getHours());
            }
            System.out.println("playground price is : " +array_ground.get(i).ground.getPrice());
           c++; 
           h=i;
        }
        
        
    }
    
       if(c==0)
        System.out.println("this playground doesn't exist");
       
       else
        
       {
    	   System.out.println("************");
           System.out.println("this is avalide hour for playground :");
           availableHours[] available = array_ground.get(h).ground.getavailable();
           //System.out.println(available.length);
           for (int j = 0; j <array_ground.get(h).ground.getAvailable_hour(); j++) {
               System.out.println(available[j].getHours());
           }
                System.out.println("please enter time slot you ewant");
                int hour=input.nextInt();
                b.set_hour(hour);
       }
}
      
      public void view()
{ 
	//System.out.println("ssss\n");
	for(int i=0 ; i<array_ground.size(); i++)
    {
		    System.out.println("this is All playground you can book any one of them");
		 
		    System.out.println("****");
            System.out.println("playground name is : " + array_ground.get(i).ground.getNamePlayground());
            System.out.println("playground location is : " +array_ground.get(i).ground.getLocationPlayground());
            System.out.println("playground booking number is : " +array_ground.get(i).ground.getBookingNumber());
            System.out.println("playground hours is :  ");
            availableHours[] available = array_ground.get(i).ground.getavailable();
            //System.out.println(available.length);
            for (int j = 0; j <array_ground.get(i).ground.getAvailable_hour(); j++) {
                System.out.println(available[j].getHours());
            }
            System.out.println("playground price is : " +array_ground.get(i).ground.getPrice());
            System.out.println("****");
    }   
       
}
      
  public void filter()
    {
     	 int choice,price;
     	 String hour;
     	 System.out.println("choose what you want filter it");
     	 System.out.println("1-Hours");
     	 System.out.println("2-price");
     	  choice=input.nextInt();
     	 if(choice==1)
     	 {
     		 System.out.println("Enter hour you want");
     		 hour=input.next();
     		 for(int i=0;i<array_ground.size(); i++)
     		 {
     			 
     			 availableHours[] available = array_ground.get(i).ground.getavailable();
     	         //System.out.println(available.length);
     	         for (int j = 0; j <array_ground.get(i).ground.getAvailable_hour(); j++) {
     	        	 if(hour.contentEquals(available[j].getHours()))
     	        	 {
     	        		 System.out.println("playgrounds");
     					 System.out.println("**");
     					 System.out.println("playground name is : " + array_ground.get(i).ground.getNamePlayground());
     			           System.out.println("playground location is : " +array_ground.get(i).ground.getLocationPlayground());
     			            System.out.println("playground booking number is : " +array_ground.get(i).ground.getBookingNumber());
     			            System.out.println("playground hours is :  ");
     			            //System.out.println(available.length);
     			            for (int f = 0; f <array_ground.get(i).ground.getAvailable_hour(); f++) {
     			                System.out.println(available[f].getHours());
     			            }
     			            System.out.println("playground price is : " +array_ground.get(i).ground.getPrice());
     			            System.out.println("**");
     	        	 }
     	         
     	         }
     		 }
     		 
     		 
     	 }
     	 else if(choice==2)
     	 {
     		 System.out.println("Enter price you want");
     		 price=input.nextInt();
     		 for(int i=0;i<array_ground.size(); i++)
     		 {
     			 double price_filt=array_ground.get(i).ground.getPrice();
     			 if(Math.abs(price_filt-price)<=10)
     			 {
     				 System.out.println("playgrounds");
     				 System.out.println("**");
     				 System.out.println("playground name is : " + array_ground.get(i).ground.getNamePlayground());
     		           System.out.println("playground location is : " +array_ground.get(i).ground.getLocationPlayground());
     		            System.out.println("playground booking number is : " +array_ground.get(i).ground.getBookingNumber());
     		            System.out.println("playground hours is :  ");
     		            availableHours[] available = array_ground.get(i).ground.getavailable();
     		            //System.out.println(available.length);
     		            for (int j = 0; j <array_ground.get(i).ground.getAvailable_hour(); j++) {
     		                System.out.println(available[j].getHours());
     		            }
     		            System.out.println("playground price is : " +array_ground.get(i).ground.getPrice());
     		            System.out.println("**");
     		          
     			 }
     		 }
     		
     	 }
}
  
       
        public static boolean isValid(String email) 
        { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
       } 
 
        public void team()
        {
            
            System.out.println("Enter number of players you wanna add to the team");
            Scanner input = new Scanner (System.in);
              int  n=input.nextInt();
              for(int i=0 ; i<n ; i++)
              {
                  System.out.println("Enter the E-mail of player :" + (i+1)  );
                  String m = input.next();
                  
                  
                  if (isValid(m)) 
                  {
                      arr[i]=m;     
                  }
                else
                  {
                      
                      while(!isValid(m))
                      {
                          System.out.println("This is invalide E-mail  \nplease enter valide one"); 
                           m = input.next();
                         arr[i]=m;  
                      }   
                  }
                 
              }
              System.out.println("your team E-mails added successfully");
        }
     
      public void randCode (){
    
      int min = 1000;
      int max = 10000;
      System.out.print("your code is : ");
      int random_int = (int)(Math.random() * (max - min + 1) + min);
      System.out.println(random_int);
    }
      public void approve()
      {
    	  String name_ground;
   	   int choice;
   	   view();
   	   System.out.println("Enter the id of the playground that you want to approve\n");
   	   name_ground=input.next();
   	   for(int i=0;i<array_ground.size();i++)
   	   {
   		   if(name_ground.equals(array_ground.get(i).ground.getNamePlayground()))
   		   {
   			   System.out.println("[1]Accept");
   			   System.out.println("[2]Delete");
   			   choice=input.nextInt();
   			   if(choice==1)
   			   {
   				   System.out.println("Acceptable");
   			   }
   			   else if(choice==2)
   			   {
   				   array_ground.remove(i).ground.getNamePlayground();
   			   }
   			   
   		   }
   	   }

      } 
}