import java.util.ArrayList;
public class Seach_Book
{
    private Book_Data book_Data=new Book_Data();

    private ArrayList<Book> books=new ArrayList<>();
    private ArrayList<Book> search_book=new ArrayList<>();
    private ArrayList<Book> booklist=new ArrayList<>();
    private ArrayList<Book> find_title;
    private ArrayList<Book> find_author;
    private ArrayList<Book> find_publisher;
    private ArrayList<Book> find_ISBN;

    public Seach_Book(String title,String author,String publisher,String ISBN)
    {
        books=book_Data.readBooks();
        if(title!="\t"){set_fine_title(title);T();}
        if(author!="\t"){set_fine_author(author);A();}
        if(publisher!="\t"){set_fine_publisher(publisher);P();}
        if(ISBN!="\t"){set_fine_ISBN(ISBN);I();}

        if(title!="\t"){retainT();}
        if(author!="\t"){retainA();}
        if(publisher!="\t"){retainP();}
        if(ISBN!="\t"){retainI();} 
    }
    public void set_fine_title(String title)
    {
        find_title=new ArrayList<>();
        for(int i=0;i<books.size();i++)
        {
            if(books.get(i).getTitle().equals(title))
            {
                find_title.add(books.get(i));
            }
        }
    }
    public void set_fine_author(String author)
    {
        find_author=new ArrayList<>();
        for(int i=0;i<books.size();i++)
        {
            if(books.get(i).getAuthor().equals(author))
            {
                find_author.add(books.get(i));
            }
        }
    }
    public void set_fine_publisher(String publisher)
    {
        find_publisher=new ArrayList<>();
        for(int i=0;i<books.size();i++)
        {
            if(books.get(i).getPublisher().equals(publisher))
            {
                find_publisher.add(books.get(i));
            }
        }
    }
    public void set_fine_ISBN(String ISBN)
    {
        find_ISBN=new ArrayList<>();
        for(int i=0;i<books.size();i++)
        {
            if(books.get(i).getISBN().equals(ISBN))
            {
                find_ISBN.add(books.get(i));
            }
        }
    }

    public void T(){if(find_title.toString()!=null){search_book.addAll(find_title);}}
    public void A(){if(find_author.toString()!=null){search_book.addAll(find_author);}}
    public void P(){if(find_publisher.toString()!=null){search_book.addAll(find_publisher);}}
    public void I(){if(find_ISBN.toString()!=null){search_book.addAll(find_ISBN);}}

    public void retainT(){if(find_title!=null){search_book.retainAll(find_title);}}
    public void retainA(){if(find_title!=null){search_book.retainAll(find_author);}}
    public void retainP(){if(find_title!=null){search_book.retainAll(find_publisher);}}
    public void retainI(){if(find_title!=null){search_book.retainAll(find_ISBN);}}

    public ArrayList<Book> getBook()
    {
        if(search_book.toString()!=null)
        {
            for(int i=0;i<search_book.size();i++){if(booklist.contains(search_book.get(i))==false){booklist.add(search_book.get(i));}}
        }
        else{return null;}
        return booklist;
    }
}
