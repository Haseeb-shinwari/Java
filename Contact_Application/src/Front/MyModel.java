
package Front;
 
import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

public abstract class MyModel extends AbstractTableModel {
  private String [] columns;
  private Object[][] rows;
  public MyModel(){}

  
    public MyModel(Object[][] date , String [] columnsName){
      this.columns=columnsName;
      this.rows=date;
  }
  @Override
 public Class getColumnClass(int col){
     
          return getValueAt(0,col).getClass();
      
      
  }
    
    
    @Override
    public int getRowCount(){
            return this.rows.length;
    }

    @Override
    public int getColumnCount() {
     return this.columns.length;
     
    }
   
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        return this.rows[rowIndex] [columnIndex];
    }
  @Override
    public String getColumnName(int col){
        return this.columns[col];
        
    }

}
