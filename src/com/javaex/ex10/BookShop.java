package com.javaex.ex10;

import java.util.Scanner;

public class BookShop {

    public static void main(String[] args) {
        Book[] books = new Book[10];

        books[0] = new Book(1, "트와일라잇", "스테파니메이어");
        books[1] = new Book(2, "뉴문", "스테파니메이어");
        books[2] = new Book(3, "이클립스", "스테파니메이어");
        books[3] = new Book(4, "브레이킹던", "스테파니메이어");
        books[4] = new Book(5, "아리랑", "조정래");
        books[5] = new Book(6, "젊은그들", "김동인");
        books[6] = new Book(7, "아프니깐 청춘이다", "김난도");
        books[7] = new Book(8, "귀천", "천상병");
        books[8] = new Book(9, "태백산맥", "조정래");
        books[9] = new Book(10, "풀하우스", "원수연");

        System.out.println("*****도서 정보 출력하기******");
        displayBookInfo(books);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
        int num = scanner.nextInt();
       

        // (1) 입력된 번호에 맞는 책을 찾아 대여 되었음(상태코드=0)을 체크 합니다.
        // 코드작성
        for(int i=0;i<books.length;i++) {
        	if(books[i].getBookNo()==num) {
        		books[i].rent();
        		break;
        	}
        }
        

        System.out.println("*****도서 정보 출력하기******");
        displayBookInfo(books);
        
        scanner.close();
    }

    //(2)전달받은 배열을 모두 출력하는 메소드
    private static void displayBookInfo(Book[] books) {
        
    	//코드작성
    	for (int i=0; i<books.length; i++) {
            	books[i].print();
    	}   
        System.out.println("");
    }
}
