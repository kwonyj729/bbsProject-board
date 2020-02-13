package com.kyj.bbs.dto;

public class Criteria {
	private int page;
	private int perPageNum;
	
	// 디폴트 생성자
	public Criteria() {
		this.page = 1;   //현재 페이지를 나타남
		this.perPageNum = 10;   //한 페이지당 페이지 블록.
	}
	
	public void setPage(int page) {
		if(page<=0) {
			this.page = 1;
			return;		
		}
		this.page = 1;
	}
	
	public void setPerPageNum(int perPageNum) {
		if(perPageNum<=0 || perPageNum>100) {
			this.perPageNum = 10;
			return;			
		}
		this.perPageNum = perPageNum;
	}

	public int getPage() {
		return page;
	}
	//이건 뭐지????????
	public int getPageStart() {
		return(this.page-1) * perPageNum;
	}
	
	public int getPerPageNum() {
		return this.perPageNum;
	}

	// 만약에 오류가 생기면 체크할 떄 좋다.
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + "]";
	}
	
	
	//여기 밑에다가 검색기능 넣을 예정.	
	
	

}
