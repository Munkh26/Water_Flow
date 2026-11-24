//Name: Munkhsoyombo Munkhbat
//Date: 11/23/2026
//Description: It checks if the water can flow off to one of the sides of the rectangular array.


public class water_flow {
    public void main(String[] args)
    {
        int[][] map = {
            {100, 99, 200, 200, 200, 200, 200, 200, 200, 200}, 
			{200, 98, 200, 200, 200, 200, 200, 200, 200, 200},
			{200, 97, 96, 200, 200, 200, 200, 200, 200, 200},
			{200, 200, 95, 200, 200, 200, 85, 84, 83, 200},
			{200, 200, 94, 93, 92, 200, 86, 200, 82, 200},
			{200, 150, 200, 200, 91, 200, 87, 200, 81, 200},
			{200, 200, 200, 200, 90, 89, 88, 200, 80, 200},
			{200, 150, 100, 200, 200, 200, 200, 200, 79, 200},
			{200, 200, 200, 200, 200, 200, 200, 200, 78, 77},
			{200, 98, 200, 200, 200, 200, 200, 200, 200, 76}		
        };
        System.out.println(canFlowOff(map, 3, 3));

    }

    public boolean canFlowOff(int[][] map, int row, int col) {
        if (row == 0 || col == 0 || row == map.length-1 || col == map[row].length-1) {
            return true;
        }
        boolean checkUp = false;
        boolean checkDown = false;
        boolean checkRight = false;
        boolean checkLeft = false;

        if (row-1 >= 0 && map[row][col] > map[row-1][col]){
            checkUp = canFlowOff(map, row-1, col);
        }
        if (row+1 < map.length && map[row][col] > map[row+1][col]){
            checkDown = canFlowOff(map, row+1, col);
        }
        if (col-1 >= 0 && map[row][col] > map[row][col-1]){
            checkLeft = canFlowOff(map, row, col-1);
        }
        if (col+1 < map[row].length && map[row][col] > map[row][col+1]){
            checkRight = canFlowOff(map, row, col+1);
        }

        return checkUp || checkDown || checkLeft || checkRight;

    }
}
