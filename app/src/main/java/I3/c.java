package I3;

import V.o;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DatabaseErrorHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o f3475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b[] f3476b;

    public c(o oVar, b[] bVarArr) {
        this.f3475a = oVar;
        this.f3476b = bVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        b bVarB = d.b(this.f3476b, sQLiteDatabase);
        this.f3475a.getClass();
        ((SQLiteDatabase) bVarB.f3474p).getPath();
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) bVarB.f3474p;
        if (!sQLiteDatabase2.isOpen()) {
            o.h(sQLiteDatabase2.getPath());
            return;
        }
        List<Pair<String, String>> attachedDbs = null;
        try {
            try {
                attachedDbs = sQLiteDatabase2.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                bVarB.close();
            } catch (IOException unused2) {
            }
        } finally {
            if (attachedDbs != null) {
                Iterator<Pair<String, String>> it = attachedDbs.iterator();
                while (it.hasNext()) {
                    o.h((String) it.next().second);
                }
            } else {
                o.h(sQLiteDatabase2.getPath());
            }
        }
    }
}
