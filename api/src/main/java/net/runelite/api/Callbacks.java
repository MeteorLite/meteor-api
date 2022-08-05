package net.runelite.api;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;

public interface Callbacks {
    void drawGameImage();

    /**
     * Mouse pressed event. If this event will be consumed it will not be propagated further to client.
     *
     * @param mouseEvent the mouse event
     * @return the mouse event
     */
    MouseEvent mousePressed(MouseEvent mouseEvent);

    /**
     * Mouse released event. If this event will be consumed it will not be propagated further to client.
     *
     * @param mouseEvent the mouse event
     * @return the mouse event
     */
    MouseEvent mouseReleased(MouseEvent mouseEvent);

    /**
     * Mouse clicked event. If this event will be consumed it will not be propagated further to client.
     *
     * @param mouseEvent the mouse event
     * @return the mouse event
     */
    MouseEvent mouseClicked(MouseEvent mouseEvent);

    /**
     * Mouse entered event. If this event will be consumed it will not be propagated further to client.
     *
     * @param mouseEvent the mouse event
     * @return the mouse event
     */
    MouseEvent mouseEntered(MouseEvent mouseEvent);

    /**
     * Mouse exited event. If this event will be consumed it will not be propagated further to client.
     *
     * @param mouseEvent the mouse event
     * @return the mouse event
     */
    MouseEvent mouseExited(MouseEvent mouseEvent);

    /**
     * Mouse dragged event. If this event will be consumed it will not be propagated further to client.
     *
     * @param mouseEvent the mouse event
     * @return the mouse event
     */
    MouseEvent mouseDragged(MouseEvent mouseEvent);

    /**
     * Mouse moved event. If this event will be consumed it will not be propagated further to client.
     *
     * @param mouseEvent the mouse event
     * @return the mouse event
     */
    MouseEvent mouseMoved(MouseEvent mouseEvent);

    /**
     * Mouse wheel moved event. If this event will be consumed it will not be propagated further to client.
     *
     * @param event the event
     * @return the mouse wheel event
     */
    MouseWheelEvent mouseWheelMoved(MouseWheelEvent event);

    /**
     * Key pressed event.
     *
     * @param keyEvent the key event
     */
    void keyPressed(KeyEvent keyEvent);

    /**
     * Key released event.
     *
     * @param keyEvent the key event
     */
    void keyReleased(KeyEvent keyEvent);

    /**
     * Key typed event.
     *
     * @param keyEvent the key event
     */
    void keyTyped(KeyEvent keyEvent);
}
