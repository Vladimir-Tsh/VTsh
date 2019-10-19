package com.javarush.games.game2048;
import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Game2048 extends Game {
    private static final int SIDE = 8;
    private static final Map<Integer, Color> valueColors = new HashMap<Integer, Color>(){{
        put(0, Color.MISTYROSE);
        put(2, Color.LIGHTSALMON);
        put(4, Color.SALMON);
        put(8, Color.DARKSALMON);
        put(16, Color.LIGHTCORAL);
        put(32, Color.CORAL);
        put(64, Color.TOMATO);
        put(128, Color.ORANGERED);
        put(256, Color.RED);
        put(512, Color.INDIANRED);
        put(1024, Color.CRIMSON);
        put(2048, Color.DARKRED);
        put(4096, Color.FUCHSIA);
    }};
    private int[][] gameField = new int[SIDE][SIDE];
    private boolean isGameStopped = false;
    private boolean canContinue;
    private int score;
    private static int maxTileValue;
    @Override
    public void initialize()
    {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }
    private void createGame(){
        canContinue = true;
        score = 0;
        setScore(score);
        maxTileValue = 2048;
        for (int i = 0; i < SIDE; i++)
            for (int j = 0; j < SIDE; j++)
                gameField[i][j] = 0;
        createNewNumber();
        createNewNumber();
    }
    private void drawScene(){
        //Color myColor = Color.BLUE;
        for (int i = 0; i < SIDE; i++)
            for (int j = 0; j < SIDE; j++)
                //setCellColor(j, i, myColor);
                setCellColoredNumber(j, i, gameField[i][j]);
    }
    private void createNewNumber(){
        if (getMaxTileValue() == maxTileValue)
            win();
        boolean isGetCell = false;
        while (!isGetCell) {
            int newX = getRandomNumber(SIDE);
            int newY = getRandomNumber(SIDE);
            if (gameField[newY][newX] == 0){
                int cellVarValue = getRandomNumber(10);
                if (cellVarValue < 9)
                    gameField[newY][newX] = 2;
                else
                    gameField[newY][newX] = 4;
                isGetCell = true;
            }
        }
    }
    private Color getColorByValue(int value){
        return valueColors.get(value);
    }
    private void setCellColoredNumber(int x, int y, int value){
        Color cellColor = getColorByValue(value);
        String cellValue;
        if (value == 0)
            cellValue = "";
        else
            cellValue = Integer.toString(value);
        setCellValueEx(x, y, cellColor, cellValue);
    }
    private boolean compressRow(int[] row) {
        boolean isCompress = false;
        for (int i = 0; i < row.length - 1; i++) {
            for (int j = 1; j < row.length - i; j++){
                if (row[j - 1] == 0 && row[j] > 0) {
                    row[j - 1] = row[j];
                    row[j] = 0;
                    isCompress = true;
                }
            }
        }
        return isCompress;
    }
    private boolean mergeRow(int[] row) {
        boolean isMerge = false;
        for (int i = 1; i < row.length; i++) {
            if (row[i] > 0) {
                if (row[i - 1] == row[i]) {
                    row[i - 1] *= 2;
                    score += row[i - 1];
                    setScore(score);
                    row[i] = 0;
                    isMerge = true;
                }
            }
        }
        return isMerge;
    }
    @Override
    public void onKeyPress(Key key) {
        if (isGameStopped) {
            if (key == Key.ESCAPE) System.exit(0);
            else if (key == Key.SPACE && !canContinue) {
                isGameStopped = false;
                createGame();
                drawScene();
            }
            else if (key == Key.ENTER && canContinue) {
                isGameStopped = false;
                maxTileValue *= 2;
                showMessageDialog(Color.RED, "", Color.YELLOW, 55);
            }
        }
        else if (canUserMove()) {
            if (key == Key.DOWN) {
                moveDown();
                drawScene();
            } else if (key == Key.LEFT) {
                moveLeft();
                drawScene();
            } else if (key == Key.UP) {
                moveUp();
                drawScene();
            } else if (key == Key.RIGHT) {
                moveRight();
                drawScene();
            }
        }
        else gameOver();
    }
    private void moveLeft(){
        boolean isMove = false;
        for (int i = 0; i < SIDE; i++) {
            if (compressRow(gameField[i])) isMove = true;
            if (mergeRow(gameField[i])) isMove = true;
            if(compressRow(gameField[i])) isMove = true;
        }
        if (isMove) {
            createNewNumber();
        }
    }
    private void moveRight() {
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }
    private void moveUp() {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }
    private void moveDown() {
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }
    private void rotateClockwise() {
        int[][] tmpGameField = new int[SIDE][SIDE];
        for (int i = 0; i < SIDE; i++)
            for (int j = 0; j < SIDE; j++)
                tmpGameField[i][j] = gameField[SIDE - j - 1][i];
        for (int i = 0; i < SIDE; i++)
            for (int j = 0; j < SIDE; j++)
                gameField[i][j] = tmpGameField[i][j];
    }
    private int getMaxTileValue() {
        int max = 0;
        for (int i = 0; i < SIDE; i++)
            for (int j = 0; j < SIDE; j++)
                max = (gameField[i][j] > max ? gameField[i][j] : max);
        return max;
    }
    private void win() {
        isGameStopped = true;
        canContinue = true;
        showMessageDialog(Color.RED, "YOU WIN!!!", Color.YELLOW, 55);
    }
    private boolean canUserMove() {
        int countNull = 0;
        int nearEqual = 0;
        for (int i = 0; i < SIDE; i++)
            for (int j = 0; j < SIDE; j++)
                if (gameField[i][j] == 0)
                    countNull++;
        for (int i = 0; i < SIDE; i++)
            for (int j = 0; j < SIDE - 1; j++)
                if (gameField[i][j] == gameField[i][j + 1] || gameField[j][i] == gameField[j + 1][i])
                    nearEqual++;
        if (countNull > 0 || nearEqual > 0) return true;
        else return false;
    }
    private void gameOver() {
        isGameStopped = true;
        canContinue = false;
        showMessageDialog(Color.RED, "YOU LOSE!!!", Color.YELLOW, 55);
    }
}