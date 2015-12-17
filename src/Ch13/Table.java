package Ch13;
//:Table.java
//Simple demonstration of JTable
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
//The TableModel controls all the data:
class DataModel extends AbstractTableModel{
	Object[][] data = {
			{"one", "two", "three", "four"},
			{"five", "six", "seven", "eight"},
			{"nine", "ten", "eleven", "twelve"}
	};
	//Prints data when table changes:
	class TML implements TableModelListener{
		public void tableChanged(TableModelEvent e){
			for(int i = 0; i < data.length; i++){
				for(int j = 0; j < data[0].length; j++){
					System.out.println(data[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	DataModel(){
		addTableModelListener(new TML());
	}
	@Override
	public int getRowCount() {
		// TODO 自动生成的方法存根
		return data.length;
	}
	@Override
	public int getColumnCount() {
		// TODO 自动生成的方法存根
		return data[0].length;
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO 自动生成的方法存根
		return data[rowIndex][columnIndex];
	}
	public void setValueAt(Object val, int row, int col){
		data[row][col] = val;
		//Indicate the change has happened:
		fireTableDataChanged();
	}
	public boolean isCellEditable(int row, int col){
		return true;
	}
}
public class Table extends JPanel{
	public Table(){
		setLayout(new BorderLayout());
		JTable table = new JTable(new DataModel());
		JScrollPane scrollpane = JTable.createScrollPaneForTable(table);
		add(scrollpane, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Show.inFrame(new Table(), 200, 200);
	}

}
