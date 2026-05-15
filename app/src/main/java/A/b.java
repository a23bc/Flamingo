package A;

import A2.C0001b;
import A2.O;
import C2.AbstractC0029a;
import C2.RunnableC0044p;
import C2.V;
import F5.y;
import G.n;
import G.x;
import G1.C0139f;
import G1.InterfaceC0136c;
import G1.InterfaceC0138e;
import G1.n0;
import G1.o0;
import G1.p0;
import G1.q0;
import G1.r;
import H.X;
import K0.u;
import K0.v;
import K0.w;
import R0.C0415x;
import V.o;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.ContentInfo;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import d.C0746L;
import d2.C0821i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.C1218t;
import p0.AbstractC1289f;
import t.AbstractC1464t;
import t.C1463s;
import u.AbstractC1525a;
import w2.AbstractC1697a;
import y0.AbstractC1951A;
import y0.InterfaceC1985r;
import yos.music.player.MainActivity;
import yos.music.player.R;
import z2.C2081b;

/* JADX INFO: loaded from: classes.dex */
public class b implements A3.e, E2.c, F2.i, F2.k, InterfaceC0136c, InterfaceC0138e, I2.c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f2o;

    /* JADX INFO: renamed from: p */
    public Object f3p;

    public /* synthetic */ b(int i7, Object obj) {
        this.f2o = i7;
        this.f3p = obj;
    }

    private final /* synthetic */ void A() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:710:0x0171, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x041b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList B(A.b r39, java.lang.String r40) {
        /*
            Method dump skipped, instruction units count: 1764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.b.B(A.b, java.lang.String):java.util.ArrayList");
    }

    private final /* synthetic */ void w() {
    }

    private final /* synthetic */ void z() {
    }

    public boolean C(int i7, int i8, Bundle bundle) {
        return false;
    }

    public C0001b D(o oVar, C0415x c0415x) {
        Object obj;
        long jK;
        boolean z6;
        long j3;
        ArrayList arrayList = (ArrayList) oVar.f7342p;
        C1463s c1463s = new C1463s(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            w wVar = (w) arrayList.get(i7);
            long j7 = wVar.f3926a;
            C1463s c1463s2 = (C1463s) this.f3p;
            int iB = AbstractC1525a.b(c1463s2.f16104p, c1463s2.f16106r, j7);
            if (iB < 0 || (obj = c1463s2.f16105q[iB]) == AbstractC1464t.f16107a) {
                obj = null;
            }
            v vVar = (v) obj;
            if (vVar == null) {
                long j8 = wVar.f3927b;
                jK = wVar.f3929d;
                j3 = j8;
                z6 = false;
            } else {
                jK = c0415x.K(vVar.f3924b);
                long j9 = vVar.f3923a;
                z6 = vVar.f3925c;
                j3 = j9;
            }
            long j10 = jK;
            ArrayList arrayList2 = wVar.f3933i;
            long j11 = wVar.f3934j;
            long j12 = wVar.f3935k;
            int i8 = i7;
            long j13 = wVar.f3926a;
            ArrayList arrayList3 = arrayList;
            int i9 = size;
            c1463s.f(j13, new u(j13, wVar.f3927b, wVar.f3929d, wVar.f3930e, wVar.f3931f, j3, j10, z6, wVar.f3932g, arrayList2, j11, j12));
            long j14 = wVar.f3926a;
            boolean z7 = wVar.f3930e;
            if (z7) {
                c1463s2.f(j14, new v(wVar.f3927b, wVar.f3928c, z7));
            } else {
                c1463s2.g(j14);
            }
            i7 = i8 + 1;
            arrayList = arrayList3;
            size = i9;
        }
        return new C0001b(c1463s, oVar);
    }

    public void E(float f7, float f8, long j3) {
        InterfaceC1985r interfaceC1985rS = ((A0.b) this.f3p).S();
        int i7 = (int) (j3 >> 32);
        int i8 = (int) (j3 & 4294967295L);
        interfaceC1985rS.h(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8));
        interfaceC1985rS.d(f7, f8);
        interfaceC1985rS.h(-Float.intBitsToFloat(i7), -Float.intBitsToFloat(i8));
    }

    public ArrayList F(int i7) {
        boolean z6 = true;
        ArrayList arrayList = new ArrayList();
        x xVar = (x) this.f3p;
        AbstractC1289f abstractC1289fQ = C0746L.q();
        InterfaceC1182c interfaceC1182cE = abstractC1289fQ != null ? abstractC1289fQ.e() : null;
        AbstractC1289f abstractC1289fW = C0746L.w(abstractC1289fQ);
        try {
            n nVar = xVar.f2612b ? xVar.f2613c : (n) xVar.f2615e.getValue();
            if (nVar != null) {
                C1218t c1218t = new C1218t();
                c1218t.f14437o = 1;
                List list = (List) nVar.f2550k.b(Integer.valueOf(i7));
                int size = list.size();
                int i8 = 0;
                while (i8 < size) {
                    Y4.h hVar = (Y4.h) list.get(i8);
                    X x6 = xVar.f2623o;
                    int iIntValue = ((Number) hVar.f8726o).intValue();
                    boolean z7 = z6;
                    long j3 = ((n1.a) hVar.f8727p).f14505a;
                    V1.a aVar = x.f2610w;
                    arrayList = arrayList;
                    arrayList.add(x6.a(iIntValue, j3, false, new G.u((ArrayList) null, c1218t, list, i7, nVar)));
                    i8++;
                    z6 = z7;
                }
            }
            return arrayList;
        } finally {
            C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
        }
    }

    public void G(Resources.Theme theme, TypedValue typedValue) {
        int i7;
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i7 = typedValue.resourceId) == 0) {
            return;
        }
        ((MainActivity) this.f3p).setTheme(i7);
    }

    public void H() {
        View viewFindViewById;
        View view = (View) this.f3p;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(android.R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new B2.e(5, viewFindViewById));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0073, code lost:
    
        if (r2 >= 26) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0078, code lost:
    
        if (r2 >= 34) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int I(t2.C1487p r7) {
        /*
            r6 = this;
            r0 = 4
            r1 = 1
            java.lang.String r2 = r7.f16701m
            r3 = 0
            if (r2 == 0) goto L84
            boolean r2 = t2.M.g(r2)
            if (r2 != 0) goto Lf
            goto L84
        Lf:
            int r2 = w2.t.f18881a
            java.lang.String r7 = r7.f16701m
            r7.getClass()
            int r2 = w2.t.f18881a
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1487656890: goto L63;
                case -1487464693: goto L58;
                case -1487464690: goto L4d;
                case -1487394660: goto L42;
                case -1487018032: goto L37;
                case -879272239: goto L2c;
                case -879258763: goto L21;
                default: goto L20;
            }
        L20:
            goto L6d
        L21:
            java.lang.String r5 = "image/png"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L2a
            goto L6d
        L2a:
            r4 = 6
            goto L6d
        L2c:
            java.lang.String r5 = "image/bmp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L35
            goto L6d
        L35:
            r4 = 5
            goto L6d
        L37:
            java.lang.String r5 = "image/webp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L40
            goto L6d
        L40:
            r4 = r0
            goto L6d
        L42:
            java.lang.String r5 = "image/jpeg"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L4b
            goto L6d
        L4b:
            r4 = 3
            goto L6d
        L4d:
            java.lang.String r5 = "image/heif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L56
            goto L6d
        L56:
            r4 = 2
            goto L6d
        L58:
            java.lang.String r5 = "image/heic"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L61
            goto L6d
        L61:
            r4 = r1
            goto L6d
        L63:
            java.lang.String r5 = "image/avif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L6c
            goto L6d
        L6c:
            r4 = r3
        L6d:
            switch(r4) {
                case 0: goto L76;
                case 1: goto L71;
                case 2: goto L71;
                case 3: goto L7a;
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L7a;
                default: goto L70;
            }
        L70:
            goto L7f
        L71:
            r7 = 26
            if (r2 < r7) goto L7f
            goto L7a
        L76:
            r7 = 34
            if (r2 < r7) goto L7f
        L7a:
            int r7 = A0.e.r(r0, r3, r3, r3)
            return r7
        L7f:
            int r7 = A0.e.r(r1, r3, r3, r3)
            return r7
        L84:
            int r7 = A0.e.r(r3, r3, r3, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: A.b.I(t2.p):int");
    }

    public void J(float f7, float f8) {
        ((A0.b) this.f3p).S().h(f7, f8);
    }

    @Override // G1.InterfaceC0136c
    public C0139f a() {
        return new C0139f(new b(((ContentInfo.Builder) this.f3p).build()));
    }

    @Override // F2.k
    public void b(int i7, int i8, int i9, long j3) {
        ((MediaCodec) this.f3p).queueInputBuffer(i7, 0, i8, j3, i9);
    }

    @Override // F2.k
    public void c(int i7, C2081b c2081b, long j3, int i8) {
        ((MediaCodec) this.f3p).queueSecureInputBuffer(i7, 0, c2081b.f21111i, j3, i8);
    }

    @Override // F2.k
    public void d(Bundle bundle) {
        ((MediaCodec) this.f3p).setParameters(bundle);
    }

    @Override // A3.e
    public void e(int i7, Serializable serializable) {
        if (i7 == 6 || i7 == 7 || i7 == 8) {
        }
        ((ProfileInstallReceiver) this.f3p).setResultCode(i7);
    }

    @Override // G1.InterfaceC0136c
    public void f(Bundle bundle) {
        ((ContentInfo.Builder) this.f3p).setExtras(bundle);
    }

    @Override // G1.InterfaceC0136c
    public void h(Uri uri) {
        ((ContentInfo.Builder) this.f3p).setLinkUri(uri);
    }

    @Override // G1.InterfaceC0136c
    public void i(int i7) {
        ((ContentInfo.Builder) this.f3p).setFlags(i7);
    }

    @Override // G1.InterfaceC0138e
    public int j() {
        return ((ContentInfo) this.f3p).getFlags();
    }

    @Override // G1.InterfaceC0138e
    public ClipData k() {
        return ((ContentInfo) this.f3p).getClip();
    }

    @Override // G1.InterfaceC0138e
    public ContentInfo l() {
        return (ContentInfo) this.f3p;
    }

    @Override // G1.InterfaceC0138e
    public int m() {
        return ((ContentInfo) this.f3p).getSource();
    }

    public void o(float f7, float f8, float f9, float f10, int i7) {
        ((A0.b) this.f3p).S().g(f7, f8, f9, f10, i7);
    }

    public synchronized void p(y yVar) {
        AbstractC1209k.f(yVar, "route");
        ((LinkedHashSet) this.f3p).remove(yVar);
    }

    public H1.e q(int i7) {
        return null;
    }

    public H1.e r(int i7) {
        return null;
    }

    public void s() {
        View view = (View) this.f3p;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void t(float f7, float f8, float f9, float f10) {
        A0.b bVar = (A0.b) this.f3p;
        InterfaceC1985r interfaceC1985rS = bVar.S();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.W() >> 32)) - (f9 + f7);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.W() & 4294967295L)) - (f10 + f8))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= 0.0f)) {
            AbstractC1951A.a("Width and height must be greater than or equal to zero");
        }
        bVar.p0(jFloatToRawIntBits);
        interfaceC1985rS.h(f7, f8);
    }

    public String toString() {
        switch (this.f2o) {
            case 17:
                return "ContentInfoCompat{" + ((ContentInfo) this.f3p) + "}";
            default:
                return super.toString();
        }
    }

    public void u() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = ((MainActivity) this.f3p).getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        G(theme, typedValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x001d, code lost:
    
        if (r1.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen") != false) goto L26;
     */
    @Override // F2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public F2.j v(F2.h r4) {
        /*
            r3 = this;
            int r0 = w2.t.f18881a
            r1 = 23
            if (r0 < r1) goto L46
            r1 = 31
            if (r0 < r1) goto Lb
            goto L1f
        Lb:
            java.lang.Object r1 = r3.f3p
            yos.music.player.logic.YosPlaybackService r1 = (yos.music.player.logic.YosPlaybackService) r1
            r2 = 28
            if (r0 < r2) goto L46
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            java.lang.String r1 = "com.amazon.hardware.tv_screen"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto L46
        L1f:
            t2.p r0 = r4.f2221c
            java.lang.String r0 = r0.f16701m
            int r0 = t2.M.e(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Creating an asynchronous MediaCodec adapter for track type "
            r1.<init>(r2)
            java.lang.String r2 = w2.t.w(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            w2.AbstractC1697a.q(r1)
            V.o r1 = new V.o
            r1.<init>(r0)
            F2.c r4 = r1.v(r4)
            return r4
        L46:
            A2.x0 r0 = new A2.x0
            r1 = 10
            r0.<init>(r1)
            F2.j r4 = r0.v(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: A.b.v(F2.h):F2.j");
    }

    public void x(Exception exc) {
        switch (this.f2o) {
            case 4:
                AbstractC1697a.n("Audio sink error", exc);
                o oVar = ((androidx.media3.decoder.ffmpeg.c) this.f3p).f9804F;
                Handler handler = (Handler) oVar.f7342p;
                if (handler != null) {
                    handler.post(new RunnableC0044p(oVar, exc, 4));
                }
                break;
            default:
                AbstractC1697a.n("Audio sink error", exc);
                o oVar2 = ((V) this.f3p).f1076U0;
                Handler handler2 = (Handler) oVar2.f7342p;
                if (handler2 != null) {
                    handler2.post(new RunnableC0044p(oVar2, exc, 4));
                }
                break;
        }
    }

    public void y() {
        switch (this.f2o) {
            case 4:
                break;
            default:
                O o7 = ((V) this.f3p).f2275U;
                if (o7 != null) {
                    o7.a();
                }
                break;
        }
    }

    public b(View view) {
        this.f2o = 19;
        if (Build.VERSION.SDK_INT < 30) {
            this.f3p = new b(18, view);
            return;
        }
        r rVar = new r(18, view);
        rVar.f2733q = view;
        this.f3p = rVar;
    }

    public b(int i7) {
        this.f2o = i7;
        switch (i7) {
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                this.f3p = new B2.g(5);
                break;
            case 14:
                AbstractC1209k.f(TimeUnit.MINUTES, "timeUnit");
                this.f3p = new J5.l(I5.d.f3554i);
                break;
            case 22:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f3p = new H1.g(this);
                } else {
                    this.f3p = new H1.f(this);
                }
                break;
            case 24:
                this.f3p = new C0746L(12);
                break;
            case 26:
                this.f3p = new LinkedHashSet();
                break;
            case 27:
                this.f3p = new C1463s((Object) null);
                break;
            case 29:
                this.f3p = new CopyOnWriteArrayList();
                break;
        }
    }

    public b(View view, Window window) {
        this.f2o = 20;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            this.f3p = new q0(window);
            return;
        }
        if (i7 >= 30) {
            this.f3p = new p0(window);
        } else if (i7 >= 26) {
            this.f3p = new o0(window);
        } else {
            this.f3p = new n0(window);
        }
    }

    @Override // F2.k
    public void flush() {
    }

    @Override // F2.k
    public void g() {
    }

    @Override // F2.k
    public void shutdown() {
    }

    @Override // F2.k
    public void start() {
    }

    public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f2o = 23;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f3p = new I1.g(uri, clipDescription, uri2);
        } else {
            this.f3p = new A0.b(uri, clipDescription, uri2, 8);
        }
    }

    public b(G5.a aVar) {
        this.f2o = 25;
        this.f3p = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }

    public b(ContentInfo contentInfo) {
        this.f2o = 17;
        contentInfo.getClass();
        this.f3p = AbstractC0029a.n(contentInfo);
    }

    public b(ClipData clipData, int i7) {
        this.f2o = 16;
        this.f3p = AbstractC0029a.l(clipData, i7);
    }

    public void n(int i7, H1.e eVar, String str, Bundle bundle) {
    }
}
