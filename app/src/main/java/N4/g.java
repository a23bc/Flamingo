package N4;

import H2.C0196m;
import K4.x;
import N2.z;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f5176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f5177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M4.o f5178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f5179d;

    public g(c cVar, C0196m c0196m, Type type, x xVar, Type type2, x xVar2, M4.o oVar) {
        this.f5179d = cVar;
        this.f5176a = new o(c0196m, xVar, type);
        this.f5177b = new o(c0196m, xVar2, type2);
        this.f5178c = oVar;
    }

    @Override // K4.x
    public final Object a(R4.a aVar) throws IOException {
        int iE = aVar.E();
        if (iE == 9) {
            aVar.A();
            return null;
        }
        Map map = (Map) this.f5178c.F();
        o oVar = this.f5177b;
        o oVar2 = this.f5176a;
        x xVar = (x) oVar.f5207c;
        x xVar2 = (x) oVar2.f5207c;
        if (iE == 1) {
            aVar.b();
            while (aVar.o()) {
                aVar.b();
                Object objA = xVar2.a(aVar);
                if (map.put(objA, xVar.a(aVar)) != null) {
                    throw new K4.o("duplicate key: " + objA);
                }
                aVar.h();
            }
            aVar.h();
            return map;
        }
        aVar.c();
        while (aVar.o()) {
            z.f5106o.getClass();
            int iG = aVar.f6682v;
            if (iG == 0) {
                iG = aVar.g();
            }
            if (iG == 13) {
                aVar.f6682v = 9;
            } else if (iG == 12) {
                aVar.f6682v = 8;
            } else {
                if (iG != 14) {
                    throw new IllegalStateException("Expected a name but was " + A0.e.O(aVar.E()) + aVar.r());
                }
                aVar.f6682v = 10;
            }
            Object objA2 = xVar2.a(aVar);
            if (map.put(objA2, xVar.a(aVar)) != null) {
                throw new K4.o("duplicate key: " + objA2);
            }
        }
        aVar.i();
        return map;
    }

    @Override // K4.x
    public final void b(R4.b bVar, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            bVar.o();
            return;
        }
        this.f5179d.getClass();
        o oVar = this.f5177b;
        bVar.d();
        for (Map.Entry entry : map.entrySet()) {
            bVar.j(String.valueOf(entry.getKey()));
            oVar.b(bVar, entry.getValue());
        }
        bVar.i();
    }
}
