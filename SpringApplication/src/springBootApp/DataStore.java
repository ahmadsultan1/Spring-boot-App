package springBootApp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class DataStore{
	public static void JsonConverter(){
		ObjectMapper objMap = new ObjectMapper();
			
			Gson gson = new Gson();
			String json = gson.toJson(App.hmStudent);
			System.out.println("json= " +json);
					
			try {
				objMap.writeValue(new File("data.json"), json);
			} catch (JsonGenerationException e1) {
				e1.printStackTrace();
			} catch (JsonMappingException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	
//	public static void saveFile(MultipartFile file2, String fileName){
//		File file = new File("file.txt");
//		try {
//			file.createNewFile();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		try {
//			FileWriter writer = new FileWriter(file);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		
	//}
}
