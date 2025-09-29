public class TetrisGrid {
    private boolean[][] grid;
    private int width;
    private int height;

    public TetrisGrid(boolean[][] grid) {
        this.height = grid[0].length;
        this.width = grid.length;
        this.grid = new boolean[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                this.grid[x][y] = grid[x][y];
            }
        }
    }

    public boolean[][] getGrid() {
        return grid;
    }

    public void clearRows() {
        boolean[][] newGrid = new boolean[width][height];
        int newY = 0;
        for (int y = 0; y < height; y++) {
            boolean fullRow = true;
            for (int x = 0; x < width; x++) {
                if (!grid[x][y]) {
                    fullRow = false;
                    break;
                }
            }
            if (!fullRow) {
                for (int x = 0; x < width; x++) {
                    newGrid[x][newY] = grid[x][y];
                }
                newY++;
            }

        }
        for (int y = newY; y < height; y++) {
            for (int x = 0; x < width; x++) {
                newGrid[x][y] = false;
            }
        }

        grid = newGrid;
    }
}
