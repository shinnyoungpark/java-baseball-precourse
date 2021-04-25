package com.wootechcamp.precourse.baseball;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {

    public void gameStart() {
        System.out.println("start!");

        while (true){

            int answer = getRandomNumber();
            System.out.println("random :" + answer);

            System.out.print("숫자를 입력해 주세요 : ");
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();

            if(input < 100){
                System.out.println("세자리의 수를 입력해 주세요.");
                continue;
            }

            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

            int onOff = scan.nextInt();
            if(onOff == 2) {
                break;
            }
        }
    }

    public int getRandomNumber() {
        Random random = new Random();
        int low = 100;
        int high = 1000;

        int result = random.nextInt(high-low) + low;

        return result;
    }

}
