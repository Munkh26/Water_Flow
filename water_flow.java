//Name: Munkhsoyombo Munkhbat
//Date: 11/23/2026
//Description: It checks if the water can flow off to one of the sides of the rectangular array.

public class water_flow {

    public void main(String[] args) {
        int[][] map = {
            {100, 200, 200, 200, 200, 200, 200, 200, 200, 200},
            {200, 200, 200, 200, 200, 200, 200, 200, 200, 200},
            {200, 10, 200, 200, 200, 200, 200, 200, 200, 200},
            {200, 11, 10, 200, 200, 6, 85, 84, 83, 200},
            {200, 200, 14, 15, 59, 200, 86, 200, 82, 200},
            {200, 11, 12, 200, 200, 200, 87, 200, 81, 200},
            {200, 10, 200, 200, 90, 89, 88, 200, 200, 200},
            {200, 9, 8, 200, 200, 200, 200, 200, 200, 200},
            {200, 200, 7, 200, 200, 200, 200, 200, 200, 200},
            {200, 98, 6, 200, 200, 200, 200, 200, 200, 200}

        };
        System.out.println(canFlowOff(map, 4, 5));

    }

    public boolean canFlowOff(int[][] map, int row, int col) {
        if (row == 0 || col == 0 || row == map.length - 1 || col == map[row].length - 1) {
            return true;
        }
        boolean checkUp = false;
        boolean checkDown = false;
        boolean checkRight = false;
        boolean checkLeft = false;

        if (row - 1 >= 0 && map[row][col] > map[row - 1][col]) {
            checkUp = canFlowOff(map, row - 1, col);
        }
        if (row + 1 < map.length && map[row][col] > map[row + 1][col]) {
            checkDown = canFlowOff(map, row + 1, col);
        }
        if (col - 1 >= 0 && map[row][col] > map[row][col - 1]) {
            checkLeft = canFlowOff(map, row, col - 1);
        }
        if (col + 1 < map[row].length && map[row][col] > map[row][col + 1]) {
            checkRight = canFlowOff(map, row, col + 1);
        }

        return checkUp || checkDown || checkLeft || checkRight;

    }
}
