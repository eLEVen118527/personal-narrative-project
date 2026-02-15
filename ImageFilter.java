import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  /** Instance Variables */
  
  /** Constructor */
  public ImageFilter(String fileName) {
    super(fileName);
  }

  // Add filter methods here...
public void colorShift(int value) {
  Pixel[][] pixels = getImagePixels();
    
  for (int row = 0; row < pixels.length; row++) {
    for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];

        // add the value to each RBG
        int newRed = currentPixel.getRed() + value;
        int newGreen = currentPixel.getGreen() + value;
        int newBlue = currentPixel.getBlue() + value;

        // force all RBG value to not exceed 255
        if (newRed > 255) {
          newRed = 255;
        }
        if (newGreen > 255) {
          newGreen = 255;
        }
        if (newBlue > 255) {
          newBlue = 255;
        }

        // update RBG values
        currentPixel.setRed(newRed);
        currentPixel.setGreen(newGreen);
        currentPixel.setBlue(newBlue);
      }
    } 
    
  }

public void colorize(String value) {
Pixel[][] pixels = getImagePixels();

  for (int row = 0; row < pixels.length; row++) {
    for (int col = 0; col < pixels[0].length; col++) {
      Pixel currentPixel = pixels[row][col];

  // calculate avg RBG value
    int totalRBG = currentPixel.getRed() + currentPixel.getGreen() + currentPixel.getBlue();
    int grayValue = totalRBG / 3;

        // Red range --> [0, 85)
        if (grayValue < 85) {
          currentPixel.setRed(255);
          currentPixel.setGreen(0);
          currentPixel.setBlue(0);
        }
        // Green range --> [85, 170)
        else if (grayValue < 170) {
          currentPixel.setRed(0);
          currentPixel.setGreen(255);
          currentPixel.setBlue(0);
        }
        // Blue range --> [170, 255]
        else {
          currentPixel.setRed(0);
          currentPixel.setGreen(0);
          currentPixel.setBlue(255);
        }
      }
    }
    
  }

}