
import java.util.ArrayList;
import java.util.Scanner;


public class LoginUser {
	Scanner input = new Scanner (System.in);

	ArrayList<LoginUser>array_user=new ArrayList<LoginUser>();
	public USER user=new USER();
	public LoginUser() {
		// TODO Auto-generated constructor stub
	}
public int register()
{
	int g,roleuser,choice = 0;
   String name,password,email,role = null,phone,location;
   int id;
   user.setUsername("admin");
   user.setPassword("admin");
   System.out.println("Enter your username :");
   name=input.next();
   user.setUsername(name);
   
   System.out.println("Enter your Email:");
   email=input.next();
   user.setEmail(email);

   System.out.println("Enter your id:");
   id=input.nextInt();
   user.setID(id);
   
   System.out.println("Enter your role user:");
   System.out.println("[1]player");
   System.out.println("[2]playground owner");
   roleuser=input.nextInt();
   if(roleuser==1)
   {
	   role="player";
	   choice=1;
   }
   else if(roleuser==2)
   {
	   role="playground owner";
	   choice=2;
   }
   user.setRoleUser(role);
   
   do {
   System.out.println("Enter your Password:");
   password=input.next();
   user.setPassword(password);

   g=check_password(password);
}while(g==0);
 System.out.print("Enter your code : ");
 int code =input.nextInt();
 System.out.println("the registration was successful  ");
return choice;
}
public int check_password(String password)
{
	 boolean hasLetter = false;
        boolean hasDigit = false;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char x = password.charAt(i);
                if (Character.isLetter(x)) {

                    hasLetter = true;
                }

                else if (Character.isDigit(x)) {

                    hasDigit = true;
                }

                if(hasLetter && hasDigit){

                    break;
                }

            }
            if (hasLetter && hasDigit) {
                System.out.println("STRONG");
                return 1;
                }
            else {
                System.out.println("NOT STRONG");
                return 0;
                }
            }
        
        else {
            System.out.println("HAVE AT LEAST 8 CHARACTERS");
            return 0;
          }
    }

public int check(Person p)
{
	for(int i=0;i<array_user.size();i++)
	{

		String x,y;
		x=array_user.get(i).user.getUsername();
		y=p.getUsername();
	if(x.equalsIgnoreCase(y)&&p.getPassword().equalsIgnoreCase(array_user.get(i).user.getPassword()))
	{
		if(array_user.get(i).user.getRoleUser()=="player")

		return 1;
		else if(array_user.get(i).user.getRoleUser()=="playground owner")
			return 2;
		else
			return 3;
	}
	}
	return 0;
	
}

public void add_USERS(LoginUser u)
{
	array_user.add(u);
}

public String toString ()
{
	StringBuilder sb = new StringBuilder();
	
		sb.append("the username is : ").append(user.getUsername()).append("\n");
		sb.append("tne account password is : ").append(user.getPassword()).append("\n");
		sb.append("the Email is:").append(user.getEmail()).append("\n");
		sb.append("the role user is:").append(user.getRoleUser()).append("\n");
		sb.append("the phone is:").append(user.getPhone()).append("\n");
		sb.append("the location is:").append(user.getLocation()).append("\n");
		sb.append("the id is:").append(user.getID()).append("\n");
	
	return sb.toString();  
	
}
public void print_users()
	{
		if(array_user.size()==0)
		{
			System.out.println("THERE ISN'T USERS\n");
		}
		else {
		for(int i=0;i<array_user.size();i++)
		{
			System.out.println(array_user.get(i));
		}
		}
	}

public void create_playground()
{
	//name, its location (as address and as GPS location), its description, its availability, booking number and price /hour
	System.out.println("");
}
}