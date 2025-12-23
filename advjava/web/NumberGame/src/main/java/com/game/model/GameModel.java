package com.game.model;

public class GameModel {
    private int target;
    private String message;

    public GameModel() {
        this.target = (int) (Math.random() * 10 + 1);
    }

    public boolean checkGuess(int guess) {
        if (guess == target) {
            message = "🎉 Correct! The number was " + target;
            return true;
        } else if (guess > target) {
            message = "Too high! Try again.";
        } else {
            message = "Too low! Try again.";
        }
        return false;
    }

    public String getMessage() {
        return message;
    }

    public int getTarget() {
        return target;
    }
}
