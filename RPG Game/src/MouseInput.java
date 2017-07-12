package com.gane.src.main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    int mx = e.getX();
    int my = e.getY();

    /**
     Public Rectangle playButton = new Rectangle(Game.WIDTH / 2 + 120, 150, 100, 50);
     Public Rectangle helpButton = new Rectangle(Game.WIDTH / 2 + 120, 150, 100, 50);
     Public Rectangle quitButton = new Rectangle(Game.WIDTH / 2 + 120, 150, 100, 50);
     */

    //Play Button
    if(mx >=Game.WIDTH /2+120&&mx <=Game.WIDTH /2+220)

    {
        if(my >= 250 && my <= 300)
            //Pressed Play Button
            Game.State = Game.STATE.Game
    }

}

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
