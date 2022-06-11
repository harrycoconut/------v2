import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Admin extends Member
{
	private Book_Data book_Data=new Book_Data();
	private Record_Data record_Data=new Record_Data();
	private ArrayList<Book> books;

	public Admin(String account,String password,String name,String identity,String fines)
    {
        super(account,password,name,identity,fines);
        setQuantity();
        setDay();
    }
	public boolean addBook(String ISBN,String title,String author,String publisher)
	{
		Book book=new Book(ISBN,title,author,publisher,"in_Library");
		if(ISBN.isBlank()||title.isBlank()||author.isBlank()||publisher.isBlank()){JOptionPane.showMessageDialog(null, "輸入值不能為空!","警告",2);return false;}
		else if(findISBN(ISBN)!=-1){JOptionPane.showMessageDialog(null,"此書已經在書庫中!","錯誤",0);return false;}
		else if(book.getISBN().length()!=12){JOptionPane.showMessageDialog(null, "ISBN長度需等於12!","警告",2);return false;}
		else
		{
			record_Data.addBook(book);
			book_Data.addBook(book);
			JOptionPane.showMessageDialog(null, "書籍已新增");
			return true;
		}
	}
	public void removeBook(String ISBN)
	{
		books=book_Data.readBooks();
		books.remove(ISBN_Index);
		book_Data.rewriteBooks(books);
		JOptionPane.showMessageDialog(null, "書籍已刪除");
	}
	public void reviseBook(Book book)
	{
		books=book_Data.readBooks();
		books.set(ISBN_Index,book);
		book_Data.rewriteBooks(books);
		JOptionPane.showMessageDialog(null, "修改完成");
	}
	public void setQuantity(){quantity=12;}
	public void setDay(){day=21;}
    public void setRate(){rate=1;}
    public int getQuantity(){return quantity;}
    public int getDay(){return day;}
    public int getRate(){return rate;}
}