package models;

import java.util.Date;

public class FileMetadata {
	private Long fileId = (new Date()).getTime();
	private String fileName;
	private Long timeStamp;
	
	public FileMetadata(){
		
	}
	public FileMetadata(String fileName, Long timeStamp){
		this.fileName = fileName;
		this.timeStamp = timeStamp;
	}
	public FileMetadata(Long fileId, String fileName, Long timeStamp){
		this.fileId = fileId;
		this.fileName = fileName;
		this.timeStamp = timeStamp;
	}
	
	public Long getFileId() {
		return fileId;
	}
	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	

}
