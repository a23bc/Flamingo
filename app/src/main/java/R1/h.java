package R1;

import A2.W;
import O1.C0329a;
import O1.j;
import O1.o;
import Q1.i;
import Z4.n;
import androidx.datastore.preferences.protobuf.AbstractC0546t;
import androidx.datastore.preferences.protobuf.C0537j;
import androidx.datastore.preferences.protobuf.C0550x;
import androidx.datastore.preferences.protobuf.InterfaceC0547u;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import m5.AbstractC1209k;
import w.AbstractC1676i;

/* JADX INFO: loaded from: classes.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f6662a = new h();

    @Override // O1.j
    public final Object a() {
        return new b(true);
    }

    @Override // O1.j
    public final void b(Object obj, o oVar) throws IOException {
        AbstractC0546t abstractC0546tA;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(((b) obj).f6654a);
        AbstractC1209k.e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        Q1.c cVarK = Q1.e.k();
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            e eVar = (e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.f6660a;
            if (value instanceof Boolean) {
                Q1.h hVarY = i.y();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                hVarY.c();
                i.m((i) hVarY.f9518p, zBooleanValue);
                abstractC0546tA = hVarY.a();
            } else if (value instanceof Float) {
                Q1.h hVarY2 = i.y();
                float fFloatValue = ((Number) value).floatValue();
                hVarY2.c();
                i.n((i) hVarY2.f9518p, fFloatValue);
                abstractC0546tA = hVarY2.a();
            } else if (value instanceof Double) {
                Q1.h hVarY3 = i.y();
                double dDoubleValue = ((Number) value).doubleValue();
                hVarY3.c();
                i.l((i) hVarY3.f9518p, dDoubleValue);
                abstractC0546tA = hVarY3.a();
            } else if (value instanceof Integer) {
                Q1.h hVarY4 = i.y();
                int iIntValue = ((Number) value).intValue();
                hVarY4.c();
                i.o((i) hVarY4.f9518p, iIntValue);
                abstractC0546tA = hVarY4.a();
            } else if (value instanceof Long) {
                Q1.h hVarY5 = i.y();
                long jLongValue = ((Number) value).longValue();
                hVarY5.c();
                i.i((i) hVarY5.f9518p, jLongValue);
                abstractC0546tA = hVarY5.a();
            } else if (value instanceof String) {
                Q1.h hVarY6 = i.y();
                hVarY6.c();
                i.j((i) hVarY6.f9518p, (String) value);
                abstractC0546tA = hVarY6.a();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(AbstractC1209k.l(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                Q1.h hVarY7 = i.y();
                Q1.f fVarL = Q1.g.l();
                fVarL.c();
                Q1.g.i((Q1.g) fVarL.f9518p, (Set) value);
                hVarY7.c();
                i.k((i) hVarY7.f9518p, fVarL);
                abstractC0546tA = hVarY7.a();
            }
            cVarK.getClass();
            str.getClass();
            cVarK.c();
            Q1.e.i((Q1.e) cVarK.f9518p).put(str, (i) abstractC0546tA);
        }
        Q1.e eVar2 = (Q1.e) cVarK.a();
        int iA = eVar2.a();
        Logger logger = C0537j.h;
        if (iA > 4096) {
            iA = 4096;
        }
        C0537j c0537j = new C0537j(oVar, iA);
        eVar2.c(c0537j);
        if (c0537j.f9489f > 0) {
            c0537j.B();
        }
    }

    @Override // O1.j
    public final Object c(FileInputStream fileInputStream) throws C0329a {
        try {
            Q1.e eVarL = Q1.e.l(fileInputStream);
            b bVar = new b(false);
            f[] fVarArr = (f[]) Arrays.copyOf(new f[0], 0);
            AbstractC1209k.f(fVarArr, "pairs");
            if (bVar.f6655b.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            if (fVarArr.length > 0) {
                f fVar = fVarArr[0];
                throw null;
            }
            Map mapJ = eVarL.j();
            AbstractC1209k.e(mapJ, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapJ.entrySet()) {
                String str = (String) entry.getKey();
                i iVar = (i) entry.getValue();
                AbstractC1209k.e(str, "name");
                AbstractC1209k.e(iVar, "value");
                int iX = iVar.x();
                switch (iX == 0 ? -1 : g.f6661a[AbstractC1676i.b(iX)]) {
                    case -1:
                        throw new C0329a("Value case is null.", null);
                    case 0:
                    default:
                        throw new W();
                    case 1:
                        bVar.b(new e(str), Boolean.valueOf(iVar.p()));
                        break;
                    case 2:
                        bVar.b(new e(str), Float.valueOf(iVar.s()));
                        break;
                    case 3:
                        bVar.b(new e(str), Double.valueOf(iVar.r()));
                        break;
                    case 4:
                        bVar.b(new e(str), Integer.valueOf(iVar.t()));
                        break;
                    case 5:
                        bVar.b(new e(str), Long.valueOf(iVar.u()));
                        break;
                    case 6:
                        e eVar = new e(str);
                        String strV = iVar.v();
                        AbstractC1209k.e(strV, "value.string");
                        bVar.b(eVar, strV);
                        break;
                    case 7:
                        e eVar2 = new e(str);
                        InterfaceC0547u interfaceC0547uK = iVar.w().k();
                        AbstractC1209k.e(interfaceC0547uK, "value.stringSet.stringsList");
                        bVar.b(eVar2, n.O0(interfaceC0547uK));
                        break;
                    case 8:
                        throw new C0329a("Value not set.", null);
                }
            }
            return bVar.c();
        } catch (C0550x e7) {
            throw new C0329a("Unable to parse preferences proto.", e7);
        }
    }
}
