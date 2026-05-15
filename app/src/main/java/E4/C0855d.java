package e4;

import N2.z;
import S5.l;
import S5.u;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import h4.C1002a;
import j5.AbstractC1108b;
import java.io.File;
import k.I;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import n4.C1232c;
import n4.C1234e;
import n4.InterfaceC1236g;
import w5.M;

/* JADX INFO: renamed from: e4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0855d extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f11569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ A0.b f11570q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0855d(A0.b bVar, int i7) {
        super(0);
        this.f11569p = i7;
        this.f11570q = bVar;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        int i7;
        InterfaceC1236g i8;
        int largeMemoryClass;
        h4.i iVarA;
        switch (this.f11569p) {
            case 0:
                Context context = (Context) this.f11570q.f50p;
                Bitmap.Config config = s4.e.f15919a;
                double d4 = 0.2d;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    AbstractC1209k.c(systemService);
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d4 = 0.15d;
                    }
                } catch (Exception unused) {
                }
                C1.k kVar = new C1.k(7);
                if (d4 > 0.0d) {
                    Bitmap.Config config2 = s4.e.f15919a;
                    try {
                        Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
                        AbstractC1209k.c(systemService2);
                        ActivityManager activityManager = (ActivityManager) systemService2;
                        largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    } catch (Exception unused2) {
                        largeMemoryClass = 256;
                    }
                    double d7 = d4 * ((double) largeMemoryClass);
                    double d8 = 1024;
                    i7 = (int) (d7 * d8 * d8);
                    break;
                } else {
                    i7 = 0;
                }
                if (i7 > 0) {
                    V1.a aVar = new V1.a();
                    aVar.f7389o = kVar;
                    aVar.f7390p = new C1234e(i7, aVar);
                    i8 = aVar;
                } else {
                    i8 = new I(2, kVar);
                }
                return new C1232c(i8, kVar);
            default:
                s4.i iVar = s4.i.f15931a;
                Context context2 = (Context) this.f11570q.f50p;
                synchronized (iVar) {
                    try {
                        iVarA = s4.i.f15932b;
                        if (iVarA == null) {
                            C1002a c1002a = new C1002a();
                            c1002a.f12705b = l.f6793a;
                            c1002a.f12706c = 0.02d;
                            c1002a.f12707d = 10485760L;
                            c1002a.f12708e = 262144000L;
                            c1002a.f12709f = M.f19498b;
                            Bitmap.Config config3 = s4.e.f15919a;
                            File cacheDir = context2.getCacheDir();
                            if (cacheDir == null) {
                                throw new IllegalStateException("cacheDir == null");
                            }
                            cacheDir.mkdirs();
                            File fileD = AbstractC1108b.D(cacheDir);
                            String str = u.f6810p;
                            c1002a.f12704a = z.o(fileD);
                            iVarA = c1002a.a();
                            s4.i.f15932b = iVarA;
                        }
                    } finally {
                    }
                }
                return iVarA;
        }
    }
}
