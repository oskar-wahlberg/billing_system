package system.billing.owg.id21;

import javax.swing.*;
import java.awt.*;

public class Graphics {

    private JPanel customerInfoPanel;
    private JPanel itemsPanel;
    private JPanel receiptPanel;

    public Graphics() {
        JFrame window;
        window = setupMainWindow();
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

        customerInfoPanel = setupCustomerInfoPanel();
        mainPanel.add(customerInfoPanel);

        itemsPanel = setupItemsPanel();
        mainPanel.add(itemsPanel);

        receiptPanel = setupReceiptPanel();
        mainPanel.add(receiptPanel);

        window.add(mainPanel);

        window.setVisible(true);
    }

    private JFrame setupMainWindow() {
        JFrame window;
        window = new JFrame("Billing System");
        window.setSize(1300, 800);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBackground(new Color(255, 255, 255));
        return window;
    }

    private JPanel setupCustomerInfoPanel() {

        // Set up panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setMaximumSize(new Dimension(300, Integer.MAX_VALUE));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Set up input boxes
        panel.add(Box.createRigidArea(new Dimension(300, 20)));
        JTextField name = new JTextField();
        name.setMaximumSize(new Dimension(200, 20));
        name.setAlignmentY(Component.CENTER_ALIGNMENT);
        name.setToolTipText("Name");
        panel.add(name);

        panel.add(Box.createRigidArea(new Dimension(300, 10)));
        JTextField phoneNumber = new JTextField();
        phoneNumber.setMaximumSize(new Dimension(200, 20));
        phoneNumber.setAlignmentY(Component.CENTER_ALIGNMENT);
        phoneNumber.setToolTipText("Phone Number");
        panel.add(phoneNumber);

        // Add buttons panel
        panel.add(Box.createRigidArea(new Dimension(300, 20)));
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(50, 50, 50));
        buttonPanel.setMaximumSize(new Dimension(300, 100));
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));

        JButton totalButton = new JButton();
        totalButton.setText("Total");
        totalButton.setMaximumSize(new Dimension(100, 50));

        JButton resetButton = new JButton();
        resetButton.setText("Reset");
        resetButton.setMaximumSize(new Dimension(100, 50));

        buttonPanel.add(Box.createRigidArea(new Dimension(40, 100)));
        buttonPanel.add(totalButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(20, 100)));
        buttonPanel.add(resetButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(40, 100)));

        panel.add(buttonPanel);
        return panel;
    }

    private JPanel setupItemsPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(100, 100, 100));
        panel.setMaximumSize(new Dimension(550, Integer.MAX_VALUE));
        return panel;
    }

    private JPanel setupReceiptPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(200, 200, 200));
        panel.setMaximumSize(new Dimension(450, Integer.MAX_VALUE));
        return panel;
    }
}
