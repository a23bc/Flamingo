package N4;

import H2.C0196m;
import K4.w;
import K4.x;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import w.AbstractC1676i;

/* JADX INFO: loaded from: classes.dex */
public final class i extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f5182c = new h(1, w.f4068o);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0196m f5183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f5184b;

    public i(C0196m c0196m, w wVar) {
        this.f5183a = c0196m;
        this.f5184b = wVar;
    }

    @Override // K4.x
    public final Object a(R4.a aVar) {
        Object arrayList;
        Serializable arrayList2;
        int iE = aVar.E();
        int iB = AbstractC1676i.b(iE);
        if (iB == 0) {
            aVar.b();
            arrayList = new ArrayList();
        } else if (iB != 2) {
            arrayList = null;
        } else {
            aVar.c();
            arrayList = new M4.n(true);
        }
        if (arrayList == null) {
            return c(aVar, iE);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.o()) {
                String strY = arrayList instanceof Map ? aVar.y() : null;
                int iE2 = aVar.E();
                int iB2 = AbstractC1676i.b(iE2);
                if (iB2 == 0) {
                    aVar.b();
                    arrayList2 = new ArrayList();
                } else if (iB2 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.c();
                    arrayList2 = new M4.n(true);
                }
                boolean z6 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = c(aVar, iE2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strY, arrayList2);
                }
                if (z6) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.h();
                } else {
                    aVar.i();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // K4.x
    public final void b(R4.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.o();
            return;
        }
        Class<?> cls = obj.getClass();
        C0196m c0196m = this.f5183a;
        c0196m.getClass();
        x xVarD = c0196m.d(TypeToken.get((Class) cls));
        if (!(xVarD instanceof i)) {
            xVarD.b(bVar, obj);
        } else {
            bVar.d();
            bVar.i();
        }
    }

    public final Serializable c(R4.a aVar, int i7) {
        int iB = AbstractC1676i.b(i7);
        if (iB == 5) {
            return aVar.C();
        }
        if (iB == 6) {
            return this.f5184b.a(aVar);
        }
        if (iB == 7) {
            return Boolean.valueOf(aVar.s());
        }
        if (iB != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(A0.e.O(i7)));
        }
        aVar.A();
        return null;
    }
}
