import java.util.ArrayList;
public class Book
{
	private ArrayList<String> book = new ArrayList<String>();

	public Book(String ISBN,String title,String author,String publisher,String state){this(ISBN, title, author, publisher, state,null);}
	public Book(String ISBN,String title,String author,String publisher,String state,String BD)
	{
		setISBN(ISBN);
		setTitle(title);
		setAuthor(author);
		setPublisher(publisher);
		setState(state);
		setBorrowDate(BD);
	}
	public String toString()
	{
		String output="";
		for(int i=0;i<book.size();i++)
		{
			output+=book.get(i)+((i==book.size()-1)?"\n":"\t");
		}
		return output;
	}

	public void setISBN(String ISBN){book.add(0,ISBN);}
	public String getISBN(){return book.get(0);}
	
	public void setTitle(String title){book.add(1,title);}
	public String getTitle(){return book.get(1);}
	public void revisetTitle(String title){book.set(1,title);}

	public void setAuthor(String author){book.add(2,author);}
	public String getAuthor(){return book.get(2);}
	public void revisetAuthor(String author){book.set(2,author);}

	public void setPublisher(String publisher){book.add(3,publisher);}
	public String getPublisher(){return book.get(3);}
	public void revisePublisher(String publisher){book.set(3,publisher);}

	public void setState(String state){book.add(4,state);}
	public String getState(){return book.get(4);}
	public void reviseState(String state){book.set(4,state);}
	
	public void setBorrowDate(String BD){book.add(5,BD);}
	public String getBorrowDate(){return book.get(5);}
	public void reviseBorrowDate(String BD){book.set(5,BD);
	}
}
