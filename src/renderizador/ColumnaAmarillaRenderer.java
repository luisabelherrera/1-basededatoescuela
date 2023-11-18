package renderizador;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author abel
 */
public class ColumnaAmarillaRenderer extends DefaultTableCellRenderer {

    private int columnaAmarilla;

    public ColumnaAmarillaRenderer(int columnaAmarilla) {
        this.columnaAmarilla = columnaAmarilla;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (column == columnaAmarilla) {
            setAmarillaEstilo(cellComponent);
        } else {
            setEstiloPorDefecto(cellComponent, table.getBackground(), table.getForeground());
        }

        return cellComponent;
    }

    private void setAmarillaEstilo(Component cellComponent) {
        cellComponent.setBackground(Color.YELLOW);
        cellComponent.setForeground(Color.BLACK);
        setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void setEstiloPorDefecto(Component cellComponent, Color backgroundColor, Color foregroundColor) {
        cellComponent.setBackground(backgroundColor);
        cellComponent.setForeground(foregroundColor);
        setHorizontalAlignment(SwingConstants.LEFT);
    }
}
