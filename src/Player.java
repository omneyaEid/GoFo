import java.util.Scanner;


public class Player 
{
    Scanner input = new Scanner (System.in);
    
   private String player_account;
   private String playgroundowner_account ; 
   private int account_number ; 
   private int password ; 
   private int money ;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPlayer_account() {
        return player_account;
    }

    public String getPlaygroundowner_account() {
        return playgroundowner_account;
    }

    public int getAccount_number() {
        return account_number;
    }

    public int getPassword() {
        return password;
    }
   

    public void setPlayer_account(String player_account) {
        this.player_account = player_account;
    }

    public void setPlaygroundowner_account(String playgroundowner_account) {
        this.playgroundowner_account = playgroundowner_account;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public void setPassword(int password) {
        this.password = password;
    }
   
    public void payPyEwallet(){
        System.out.println("Enter the playground owner account you will pay to him");
        String owner = input.next();
        setPlaygroundowner_account(owner);
        System.out.println("Enter money you will pay");
        int money= input.nextInt();
        setMoney(money);
        System.out.println("Enter your account");
        String player = input.next();
        setPlayer_account(player);
        System.out.println("Enter your account number ");
        int acc= input.nextInt();
        setAccount_number(acc);
        System.out.println("your pay operation has done successful");
        returnPyEwallet();
         
    }
    
    public void returnPyEwallet()
    {
        System.out.println("Do you wanna to return your money (yes/no)");
        String choice= input.next();
        while("yes".equals(choice))
        {
            System.out.println("Enter money you want to return ");
            int m= input.nextInt();
            if(m<=getMoney())
            {
               System.out.println("your return money operation has done "); 
               money-=m;
               System.out.println(money);
            }
            else
            {
                System.out.println("you only have " + getMoney()); 
            }
            
            System.out.println("Do you wanna to return your money (yes/no)");
        }
        
        System.out.println("Do you wanna to return your money (yes/no)");
    }
    
    
    
}