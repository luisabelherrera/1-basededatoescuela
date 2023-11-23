package renderizador;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class EstadoCellRenderer1 extends DefaultTableCellRenderer {

    private static final Color COLOR_APROBADO = Color.GREEN;
    private static final Color COLOR_DESAPROBADO = Color.RED;
    private static final Color COLOR_ADMITIDO = Color.BLUE;
    private static final Color COLOR_NO_ADMITIDO = Color.ORANGE;
    private static final Color COLOR_ACTIVO = Color.GREEN;
    private static final Color COLOR_INACTIVO = Color.RED;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Centrar el texto en todas las celdas
        setHorizontalAlignment(SwingConstants.CENTER);

        // Establecer el color del texto en negro para todas las celdas
        cellComponent.setForeground(Color.BLACK);

        // Aplicar el cambio de color según la columna y el valor
        if (column == 8) {
            String estado = (String) value;
            if ("Activo".equals(estado)) {
                cellComponent.setBackground(COLOR_ACTIVO);
            } else if ("Inactivo".equals(estado)) {
                cellComponent.setBackground(COLOR_INACTIVO);
            } else {
                cellComponent.setBackground(table.getBackground());
            }
        } else {
            cellComponent.setBackground(table.getBackground());
        }

        return cellComponent;
    }
}
