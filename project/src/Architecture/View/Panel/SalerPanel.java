package Architecture.View.Panel;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 销售员面板
 */
public class SalerPanel extends BasePanel {
    public SalerPanel() {
        panelName = "销售员界面";
        commandList = new ArrayList<>(Arrays.asList("查询"));
    }

    @SuppressWarnings("unused")
    private void Command1() {

    }
}
