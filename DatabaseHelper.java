package carrira.elan.englishslanglist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "slenglist.db"; // название бд
    private static final int DATABASE_VERSION = 23; // версия базы данных
    public static final String TABLE = "sleng"; // название таблицы в бд

    //назви стовбців
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_EXPLAIN = "expl";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE + "(" + COLUMN_ID + " integer primary key, " + COLUMN_NAME + " text, " + COLUMN_EXPLAIN + " text" + ")");

        // добавление начальных данных
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Idn', 'I don’t know');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Btw' , 'By the way');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Icymi', 'In case you miss it');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('WYD' , 'What are you doing');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('What’s up?', 'Hey what are you doing?');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('I get it', 'I get it now! Thank you for explaining that');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Same here', 'I agree');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('You bet', 'Certainly you’re welcome');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('W8', 'Wait');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Cock-up', 'Screw up');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Rubbish', 'Garbage or that’s crap');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Blimey', 'My goodness');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Gutted', 'Devastated');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Chuffed', 'Proud');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Lost the plot', 'Gone crazy');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Sorted', 'Arranged');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Hoover', 'Vacuum');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Kip', 'Sleep or nap');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Bee’s knees', 'Awesome');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Dodgy', 'Suspicious');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Wonky', 'Not right');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Tad', 'A little bit');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Nicked', 'Stolen');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Nutter', 'Crazy person');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Knackered', 'Tired');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Gobsmacked', 'Amazed');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Dog’s bollocks', 'Awesome');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Chap', 'Male or friend');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Bob’s your uncle', 'You have it made');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Absobloodylutely', 'Yes indeed!');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Nosh', 'Food');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Shambles', 'Mess');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Arse over tit', 'Fall over');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Dog’s dinner', 'A mess');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Bangers', 'Sausage');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Chips', 'French fries');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Starkers', 'Naked');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Plastered', 'Intoxicated');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Chav', 'White trash');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Stag night', 'Bachelor party');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Ace', 'Cool');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Plonker', 'Idiot');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Blighty', 'Britain');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Give you a bell', 'Call you');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Tenner', 'A ten-pound note');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Fiver', 'A five-pound note');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Toff', 'Upper class person');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Quid', 'One pound sterling');");
        //db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('', '');");

        //db.execSQL("SELECT * FROM "+TABLE+" ORDER BY "+COLUMN_NAME+" ASC;");
    }

    //оновлення БД
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,  int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(db);
    }
}

