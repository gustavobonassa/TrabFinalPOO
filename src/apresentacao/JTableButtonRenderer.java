package apresentacao;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class JTableButtonRenderer extends AbstractCellEditor implements TableCellRenderer, TableCellEditor, ActionListener
	{
	JTable table;
	JButton renderButton;
	JButton editButton;
	String text;	
	public JTableButtonRenderer(JTable table, int column,String nomeButton)
    {
        super();
        this.table = table;
        renderButton = new JButton(nomeButton);

        editButton = new JButton(nomeButton);
        editButton.setFocusPainted( false );
        editButton.addActionListener( (ActionListener) this );

        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(column).setCellRenderer( this );
        columnModel.getColumn(column).setCellEditor( this );
    }

    public Component getTableCellRendererComponent(
        JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        if (hasFocus)
        {
            renderButton.setForeground(table.getForeground());
            renderButton.setBackground(UIManager.getColor("Button.background"));
        }
        else if (isSelected)
        {
            renderButton.setForeground(table.getSelectionForeground());
             renderButton.setBackground(table.getSelectionBackground());
        }
        else
        {
            renderButton.setForeground(table.getForeground());
            renderButton.setBackground(UIManager.getColor("Button.background"));
        }

        return renderButton;
    }

    public Component getTableCellEditorComponent(
        JTable table, Object value, boolean isSelected, int row, int column)
    {
        text = (value == null) ? "" : value.toString();
        editButton.setText( text );
        return editButton;
    }

    public Object getCellEditorValue()
    {
        return text;
    }

    public void actionPerformed(ActionEvent e)//executa a funcao de cada botao da tabela
    {
        fireEditingStopped();
        int idUser = (int) table.getModel().getValueAt(table.getSelectedRow(), 0);
        String nomeUser = (String) table.getModel().getValueAt(table.getSelectedRow(), 2);
        VisualisarBensEDependentes vs = new VisualisarBensEDependentes(idUser, nomeUser);
        vs.setVisible(true);
        //JOptionPane.showMessageDialog(null, "Nome : " + table.getModel().getValueAt(table.getSelectedRow(), 2));
    }
}