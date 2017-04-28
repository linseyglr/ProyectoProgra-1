/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.model;



import java.util.List;
import javax.swing.table.AbstractTableModel;


public class EscañoTableModel extends AbstractTableModel{
    
    List<Escaño> rows;
    List<Integer> cols;

    public  EscañoTableModel(List<Integer> cols, List<Escaño> rows){
        this.cols=cols;
        this.rows=rows;
        initColNames();
    }

    public int getColumnCount() {
        return cols.size();
    }

    public String getColumnName(int col){
        return colNames[cols.get(col)];
    }   
    
    public int getRowCount() {
        return rows.size();
    }

    public Object getValueAt(int row, int col) {
        if(rows.size()==0){
            return "Votos";
        }
        //Escaño c1 = rows.get(row);
      //  switch (cols[col]){
//            case CODIGO: return c1.getIdAbonos();
//            case APARTADO: return c1.getApartado();
//            case VENDEDOR: return c1.getU().getNombre();
//            case REALIZADO: return c1.getFechaRealizado();
//            case MONTO: return c1.getMonto();
//            case SALDO: return c1.getSaldo();
//            default: return "";
       // }
       return null;
    }
    
    public Escaño getRowAt(int row) {
        return rows.get(row);
    }
    
    public static final int CODIGO=0;
    public static final int APARTADO=1;
    public static final int VENDEDOR=2;
    public static final int REALIZADO=3;
    public static final int MONTO=4;
    public static final int SALDO=5;
    
    
    String[] colNames = new String[20];
    private void initColNames() {
        char k = '@';
        for (int i = 0; i <= cols.size(); i++) {
            if (i != 0) {
                k = (char) (k + 1);
                colNames[i] = "Partido " + k;
            }
        }

//        colNames[CODIGO]= "CODIGO";
//        colNames[APARTADO]= "APARTADO";
//        colNames[VENDEDOR]= "VENDEDOR";
//        colNames[REALIZADO]="REALIZADO";
//        colNames[MONTO]="MONTO";
//        colNames[SALDO]="SALDO";
    }
}
