package Y1;

import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import m5.C1203e;
import p2.C1293c;
import s2.C1430a;

/* JADX INFO: loaded from: classes.dex */
public class s implements U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static s f8656b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8657a;

    @Override // androidx.lifecycle.U
    public Q a(Class cls) {
        switch (this.f8657a) {
            case 0:
                return new t(true);
            case 1:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            case 2:
                return i6.g.s(cls);
            case 3:
                return new C1430a();
            default:
                return new y3.m();
        }
    }

    @Override // androidx.lifecycle.U
    public Q b(Class cls, C1293c c1293c) {
        switch (this.f8657a) {
            case 0:
                return a(cls);
            case 1:
                a(cls);
                throw null;
            case 2:
                return a(cls);
            case 3:
                return a(cls);
            default:
                return a(cls);
        }
    }

    @Override // androidx.lifecycle.U
    public final Q c(C1203e c1203e, C1293c c1293c) {
        switch (this.f8657a) {
        }
        return Z1.l.a(this, c1203e, c1293c);
    }
}
