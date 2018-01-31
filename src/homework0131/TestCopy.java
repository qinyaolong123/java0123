package homework0131;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;

public class TestCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File file1=new File("C:\\Users\\∏Á\\Desktop\\≈‡—µ\\2018-01-31\\ ”∆µ\\git.wmv");
		InputStream in=new FileInputStream(file1);
		byte[] bt=new byte[(int)file1.length()];
		in.read(bt);
		in.close();
		File file2=new File("D:\\CopyTest3");
		OutputStream out=new FileOutputStream(file2);
		out.write(bt);
		out.flush();
		out.close();
		
	}

}
