import org.code.theater.*;
import org.code.media.*;

public class SceneOne extends Scene {

 /** Instance Variables */
private ImageFilter[][] NailDesigns;        // Images of the leaders of each faction

  /** Constructor */
public SceneOne(ImageFilter[][] NailDesigns) {
this.NailDesigns = NailDesigns;
}
/**
 * Top-level drawScene method which will draw the whole animation
*/
public void drawScene() {
clear("pink");
    
drawText("Scene 1", 100, 100);
drawNailIntroScene();
NailInspoScene();
pause(2);
}

  // other methods...
public void drawNailIntroScene() {
  
clear("pink");
    
setTextHeight(30);
setTextColor("white");
setTextStyle(Font.MONO, FontStyle.BOLD);
    
drawText("I love doing nails", 40, 150);

pause(1.0);
}

public void NailInspoScene() {
clear("pink");
    
    
setTextHeight(30);
setTextColor("white");
setTextStyle(Font.MONO, FontStyle.BOLD);

ImageFilter UniNail = new ImageFilter("Depop-Unisex-Nails.jpg");
  UniNail.colorShift(90);
  drawImage(UniNail, 60, 60, 120);
  
ImageFilter Nail3 = new ImageFilter("Nail3.jpg");
   Nail3.colorShift(90);
  drawImage(Nail3, 220, 60, 120);
   
ImageFilter Nail4 = new ImageFilter("Nail4.jpg");
   Nail4.colorShift(90);
  drawImage(Nail4, 60, 220, 120);
   
ImageFilter Nail2 = new ImageFilter("Nail2.jpg");
 Nail2.colorShift(90);
  drawImage(Nail2, 220, 220, 120);
  
pause(1.0);
  
}
}