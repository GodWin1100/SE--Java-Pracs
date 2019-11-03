import java.awt.*;
import java.awt.Shape;
import java.awt.event.*;
import java.util.EventListener;

public class applet extends Frame implements EventListener
{
    private Label lbl;
    private TextField tf;
    private Button btn,btn2;
    private int count=0;

    public applet()
    {
        setLayout(new FlowLayout());
        lbl=new Label("Counter");
        add(lbl);

        tf=new TextField("0");
        tf.setEditable(false);
        add(tf);
        btn=new Button("Count");
        add(btn);
        btn.addActionListener(this::actionPerformed);
        btn2=new Button("Reset");
        add(btn2);
        btn2.addActionListener(this::actionPerformed);
        setTitle("Counter");
        setSize(300,100);
        setVisible(true);
    }

    public static void main(String args[])
    {
        applet a=new applet();
    }

    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getActionCommand().equals("Count"))
        {
            ++count;
            tf.setText(count+"");
        }
        if(evt.getActionCommand().equals("Reset"))
        {
            count=0;
            tf.setText(count+"");
        }
    }
}