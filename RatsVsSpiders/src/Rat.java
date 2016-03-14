
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suzanne
 */
public class Rat extends Rectangle{
    private ImageIcon image;
    private final int imageSize;
    private Image ResizedImage;
    
    public Rat(int width, int height){

      image = new ImageIcon("src/images/rat.gif");
      ResizedImage = image.getImage().getScaledInstance(80, 80,Image.SCALE_DEFAULT);
      
      imageSize =image.getIconWidth();
      setBounds(400,400, imageSize, imageSize);
       
    }
     public void DrawRat(Graphics g) {
   
     g.drawImage(ResizedImage, this.x, this.y, null);
       
      }
     public final void Invert(){
         image = new ImageIcon("src/images/rat_flipped.gif"); ResizedImage = image.getImage();
     }
     public final void RightOrient(){
         image = new ImageIcon("src/images/rat.gif"); ResizedImage = image.getImage();
     }
     
    
}
