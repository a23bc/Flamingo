package s4;

import android.os.SystemClock;
import q4.C1377a;

/* JADX INFO: loaded from: classes.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f15931a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static h4.i f15932b;

    @Override // s4.g
    public boolean a() {
        boolean z6;
        synchronized (f.f15921a) {
            try {
                int i7 = f.f15923c;
                f.f15923c = i7 + 1;
                if (i7 >= 30 || SystemClock.uptimeMillis() > f.f15924d + ((long) 30000)) {
                    f.f15923c = 0;
                    f.f15924d = SystemClock.uptimeMillis();
                    String[] list = f.f15922b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    f.f15925e = list.length < 800;
                }
                z6 = f.f15925e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    @Override // s4.g
    public boolean b(q4.h hVar) {
        j0.k kVar = hVar.f15594a;
        if ((kVar instanceof C1377a ? ((C1377a) kVar).f15582a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        j0.k kVar2 = hVar.f15595b;
        return (kVar2 instanceof C1377a ? ((C1377a) kVar2).f15582a : Integer.MAX_VALUE) > 100;
    }
}
