/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.frame.clases;

/**
 *
 * @author User
 */
import java.awt.event.*;
import java.awt.Color;
import java.awt.Frame;

public class EsquemaRaton implements MouseListener {
@Override
public void mouseClicked(MouseEvent evento) {
    Frame miVentana = new Frame();
    miVentana.setSize(600, 200);
    miVentana.setVisible(true);
// aqui se implementa la accion deseada
}
@Override
public void mousePressed(MouseEvent evento) {
    System.out.println("hola");
}
@Override
public void mouseReleased(MouseEvent evento) {
    System.out.println("bye");
}
@Override
public void mouseEntered(MouseEvent evento) {
evento.getComponent().setBackground(Color.green);
}
@Override
public void mouseExited(MouseEvent evento) {
evento.getComponent().
setBackground(Color.gray);
}
}
