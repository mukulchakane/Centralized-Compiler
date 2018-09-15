
package tcServer;

import java.awt.*;
import javax.swing.*;
import java.awt.print.*;


public class PrintUtilities implements Printable {
  private Component componentToBePrinted;
  int ww, hh;
  boolean scale;

  public static void printComponent(Component c, int ww, int hh, boolean scale) {
    new PrintUtilities(c,ww,hh,scale).print();
  }
  
  public PrintUtilities(Component componentToBePrinted, int ww,  int hh, boolean scale) {
    this.componentToBePrinted = componentToBePrinted;
    this.ww = ww;
    this.hh = hh;
    this.scale = scale;
  }
  
  public void print() {
    PrinterJob printJob = PrinterJob.getPrinterJob();
    printJob.setPrintable(this);
    if (printJob.printDialog())
      try {
        printJob.print();
      } catch(PrinterException pe) {
        System.out.println("Error printing: " + pe);
      }
  }

  public int print(Graphics g, PageFormat pageFormat, int pageIndex) {
    if (pageIndex > 0) {
      return(NO_SUCH_PAGE);
    } else {
      Graphics2D g2d = (Graphics2D)g;
      
      g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
      if(scale) {
        g2d.scale(pageFormat.getImageableWidth() / (float)ww,pageFormat.getImageableHeight() / (float)hh);
      }
      
        //pageFormat.
      
      disableDoubleBuffering(componentToBePrinted);
      componentToBePrinted.paint(g2d);
      enableDoubleBuffering(componentToBePrinted);
      return(PAGE_EXISTS);
    }
  }


  public static void disableDoubleBuffering(Component c) {
    RepaintManager currentManager = RepaintManager.currentManager(c);
    currentManager.setDoubleBufferingEnabled(false);
  }


  public static void enableDoubleBuffering(Component c) {
    RepaintManager currentManager = RepaintManager.currentManager(c);
    currentManager.setDoubleBufferingEnabled(true);
  }
}
