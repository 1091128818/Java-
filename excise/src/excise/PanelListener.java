package excise;

import java.awt.Graphics;  
import java.awt.event.MouseEvent;  
import java.awt.event.MouseListener;  
  
public class PanelListener implements MouseListener {  
  
    private int x1;  
    private int y1;  
    private int x2;  
    private int y2;  
    private boolean flag;// ���Ա���ڰ��»��ƶ���ΰ�ť��ʱ���ǲ��ǻ��Ƶ�һ����  
    private DrawFrame drawFrame;// ���崰����  
    private Graphics graphics;// ��ͼ�����ͼ��������  
  
    public PanelListener(DrawFrame drawFrame, Graphics graphics) {  
        this.drawFrame = drawFrame;  
        this.graphics = graphics;  
        this.flag = false;  
    }  
  
    @Override  
    public void mouseClicked(MouseEvent e) {  
        // TODO Auto-generated method stub  
        System.out.println("����굥���¼�Դ��ʱ����Ӧ�ķ���");  
    }  
  
    @Override  
    public void mouseEntered(MouseEvent e) {  
        // TODO Auto-generated method stub  
        System.out.println("���������¼�Դ��ʱ��ִ�еķ���");  
    }  
  
    @Override  
    public void mouseExited(MouseEvent e) {  
        // TODO Auto-generated method stub  
        System.out.println("������뿪�¼�Դ��ʱ��ִ�еķ���");  
    }  
  
    @Override  
    public void mousePressed(MouseEvent e) {  
        // TODO Auto-generated method stub  
        System.out.println("��������¼�Դ�ϰ��µ�ʱ��ִ�еķ���");  
        if (drawFrame.getGraphName().equals("�����") && !flag) {// ������µ��ǻ��ƶ���ΰ�ť  
            x1 = e.getX();  
            y1 = e.getY();  
            flag = true;  
        } else if (!drawFrame.getGraphName().equals("�����")) {// ������µĲ��ǻ��ƶ���ΰ�ť  
            x1 = e.getX();  
            y1 = e.getY();  
        }  
    }  
  
    @Override  
    public void mouseReleased(MouseEvent e) {  
        // TODO Auto-generated method stub  
        System.out.println("��������¼�Դ���ͷŵ�ʱ��ִ�еķ���");  
        System.out.println(e.getX() + " " + e.getY());  
        x2 = e.getX();  
        y2 = e.getY();  
        String graphName = drawFrame.getGraphName();  
          
        if (graphName.equals("ֱ��")) {  
            graphics.drawLine(x1, y1, x2, y2);  
            flag = false;  
        } else if (graphName.equals("���ľ���")) {  
            graphics.drawRect(x1, y1, x2 - x1, y2 - y1);  
            flag = false;  
        } else if (graphName.equals("������Բ")) {  
            graphics.drawOval(x1, y1, x2 - x1, y2 - y1);  
            flag = false;    
        } else if (graphName.equals("�����")) {  
            graphics.drawLine(x1, y1, x2, y2);  
            x1 = x2;  
            y1 = y2;  
        } else if (graphName.equals("ʵ�ľ���")) {  
            graphics.fillRect(x1, y1, x2 - x1, y2 - y1);  
            flag = false;  
        } else if (graphName.equals("ʵ����Բ")) {  
            graphics.fillOval(x1, y1, x2 - x1, y2 - y1);  
            flag = false;  
        }  
    }  
  
}
