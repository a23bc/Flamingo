package o0;

import D.D0;
import Y4.o;
import android.app.PendingIntent;
import b1.x;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import java.util.Arrays;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1223y;

/* JADX INFO: renamed from: o0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1256m {

    /* JADX INFO: renamed from: a */
    public static final V1.a f14654a = new V1.a(new x(14), new C1247d(1));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final V1.a b(l5.e eVar, InterfaceC1182c interfaceC1182c) {
        D0 d02 = new D0(14, eVar);
        AbstractC1223y.c(1, interfaceC1182c);
        return new V1.a(d02, interfaceC1182c);
    }

    public static final Object c(Object[] objArr, V1.a aVar, String str, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7, int i8) {
        Object[] objArr2;
        final Object obj;
        Object objF;
        if ((i8 & 2) != 0) {
            aVar = f14654a;
        }
        final V1.a aVar2 = aVar;
        if ((i8 & 4) != 0) {
            str = null;
        }
        long j3 = c0912t.f11891T;
        if (str == null || str.length() == 0) {
            j0.k.p(36);
            str = Long.toString(j3, 36);
            AbstractC1209k.e(str, "toString(...)");
        }
        final String str2 = str;
        AbstractC1209k.d(aVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final InterfaceC1251h interfaceC1251h = (InterfaceC1251h) c0912t.j(AbstractC1253j.f14649a);
        Object objK = c0912t.K();
        Object obj2 = C0903o.f11850a;
        if (objK == obj2) {
            Object objB = (interfaceC1251h == null || (objF = interfaceC1251h.f(str2)) == null) ? null : ((InterfaceC1182c) aVar2.f7390p).b(objF);
            if (objB == null) {
                objB = interfaceC1180a.a();
            }
            objArr2 = objArr;
            Object c1245b = new C1245b(aVar2, interfaceC1251h, str2, objB, objArr2);
            c0912t.i0(c1245b);
            objK = c1245b;
        } else {
            objArr2 = objArr;
        }
        final C1245b c1245b2 = (C1245b) objK;
        Object objA = Arrays.equals(objArr2, c1245b2.f14633s) ? c1245b2.f14632r : null;
        if (objA == null) {
            objA = interfaceC1180a.a();
        }
        boolean zH = c0912t.h(c1245b2) | ((((i7 & 112) ^ 48) > 32 && c0912t.h(aVar2)) || (i7 & 48) == 32) | c0912t.h(interfaceC1251h) | c0912t.f(str2) | c0912t.h(objA) | c0912t.h(objArr2);
        Object objK2 = c0912t.K();
        if (zH || objK2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = objA;
            Object obj3 = new InterfaceC1180a() { // from class: o0.a
                @Override // l5.InterfaceC1180a
                public final Object a() throws PendingIntent.CanceledException {
                    boolean z6;
                    C1245b c1245b3 = c1245b2;
                    InterfaceC1251h interfaceC1251h2 = c1245b3.f14630p;
                    InterfaceC1251h interfaceC1251h3 = interfaceC1251h;
                    boolean z7 = true;
                    if (interfaceC1251h2 != interfaceC1251h3) {
                        c1245b3.f14630p = interfaceC1251h3;
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    String str3 = c1245b3.f14631q;
                    String str4 = str2;
                    if (AbstractC1209k.a(str3, str4)) {
                        z7 = z6;
                    } else {
                        c1245b3.f14631q = str4;
                    }
                    c1245b3.f14629o = aVar2;
                    c1245b3.f14632r = obj;
                    c1245b3.f14633s = objArr3;
                    InterfaceC1250g interfaceC1250g = c1245b3.f14634t;
                    if (interfaceC1250g != null && z7) {
                        ((A0.b) interfaceC1250g).q0();
                        c1245b3.f14634t = null;
                        c1245b3.b();
                    }
                    return o.f8736a;
                }
            };
            c0912t.i0(obj3);
            objK2 = obj3;
        } else {
            obj = objA;
        }
        C0879c.g((InterfaceC1180a) objK2, c0912t);
        return obj;
    }

    public static final Object d(Object[] objArr, V1.a aVar, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        return c(Arrays.copyOf(objArr, objArr.length), aVar, null, interfaceC1180a, c0912t, 384 | ((i7 << 3) & 7168), 0);
    }

    public static final Object e(Object[] objArr, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        return c(Arrays.copyOf(objArr, objArr.length), f14654a, null, interfaceC1180a, c0912t, ((i7 << 6) & 7168) | 384, 0);
    }

    public static final C1249f f(C0912t c0912t) {
        c0912t.X(1967008021);
        Object[] objArr = new Object[0];
        V1.a aVar = C1249f.f14641s;
        Object objK = c0912t.K();
        if (objK == C0903o.f11850a) {
            objK = new n6.c(1);
            c0912t.i0(objK);
        }
        C1249f c1249f = (C1249f) d(objArr, aVar, (InterfaceC1180a) objK, c0912t, 384);
        c1249f.f14644q = (InterfaceC1251h) c0912t.j(AbstractC1253j.f14649a);
        c0912t.p(false);
        return c1249f;
    }
}
