package src;
public class LightGridImplementation implements LightGrid {
    private boolean[][] lights;

    public LightGridImplementation(int size) {
        lights = new boolean[size][size];
    }

    @Override
    public void turnOn(int x1, int y1, int x2, int y2) {
        for (int x = x1; x <= x2; x++) {
            for (int y = y1; y <= y2; y++) {
                lights[x][y] = true;
            }
        }
    }

    @Override
    public void turnOff(int x1, int y1, int x2, int y2) {
        for (int x = x1; x <= x2; x++) {
            for (int y = y1; y <= y2; y++) {
                lights[x][y] = false;
            }
        }
    }

    @Override
    public void toggle(int x1, int y1, int x2, int y2) {
        for (int x = x1; x <= x2; x++) {
            for (int y = y1; y <= y2; y++) {
                lights[x][y] = !lights[x][y];
            }
        }
    }

    @Override
    public boolean isLit(int x, int y) {
        return lights[x][y];
    }

    public boolean[][] getGrid() {
        return lights;
    }

}
