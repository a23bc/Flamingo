package B3;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f868a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final k f869b;

    /* JADX INFO: renamed from: c */
    public volatile I3.f f870c;

    public o(k kVar) {
        this.f869b = kVar;
    }

    public final I3.f a() {
        this.f869b.a();
        if (!this.f868a.compareAndSet(false, true)) {
            String strB = b();
            k kVar = this.f869b;
            kVar.a();
            kVar.b();
            return new I3.f(((SQLiteDatabase) kVar.f851c.x().f3474p).compileStatement(strB));
        }
        if (this.f870c == null) {
            String strB2 = b();
            k kVar2 = this.f869b;
            kVar2.a();
            kVar2.b();
            this.f870c = new I3.f(((SQLiteDatabase) kVar2.f851c.x().f3474p).compileStatement(strB2));
        }
        return this.f870c;
    }

    public abstract String b();

    public final void c(I3.f fVar) {
        if (fVar == this.f870c) {
            this.f868a.set(false);
        }
    }
}
