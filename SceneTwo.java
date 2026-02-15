import org.code.theater.*;
import org.code.media.*;

public class SceneTwo extends Scene {

  /** Instance Variables */
private ImageFilter[][] Swimming;
  
  /** Constructor */
public SceneTwo(ImageFilter[][] Swimming) {
 this.Swimming = Swimming;
}

  /**
   * Top-level drawScene method which will draw the whole animation
   */
public void drawScene() {
clear("pink");
    
drawText("Scene 2", 100, 100);
SwimIntroScene();
SwimmingScene(); 
pause(1);
}
  
public void SwimIntroScene() {
  
clear("blue");
    
setTextHeight(30);
setTextColor("white");
setTextStyle(Font.MONO, FontStyle.BOLD);
    
drawText("I love swimming", 40, 150);


pause(1.0);
}
  // other methods...

  // this methods draws the swimmig scene with the pictures aligned nicely
public void SwimmingScene() {
// clears the background sets it too blue
clear("blue");

// sets the text properties 
setTextHeight(20); // font size
setTextColor("white"); // white text font color 
setTextStyle(Font.MONO, FontStyle.BOLD); // bold font 
// the first image top left 
ImageFilter swim1 = new ImageFilter("swimgirl.jpg");
swim1.colorShift(90);
drawImage(swim1, 60, 60, 120);
// the text at the bottom
drawText("I enjoy swimming with friends", 20, 350);
// the top right swimming image 
ImageFilter swim2 = new ImageFilter("float.jpg");
swim2.colorShift(90);
drawImage(swim2, 220, 60, 120);
//the bottom left swimming image 
ImageFilter swim3 = new ImageFilter("swim.jpeg");
swim3.colorShift(90);
drawImage(swim3, 60, 220, 120);
// Bottom right swimming image 
ImageFilter swim4 = new ImageFilter("swim2.jpg");
swim4.colorShift(90);
drawImage(swim4, 220, 220, 120);
  // pause for a sec
pause(1.0);
}
// this method Mr Aillo gave us to center a string  
public String addSpaceToCenter(String className) {
  if (className.length() < 30) {
    int spacesNeeded = 30 - className.length();
    String toAdd = "";
  for (int i = 0; i < spacesNeeded / 2; i++) {
    toAdd += " ";
}
// returns a string with padding on both sides 
  return toAdd + className + toAdd;
}
// if the string is 30 or more characters return classname
  return className;
}
  }