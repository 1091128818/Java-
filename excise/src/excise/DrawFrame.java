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
 * ���廭��Ĵ����࣬�̳�JFrame 
 *  
 * @author why 
 *  
 */  
public class DrawFrame extends JFrame {  
  
    private static final long serialVersionUID = 1L;  
    private String graphName = "ֱ��";  
  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        DrawFrame drawFrame = new DrawFrame();  
        drawFrame.init();  
    }  
  
    public void init() {  
        // JFrame��Ĭ�ϲ��ַ�ʽ�Ǳ߿򲼾�  
        // ���ô���ı���  
        this.setTitle("�ҵĻ���");  
        // ���ô����С  
        this.setSize(new Dimension(800, 600));  
        // ���ô����Ĭ����ʾλ�ã���ǰ����Ϊˮƽ����ֱ������ʾ  
        this.setLocationRelativeTo(null);  
        // ���õ���رյİ�ť����Ӧ����  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
        // ����JPanel��������  
        JPanel drawPanel = new JPanel();  
        // ���û�ͼ����ı���ɫ  
        drawPanel.setBackground(Color.WHITE);  
        // ��ӻ�ͼ������  
        this.add(drawPanel, BorderLayout.CENTER);  
        // ���ô������湤�����İ�ť  
        createToolsPanel();  
  
        // ���ô���ɼ�  
        this.setVisible(true);  
        /** 
         * ����ͼ����������ļ������� 
         * ����ע��Ҫ�õ�JPanel��Graphics�������Ҫ�����ô���ɼ�֮�����ȡ�ã�����ò����ö�����ֿ�ָ����쳣 
         */  
        PanelListener panelListener = new PanelListener(this, drawPanel.getGraphics());  
        drawPanel.addMouseListener(panelListener);  
    }  
  
    private void createToolsPanel() {  
        JPanel toolsPanel = new JPanel();// JPanel��Ĭ�ϲ��ַ�ʽ����ʽ����  
        String[] array = { "ֱ��", "���ľ���", "������Բ", "�����","ʵ�ľ���", "ʵ����Բ" };  
        // ʵ����һ����ť����������  
        ButtonListener l = new ButtonListener();  
        for (int i = 0; i < array.length; i++) {  
            JButton btn = new JButton(array[i]);  
            // ����ť��Ӽ�����  
            btn.addActionListener(l);  
            // ��������Ӱ�ť���  
            toolsPanel.add(btn);  
        }  
        // ������������ӵ�JFrame��  
        this.add(toolsPanel, BorderLayout.NORTH);  
    }  
  
    private class ButtonListener implements ActionListener {  
  
        @Override  
        public void actionPerformed(ActionEvent e) {  
            graphName = e.getActionCommand();  
            System.out.println("���µİ�ť��" + graphName);  
        }  
    }  
  
    public String getGraphName() {  
        return graphName;  
    }  
  
    public void setGraphName(String graphName) {  
        this.graphName = graphName;  
    }  
  
}  

  
