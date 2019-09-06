package excise;

import java.awt.Graphics;  
import java.awt.event.MouseEvent;  
import java.awt.event.MouseListener;  
  
public class PanelListener implements MouseListener {  
  
    private int x1;  
    private int y1;  
    private int x2;  
    private int y2;  
    private boolean flag;// 用以标记在按下绘制多边形按钮的时候是不是绘制第一条边  
    private DrawFrame drawFrame;// 画板窗体类  
    private Graphics graphics;// 绘图区域的图形上下文  
  
    public PanelListener(DrawFrame drawFrame, Graphics graphics) {  
        this.drawFrame = drawFrame;  
        this.graphics = graphics;  
        this.flag = false;  
    }  
  
    @Override  
    public void mouseClicked(MouseEvent e) {  
        // TODO Auto-generated method stub  
        System.out.println("当鼠标单击事件源的时候响应的方法");  
    }  
  
    @Override  
    public void mouseEntered(MouseEvent e) {  
        // TODO Auto-generated method stub  
        System.out.println("当鼠标进入事件源的时候执行的方法");  
    }  
  
    @Override  
    public void mouseExited(MouseEvent e) {  
        // TODO Auto-generated method stub  
        System.out.println("当鼠标离开事件源的时候执行的方法");  
    }  
  
    @Override  
    public void mousePressed(MouseEvent e) {  
        // TODO Auto-generated method stub  
        System.out.println("当鼠标在事件源上按下的时候执行的方法");  
        if (drawFrame.getGraphName().equals("多边形") && !flag) {// 如果按下的是绘制多边形按钮  
            x1 = e.getX();  
            y1 = e.getY();  
            flag = true;  
        } else if (!drawFrame.getGraphName().equals("多边形")) {// 如果按下的不是绘制多边形按钮  
            x1 = e.getX();  
            y1 = e.getY();  
        }  
    }  
  
    @Override  
    public void mouseReleased(MouseEvent e) {  
        // TODO Auto-generated method stub  
        System.out.println("当鼠标在事件源上释放的时候执行的方法");  
        System.out.println(e.getX() + " " + e.getY());  
        x2 = e.getX();  
        y2 = e.getY();  
        String graphName = drawFrame.getGraphName();  
          
        if (graphName.equals("直线")) {  
            graphics.drawLine(x1, y1, x2, y2);  
            flag = false;  
        } else if (graphName.equals("空心矩形")) {  
            graphics.drawRect(x1, y1, x2 - x1, y2 - y1);  
            flag = false;  
        } else if (graphName.equals("空心椭圆")) {  
            graphics.drawOval(x1, y1, x2 - x1, y2 - y1);  
            flag = false;    
        } else if (graphName.equals("多边形")) {  
            graphics.drawLine(x1, y1, x2, y2);  
            x1 = x2;  
            y1 = y2;  
        } else if (graphName.equals("实心矩形")) {  
            graphics.fillRect(x1, y1, x2 - x1, y2 - y1);  
            flag = false;  
        } else if (graphName.equals("实心椭圆")) {  
            graphics.fillOval(x1, y1, x2 - x1, y2 - y1);  
            flag = false;  
        }  
    }  
  
}
