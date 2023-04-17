import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class KalkulatorBMI extends Frame implements ActionListener {

  // Create instances
  Label nimL, namaL, beratL, tinggiL, dataL, hasilL;
  TextField nimTF, namaTF, beratTF, tinggiTF;
  Button hasilB;

  KalkulatorBMI() {
    // Create frame
    Frame f = new Frame("Kalkulator BMI");
    f.addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          f.dispose();
        }
      }
    );

    // Initiate labels
    nimL = new Label("NIM");
    nimL.setBounds(60, 65, 23, 15);
    namaL = new Label("NAMA");
    namaL.setBounds(60, 105, 36, 15);
    beratL = new Label("BERAT");
    beratL.setBounds(60, 145, 40, 15);
    tinggiL = new Label("TINGGI");
    tinggiL.setBounds(60, 185, 45, 15);
    dataL = new Label("");
    dataL.setBounds(60, 311, 400, 15);
    hasilL = new Label("");
    hasilL.setBounds(60, 329, 400, 15);

    // Initiate textfields
    nimTF = new TextField("4611421092");
    nimTF.setBounds(132, 62, 200, 20);
    namaTF = new TextField("Faris Faikar");
    namaTF.setBounds(132, 102, 200, 20);
    beratTF = new TextField("60");
    beratTF.setBounds(132, 142, 200, 20);
    tinggiTF = new TextField("170");
    tinggiTF.setBounds(132, 182, 200, 20);

    // Initiate buttons
    hasilB = new Button("HASIL");
    hasilB.setBounds(67, 238, 67, 35);

    // Add action listener
    hasilB.addActionListener(this);

    // Add components to frame
    f.add(nimL);
    f.add(namaL);
    f.add(beratL);
    f.add(tinggiL);
    f.add(nimTF);
    f.add(namaTF);
    f.add(beratTF);
    f.add(tinggiTF);
    f.add(hasilB);
    f.add(dataL);
    f.add(hasilL);

    // Set size, layout, and visibility of frame
    f.setSize(400, 400);
    f.setLayout(null);
    f.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String nimStr = nimTF.getText();
    String namaStr = namaTF.getText();
    String beratStr = beratTF.getText();
    String tinggiStr = tinggiTF.getText();

    // Sanitize input to only accept integers
    int berat, tinggi;
    try {
      berat = Integer.parseInt(beratStr);
      tinggi = Integer.parseInt(tinggiStr);
    } catch (NumberFormatException ex) {
      // If input is not an integer, show an error message and return
      JOptionPane.showMessageDialog(
        this,
        "Input berat dan tinggi harus berupa angka integer.",
        "Error",
        JOptionPane.ERROR_MESSAGE
      );
      return;
    }

    // Calculate BMI
    double bmi = berat / ((tinggi / 100.0) * (tinggi / 100.0));

    // Category logic
    String kategori;
    if (bmi > 25.0) {
      kategori = "obesitas";
    } else if (bmi < 18.5) {
      kategori = "kurus";
    } else {
      kategori = "ideal";
    }

    // Set results text
    dataL.setText(
      namaStr + ", dengan NIM: " + nimStr + ", BMI: " + Math.round(bmi)
    );
    hasilL.setText("Maka dia masuk dalam kategori " + kategori);
  }

  public static void main(String[] asdf) {
    new KalkulatorBMI();
  }
}
