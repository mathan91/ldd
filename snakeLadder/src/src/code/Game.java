package src.code;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {

    public Dice dice;
    public Board board;
    Queue<Player> players;
    GameStatus gameStatus;

    public Game(Dice dice, Board board) {
        this.dice = dice;
        this.board = board;
        this.players = new LinkedList<>();
        this.gameStatus = GameStatus.NOT_STARTED;
    }

    public void addPlayers(List<Player> players) {
        if (this.gameStatus == GameStatus.NOT_STARTED) {
            for (Player player : players)
                this.players.offer(player);
        } else
            throw new GameAlreadyStartedException("Cannot add new players");
    }

    public void startGame() {
        this.gameStatus = GameStatus.RUNNING;
        while (players.size() > 1) {
            Player player = players.poll();
            makeMove(player);
            if (player.getPosition() == board.getDimension()) {
                System.out.println(player.name + "has won");
            } else
                players.offer(player);
        }
        this.gameStatus = GameStatus.FINISHED;
    }

    private void makeMove(Player player) {

        int dicevalue = dice.roll();
        int targetPosition = player.getPosition() + dicevalue;
        if (targetPosition > board.getDimension())
            System.out.println("Invalid Move");
        else {
            player.setPosition(targetPosition);
            if (board.hasSpecialItem(targetPosition)) {
                SpecialItems sp = board.getSpecialItem(targetPosition);
                player.setPosition(sp.end);
            }
        }
    }
}
