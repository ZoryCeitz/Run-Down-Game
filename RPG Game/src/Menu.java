import java.awt.*;

/**
 * Created by IGMAdmin on 7/12/2017.
 */
public class Menu {

    Public Rectangle playButton = new Rectangle(Game.WIDTH / 2 + 120, 150, 100, 50);
    Public Rectangle helpButton = new Rectangle(Game.WIDTH / 2 + 120, 150, 100, 50);
    Public Rectangle quitButton = new Rectangle(Game.WIDTH / 2 + 120, 150, 100, 50);

    public void render(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
      Font fnt0 = new Font("arial", Font.BOLD,50);
      g.setFont(fnt0);
      g.setcolor(Color.white);
      g.drawString("Text Based RPG",Game.WIDTH / 2, 100);

      Font fnt1 = new Font("arial", Font.BOLD, 30);
      g.setFont(fnt1);
      g.drawString("Play", playButton.x + 19, playButton.y + 30);
      g2d.draw(playButton);
      g.drawString("Help", helpButton.x + 19, helpButton.y + 30);
      g2d.draw(helpButton);
      g.drawString("Quit", quitButton.x + 19, quitButton.y + 30);
      g2d.draw(quitButton);
    }
}