import java.util.Scanner;

public class AdministratorService {
	 booking b=new booking();
	

	Playground_owner owner=new Playground_owner();
	public AdministratorService() {
		// TODO Auto-generated constructor stub
	}
	Scanner input=new Scanner(System.in);
	public void ApprovePlayground()
	{
	   String name_ground;
	   int choice;
	   owner.view();
	   System.out.println("Enter the id of the playground that you want to approve\n");
	   name_ground=input.next();
	   for(int i=0;i<owner.array_ground.size();i++)
	   {
		   if(name_ground.equals(owner.array_ground.get(i).ground.getNamePlayground()))
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
				   owner.array_ground.remove(i).ground.getNamePlayground();
			   }
			   
		   }
	   }
	}

}