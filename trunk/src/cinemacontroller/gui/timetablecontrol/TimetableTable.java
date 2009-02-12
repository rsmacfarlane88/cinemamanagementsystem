/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cinemacontroller.gui.timetablecontrol;

import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class TimetableTable extends JTable {
  public TimetableItemCellSizer map;
  public TimetableTable(TimetableItemCellSizer cmp, TableModel tbl) {
    super(tbl);
    map = cmp;
    setUI(new TimetableCellPainter());
  }
  public Rectangle getCellRect(int row, int column, boolean includeSpacing){
    // required because getCellRect is used in JTable constructor
    if (map==null) return super.getCellRect(row,column, includeSpacing);
   // add widths of all spanned logical cells
    int sk=map.visibleCell(row,column);
    Rectangle r1=super.getCellRect(row,sk,includeSpacing);
    if (map.span(row,sk)!=1)
    for (int i=1; i<map.span(row,sk); i++){
        r1.width+=getColumnModel().getColumn(sk+i).getWidth();
      }
    return r1;
  }
  public int columnAtPoint(Point p) {
    int x=super.columnAtPoint(p);
    // -1 is returned by columnAtPoint if the point is not in the table
    if (x<0) return x;
    int y=super.rowAtPoint(p);
    return map.visibleCell(y,x);
  }
}