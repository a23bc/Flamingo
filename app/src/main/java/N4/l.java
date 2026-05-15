package N4;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M4.o f5196b;

    public l(M4.o oVar, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f5196b = oVar;
    }

    @Override // N4.k
    public final Object c() {
        return this.f5196b.F();
    }

    @Override // N4.k
    public final void e(Object obj, R4.a aVar, j jVar) throws IllegalAccessException {
        Object objA = jVar.h.a(aVar);
        if (objA == null && jVar.f5194k) {
            return;
        }
        Field field = jVar.f5186b;
        if (!jVar.l) {
            field.set(obj, objA);
            return;
        }
        throw new K4.o("Cannot set value of 'static final' " + P4.c.d(field, false));
    }

    @Override // N4.k
    public final Object d(Object obj) {
        return obj;
    }
}
