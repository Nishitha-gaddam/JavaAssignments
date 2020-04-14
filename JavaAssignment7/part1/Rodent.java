package JavaAssignment7.part1;

public abstract class Rodent {
    public Rodent() {
        System.out.println("Rodents are mammals characterized by upper and lower pairs of ever-growing rootless incisor teeth");
    }

    public void foodConsumed() {
        System.out.println("Rodents eat grass and available trees");
    }

    public abstract void apperance();

}

class Hamster extends Rodent {

    public Hamster() {
        System.out.println(" Hamsters are small rodents that are commonly kept as house pets");

    }

    public void foodConsumed() {
        System.out.println("Hamsters eat leafy greens and few fruits like pears etc");
    }

    @Override
    public void apperance() {
        System.out.println("Hamsters have large cheek pouches where they collect food to transport from one place to another.");
    }

}

class Mouse extends Rodent {

    public Mouse() {
        System.out.println("Mouse is a small rodents with pointed noses, furry round bodies, large ears and long, often hairless, tails");
    }

    public void foodConsumed() {
        System.out.println("Mice eat grains and seeds");
    }

    @Override
    public void apperance() {
        System.out.println("Mice are small rodents with pointed noses, furry round bodies, large ears and long, often hairless, tails. ");
    }


}