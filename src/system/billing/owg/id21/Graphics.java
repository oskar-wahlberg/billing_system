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

    protected JFrame setupMainWindow() {
        JFrame window;
        window = new JFrame("Billing System");
        window.setSize(1300, 800);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBackground(new Color(255, 255, 255));
        return window;
    }

    protected JPanel setupCustomerInfoPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setMaximumSize(new Dimension(300, Integer.MAX_VALUE));
        return panel;
    }

    protected JPanel setupItemsPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(100, 100, 100));
        panel.setMaximumSize(new Dimension(550, Integer.MAX_VALUE));
        return panel;
    }

    protected JPanel setupReceiptPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(200, 200, 200));
        panel.setMaximumSize(new Dimension(450, Integer.MAX_VALUE));
        return panel;
    }
}
