import org.qtjambi.qt.*;
import org.qtjambi.qt.core.*;
import org.qtjambi.qt.gui.*;
import org.qtjambi.qt.xml.*;
import org.qtjambi.qt.network.*;
import org.qtjambi.qt.sql.*;
import org.qtjambi.qt.svg.*;


public class src_sql_kernel_qsqlerror {
    public static void main(String args[]) {
        QApplication.initialize(args);
//! [0]
    QSqlQueryModel model = new QSqlQueryModel();
    model.setQuery("select * from myTable");
    if (model.lastError().isValid())
        System.out.println(model.lastError());
//! [0]


    }
}
