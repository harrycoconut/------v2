import java.util.ArrayList;
import java.io.*;
public class Library_Record
{
    private ArrayList<Record> records;
	private String RecordTXT="Records.txt";
	public String input,output;
	public String[] inputArray=new String[4];

	public void addRecord(Record record)
	{
		try
		{
			FileWriter fw=new FileWriter(RecordTXT,true);
			fw.write(record.toString());
			fw.flush();
        	fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Record> readRecord()
	{
		try
		{
			FileReader fr = new FileReader(RecordTXT);
			BufferedReader br = new BufferedReader(fr);
			records=new ArrayList<>();
			while (br.ready())
			{
				input= br.readLine();
				inputArray=input.split("\t");
				records.add(new Record(inputArray[0],inputArray[1],inputArray[2],inputArray[3]));
			}
			fr.close();	
			return records;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
