import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class StringReverse 
{

	@Test
	public void reverse()
	{
		String sentence="hope you are doing well";
		char[] c=sentence.toCharArray();
		StringBuffer reverseWord=new StringBuffer(); 
		for(int i=c.length-1;i>=0;i--)
		{
			reverseWord.append(c[i]);
		}
		System.out.println(reverseWord);
	}
	
	
	
	
	

}
