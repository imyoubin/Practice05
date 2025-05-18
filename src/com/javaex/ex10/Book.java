package com.javaex.ex10;

public class Book {
    
	private int bookNo;
    private String title;
    private String author;
    private int stateCode;

    public Book(){}
    
    public Book(int bookNo, String title, String author) {
        this.bookNo = bookNo;
        this.author = author;
        this.title = title;
        this.stateCode = 1;
    }

    public void rent() {
        stateCode = 0;
        System.out.println(title + "이(가) 대여 됐습니다.");
    }

    public void print() {
    	String rentState;
    	if( stateCode == 1 ) {
    		rentState = "재고있음";
    	}else {
    		rentState = "대여중";
    	}
        System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + author + ", 대여 유무:" + rentState);
    }

    public int getBookNo() {
        return bookNo;
    } 
    
}
