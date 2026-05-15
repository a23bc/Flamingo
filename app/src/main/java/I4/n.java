package I4;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class n extends I0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Unsafe f3516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f3517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f3518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f3519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f3520g;
    public static final long h;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new m());
            }
            try {
                f3518e = unsafe.objectFieldOffset(p.class.getDeclaredField("q"));
                f3517d = unsafe.objectFieldOffset(p.class.getDeclaredField("p"));
                f3519f = unsafe.objectFieldOffset(p.class.getDeclaredField("o"));
                f3520g = unsafe.objectFieldOffset(o.class.getDeclaredField("a"));
                h = unsafe.objectFieldOffset(o.class.getDeclaredField("b"));
                f3516c = unsafe;
            } catch (NoSuchFieldException e7) {
                throw new RuntimeException(e7);
            }
        } catch (PrivilegedActionException e8) {
            throw new RuntimeException("Could not initialize intrinsics", e8.getCause());
        }
    }

    @Override // I0.c
    public final void M(o oVar, o oVar2) {
        f3516c.putObject(oVar, h, oVar2);
    }

    @Override // I0.c
    public final void N(o oVar, Thread thread) {
        f3516c.putObject(oVar, f3520g, thread);
    }

    @Override // I0.c
    public final boolean l(p pVar, C0229d c0229d, C0229d c0229d2) {
        return k.a(f3516c, pVar, f3517d, c0229d, c0229d2);
    }

    @Override // I0.c
    public final boolean m(p pVar, Object obj, Object obj2) {
        return l.a(f3516c, pVar, f3519f, obj, obj2);
    }

    @Override // I0.c
    public final boolean n(p pVar, o oVar, o oVar2) {
        return j.a(f3516c, pVar, f3518e, oVar, oVar2);
    }

    @Override // I0.c
    public final C0229d w(p pVar) {
        C0229d c0229d;
        C0229d c0229d2 = C0229d.f3505d;
        do {
            c0229d = pVar.f3529p;
            if (c0229d2 == c0229d) {
                break;
            }
        } while (!l(pVar, c0229d, c0229d2));
        return c0229d;
    }

    @Override // I0.c
    public final o x(p pVar) {
        o oVar;
        o oVar2 = o.f3521c;
        do {
            oVar = pVar.f3530q;
            if (oVar2 == oVar) {
                break;
            }
        } while (!n(pVar, oVar, oVar2));
        return oVar;
    }
}
