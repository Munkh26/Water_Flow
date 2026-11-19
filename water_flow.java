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
        System.out.println(canFlowOff(map, 3, 4));

    }

    public boolean canFlowOff(int[][] map, int row, int col) {
        if (row==0 || col == 0 || row == map.length || col == map[row].length) {
            return true;
        }


        return canFlowOff(map, row-1, col) || canFlowOff(map, row+1, col) || canFlowOff(map, row, col-1) || canFlowOff(map, row, col+1);
    }
}
