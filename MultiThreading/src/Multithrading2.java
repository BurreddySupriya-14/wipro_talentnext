import java.util.*;
public class Multithrading2 implements Runnable {
    String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
    Random random = new Random();
    public void run() {
        while (true) {
            int index = random.nextInt(colours.length);
            String colour = colours[index];
            System.out.println("Selected Colour: " + colour);
            if (colour.equals("red")) {
                System.out.println("Red encountered. Stopping thread.");
                break;
            }
            try {
                Thread.sleep(500); // Pause for visibility
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Multithrading2 task = new Multithrading2();
        Thread thread = new Thread(task);
        thread.start();
    }
}