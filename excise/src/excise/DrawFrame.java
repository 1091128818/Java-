package excise;

import java.awt.BorderLayout;  
import java.awt.Color;  
import java.awt.Dimension;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JPanel;  
  
/** 
 * 定义画板的窗体类，继承JFrame 
 *  
 * @author why 
 *  
 */  
public class DrawFrame extends JFrame {  
  
    private static final long serialVersionUID = 1L;  
    private String graphName = "直线";  
  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        DrawFrame drawFrame = new DrawFrame();  
        drawFrame.init();  
    }  
  
    public void init() {  
        // JFrame的默认布局方式是边框布局  
        // 设置窗体的标题  
        this.setTitle("我的画板");  
        // 设置窗体大小  
        this.setSize(new Dimension(800, 600));  
        // 设置窗体的默认显示位置，当前设置为水平和竖直居中显示  
        this.setLocationRelativeTo(null);  
        // 设置点击关闭的按钮的响应动作  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
        // 创建JPanel容器对象  
        JPanel drawPanel = new JPanel();  
        // 设置画图区域的背景色  
        drawPanel.setBackground(Color.WHITE);  
        // 添加画图的区域  
        this.add(drawPanel, BorderLayout.CENTER);  
        // 调用创建上面工具栏的按钮  
        createToolsPanel();  
  
        // 设置窗体可见  
        this.setVisible(true);  
        /** 
         * 给绘图区域添加鼠标的监听器。 
         * 这里注意要得到JPanel的Graphics对象必须要在设置窗体可见之后才能取得，否则得不到该对象出现空指针的异常 
         */  
        PanelListener panelListener = new PanelListener(this, drawPanel.getGraphics());  
        drawPanel.addMouseListener(panelListener);  
    }  
  
    private void createToolsPanel() {  
        JPanel toolsPanel = new JPanel();// JPanel的默认布局方式是流式布局  
        String[] array = { "直线", "空心矩形", "空心椭圆", "多边形","实心矩形", "实心椭圆" };  
        // 实例化一个按钮监听器对象  
        ButtonListener l = new ButtonListener();  
        for (int i = 0; i < array.length; i++) {  
            JButton btn = new JButton(array[i]);  
            // 给按钮添加监听器  
            btn.addActionListener(l);  
            // 向上面添加按钮组件  
            toolsPanel.add(btn);  
        }  
        // 将工具容器添加到JFrame中  
        this.add(toolsPanel, BorderLayout.NORTH);  
    }  
  
    private class ButtonListener implements ActionListener {  
  
        @Override  
        public void actionPerformed(ActionEvent e) {  
            graphName = e.getActionCommand();  
            System.out.println("按下的按钮是" + graphName);  
        }  
    }  
  
    public String getGraphName() {  
        return graphName;  
    }  
  
    public void setGraphName(String graphName) {  
        this.graphName = graphName;  
    }  
  
}  

  
