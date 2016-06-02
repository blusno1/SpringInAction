package blusno.SpringInActionFour.knights;

import java.io.PrintStream;

/**
 * Created by root on 16-6-1.
 */
public class SlayDragonQuest implements Quest{

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("屠龙任务！");
    }
}