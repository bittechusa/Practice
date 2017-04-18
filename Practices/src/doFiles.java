import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class doFiles 
{
	private String fileName="/Users/salim87/Documents/workspace2/Practices/src/Apple.txt";
	
	
	@Test	
	public void doesFileExists() throws IOException
	{
		
		 StringBuilder sb = new StringBuilder();
		
		 BufferedReader br=null;
		 FileReader fr=null;
		try {
			
			
			 br= new BufferedReader(new FileReader(fileName));
		    String line = br.readLine();
		    while (line != null) {
		    String word1= 	line.substring(0, 8);
		    System.out.println(word1);
		    String word2= 	line.substring(8);
		    	  String[] words= word2.split(",");
			       for(int i=0;i<words.length;i++)
			       {
			       System.out.println(words[i]);
			       }
		      	sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		      
		       	      
		    }
		    
		}catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	
		finally {
		    br.close();
		}
		
	}

}


