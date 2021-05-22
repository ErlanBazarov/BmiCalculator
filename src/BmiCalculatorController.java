import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class BmiCalculatorController {

    @FXML
    private Button CalculateButton;

    @FXML
    private TextField weightTextField;

    @FXML
    private TextField HeightTextField;

    @FXML
    private CheckBox EnglishUnitsCheck;

    @FXML
    private Label BmiResultLabel;

    @FXML
    void OnCalculateClick(MouseEvent event) {
      float height = Float.parseFloat(HeightTextField.getText());
      float weight = Float.parseFloat(weightTextField.getText());
      float bmi;
      if (EnglishUnitsCheck.selectedProperty().get() == true){
        bmi = 707 * weight / (float) Math.pow(height, 2);
      }
      else{
        bmi = weight / (float) Math.pow(height, 2);
      }
      System.out.println(bmi);
      BmiResultLabel.setText(String.valueOf(bmi));
    }

}
