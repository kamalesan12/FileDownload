package Controllers;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DownloadAction;



public class downtesting extends DownloadAction {
	
	

	@Override
	protected StreamInfo getStreamInfo(ActionMapping am, ActionForm af, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		
		String filen=req.getParameter("filename");
		StreamInfo str=null;
		
		if(filen.contains("downimage")){
			 File f=new File("D:/kamalesan/Myprojects/Struts_Project/DownloadCheck/WIN_20230313_14_21_32_Pro.jpg");
			 str=new FileStreamInfo("image/jpeg", f);
			 res.setContentType("image/jpeg");
			 res.setHeader("content-Disposition", "attachment;filename=kamalesan.jpg");
			 
		}if(filen.contains("downfile")){
			str=new FileStreamInfo("application/pdf", new File("D:/kamalesan/Myprojects/Struts_Project/DownloadCheck/Kamalesan_updated_adhar.pdf"));
			res.setContentType("application/pdf");
			res.setHeader("content-Disposition", "attachment;filename=Nisha.pdf");
		}if(filen.contains("downcsv")){
			str=new FileStreamInfo("text/csv",new File("C:/Users/ININTR00263/Downloads/587190476_2024_M05.csv"));
			res.setContentType("text/csv");
			res.setHeader("content-Disposiiton", "attachment;filename=Appu.csv");
			
		}if(filen.contains("downtxt")){
			str=new FileStreamInfo("text/plain",new File("D:/Sms flow.txt")); 
			res.setContentType("text/plain");
			res.setHeader("content-Disposition", "attachment;filename=Nithish.txt");
					}
		
		return str;
	}

}
