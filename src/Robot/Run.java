package Robot;

import Robot.hands.*;
import Robot.heads.*;
import Robot.legs.*;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


        ToshibaHead toshibaHead = new ToshibaHead(43);
        SamsungHead samsungHead = new SamsungHead(234);
        SonyHead sonyHead = new SonyHead(765);

        ToshibaHands toshibaHands = new ToshibaHands(532);
        SamsungHands samsungHands = new SamsungHands(76);
        SonyHands sonyHands = new SonyHands(230);

        ToshibaLegs toshibaLegs = new ToshibaLegs(654);
        SamsungLegs samsungLegs = new SamsungLegs(731);
        SonyLegs sonyLegs = new SonyLegs(346);

        Robot[] newRobots = {new Robot(samsungHead, sonyHands, toshibaLegs),
                new Robot(sonyHead, toshibaHands, samsungLegs),
                new Robot(toshibaHead, samsungHands, sonyLegs)
        };

        for (int i = 0; i < newRobots.length; i++) {
            newRobots[i].action();
            System.out.println();
        }
        int[] price = new int[3];
        for (int i = 0; i < newRobots.length; i++) {
            price[i] = newRobots[i].getPrice();
        }
        int maxCost = price[0];
        int robotNum = 1;
        for (int i = 0; i < price.length - 1; i++) {
            if (maxCost < price[i + 1]) {
                maxCost = price[i + 1];
                robotNum++;
            }
        }
        System.out.println("Максимальная стоимость робота " + maxCost);
        System.out.println("Самый дорогой робот под номером - " + robotNum);
    }
}
