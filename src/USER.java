

public class USER extends Person  
{
    protected String Email;
    protected int ID ;
    protected String RoleUser;
    protected String Phone;
    protected String Location;

    public USER() 
    {
        
    }

    public USER(String Email, int ID, String RoleUser, String Phone, String Location) {
        this.Email = Email;
        this.ID = ID;
        this.RoleUser = RoleUser;
        this.Phone = Phone;
        this.Location = Location;
    }
    

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRoleUser() {
        return RoleUser;
    }

    public void setRoleUser(String RoleUser) {
        this.RoleUser = RoleUser;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
    
      
}

