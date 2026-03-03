package OthersProgram;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P1 {
    public static void main(String[] args) throws IOException {
//      	File a = new File("Folder");
//    	boolean b = a.mkdir();
//    	File f = new File(a,"test.txt");
        try(FileReader fr = new FileReader("Folder\\test.txt"))  {
//        	fr.write("testing");
//        	fr.flush();
//        	fr.close();
        	//f.createNewFile();
        	int i =fr.read();
    		while(i != -1) {
    			System.out.print((char) i);
    			i =fr.read();
    		}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
