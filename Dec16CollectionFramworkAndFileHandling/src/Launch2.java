import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

// File Handling example


public class Launch2 {

	public static void main(String[] args) throws Exception{
		String path1 = "/Users/lesterzeng/Documents/Java Training/iopng/input.txt";
		String path2 = "/Users/lesterzeng/Documents/Java Training/iopng/output.txt";
		
		// 1 byte - byte streams
//		FileInputStream fis = new FileInputStream(path1);
//		FileOutputStream fos = new FileOutputStream(path2);
		
		// 2 bytes - character streams
		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2);
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);

//  	For 1 byte
//		int x;

//		while((x = fis.read())!=-1){
//			fos.write(x);
//			System.out.println(x);
		
//		For 2 bytes
		String x;
		while((x = br.readLine())!=null) {
			bw.write(x);
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}
