public class Teacher_UI  extends Member_UI
{
    public Teacher_UI (User user)
    {
        super(user);
    }
    public void setID(User user){this.user=new Teacher(user.getAccount(), user.getPassword(), user.getName(),user.getIdentity(),Integer.toString(user.getFines()));}
}