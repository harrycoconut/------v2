public class Staff extends Member
{   
    public Staff(String account,String password,String name,String identity,String fines)
    {
        super(account,name,password,identity,fines);
        setQuantity();
        setDay();
    }
    public void setQuantity(){quantity=5;}
	public void setDay(){day=14;}
    public void setRate(){rate=10;}
    public int getQuantity(){return quantity;}
    public int getDay(){return day;}
    public int getRate(){return rate;}
}
