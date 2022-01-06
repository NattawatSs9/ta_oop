import javax.swing.*;
import java.awt.*;

public class TimeCountCheck extends JFrame implements Runnable {
    private int timer;
    private boolean isPaused;
    private JLabel label;


    public TimeCountCheck(){
        System.out.println("Timer Start");
        label = new JLabel("");
        label.setFont(new Font("Angsana new", Font.BOLD, 56));

        this.add(label);
        this.setSize(400,200);
        this.setVisible(true);
        this.setLocation(1100,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public synchronized void checkPaused(){
        while (isPaused){
            try{
                this.wait();
            }
            catch(InterruptedException ex) {
                System.out.println("Clock get Interrupted");
            }
        }
    }
    public void pauseThread(){
        isPaused = true;
    }
    public synchronized void resumeThread(){
        isPaused = false;
        this.notify();
    }
    @Override
    public void run() {
        while (true){
            checkPaused();
            int hour = Math.floorDiv(timer,3600);
            int min = Math.floorDiv(timer%3600, 60);
            int sec = Math.floorDiv((timer%3600)%60,1);
            label.setText(String.format("%02d:%02d:%02d", hour, min, sec));
            timer++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean getPaused() {
        return isPaused;
    }

    public void setPaused(boolean paused) {
        isPaused = paused;
    }
}
