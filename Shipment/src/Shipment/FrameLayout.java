/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shipment;

//importing the lib we need
import javax.swing.JFrame;

//editing the JFrame class in a child class
public class FrameLayout extends JFrame {
    //adding a constructor for the class
    public FrameLayout(){
        //calling the constructor for the parent class with super
        //adding a title to it
        super("Shipment Company GUI");
        //setting the size for the window
        setSize(600,600);
        //configuring the exit btn
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setting the program window to visible
        setVisible(true);
    }

}
