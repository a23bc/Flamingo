package I3;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: r */
    public final SQLiteStatement f3487r;

    public f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement, 1);
        this.f3487r = sQLiteStatement;
    }

    public final void r() {
        this.f3487r.executeUpdateDelete();
    }
}
