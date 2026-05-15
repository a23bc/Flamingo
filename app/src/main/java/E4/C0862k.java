package e4;

import B5.n;
import F5.o;
import F5.t;
import L2.C0247a;
import N2.K;
import Y4.m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import g4.C0990c;
import j4.C1106a;
import j5.AbstractC1107a;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.C1153h;
import l4.C1178a;
import m4.C1198a;
import n4.C1232c;
import p4.C1296b;
import s4.AbstractC1434a;
import w5.AbstractC1767D;
import w5.M;
import w5.y0;

/* JADX INFO: renamed from: e4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0862k {

    /* JADX INFO: renamed from: a */
    public final C1296b f11594a;

    /* JADX INFO: renamed from: b */
    public final m f11595b;

    /* JADX INFO: renamed from: c */
    public final B5.d f11596c;

    /* JADX INFO: renamed from: d */
    public final s4.j f11597d;

    /* JADX INFO: renamed from: e */
    public final V1.a f11598e;

    /* JADX INFO: renamed from: f */
    public final C0853b f11599f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f11600g;
    public final AtomicBoolean h;

    public C0862k(Context context, C1296b c1296b, m mVar, m mVar2, m mVar3, C0853b c0853b, s4.h hVar) {
        Object k7;
        this.f11594a = c1296b;
        this.f11595b = mVar;
        y0 y0VarC = AbstractC1767D.c();
        D5.e eVar = M.f19497a;
        this.f11596c = AbstractC1767D.a(I0.c.L(y0VarC, n.f912a.f20145t).h(new C0861j(this)));
        s4.j jVar = new s4.j(this, context, hVar.f15927b);
        this.f11597d = jVar;
        V1.a aVar = new V1.a();
        aVar.f7389o = jVar;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            if (!AbstractC1434a.f15912a) {
                k7 = (i7 == 26 || i7 == 27) ? new s4.i() : new K(true);
            }
            aVar.f7390p = k7;
            this.f11598e = aVar;
            t tVar = new t(c0853b);
            tVar.f(new C1198a(2), o.class);
            tVar.f(new C1198a(5), String.class);
            tVar.f(new C1198a(1), Uri.class);
            tVar.f(new C1198a(4), Uri.class);
            tVar.f(new C1198a(3), Integer.class);
            tVar.f(new C1198a(0), byte[].class);
            l4.c cVar = new l4.c();
            ArrayList arrayList = (ArrayList) tVar.f2443r;
            arrayList.add(new Y4.h(cVar, Uri.class));
            arrayList.add(new Y4.h(new C1178a(hVar.f15926a), File.class));
            tVar.e(new j4.i(mVar3, mVar2, hVar.f15928c), Uri.class);
            tVar.e(new C1106a(5), File.class);
            tVar.e(new C1106a(0), Uri.class);
            tVar.e(new C1106a(3), Uri.class);
            tVar.e(new C1106a(6), Uri.class);
            tVar.e(new C1106a(4), Drawable.class);
            tVar.e(new C1106a(1), Bitmap.class);
            tVar.e(new C1106a(2), ByteBuffer.class);
            C0990c c0990c = new C0990c(hVar.f15929d, hVar.f15930e);
            ArrayList arrayList2 = (ArrayList) tVar.f2445t;
            arrayList2.add(c0990c);
            List listC = AbstractC1107a.C((ArrayList) tVar.f2441p);
            this.f11599f = new C0853b(listC, AbstractC1107a.C((ArrayList) tVar.f2442q), AbstractC1107a.C(arrayList), AbstractC1107a.C((ArrayList) tVar.f2444s), AbstractC1107a.C(arrayList2));
            this.f11600g = Z4.n.C0(listC, new C1153h(this, aVar));
            this.h = new AtomicBoolean(false);
            context.registerComponentCallbacks(jVar);
        }
        boolean z6 = AbstractC1434a.f15912a;
        k7 = new K(false);
        aVar.f7390p = k7;
        this.f11598e = aVar;
        t tVar2 = new t(c0853b);
        tVar2.f(new C1198a(2), o.class);
        tVar2.f(new C1198a(5), String.class);
        tVar2.f(new C1198a(1), Uri.class);
        tVar2.f(new C1198a(4), Uri.class);
        tVar2.f(new C1198a(3), Integer.class);
        tVar2.f(new C1198a(0), byte[].class);
        l4.c cVar2 = new l4.c();
        ArrayList arrayList3 = (ArrayList) tVar2.f2443r;
        arrayList3.add(new Y4.h(cVar2, Uri.class));
        arrayList3.add(new Y4.h(new C1178a(hVar.f15926a), File.class));
        tVar2.e(new j4.i(mVar3, mVar2, hVar.f15928c), Uri.class);
        tVar2.e(new C1106a(5), File.class);
        tVar2.e(new C1106a(0), Uri.class);
        tVar2.e(new C1106a(3), Uri.class);
        tVar2.e(new C1106a(6), Uri.class);
        tVar2.e(new C1106a(4), Drawable.class);
        tVar2.e(new C1106a(1), Bitmap.class);
        tVar2.e(new C1106a(2), ByteBuffer.class);
        C0990c c0990c2 = new C0990c(hVar.f15929d, hVar.f15930e);
        ArrayList arrayList22 = (ArrayList) tVar2.f2445t;
        arrayList22.add(c0990c2);
        List listC2 = AbstractC1107a.C((ArrayList) tVar2.f2441p);
        this.f11599f = new C0853b(listC2, AbstractC1107a.C((ArrayList) tVar2.f2442q), AbstractC1107a.C(arrayList3), AbstractC1107a.C((ArrayList) tVar2.f2444s), AbstractC1107a.C(arrayList22));
        this.f11600g = Z4.n.C0(listC2, new C1153h(this, aVar));
        this.h = new AtomicBoolean(false);
        context.registerComponentCallbacks(jVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x00bf, code lost:
    
        if (j5.AbstractC1110d.p(r0, r2) == r3) goto L198;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00d4 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:166:0x00ca, B:168:0x00d4, B:170:0x00d8, B:172:0x00e0, B:176:0x00ee, B:179:0x00f4, B:183:0x010d, B:185:0x0111, B:187:0x0119, B:189:0x011f, B:190:0x0125, B:182:0x0102), top: B:229:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00f4 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:166:0x00ca, B:168:0x00d4, B:170:0x00d8, B:172:0x00e0, B:176:0x00ee, B:179:0x00f4, B:183:0x010d, B:185:0x0111, B:187:0x0119, B:189:0x011f, B:190:0x0125, B:182:0x0102), top: B:229:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0102 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:166:0x00ca, B:168:0x00d4, B:170:0x00d8, B:172:0x00e0, B:176:0x00ee, B:179:0x00f4, B:183:0x010d, B:185:0x0111, B:187:0x0119, B:189:0x011f, B:190:0x0125, B:182:0x0102), top: B:229:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0111 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:166:0x00ca, B:168:0x00d4, B:170:0x00d8, B:172:0x00e0, B:176:0x00ee, B:179:0x00f4, B:183:0x010d, B:185:0x0111, B:187:0x0119, B:189:0x011f, B:190:0x0125, B:182:0x0102), top: B:229:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0171 A[Catch: all -> 0x0185, TryCatch #4 {all -> 0x0185, blocks: (B:200:0x016b, B:202:0x0171, B:207:0x0187, B:209:0x018b), top: B:236:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0187 A[Catch: all -> 0x0185, TryCatch #4 {all -> 0x0185, blocks: (B:200:0x016b, B:202:0x0171, B:207:0x0187, B:209:0x018b), top: B:236:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01b0 A[Catch: all -> 0x01c4, TRY_LEAVE, TryCatch #3 {all -> 0x01c4, blocks: (B:218:0x01ac, B:220:0x01b0, B:225:0x01c6, B:226:0x01cf), top: B:235:0x01ac }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01c6 A[Catch: all -> 0x01c4, TRY_ENTER, TryCatch #3 {all -> 0x01c4, blocks: (B:218:0x01ac, B:220:0x01b0, B:225:0x01c6, B:226:0x01cf), top: B:235:0x01ac }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(e4.C0862k r19, p4.h r20, int r21, e5.AbstractC0865c r22) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C0862k.a(e4.k, p4.h, int, e5.c):java.lang.Object");
    }

    public static void b(p4.d dVar, C0247a c0247a, C0854c c0854c) {
        p4.h hVar = dVar.f15021b;
        c0854c.getClass();
        hVar.getClass();
    }

    public final void c() {
        if (this.h.getAndSet(true)) {
            return;
        }
        AbstractC1767D.f(this.f11596c, null);
        this.f11597d.a();
        C1232c c1232c = (C1232c) this.f11595b.getValue();
        if (c1232c != null) {
            c1232c.f14543a.A();
            C1.k kVar = c1232c.f14544b;
            synchronized (kVar) {
                kVar.f959o = 0;
                ((LinkedHashMap) kVar.f960p).clear();
            }
        }
    }
}
