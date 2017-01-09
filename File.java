import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class File {

	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		// TODO Auto-generated method stub
		
		
			FileInputStream fis = new FileInputStream("D:\\DemoFile.txt");
			FileOutputStream fos = new FileOutputStream("D:\\Demo.txt");
			
			int read = fis.read();
			
			while(read!=-1)
			{
				fos.write(read);
				read = fis.read();
		}
			fis.close();
			fos.close();
			
			System.out.println("Done");
	}

}
