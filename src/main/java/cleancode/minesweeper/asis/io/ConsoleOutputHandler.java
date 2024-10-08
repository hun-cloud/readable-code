package cleancode.minesweeper.asis.io;

import cleancode.minesweeper.asis.GameBoard;
import cleancode.minesweeper.asis.GameException;
import cleancode.minesweeper.asis.position.CellPosition;

import java.util.List;
import java.util.stream.IntStream;

public class ConsoleOutputHandler implements OutputHandler{
    @Override
    public void showGameStartComments() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("지뢰찾기 게임 시작!");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    @Override
    public void showBoard(GameBoard board) {
        String alphabets = generateColAlphabets(board);

        System.out.println("    " + alphabets);
        for (int row = 0; row < board.getRowSize(); row++) {
            System.out.printf("%2d  ", row + 1);
            for (int col = 0; col < board.getColSize(); col++) {
                CellPosition cellPosition = CellPosition.of(row, col);
                System.out.print(board.getSign(cellPosition) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private String generateColAlphabets(GameBoard board) {
        List<String> alphabets = IntStream.range(0, board.getColSize())
                .mapToObj(index -> (char) ('a' + index))
                .map(Object::toString)
                .toList();
        return String.join(" ", alphabets);
    }
    @Override
    public void showGameWinningComment() {
        System.out.println("지뢰를 모두 찾았습니다. GAME CLEAR!");
    }
    @Override
    public void showGameLosingComment() {
        System.out.println("지뢰를 밟았습니다.0. GAME OVER!");
    }
    @Override
    public void showCommentForSelectingCell() {
        System.out.println("선택할 좌표를 입력하세요. (예: a1)");
    }
    @Override
    public void showCommentForUserAction() {
        System.out.println("선택한 셀에 대한 행위를 선택하세요. (1: 오픈, 2: 깃발 꽂기)");
    }
    @Override
    public void showExceptionMessage(GameException e) {
        System.out.println(e.getMessage());
    }
    @Override
    public void showSimpleMessage(String message) {
        System.out.println(message);
    }
    @Override
    public void showCommentWrongNumber() {
        System.out.println("잘못된 번호를 선택하셨습니다.");
    }
}
