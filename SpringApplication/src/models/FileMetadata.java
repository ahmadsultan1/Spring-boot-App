//package models;
//
//import java.util.Date;
//
//import org.springframework.web.multipart.MultipartFile;
//
//public class FileMetadata {
//	private static Long fileId = (new Date()).getTime();
//	private static String fileName;
//	private static Long timeStamp;
//	private static MultipartFile file;
//	
//	public FileMetadata(){
//		
//	}
//	public FileMetadata(String fileName, Long timeStamp){
//		this.fileName = fileName;
//		this.timeStamp = timeStamp;
//	}
//	public FileMetadata(Long fileId, String fileName, Long timeStamp){
//		this.fileId = fileId;
//		this.fileName = fileName;
//		this.timeStamp = timeStamp;
//	}
//	public FileMetadata(MultipartFile file, Long fileId, String fileName){
//		this.file = file;
//		this.fileName = fileName;
//		this.fileId = fileId;
//	}
//	
//	public static Long getFileId() {
//		return fileId;
//	}
//	public void setFileId(Long fileId) {
//		this.fileId = fileId;
//	}
//	public String getFileName() {
//		return fileName;
//	}
//	public void setFileName(String fileName) {
//		this.fileName = fileName;
//	}
//	public Long getTimeStamp() {
//		return timeStamp;
//	}
//	public void setTimeStamp(Long timeStamp) {
//		this.timeStamp = timeStamp;
//	}
//	
//	
//
//}
