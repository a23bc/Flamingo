package b1;

import X.C0469c0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: b1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0623h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0622g f9973a = new C0622g("");

    public static final List a(C0622g c0622g, int i7, int i8, C0469c0 c0469c0) {
        List list;
        if (i7 == i8 || (list = c0622g.f9969o) == null) {
            return null;
        }
        if (i7 != 0 || i8 < c0622g.f9970p.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                C0620e c0620e = (C0620e) list.get(i9);
                if ((c0469c0 != null ? ((Boolean) c0469c0.b(c0620e.f9964a)).booleanValue() : true) && b(i7, i8, c0620e.f9965b, c0620e.f9966c)) {
                    arrayList.add(new C0620e((InterfaceC0617b) c0620e.f9964a, i6.h.q(c0620e.f9965b, i7, i8) - i7, i6.h.q(c0620e.f9966c, i7, i8) - i7, c0620e.f9967d));
                }
            }
            return arrayList;
        }
        if (c0469c0 == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = list.get(i10);
            if (((Boolean) c0469c0.b(((C0620e) obj).f9964a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i7, int i8, int i9, int i10) {
        return ((i7 < i10) & (i9 < i8)) | (((i7 == i8) | (i9 == i10)) & (i7 == i9));
    }
}
