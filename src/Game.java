import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;


public class Game {

    private final int MAX_FPS;
    private final int WIDTH;
    private final int HEIGHT;

    // Game states
    public enum GAME_STATES{
        MENU,
        GAME,
    }

    public GAME_STATES GameState;


    //pause
    public boolean isPaused = false;


    //menu UI elements
    private JPanel Menu;
    private JButton Menu_Play;
    private JButton Menu_Exit;

    //Buffer
    private BufferStrategy strategy;

    //Timing
    private float dt;
    private long lastFrame;
    private long startFrame;
    private int fps;

    //Window sizing
    public Game(int width, int height, int fps) {
        this.MAX_FPS = fps;
        this.WIDTH = width;
        this.HEIGHT = height;
    }



    //
}
