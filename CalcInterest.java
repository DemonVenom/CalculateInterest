
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CalcInterest {


    // Simple

    private JLabel simpleLabel;
    private JLabel simpleLabel2;
    private JLabel simpleLabel3;
    private JLabel simpleLabel4;

    private JTextField simplePrincipal;
    private JTextField simpleAnnualRate;
    private JTextField simpleYears;
    private JTextField simpleOutputFile;

    // Compound


    private JLabel compoundLabel;
    private JLabel compoundLabel2;
    private JLabel compoundLabel3;
    private JLabel compoundLabel4;

    private JTextField compoundPrincipal;
    private JTextField compoundAnnualRate;
    private JTextField compoundYears;
    private JTextField compoundOutputFile;

    // Continuous

    private JLabel continuousLabel;
    private JLabel continuousLabel2;
    private JLabel continuousLabel3;
    private JLabel continuousLabel4;

    private JTextField continuousPrincipal;
    private JTextField continuousAnnualRate;
    private JTextField continuousYears;
    private JTextField continuousOutputFile;

    // Other

    private JButton simpleInterest;
    private JButton compoundInterest;
    private JButton continuousInterest;

    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;




    public CalcInterest() {


        JFrame frame = new JFrame("Interest Computer");
        JTabbedPane tabbedPane = new JTabbedPane();

        createPanel1();
        createPanel2();
        createPanel3();

        tabbedPane.addTab("Simple", panel1);
        tabbedPane.addTab("Compound ", panel2);
        tabbedPane.addTab("Continuous", panel3);

        frame.add(tabbedPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550,350);
        frame.setVisible(true);


    }

    private void createPanel1() {

        // Create a new label, prompting the user to input the student name
        simpleLabel = new JLabel("Principal $");

        // Create a new text field, measured at 10 characters long to input name
        simplePrincipal = new JTextField(10);

        // Create a new label, prompting the user to input student id
        simpleLabel2 = new JLabel("Annual % Rate");

        // Create a new text field, measured at 10 characters long to input id
        simpleAnnualRate = new JTextField(10);

        // Create a new label, prompting the user to input student id
        simpleLabel3 = new JLabel("Years");

        // Create a new text field, measured at 10 characters long to input id
        simpleYears = new JTextField(10);

        // Create a new label, prompting the user to input student id
        simpleLabel4 = new JLabel("Output File");

        // Create a new text field, measured at 10 characters long to input id
        simpleOutputFile = new JTextField(10);

        // Create a new button, allows user to start exit program
        simpleInterest = new JButton("Compute Simple Interest");
        // Create a new action listener, allows program to exit the program
        simpleInterest.addActionListener(new SimpleHandler());



        // Create a new panel, using the panel reference
        panel1 = new JPanel();

        panel1.setLayout(new GridLayout(5, 2));


        // Add 4 labels, 4 text fields, and one button
        panel1.add(simpleLabel);
        panel1.add(simplePrincipal);
        panel1.add(simpleLabel2);
        panel1.add(simpleAnnualRate);
        panel1.add(simpleLabel3);
        panel1.add(simpleYears);
        panel1.add(simpleLabel4);
        panel1.add(simpleOutputFile);
        panel1.add(simpleInterest);
    }


    private void createPanel2() {


        // Create a new label, prompting the user to input the student name
        compoundLabel = new JLabel("Principal $");

        // Create a new text field, measured at 10 characters long to input name
        compoundPrincipal = new JTextField(10);

        // Create a new label, prompting the user to input student id
        compoundLabel2 = new JLabel("Annual % Rate");

        // Create a new text field, measured at 10 characters long to input id
        compoundAnnualRate = new JTextField(10);

        // Create a new label, prompting the user to input student id
        compoundLabel3 = new JLabel("Years");

        // Create a new text field, measured at 10 characters long to input id
        compoundYears = new JTextField(10);

        // Create a new label, prompting the user to input student id
        compoundLabel4 = new JLabel("Output File");

        // Create a new text field, measured at 10 characters long to input id
        compoundOutputFile = new JTextField(10);

        // Create a new button, allows user to start exit program
        compoundInterest = new JButton("Compute Compound Interest");
        // Create a new action listener, allows program to exit the program
        compoundInterest.addActionListener(new CompoundHandler());



        // Create a new panel, using the panel reference
        panel2 = new JPanel();

        panel2.setLayout(new GridLayout(5, 2));


        // Add 4 labels, 4 text fields, and one button
        panel2.add(compoundLabel);
        panel2.add(compoundPrincipal);
        panel2.add(compoundLabel2);
        panel2.add(compoundAnnualRate);
        panel2.add(compoundLabel3);
        panel2.add(compoundYears);
        panel2.add(compoundLabel4);
        panel2.add(compoundOutputFile);
        panel2.add(compoundInterest);
    }


    private void createPanel3() {


        // Create a new label, prompting the user to input the student name
        continuousLabel = new JLabel("Principal $");

        // Create a new text field, measured at 10 characters long to input name
        continuousPrincipal = new JTextField(10);

        // Create a new label, prompting the user to input student id
        continuousLabel2 = new JLabel("Annual % Rate");

        // Create a new text field, measured at 10 characters long to input id
        continuousAnnualRate = new JTextField(10);

        // Create a new label, prompting the user to input student id
        continuousLabel3 = new JLabel("Years");

        // Create a new text field, measured at 10 characters long to input id
        continuousYears = new JTextField(10);

        // Create a new label, prompting the user to input student id
        continuousLabel4 = new JLabel("Output File");

        // Create a new text field, measured at 10 characters long to input id
        continuousOutputFile = new JTextField(10);

        // Create a new button, allows user to start exit program
        continuousInterest = new JButton("Compute Continuous Interest");
        // Create a new action listener, allows program to exit the program
        continuousInterest.addActionListener(new ContinuousHandler());



        // Create a new panel, using the panel reference
        panel3 = new JPanel();

        panel3.setLayout(new GridLayout(5, 2));


        // Add 4 labels, 4 text fields, and one button
        panel3.add(continuousLabel);
        panel3.add(continuousPrincipal);
        panel3.add(continuousLabel2);
        panel3.add(continuousAnnualRate);
        panel3.add(continuousLabel3);
        panel3.add(continuousYears);
        panel3.add(continuousLabel4);
        panel3.add(continuousOutputFile);
        panel3.add(continuousInterest);
    }


    // Create class to handle conversion from kilo to miles

    private class SimpleHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {


            double simplePrincipal = Double.parseDouble(CalcInterest.this.simplePrincipal.getText());
            double simpleRate = Double.parseDouble(simpleAnnualRate.getText()) / 100.0;
            double simpleYear = Double.parseDouble(simpleYears.getText());


            double simpleInterest = 0;


            // Place id textbox information into .txt file name string variable
            String file = String.format("%s", simpleOutputFile.getText());


            String outputString = "";


            try {

                // Create the PrintWriter object...
                PrintWriter output = new PrintWriter(file);

                output.format("Simple Interest\nPrincipal: %.2f\nInterest Rate: %.6f\nYears: %.0f",
                        simplePrincipal, simpleRate, simpleYear);


                for (int i = 0; i <= simpleYear; i++) {

                    simpleInterest = simplePrincipal * (Math.pow((1.0 + simpleRate), i));

                    output.format("\n%6d%15.2f", i, simpleInterest);
                }

                // Close the formatter
                output.close();

            }
            // When the user-inputted file cannot be found...
            catch (FileNotFoundException fileNotFoundException) {
                // ...report to the user the error
                System.out.println("Error: Could not find/create file");
            }

        }
    }






    private class CompoundHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {


            double compoundPrincipal = Double.parseDouble(CalcInterest.this.compoundPrincipal.getText());
            double compoundRate = Double.parseDouble(compoundAnnualRate.getText()) / 100.0;
            double compoundYear = Double.parseDouble(compoundYears.getText());


            double compoundInterest = 0;


            // Place id textbox information into .txt file name string variable
            String file = String.format("%s", compoundOutputFile.getText());


            String outputString = "";


            try {

                // Create the PrintWriter object...
                PrintWriter output = new PrintWriter(file);

                output.format("Interest Compounded Monthly\nPrincipal: %.2f\nInterest Rate: %.6f\nYears: %.0f",
                        compoundPrincipal, compoundRate, compoundYear);

                for (int i = 0; i <= compoundYear; i++) {

                    compoundInterest = compoundPrincipal * (Math.pow((1.0 + (compoundRate / 12.0)), (i * 12.0)));

                    output.format("\n%6d%15.2f", i, compoundInterest);
                }

                // Close the formatter
                output.close();

            }
            // When the user-inputted file cannot be found...
            catch (FileNotFoundException fileNotFoundException) {
                // ...report to the user the error
                System.out.println("Error: Could not find/create file");
            }

        }
    }







    private class ContinuousHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {


            double continuousPrincipal = Double.parseDouble(CalcInterest.this.continuousPrincipal.getText());
            double continuousRate = Double.parseDouble(continuousAnnualRate.getText()) / 100.0;
            double continuousYear = Double.parseDouble(continuousYears.getText());


            double continuousInterest = 0;


            // Place id textbox information into .txt file name string variable
            String file = String.format("%s", continuousOutputFile.getText());


            String outputString = "";


            try {

                // Create the PrintWriter object...
                PrintWriter output = new PrintWriter(file);

                output.format("Interest Compounded Continuously\nPrincipal: %.2f\nInterest Rate: %.6f\nYears: %.0f",
                        continuousPrincipal, continuousRate, continuousYear);

                for (int i = 0; i <= continuousYear; i++) {

                    continuousInterest = continuousPrincipal * (Math.exp(i * continuousRate));

                    output.format("\n%6d%15.2f", i, continuousInterest);
                }

                // Close the formatter
                output.close();

            }
            // When the user-inputted file cannot be found...
            catch (FileNotFoundException fileNotFoundException) {
                // ...report to the user the error
                System.out.println("Error: Could not find/create file");
            }

        }
    }









}
