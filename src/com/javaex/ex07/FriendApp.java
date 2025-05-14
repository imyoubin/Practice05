package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        
        for (int i = 0; i < friendArray.length; i++) {
            // 친구정보(이름)
        	System.out.print("이름: ");
            String name = sc.nextLine();
            
            // 친구정보(핸드폰)
            System.out.print("핸드폰: ");
            String hp = sc.nextLine();
            
            // 친구정보(학교)
            System.out.print("학교: ");
            String school = sc.nextLine();
            
            System.out.println("-------------------------------------");

            // Friend 객체 생성하여 데이터 넣기
            Friend friend = new Friend();
            friend.setName(name);
            friend.setHp(hp);
            friend.setSchool(school);

            // 배열에 추가하기
            friendArray[i] = friend;
        }

        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            friendArray[i].showInfo();
        }

        sc.close();
    }

}