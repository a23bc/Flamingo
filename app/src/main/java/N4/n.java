package N4;

import A2.C0001b;
import H2.C0196m;
import K4.x;
import K4.y;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n implements y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0001b f5201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final K4.h f5202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final M4.g f5203q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f5204r;

    public n(C0001b c0001b, K4.h hVar, M4.g gVar, c cVar, List list) {
        this.f5201o = c0001b;
        this.f5202p = hVar;
        this.f5203q = gVar;
        this.f5204r = list;
    }

    @Override // K4.y
    public final x a(C0196m c0196m, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        M4.d.e(this.f5204r);
        return P4.c.f5763a.K(rawType) ? new m(rawType, b(c0196m, typeToken, rawType, true)) : new l(this.f5201o.h(typeToken), b(c0196m, typeToken, rawType, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.LinkedHashMap b(H2.C0196m r27, com.google.gson.reflect.TypeToken r28, java.lang.Class r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.n.b(H2.m, com.google.gson.reflect.TypeToken, java.lang.Class, boolean):java.util.LinkedHashMap");
    }

    public final boolean c(Field field, boolean z6) {
        Class<?> type = field.getType();
        M4.g gVar = this.f5203q;
        gVar.getClass();
        if (M4.g.c(type)) {
            return false;
        }
        gVar.b(z6);
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || M4.g.c(field.getType())) {
            return false;
        }
        List list = z6 ? gVar.f4790o : gVar.f4791p;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
