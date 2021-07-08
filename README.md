# CalculateInterest

⦁	Write a program that computes interest payments in one of three forms: simple interest, interest compounded monthly, and interest compounded continuously, using tabbed panes (class JTabbedPane).

 

You will need one JPanel for each tabbed pane. Use GridLayout in each panel. You do NOT have to guard against user input errors. The button at the bottom should be named appropriately in each panel. Write the output to a file specified by the user using the PrintWriter class to open the output file, and use the format() method of this class to format the output (neatly). After writing the file sure to close the file and then exit the program: that is, the program only does one interest computation each time it is invoked; as a consequence, the main routine does not have to be in a separate class file.
Unfortunately, you are going to need to do a lot of cutting and pasting, as each panel has the same labels and the same text fields (although each has different buttons). Apparently, the Java compiler will not let you use the same labels and text fields in all 3 panels: they must be named differently (otherwise they will only appear in the pane to which they were last added).
The interest formulas for each computation, where A is the accumulation, P is the principal, r is the interest rate (divided by 100.0!), and y is the years are as follows:
⦁	Simple interest: A = P * (1 + r)y
⦁	Compounded monthly: A = P * (1 + r/12.0)y*12.0
⦁	Compounded continuously: A = P * ey*r
Use the static Math.exp() method for the last computation. Here are some sample output files using each pane (note that year 0 always contains the initial investment!):

    Simple Interest
    Principal:   10000.00
    Interest Rate: 0.0250
    Years: 10
        0   10000.00
        1   10250.00
        2   10506.25
        3   10768.91
        4   11038.13
        5   11314.08
        6   11596.93
        7   11886.86
        8   12184.03
        9   12488.63
     10  12800.85

    Interest Compounded Monthly
    Principal:   10000.00
    Interest Rate: 0.0250
    Years: 10
        0   10000.00
        1   10252.88
        2   10512.16
        3   10778.00
        4   11050.56
        5   11330.01
        6   11616.53
        7   11910.29
        8   12211.49
        9   12520.30
     10  12836.92

    Interest Compounded Continuously
    Principal:   10000.00
    Interest Rate: 0.0250
    Years: 10
        0   10000.00
        1   10253.15
        2   10512.71
        3   10778.84
        4   11051.71
        5   11331.48
        6   11618.34
        7   11912.46
        8   12214.03
        9   12523.23
     10  12840.25
