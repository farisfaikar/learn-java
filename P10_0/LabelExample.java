import java.awt.*;

public class LabelExample extends Frame {
   public LabelExample() {
      // Create a label
      Label label = new Label();
      
      // Set the label's text with Unicode line feed
      label.setText("Hello,\u2028World!");
      
      // Add the label to the frame
      add(label);
      
      // Set the size and make the frame visible
      setSize(200, 200);
      setVisible(true);
   }

   public static void main(String[] args) {
      new LabelExample();
   }
}
