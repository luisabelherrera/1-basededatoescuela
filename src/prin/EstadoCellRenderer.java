/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prin;

/**
 *
 * @author abel
 */
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class EstadoCellRenderer extends DefaultTableCellRenderer {
      private static final Color COLOR_APROBADO = Color.GREEN;
    private static final Color COLOR_DESAPROBADO = Color.RED;
    private static final Color COLOR_ADMITIDO = Color.BLUE;
    private static final Color COLOR_NO_ADMITIDO = Color.ORANGE;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Aplicar el cambio de color si es la columna "Estado" (columna 6 o 7)
        if (column == 8) {
            String estado = (String) value;
            if ("aprobado".equals(estado)) {
                cellComponent.setBackground(COLOR_APROBADO);
            } else if ("Desaprobado".equals(estado)) {
                cellComponent.setBackground(COLOR_DESAPROBADO);
            } else {
                cellComponent.setBackground(table.getBackground());
            }
        } else if (column == 7) {
            String estado = (String) value;
            if ("Admitido".equals(estado)) {
                cellComponent.setBackground(COLOR_ADMITIDO);
            } else if ("No Admitido".equals(estado)) {
                cellComponent.setBackground(COLOR_NO_ADMITIDO);
            } else {
                cellComponent.setBackground(table.getBackground());
            }
        } else {
            cellComponent.setBackground(table.getBackground());
        }

        // Centrar el texto en todas las celdas
        setHorizontalAlignment(SwingConstants.CENTER);

        // Establecer el color del texto en negro para todas las celdas
        cellComponent.setForeground(Color.BLACK);

        return cellComponent;
    }
}