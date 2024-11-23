public class LeetCode1861 {

    private static char[][] rotate(char[][] box) {
        int row = box.length;
        int col = box[0].length;

        char[][] rBox = new char[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rBox[j][row - 1 - i] = box[i][j];
            }
        }

        return rBox;
    }

    public char[][] rotateTheBox(char[][] box) {
        int row = box.length;
        int col = box[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = col - 1; j >= 0; j--) {
                if (box[i][j] == '#') {
                    int k = j;
                    while (k+1 < col && box[i][k+1] == '.') {
                        k++;
                    }
                    if (k != j) {
                        box[i][k] = '#';
                        box[i][j] = '.';
                    }
                }
            }
        }

        return rotate(box);
    }
}
