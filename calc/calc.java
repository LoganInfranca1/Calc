
/**
 * This class will creat a basketall calc to add up nbr of 3 shots,2points and free throws
 *
 * Logan I
 * 2/4/2019
 */
import java.lang.Runtime;
import java.io.IOException;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import static java.lang.Math.*;
public class calc extends JFrame
{
    // instance variables - replace the example below with your own
    private JLabel headerL,header2L,oneL,twoL,finalL;
    private JTextField oneTF,twoTF,finalTF;
    private JButton oneB,twoB,threeB,exitB,addB,addB2,addB3,addB4,addB5,addB6,addB7;
    private  AddButtonHandler abHandler;
    private  AddButtonHandler1 abHandler1;
    private  AddButtonHandler2 abHandler2;
    private  AddButtonHandler3 abHandler3;
    private  AddButtonHandler4 abHandler4;
    private  AddButtonHandler5 abHandler5;
    private  AddButtonHandler6 abHandler6;
    private ExitButtonHandler ebHandler;
    
    private static final int WIDTH =600;
    private static final int HEIGHT =500;
    public calc(){
        
        headerL=new JLabel("Calc",SwingConstants.CENTER);
        header2L=new JLabel("   ",SwingConstants.CENTER);
        oneL=new JLabel("Enter first Number",SwingConstants.RIGHT);
        twoL=new JLabel("Enter seccond Nuber",SwingConstants.RIGHT);
        
        finalL=new JLabel("Final Score",SwingConstants.RIGHT);
        
        oneTF=new JTextField(3);
        twoTF=new JTextField(3);
        
        finalTF=new JTextField(3);
        
        addB=new JButton("+");
        abHandler=new AddButtonHandler();
        addB.addActionListener(abHandler);
        
        addB2=new JButton("-");
        abHandler1=new AddButtonHandler1();
        addB2.addActionListener(abHandler1);
        
        addB3=new JButton("/");
        abHandler2=new AddButtonHandler2();
        addB3.addActionListener(abHandler2);
        
        addB4=new JButton("*");
        abHandler3=new AddButtonHandler3();
        addB4.addActionListener(abHandler3);
        
        addB5=new JButton("Dab");
        abHandler4=new AddButtonHandler4();
        addB5.addActionListener(abHandler4);
        
        addB6=new JButton("MP3");
        abHandler5=new AddButtonHandler5();
        addB6.addActionListener(abHandler5);
        
        addB7=new JButton("Clear");
        abHandler6=new AddButtonHandler6();
        addB7.addActionListener(abHandler6);
        
        exitB=new JButton("Exit");
        ebHandler= new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
        
        setTitle("Calc");
        Container pane=getContentPane();
        pane.setLayout(new GridLayout(8,2));
        pane.add(headerL);
        pane.add(header2L);
        pane.add(oneL);
        pane.add(oneTF);
        pane.add(twoL);
        pane.add(twoTF);
        pane.add(finalL);
        pane.add(finalTF);
        pane.add(addB2);
        pane.add(addB3);
        pane.add(addB);
        pane.add(addB4);
        pane.add(addB6);
        pane.add(addB5);
        pane.add(addB6);
        pane.add(exitB);
        setSize(WIDTH,HEIGHT);setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private class ExitButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
         System.exit(0);   
        }
        }
    
        private class AddButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
         double one,two,finalScore;
         
         one=Double.parseDouble(oneTF.getText());
         two=Double.parseDouble(twoTF.getText());
         finalScore = one + two;
         finalTF.setText(""+String.format("%.3f",finalScore));
        }
        }
        private class AddButtonHandler1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
         double one,two,finalScore;
         
         one=Double.parseDouble(oneTF.getText());
         two=Double.parseDouble(twoTF.getText());
         finalScore = one - two;
         finalTF.setText(""+String.format("%.3f",finalScore));
        }
        }
        private class AddButtonHandler2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
         double one,two,finalScore;
         
         one=Double.parseDouble(oneTF.getText());
         two=Double.parseDouble(twoTF.getText());
         finalScore = one / two;
         finalTF.setText(""+String.format("%.3f",finalScore));
        }
        }
        private class AddButtonHandler3 implements ActionListener{
        public void actionPerformed(ActionEvent e){
         double one,two,finalScore;
         
         one=Double.parseDouble(oneTF.getText());
         two=Double.parseDouble(twoTF.getText());
         finalScore = one * two;
         finalTF.setText(""+String.format("%.3f",finalScore));
        }
        }
        private class AddButtonHandler6 implements ActionListener{
        public void actionPerformed(ActionEvent e){
         double one,two,finalScore;
         
         one=Double.parseDouble(oneTF.getText());
         two=Double.parseDouble(twoTF.getText());
         finalScore = one * two;
         finalTF.setText(""+String.format("  "));
        }
        }
        private class AddButtonHandler4 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Runtime runtime = Runtime.getRuntime();   
         try
        {
            runtime.exec("Project1.exe");        //opens new notepad instance
            //OR runtime.exec("notepad");
        }
        catch (IOException a)
        {
            a.printStackTrace();
        }
        }
        }
        private class AddButtonHandler5 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Runtime runtime = Runtime.getRuntime();   
         try
        {
            runtime.exec("Project2.exe");        //opens new notepad instance
            //OR runtime.exec("notepad");
        }
        catch (IOException a)
        {
            a.printStackTrace();
        }
        }
        }
        
     public static void main(String[] args){
     calc mynameisjef=new calc();
    }
}

    
        
    
   
