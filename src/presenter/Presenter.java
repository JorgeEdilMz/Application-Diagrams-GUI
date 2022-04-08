package presenter;

import models.Data;
import view.View;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter implements ActionListener {

    View view;
    Data data;

    public Presenter() {
        data = new Data();
        view = new View(this);
        aggregateData();
    }

    public void aggregateData(){
        DefaultTableModel dtm = new DefaultTableModel(data.getData(),data.getHeaders());
        view.getTablePanel().fillData(dtm);
        view.getDiagramPanel().getBarPanel().setData(data.maxValor(),data.getHeaders(),data.sumColumns(),data.size());
        view.getDiagramPanel().getPiePanel().setData(data.maxValor(),data.getHeaders(),data.sumColumns(),data.size(),data.sumTotalColumns());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view.getSelectionPanel().getBtnBar())
            view.getDiagramPanel().showPanelBar();
        if(e.getSource() == view.getSelectionPanel().getBtnPie())
            view.getDiagramPanel().showPanelPie();
    }
}
