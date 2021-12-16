package ua.kpi.pbf;


import java.util.Scanner;

public class Controller {

    //Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The work method
    void processUser() {
        Scanner scan = new Scanner(System.in);
        model.setString(scan.next());

        view.printMessage(model.getString());
    }
}
