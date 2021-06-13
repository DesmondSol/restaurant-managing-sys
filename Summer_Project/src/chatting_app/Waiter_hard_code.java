/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatting_app;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;


/**
 *
 * @author hp
 */
public class Waiter_hard_code implements ActionListener{
    String waiterName="Elda Situ";
    
    Waiter_hard_code(){
        
        JFrame frame= new JFrame();
        
        frame.setLayout(new BorderLayout());
        
        //top panel
        JPanel top= new JPanel();
        top.setLayout(new FlowLayout());
        JLabel tnb= new JLabel();
        Integer[] data = {1, 2, 3, 4};
 JComboBox<Integer> tnbs;
        tnbs = new JComboBox<>(data);
        top.add(tnb);
        top.add(tnbs);
        
        //middle panel
        JTabbedPane sel=new JTabbedPane();
        // first tab
        
        JPanel mid=new JPanel();
        mid.setLayout(new BorderLayout());
        
        
        sel.addTab("Food", mid);

        
        //Second tab
        JPanel mid2=new JPanel();
        mid2.setLayout(new BorderLayout());
        
        sel.addTab("Drinks", mid2);
        
        //bottom panel
        JPanel bot=new JPanel();
        bot.setLayout(new BorderLayout());
        JTextArea gen=new JTextArea("\n \n \n \n...");
        gen.setSize(120,110);
        JScrollPane scrlp = new JScrollPane(gen);
        JPanel ctr=new JPanel();
        ctr.setLayout(new BorderLayout());
        JButton gen1=new JButton("GENERATE");
        JButton erase=new JButton("Erase");
        JPanel sen=new JPanel();
        JButton send=new JButton("Send");
        sen.add(send);
        ctr.add(gen1,BorderLayout.NORTH);
        ctr.add(erase);
        bot.add(scrlp,BorderLayout.CENTER);
        bot.add(ctr,BorderLayout.EAST);
        bot.add(sen,BorderLayout.SOUTH);
        
        
        frame.add(top,BorderLayout.NORTH);
        frame.add(sel,BorderLayout.CENTER);
        frame.add(bot,BorderLayout.SOUTH);
        ImageIcon icon = new ImageIcon("APB.jpg");
        frame.setIconImage(icon.getImage());
        
        frame.setSize(400,490);
        frame.setTitle("Waiter view : Ms/Mss "+waiterName);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
     public static void main(String args[]) {
        new Waiter_hard_code();
    }
}
