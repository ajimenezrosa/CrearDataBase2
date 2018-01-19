package next.com.creardatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Next University.
 */
public class DataBase extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "nextuDB";

    protected static final String TABLA_NOMBRE = "nextu";

    private static final String ID = "id";
    private static final String TEXTO = "texto";

    private static final String sentencia = "CREATE TABLE "
            + TABLA_NOMBRE + " (" + ID + " INT PRIMARY KEY, "
            +TEXTO + " TEXT" + ")";

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sentencia);
    }

    public DataBase(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
