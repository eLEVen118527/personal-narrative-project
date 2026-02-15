import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Create any 2D arrays & variables to be passed as parameters to constructor
 ImageFilter[][] NailDesigns = {
      { new ImageFilter("Nail3.jpg"), new ImageFilter("Nail4.jpg")}, 
      { new ImageFilter("Nail2.jpg"), new ImageFilter("Depop-Unisex-Nails.jpg")}, 
    };
 ImageFilter[][] Swimming = {
      { new ImageFilter("swim2.jpg"), new ImageFilter("swim.jpeg")}, 
      { new ImageFilter("swimgirl.jpg"), new ImageFilter("float.jpg")}, 
    };

    // Instantiate Scene subclass objects
    SceneOne scene1 = new SceneOne(NailDesigns);
    SceneTwo scene2 = new SceneTwo(Swimming);
    
    // Call drawScene methods in each subclass
    scene1.drawScene();
    scene2.drawScene();
    
    // Play scenes in Theater, in order of arguments
    Theater.playScenes(scene1, scene2);
    
  }
}