import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CityAdderApp {
    private JFrame frame;
    private JTextField cityTextField;
    private JButton addButton;
    private JComboBox<String> cityComboBox;
    private DefaultComboBoxModel<String> comboBoxModel;

    public static void main(String[] args) {
        new CityAdderApp().createUI();
    }

    // Method to create and display the frame and components
    private void createUI() {
        // Create the main frame
        frame = new JFrame("City Adder");

        // Set layout for the frame
        frame.setLayout(new FlowLayout());

        // Create the text field for city input
        cityTextField = new JTextField(20);

        // Create the combo box with a DefaultComboBoxModel to manage items
        comboBoxModel = new DefaultComboBoxModel<>();
        cityComboBox = new JComboBox<>(comboBoxModel);

        // Create the Add button
        addButton = new JButton("Add");

        // Add action listener to the button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the city name from the text field
                String cityName = cityTextField.getText().trim();

                if (cityName.isEmpty()) {
                    // Show message if the text field is empty
                    JOptionPane.showMessageDialog(frame, "Please Enter city name", "Input Error", JOptionPane.WARNING_MESSAGE);
                } else {
                    // Add the city to the combo box and clear the text field
                    comboBoxModel.addElement(cityName);
                    cityTextField.setText(""); // Clear the text field
                    // Show confirmation message
                    JOptionPane.showMessageDialog(frame, "City added", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Add the components to the frame
        frame.add(new JLabel("Enter City:"));
        frame.add(cityTextField);
        frame.add(addButton);
        frame.add(new JLabel("Cities Added:"));
        frame.add(cityComboBox);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
