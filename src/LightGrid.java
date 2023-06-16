package src;
public interface LightGrid {
    void turnOn(int coordinate1 , int coordinate2, int coordinate3 , int coordinate4);
    void turnOff(int coordinate1 , int coordinate2, int coordinate3 , int coordinate4);
    void toggle(int coordinate1 , int coordinate2, int coordinate3 , int coordinate4);
    boolean isLit(int x, int y);


}
