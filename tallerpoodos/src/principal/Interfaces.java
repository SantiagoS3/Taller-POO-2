/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class Interfaces extends JFrame  implements ActionListener  {
    
        JButton b1,b2,b3,b4,b5,b6,b7;
        JFrame p = new JFrame(); 
        JFrame p2 = new JFrame(); 
        JFrame p3 = new JFrame();
        JTextField t1;
        
    public Interfaces (){

        p.setBounds(500, 500, 900, 500);

    
        p2.setBounds(500, 500, 900, 500);
        
        p.setLayout(null);
        p2.setLayout(null);
        
        
        b1 = new JButton("Sonic");
        b2 = new JButton("Retotokio");
        b3 = new JButton("Elhoyo");
        b4 = new JButton("Lapurga");
        b5 = new JButton("Tirador");
        b6 = new JButton("Compraentradas");
        b7 = new JButton("Volver");
        
       
        p.add(b1);
        b1.setBounds(45,45,120,30);          //Agrego los botones necesarios al primer Frame
        p.add(b2);
        b2.setBounds(200,45,120,30);
        p.add(b3);
        b3.setBounds(45,45,45,45);
        p.add(b4);
        b4.setBounds(45,45,45,45);
        p.add(b5);
        b5.setBounds(45,45,45,45);
        
        
        t1.setBounds(50,50, 400,400);
        p2.add(t1);
        b6.setBounds(45,45,45,45);          //Agrego los botones necesarios para el segundo Frame
        p2.add(b6); 
        b5.setBounds(45,45,45,45);
        p2.add(b7);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

           p.setVisible(true);
    }
          @Override
    public void actionPerformed(ActionEvent arg0) {
        
        String accion;
        
        accion = arg0.getActionCommand();
        
         
        
        if (accion.equals("Sonic")) {
   
            
            p.setVisible(false);
            p2.setVisible(true);
           
        }
        
        if (accion.equals("Volver")) {
            
             p.setVisible(true);
              p2.setVisible(false);

                       
        }
        if (accion.equals("Elhoyo")) {
            System.out.println("Debe dijitar un numero");            
        }
        if (accion.equals("Lapurga")) {
            System.out.println("Debe dijitar un numero");            
        }
        if (accion.equals("Tirador")) {
            System.out.println("Debe dijitar un numero");            
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
