package springBootApp;

import java.util.HashMap;
import models.Student;




public class SchoolImpl{
	static Student student;


	public static void addStudent(Student student) {
		App.hmStudent.put(new Long(student.getId()), student);
		DataStore.JsonConverter();
	}

	public static Student findStudent(Long id) {
		return App.hmStudent.get(new Long(id));
	}

	public static HashMap<Long, Student> getAllStudents() {
		return App.hmStudent;
	}


	public static String deleteStudent(Long id) {
		if (App.hmStudent.containsKey(new Long(id))) {
			
			student = App.hmStudent.get(new Long(id));
			App.hmStudent.remove(new Long(id));
		} else {
			try {
				throw new Exception("Student " + id + " does not exists");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		DataStore.JsonConverter();
		return student.getFirstName() + " "+ student.getLastName() + "has been deleted";
	}
	
	public static void updateStudent(String id, Student student){
		student.setId(Long.parseLong(id));
		if (App.hmStudent.containsKey(student.getId())) {
			App.hmStudent.put(new Long(student.getId()), student);
		} else {
			try {
				throw new Exception("Student " + student.getId() + " does not exist");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		DataStore.JsonConverter();
	}

//	public static void addingFiles(FileMetadata fileMetadata, String fileName) {
//		File files = new File("file");  
//		FileWriter filewriter = null;
//		  try
//				  {
//			  filewriter = new FileWriter (files);
//			  filewriter.write("testing");
//			  
//				  }catch(IOException e){
//					  e.printStackTrace();
//					  System.out.println("if we get here we have a problem");
//				  }finally{
//					  if(filewriter != null)
//					  {
//						  try{
//							  filewriter.close();
//						  }catch(IOException ignore){
//							  
//						  }
//					  }
//					  System.out.printf("File is located at %s%n", files.getAbsolutePath());
//					  
//				  }
//		  BufferedWriter out = new BufferedWriter(new FileWriter(file)); 
//		  out.close();
//	}
//		Properties properties = new Properties();
//		for(Entry<Long, FileMetadata> entry : App.hashFile.entrySet()){
//			properties.put(entry.getKey(), entry.getValue());
//		}
//		try {
//			properties.store(new FileOutputStream("data.properties"), null);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		FileMetadata.setFileId(Long.parseLong(fileId));
//		if (App.hashFile.containsKey(FileMetadata.getFileId())){
//			App.hashFile.put(new InputStream(FileMetadata.getFileId()), fileMetadata);
//		}else{
//			try{
//				throw new Exception("file" + FileMetadata.getFileId() + "doesn't exist");
//			}catch (Exception e){
//				e.printStackTrace();
//			}
//		}
//		DataStore.JsonFileConverter();
//		
//		
//		
//	}
	
//	public static void addingFiles(MultipartFile file, String fileName){
//		DataStore.saveFile(file, fileName);
//	}
	
	

}
