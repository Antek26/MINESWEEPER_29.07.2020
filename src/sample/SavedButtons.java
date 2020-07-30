package sample;


import javafx.scene.control.Button;

public class SavedButtons {


    private static GridButton button5x5;
    private static Button button10x10;
    private static Button button20x20;


    public static GridButton getButton5x5() {
        return button5x5;
    }

    public static void setButton5x5(GridButton buttonRightClick) {
        button5x5 = buttonRightClick;
    }

    public static Button getButton10x10() {
        return button10x10;
    }

    public static void setButton10x10(Button buttonRightClick) {
        button10x10 = buttonRightClick;
    }

    public static Button getButton20x20() {
        return button20x20;
    }

    public static void setButton20x20(Button buttonRightClick) {
        button20x20 = buttonRightClick;
    }
}
