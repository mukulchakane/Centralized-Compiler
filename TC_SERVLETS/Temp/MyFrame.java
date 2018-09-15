import java.awt.*;
import java.awt.FileDialog;
public class MyFrame extends Frame
{
    //FileDialog fd1,fd2;
    
    MyFrame(String str)
    {
      super(str);   
    }
public static void main(String []args)
{
    Frame f1=new MyFrame("main");
  
f.setSize(500,500);
    f.setVisible(true);
 FileDialog fd1=new FileDialog(this);
fd1.setVisible(true);
}

}
