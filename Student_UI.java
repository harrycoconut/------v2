public class Student_UI  extends Member_UI
{
    public Student_UI (User user)
    {
        super(user);
    }
    public void setID(User user){this.user=new Student(user.getAccount(), user.getPassword(), user.getName(),user.getIdentity(),Integer.toString(user.getFines()));}
}