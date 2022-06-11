public class Staff_UI  extends Member_UI
{
    public Staff_UI (User user)
    {
        super(user);
    }
    public void setID(User user){this.user=new Staff(user.getAccount(), user.getPassword(), user.getName(),user.getIdentity(),Integer.toString(user.getFines()));}
}