public class LightCountImplementation implements LightCounter{
    @Override
    public int countLitLights(boolean[][] grid) {
        int count = 0;
        for (boolean[] row : grid) {
            for (boolean light : row) {
                if (light) {
                    count++;
                }
            }
        }
        return count;
    }
}