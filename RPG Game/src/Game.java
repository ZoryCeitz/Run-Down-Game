import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;


public class Game {

    //Menu
    private enum STATE {
        MENU,
        GAME
    };

    private STATE State = STATE.MENU;

}



    //Buffer
    private BufferStrategy strategy;

    //Timing
    private float dt;
    private long lastFrame;
    private long startFrame;
    private int fps;

    //Window sizing
    public Game(int width, int height, int fps) {
        int MAX_FPS = fps;
        int WIDTH = width;
        int HEIGHT = height;

    private void tick(){
        if(state == STATE.GAME){
            p.tick();
            c.tick();
        }

        Graphics g = bs.getDrawGraphics();
        g.drawImage(image, 0, 0,getwidth(), getbeight, this);

        g.drawImage(background), 0, 0, this);

        if(State == STATE.GAME) {
            p.render(g);
            c.render(g);
        }else if(State == STATE.MENU)
        menu.render(g);
        {

        }




        //
    }
