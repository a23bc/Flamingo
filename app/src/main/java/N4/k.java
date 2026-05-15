package N4;

import K4.x;
import a.AbstractC0509a;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5195a;

    public k(LinkedHashMap linkedHashMap) {
        this.f5195a = linkedHashMap;
    }

    @Override // K4.x
    public final Object a(R4.a aVar) throws IOException {
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        Object objC = c();
        try {
            aVar.c();
            while (aVar.o()) {
                j jVar = (j) this.f5195a.get(aVar.y());
                if (jVar == null || !jVar.f5189e) {
                    aVar.K();
                } else {
                    e(objC, aVar, jVar);
                }
            }
            aVar.i();
            return d(objC);
        } catch (IllegalAccessException e7) {
            AbstractC0509a abstractC0509a = P4.c.f5763a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (IllegalStateException e8) {
            throw new K4.o(e8);
        }
    }

    @Override // K4.x
    public final void b(R4.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.o();
            return;
        }
        bVar.d();
        try {
            Iterator it = this.f5195a.values().iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(bVar, obj);
            }
            bVar.i();
        } catch (IllegalAccessException e7) {
            AbstractC0509a abstractC0509a = P4.c.f5763a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, R4.a aVar, j jVar);
}
