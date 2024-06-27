import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class PrintSpeedTest {

	public static void main(String[] args) {
//	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out) );
//	   bw.append('a');
//	   bw.write("");

	   //String고정문자열     StringBuilder가변문자열
		
	   StringBuilder sb = new StringBuilder(); //"유레카~!!유레카~!!"
	   
		
	   long start = System.currentTimeMillis();
//	   long start = System.nanoTime();
	   for(int i=0; i<1000000; i++) {
		System.out.println("유레카~!!");
//		    sb.append("유레카~!!\n");
		   
//		    sb.append("유레카~!!");
//		    sb.append("\n");
		   
//		   sb.append("유레카~!!")
//		     .append('\n');
	   }//for
	   
//	   System.out.println(sb.toString());
	   
	   long end = System.currentTimeMillis();
//	   long end = System.nanoTime();
	   
	   System.out.println("출력시간: "+ (end-start));
	}//main
}