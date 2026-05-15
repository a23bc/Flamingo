package I3;

import B5.u;
import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable {

    /* JADX INFO: renamed from: q */
    public static final String[] f3472q = new String[0];

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f3473o;

    /* JADX INFO: renamed from: p */
    public final SQLiteClosable f3474p;

    public /* synthetic */ b(SQLiteClosable sQLiteClosable, int i7) {
        this.f3473o = i7;
        this.f3474p = sQLiteClosable;
    }

    public void b() {
        ((SQLiteDatabase) this.f3474p).beginTransaction();
    }

    public void c(int i7, byte[] bArr) {
        ((SQLiteProgram) this.f3474p).bindBlob(i7, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3473o) {
            case 0:
                ((SQLiteDatabase) this.f3474p).close();
                break;
            default:
                ((SQLiteProgram) this.f3474p).close();
                break;
        }
    }

    public void d(long j3, int i7) {
        ((SQLiteProgram) this.f3474p).bindLong(i7, j3);
    }

    public void g(int i7) {
        ((SQLiteProgram) this.f3474p).bindNull(i7);
    }

    public void h(int i7, String str) {
        ((SQLiteProgram) this.f3474p).bindString(i7, str);
    }

    public void i() {
        ((SQLiteDatabase) this.f3474p).endTransaction();
    }

    public void j(String str) {
        ((SQLiteDatabase) this.f3474p).execSQL(str);
    }

    public Cursor n(H3.c cVar) {
        return ((SQLiteDatabase) this.f3474p).rawQueryWithFactory(new a(cVar), cVar.d(), f3472q, null);
    }

    public Cursor o(String str) {
        return n(new u(str, 2));
    }

    public void q() {
        ((SQLiteDatabase) this.f3474p).setTransactionSuccessful();
    }
}
