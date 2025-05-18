package com.javaex.ex04;

public class Base {
    
    public void service(String state) {
        
        //코드작성할것
    	 switch (state){
         case "낮":
             day();
             break;
         case "밤":
             night();
             break;
         default :
             afternoon();
             break;
         
         }
    }

    public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
        
    	//코드작성할것
    	System.out.println("밤에는 숙면");
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
}

