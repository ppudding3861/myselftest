package com.pudding.test;

public class OperationEx04 {

    public static void main(String[] args) {
        // 점수 변수를 지정
          int score = 40;
        // 90점 이상 = a

        if(score >= 90) {
            System.out.println("A");
        }
        // 80점 이상 90점 미만 = b
        else if(score >=80 && score < 90){
            System.out.println("B");
        }
        // 70점 이상 80점 미먄 = c
        else if(score >= 70 && score < 80) {
            System.out.println("C");
        }
        // 60점 이상 70점 미만 = d
        else if (score >= 60 && score < 70) {
            System.out.println("D");
        }
        // 60점 미만 = f
        else {
            System.out.println("F");
        }
        // 반환한다.
    }

}
