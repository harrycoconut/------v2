import java.util.ArrayList;
import java.io.*;
public class Book_Data
{
    private ArrayList<Book> books;
	private String BookTXT="Books.txt";

	public String input,output;
	public String[] inputArray=new String[6];

    public void rewriteBooks(ArrayList<Book> books)
	{
		try
		{
			FileWriter fw = new FileWriter(BookTXT);
			output="";
			for(int i=0;i<books.size();i++){output+=books.get(i).toString();}
        	fw.write(output);
       		fw.flush();
        	fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	public void addBook(Book book)
	{
		try
		{
			FileWriter fw=new FileWriter(BookTXT,true);
			fw.write(book.toString());
			fw.flush();
        	fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Book> readBooks()
	{
		try
		{
			FileReader fr = new FileReader(BookTXT);
			BufferedReader br = new BufferedReader(fr);
			books=new ArrayList<>();
			while (br.ready())
			{
				input= br.readLine();
				inputArray=input.split("\t");
				books.add(new Book(inputArray[0],inputArray[1],inputArray[2],inputArray[3],inputArray[4],inputArray[5]));
			}
			fr.close();	
			return books;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
