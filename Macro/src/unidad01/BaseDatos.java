package unidad01;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDatos {

    private String driver = "oracle.jdbc.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:EGCC";
    private String user = "banco";
    private String password = "banco";

    private Connection cn = null;

    public BaseDatos() throws Exception {
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            cn = null;
            throw e;
        }//Constructor
    }

    private boolean liberar = true;

    //Metodo para lliberar recursos
    public void dispose() {
        try {
            if(!cn.isClosed()) cn.close();
            cn=null;
        } catch (Exception e) {
            
        }
        liberar = false;
    }//dispose

    //Destructor

    protected void finalize() throws Throwable {
        if (liberar == false) {
            return;
        }
        try {
            this.dispose();
        } catch (Exception e) {
        } finally {
            super.finalize();
        }
    }
}//BaseDatos
