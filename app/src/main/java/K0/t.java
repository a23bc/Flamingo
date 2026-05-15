package K0;

import A2.C0001b;
import android.view.MotionEvent;
import l5.InterfaceC1182c;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0233a f3907a = new C0233a(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0233a f3908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final StackTraceElement[] f3909c;

    static {
        new C0233a(1007);
        f3908b = new C0233a(1008);
        new C0233a(1002);
        f3909c = new StackTraceElement[0];
    }

    public static final boolean a(u uVar) {
        return !uVar.h && uVar.f3913d;
    }

    public static final boolean b(u uVar) {
        return (uVar.b() || !uVar.h || uVar.f3913d) ? false : true;
    }

    public static final boolean c(u uVar) {
        return uVar.h && !uVar.f3913d;
    }

    public static final boolean d(long j3, long j7) {
        return j3 == j7;
    }

    public static final boolean e(u uVar, long j3, long j7) {
        int i7 = uVar.f3917i == 1 ? 1 : 0;
        long j8 = uVar.f3912c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        float f7 = i7;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j7 >> 32)) * f7;
        float f8 = ((int) (j3 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j7 & 4294967295L)) * f7;
        return (fIntBitsToFloat > f8) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j3 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long f(u uVar, boolean z6) {
        long jG = C1892b.g(uVar.f3912c, uVar.f3916g);
        if (z6 || !uVar.b()) {
            return jG;
        }
        return 0L;
    }

    public static final void g(C0245m c0245m, long j3, InterfaceC1182c interfaceC1182c, boolean z6) {
        C0001b c0001b = c0245m.f3897b;
        MotionEvent motionEvent = c0001b != null ? (MotionEvent) ((V.o) c0001b.f224r).f7343q : null;
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z6) {
            motionEvent.setAction(3);
        }
        int i7 = (int) (j3 >> 32);
        int i8 = (int) (j3 & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(i7), -Float.intBitsToFloat(i8));
        interfaceC1182c.b(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8));
        motionEvent.setAction(action);
    }
}
