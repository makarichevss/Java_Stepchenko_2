/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx1 {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friendAction1 = new ArrayList<>();
        friendAction1.add(Action.STONE);
        friendAction1.add(Action.SCISSORS);
        friendAction1.add(Action.PAPER);

        List<Action> friendAction2 = new ArrayList<>();
        friendAction2.add(Action.SCISSORS);
        friendAction2.add(Action.PAPER);
        friendAction2.add(Action.SCISSORS);

        new BestFriend("Vasya", friendAction1, exchanger);
        new BestFriend("Petya", friendAction2, exchanger);
    }
}

enum Action {
    STONE, SCISSORS, PAPER;
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendAction) {
        if ((myAction == Action.STONE && friendAction == Action.SCISSORS)
                || (myAction == Action.SCISSORS && friendAction == Action.PAPER)
                || (myAction == Action.PAPER && friendAction == Action.STONE)
        ) {
            System.out.println(name + " wins");
        }
    }

    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
