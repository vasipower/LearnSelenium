package HomePage;
import java.io.File;
// Java classes - utility
import java.util.Date;
import java.text.SimpleDateFormat;
public class print {
	
	public static void main(String[] args) {
		
		
		// Format date to append to new file name
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = "logFile" + strDate +".html" ;
		File newFile = new File(fileName);
		System.out.println(newFile);
	}

}
