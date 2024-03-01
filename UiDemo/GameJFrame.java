package UiDemo;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        this.setSize(920, 680);
        //this.setLocation(500, 200);
        this.setLocationRelativeTo(null);
        this.setTitle("GAMETITLE");
        // 界面置顶
        // this.setAlwaysOnTop(true);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);





        // 建议写在最后
        this.setVisible(true);
    }
    
}
