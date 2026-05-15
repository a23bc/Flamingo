package I3;

import V.o;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes.dex */
public final class d extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b[] f3477o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f3478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3479q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, b[] bVarArr, o oVar) {
        super(context, str, null, 12, new c(oVar, bVarArr));
        oVar.getClass();
        this.f3478p = oVar;
        this.f3477o = bVarArr;
    }

    public static b b(b[] bVarArr, SQLiteDatabase sQLiteDatabase) {
        b bVar = bVarArr[0];
        if (bVar == null || ((SQLiteDatabase) bVar.f3474p) != sQLiteDatabase) {
            bVarArr[0] = new b(sQLiteDatabase, 0);
        }
        return bVarArr[0];
    }

    public final synchronized b c() {
        this.f3479q = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.f3479q) {
            return b(this.f3477o, writableDatabase);
        }
        close();
        return c();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f3477o[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        b(this.f3477o, sQLiteDatabase);
        this.f3478p.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.database.sqlite.SQLiteDatabase r7) {
        /*
            r6 = this;
            r0 = 1
            I3.b[] r1 = r6.f3477o
            I3.b r7 = b(r1, r7)
            V.o r1 = r6.f3478p
            r1.getClass()
            java.lang.String r2 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r2 = r7.o(r2)
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L21
            r4 = 0
            if (r3 == 0) goto L23
            int r3 = r2.getInt(r4)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L23
            r3 = r0
            goto L24
        L21:
            r7 = move-exception
            goto L72
        L23:
            r3 = r4
        L24:
            r2.close()
            java.lang.Object r2 = r1.f7343q
            L2.a r2 = (L2.C0247a) r2
            L2.C0247a.g(r7)
            if (r3 != 0) goto L51
            B3.l r3 = L2.C0247a.n(r7)
            boolean r5 = r3.f857a
            if (r5 == 0) goto L39
            goto L51
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r1)
            java.lang.Object r1 = r3.f858b
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L51:
            r1.K(r7)
            int r7 = androidx.work.impl.WorkDatabase_Impl.f9851s
            java.lang.Object r7 = r2.f4105p
            androidx.work.impl.WorkDatabase_Impl r7 = (androidx.work.impl.WorkDatabase_Impl) r7
            java.util.ArrayList r1 = r7.f855g
            if (r1 == 0) goto L71
            int r1 = r1.size()
        L62:
            if (r4 >= r1) goto L71
            java.util.ArrayList r2 = r7.f855g
            java.lang.Object r2 = r2.get(r4)
            O3.g r2 = (O3.g) r2
            r2.getClass()
            int r4 = r4 + r0
            goto L62
        L71:
            return
        L72:
            r2.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.d.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        this.f3479q = true;
        this.f3478p.C(b(this.f3477o, sQLiteDatabase), i7, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r12) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.d.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        this.f3479q = true;
        this.f3478p.C(b(this.f3477o, sQLiteDatabase), i7, i8);
    }
}
