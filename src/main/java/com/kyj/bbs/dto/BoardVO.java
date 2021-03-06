package com.kyj.bbs.dto;

import java.util.Date;

public class BoardVO {
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private int readCount;
	
	
	public BoardVO() {
	}


	public BoardVO(int bno, String title, String content, String writer, Date regDate, int readCount) {
		
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
		this.readCount = readCount;
	}


	public int getBno() {
		return bno;
	}


	public void setBno(int bno) {
		this.bno = bno;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public Date getRegDate() {
		return regDate;
	}


	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}


	public int getReadCount() {
		return readCount;
	}


	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}


	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title +
				", content=" + content + ", writer=" + writer + ", regDate="
				+ regDate + ", readCount=" + readCount + "]";
	}
	
	
	
	
	

	
	
}
