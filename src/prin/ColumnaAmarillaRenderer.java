/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prin;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class ColumnaAmarillaRenderer extends DefaultTableCellRenderer {
    private static final Color COLOR_AMARILLO = Color.YELLOW;
    private static final Color COLOR_TEXTO_OSCURO = Color.BLACK;

    private int columnaAmarilla;

    public ColumnaAmarillaRenderer(int columnaAmarilla) {
        this.columnaAmarilla = columnaAmarilla;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (column == columnaAmarilla) {
            cellComponent.setBackground(COLOR_AMARILLO);
            cellComponent.setForeground(COLOR_TEXTO_OSCURO);
            setHorizontalAlignment(SwingConstants.CENTER);
        } else {
            cellComponent.setBackground(table.getBackground());
            cellComponent.setForeground(table.getForeground());
            setHorizontalAlignment(SwingConstants.LEFT);
        }

        return cellComponent;
    }
}