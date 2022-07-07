package edu.lab10.lab10;

import edu.lab10.CDokument;
import edu.lab10.shapes.CPolyProsto;
import edu.lab10.shapes.CPolyRTriangle;
import edu.lab10.shapes.CShapeCircle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class CMainForm extends javax.swing.JFrame{
    private JPanel mainPanel;
    private JPanel graphicArea;

    public CDokument document;

    public CMainForm(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        document = new CDokument((CGraphicArea)graphicArea);
        document.addShape( new CShapeCircle(200,200,Color.LIGHT_GRAY, Color.BLACK, 70));
        document.addShape(new CShapeCircle(600,300, Color.YELLOW, Color.BLUE, 90));
        document.redraw();

        document.addShape(new CPolyRTriangle(500, 600, Color.yellow,Color.BLUE, 200 ,150 ));
        document.addShape(new CPolyRTriangle(800, 400, Color.gray,Color.DARK_GRAY, 250 ,100 ));
        document.addShape(new CPolyProsto(200, 200, Color.gray,Color.DARK_GRAY, 120 ,100 , 20));
        document.redraw();

        graphicArea.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                super.mousePressed(mouseEvent);
                graphicAreaMousePressed(mouseEvent);
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                super.mouseReleased(mouseEvent);
                graphicAreaMouseReleased();
            }
        });

        graphicArea.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent e){
                super.mouseDragged(e);
                graphicAreaMouseDragged(e);
            }
        });
    }




    private void createUIComponents() {
       graphicArea = new CGraphicArea();
    }

    private void graphicAreaMousePressed(MouseEvent evt){
        if(evt.getButton() == MouseEvent.BUTTON1){
            if(document.selectShape(evt.getX(), evt.getY()));{
                document.redraw();
            }
        }
    }

    private void graphicAreaMouseReleased(){
        document.deselectShape();
        document.redraw();
    }

    private void graphicAreaMouseDragged(MouseEvent evt){
        document.moveSelectedTo(evt.getX(), evt.getY());
        long time = document.redraw();
        if(time > 0){
            setTitle(String.format("Kształtowniki, czas rysowania %d ms", time));
        }
    }
}
