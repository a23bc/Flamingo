package p0;

import j0.AbstractC1092c;
import j0.C1095f;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f14953a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f14954b = new Object();

    public static final void a(int i7, int i8) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException("index (" + i7 + ") is out of bound of [0, " + i8 + ')');
        }
    }

    public static final boolean b(v vVar, int i7, AbstractC1092c abstractC1092c, boolean z6) {
        boolean z7;
        synchronized (f14953a) {
            try {
                int i8 = vVar.f14981d;
                if (i8 == i7) {
                    vVar.f14980c = abstractC1092c;
                    z7 = true;
                    if (z6) {
                        vVar.f14982e++;
                    }
                    vVar.f14981d = i8 + 1;
                } else {
                    z7 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    public static final int c(long[] jArr, long j3) {
        int length = jArr.length - 1;
        int i7 = 0;
        while (i7 <= length) {
            int i8 = (i7 + length) >>> 1;
            long j7 = jArr[i8];
            if (j3 > j7) {
                i7 = i8 + 1;
            } else {
                if (j3 >= j7) {
                    return i8;
                }
                length = i8 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static final v e(p pVar) {
        v vVar = pVar.f14952o;
        AbstractC1209k.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (v) l.u(vVar, pVar);
    }

    public static final int f(p pVar) {
        v vVar = pVar.f14952o;
        AbstractC1209k.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((v) l.i(vVar)).f14982e;
    }

    public static final boolean g(p pVar, InterfaceC1182c interfaceC1182c) {
        int i7;
        AbstractC1092c abstractC1092c;
        Object objB;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        do {
            synchronized (f14953a) {
                v vVar = pVar.f14952o;
                AbstractC1209k.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.i(vVar);
                i7 = vVar2.f14981d;
                abstractC1092c = vVar2.f14980c;
            }
            AbstractC1209k.c(abstractC1092c);
            C1095f c1095fI = abstractC1092c.i();
            objB = interfaceC1182c.b(c1095fI);
            AbstractC1092c abstractC1092cE = c1095fI.e();
            if (AbstractC1209k.a(abstractC1092cE, abstractC1092c)) {
                break;
            }
            v vVar3 = pVar.f14952o;
            AbstractC1209k.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                zB = b((v) l.x(vVar3, pVar, abstractC1289fK), i7, abstractC1092cE, true);
            }
            l.o(abstractC1289fK, pVar);
        } while (!zB);
        return ((Boolean) objB).booleanValue();
    }

    public static final void h() {
        throw new UnsupportedOperationException();
    }

    public abstract void d();
}
