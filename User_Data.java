import java.util.ArrayList;
import java.io.*;
public class User_Data
{
    private ArrayList<User> users;
	private String UserTXT="Users.txt";

	public String input,output;
	public String[] inputArray=new String[5];

    public void rewriteUsers(ArrayList<User> users)
	{
		try{
			FileWriter fw = new FileWriter(UserTXT);
			output="";
			for(int i=0;i<users.size();i++){output+=users.get(i).toString();}
        	fw.write(output);
       		fw.flush();
        	fw.close();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
    }
	public void addUser(User user)
	{
		try{
			FileWriter fw=new FileWriter(UserTXT,true);
			fw.write(user.toString());
			fw.flush();
        	fw.close();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	public ArrayList<User> readUsers()
	{
		try{
			FileReader fr = new FileReader(UserTXT);
			BufferedReader br = new BufferedReader(fr);
			users=new ArrayList<>();
			while (br.ready())
			{
				input= br.readLine();
				inputArray=input.split("\t");
				users.add(new User(inputArray[0],inputArray[1],inputArray[2],inputArray[3],inputArray[4]));
			}
			fr.close();	
			return users;
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		return null;
	}
}