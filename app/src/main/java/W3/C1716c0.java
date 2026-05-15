package w3;

import A2.RunnableC0022x;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import d2.C0821i;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import t.C1450e;
import t2.C1470C;
import t2.C1476e;
import t2.C1482k;
import t2.C1488q;
import v2.C1636c;
import w2.AbstractC1697a;
import x3.C1901C;
import x3.C1903E;
import x3.C1904F;
import x3.C1911M;
import x3.C1925j;
import x3.C1928m;
import x3.InterfaceC1923h;

/* JADX INFO: renamed from: w3.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1716c0 implements InterfaceC1758x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1760y f19154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B1 f19155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w2.j f19156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1710a0 f19157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V1.a f19158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public V1.a f19159g;
    public C1928m h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1713b0 f19162k = new C1713b0();
    public C1713b0 l = new C1713b0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public B2.h f19163m = new B2.h(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f19164n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f19165o = -9223372036854775807L;

    public C1716c0(Context context, C1760y c1760y, B1 b12, Looper looper, V1.a aVar) {
        this.f19156d = new w2.j(looper, w2.o.f18873a, new W(this));
        this.f19153a = context;
        this.f19154b = c1760y;
        this.f19157e = new C1710a0(this, looper);
        this.f19155c = b12;
        this.f19158f = aVar;
    }

    public static List O0(List list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static x3.m0 P0(x3.m0 m0Var) {
        if (m0Var == null) {
            return null;
        }
        if (m0Var.f20071r > 0.0f) {
            return m0Var;
        }
        AbstractC1697a.w("Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList arrayList = new ArrayList();
        AbstractCollection abstractCollection = m0Var.f20076w;
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        return new x3.m0(m0Var.f20068o, m0Var.f20069p, m0Var.f20070q, 1.0f, m0Var.f20072s, m0Var.f20073t, m0Var.f20074u, m0Var.f20075v, arrayList, m0Var.f20077x, m0Var.f20078y);
    }

    public static t2.W Q0(int i7, t2.G g6, long j3, boolean z6) {
        return new t2.W(null, i7, g6, null, i7, j3, j3, z6 ? 0 : -1, z6 ? 0 : -1);
    }

    @Override // w3.InterfaceC1758x
    public final void A(t2.V v3) {
        this.f19156d.a(v3);
    }

    @Override // w3.InterfaceC1758x
    public final void A0(float f7) {
        AbstractC1697a.w("Session doesn't support setting player volume");
    }

    @Override // w3.InterfaceC1758x
    public final long B() {
        return ((n1) this.f19163m.f749a).f19291c.f19422e;
    }

    @Override // w3.InterfaceC1758x
    public final t2.J B0() {
        t2.G gS = ((n1) this.f19163m.f749a).s();
        return gS == null ? t2.J.f16263J : gS.f16226d;
    }

    @Override // w3.InterfaceC1758x
    public final boolean C() {
        return ((n1) this.f19163m.f749a).f19306t;
    }

    @Override // w3.InterfaceC1758x
    public final void C0(List list) {
        m(list, 0, -9223372036854775807L);
    }

    @Override // w3.InterfaceC1758x
    public final void D() {
        u0(0, Integer.MAX_VALUE);
    }

    @Override // w3.InterfaceC1758x
    public final void D0() {
        this.f19159g.F().f19983a.skipToPrevious();
    }

    @Override // w3.InterfaceC1758x
    public final void E(boolean z6) {
        if (z6 != r0()) {
            n1 n1VarK = ((n1) this.f19163m.f749a).k(z6);
            B2.h hVar = this.f19163m;
            X0(new B2.h(n1VarK, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), null, null);
        }
        C1904F c1904fF = this.f19159g.F();
        E4.M m7 = AbstractC1748s.f19344a;
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", z6 ? 1 : 0);
        c1904fF.K("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
    }

    @Override // w3.InterfaceC1758x
    public final void E0(t2.G g6, long j3) {
        m(E4.I.t(g6), 0, j3);
    }

    @Override // w3.InterfaceC1758x
    public final void F() {
        this.f19159g.F().f19983a.skipToNext();
    }

    @Override // w3.InterfaceC1758x
    public final long F0() {
        long jF = k1.f((n1) this.f19163m.f749a, this.f19164n, this.f19165o, this.f19154b.f19402f);
        this.f19164n = jF;
        return jF;
    }

    @Override // w3.InterfaceC1758x
    public final void G(int i7) {
        int iO = o() - 1;
        if (iO >= X().f16504b) {
            n1 n1VarC = ((n1) this.f19163m.f749a).c(iO, n0());
            B2.h hVar = this.f19163m;
            X0(new B2.h(n1VarC, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), null, null);
        }
        ((C1901C) this.f19159g.f7389o).f19973a.adjustVolume(-1, i7);
    }

    @Override // w3.InterfaceC1758x
    public final long G0() {
        return ((n1) this.f19163m.f749a).f19284A;
    }

    @Override // w3.InterfaceC1758x
    public final t2.p0 H() {
        return t2.p0.f16715b;
    }

    @Override // w3.InterfaceC1758x
    public final boolean H0() {
        return this.f19161j;
    }

    @Override // w3.InterfaceC1758x
    public final int I() {
        return ((n1) this.f19163m.f749a).f19291c.f19423f;
    }

    @Override // w3.InterfaceC1758x
    public final w1 I0() {
        return (w1) this.f19163m.f751c;
    }

    @Override // w3.InterfaceC1758x
    public final long J() {
        return ((n1) this.f19163m.f749a).f19286C;
    }

    @Override // w3.InterfaceC1758x
    public final I4.y J0(v1 v1Var) {
        Bundle bundle = Bundle.EMPTY;
        w1 w1Var = (w1) this.f19163m.f751c;
        w1Var.getClass();
        boolean zContains = w1Var.f19387a.contains(v1Var);
        String str = v1Var.f19383b;
        if (zContains) {
            this.f19159g.F().K(str, bundle);
            return M3.a.U(new z1(0));
        }
        I4.E e7 = new I4.E();
        Z z6 = new Z(this.f19154b.f19401e, e7);
        V1.a aVar = this.f19159g;
        aVar.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command must neither be null nor empty");
        }
        ((C1901C) aVar.f7389o).f19973a.sendCommand(str, bundle, z6);
        return e7;
    }

    @Override // w3.InterfaceC1758x
    public final t2.J K() {
        return ((n1) this.f19163m.f749a).f19299m;
    }

    @Override // w3.InterfaceC1758x
    public final void K0() {
        B1 b12 = this.f19155c;
        int iA = b12.f18932a.a();
        C1760y c1760y = this.f19154b;
        if (iA != 0) {
            c1760y.Q0(new X(this, 1));
            return;
        }
        Object objQ = b12.f18932a.q();
        AbstractC1697a.j(objQ);
        c1760y.Q0(new RunnableC0022x(this, 13, (x3.Y) objQ));
        c1760y.f19401e.post(new X(this, 0));
    }

    @Override // w3.InterfaceC1758x
    public final boolean L() {
        return ((n1) this.f19163m.f749a).f19308v;
    }

    @Override // w3.InterfaceC1758x
    public final E4.I L0() {
        return (E4.I) this.f19163m.f750b;
    }

    @Override // w3.InterfaceC1758x
    public final long M() {
        return l0();
    }

    @Override // w3.InterfaceC1758x
    public final void M0(C1488q c1488q) {
        this.f19156d.e(c1488q);
    }

    @Override // w3.InterfaceC1758x
    public final int N() {
        return V();
    }

    public final void N0(int i7, List list) {
        ArrayList arrayList = new ArrayList();
        Y y6 = new Y(this, new AtomicInteger(0), list, arrayList, i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            byte[] bArr = ((t2.G) list.get(i8)).f16226d.f16313k;
            if (bArr == null) {
                arrayList.add(null);
                y6.run();
            } else {
                I4.y yVarW = this.f19158f.w(bArr);
                arrayList.add(yVarW);
                Handler handler = this.f19154b.f19401e;
                Objects.requireNonNull(handler);
                yVarW.b(y6, new C2.O(handler, 0));
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final C1636c O() {
        AbstractC1697a.w("Session doesn't support getting Cue");
        return C1636c.f18271c;
    }

    @Override // w3.InterfaceC1758x
    public final t2.s0 P() {
        AbstractC1697a.w("Session doesn't support getting VideoSize");
        return t2.s0.f16725e;
    }

    @Override // w3.InterfaceC1758x
    public final void Q() {
        this.f19159g.F().f19983a.skipToPrevious();
    }

    @Override // w3.InterfaceC1758x
    public final float R() {
        return 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03cd A[PHI: r30
  0x03cd: PHI (r30v8 long) = (r30v5 long), (r30v9 long) binds: [B:190:0x03d8, B:185:0x03ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0799 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0654 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x07e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d5  */
    /* JADX WARN: Type inference failed for: r10v49, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.util.AbstractCollection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R0(boolean r76, w3.C1713b0 r77) {
        /*
            Method dump skipped, instruction units count: 2226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.C1716c0.R0(boolean, w3.b0):void");
    }

    @Override // w3.InterfaceC1758x
    public final void S() {
        V0(0L, V());
    }

    public final void S0() {
        t2.g0 g0Var = new t2.g0();
        AbstractC1697a.i(T0() && !((n1) this.f19163m.f749a).f19297j.p());
        n1 n1Var = (n1) this.f19163m.f749a;
        t1 t1Var = (t1) n1Var.f19297j;
        int i7 = n1Var.f19291c.f19418a.f16364b;
        t1Var.m(i7, g0Var, 0L);
        t2.G g6 = g0Var.f16456c;
        if (t1Var.r(i7) == -1) {
            C1470C c1470c = g6.f16228f;
            if (c1470c.f16196a != null) {
                if (((n1) this.f19163m.f749a).f19306t) {
                    C1904F c1904fF = this.f19159g.F();
                    Uri uri = c1470c.f16196a;
                    Bundle bundle = c1470c.f16198c;
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    c1904fF.f19983a.playFromUri(uri, bundle);
                } else {
                    C1904F c1904fF2 = this.f19159g.F();
                    Uri uri2 = c1470c.f16196a;
                    Bundle bundle2 = c1470c.f16198c;
                    if (bundle2 == null) {
                        bundle2 = Bundle.EMPTY;
                    }
                    c1904fF2.J(uri2, bundle2);
                }
            } else if (c1470c.f16197b == null) {
                boolean z6 = ((n1) this.f19163m.f749a).f19306t;
                String str = g6.f16223a;
                if (z6) {
                    C1904F c1904fF3 = this.f19159g.F();
                    Bundle bundle3 = c1470c.f16198c;
                    if (bundle3 == null) {
                        bundle3 = Bundle.EMPTY;
                    }
                    c1904fF3.f19983a.playFromMediaId(str, bundle3);
                } else {
                    C1904F c1904fF4 = this.f19159g.F();
                    Bundle bundle4 = c1470c.f16198c;
                    if (bundle4 == null) {
                        bundle4 = Bundle.EMPTY;
                    }
                    c1904fF4.H(str, bundle4);
                }
            } else if (((n1) this.f19163m.f749a).f19306t) {
                C1904F c1904fF5 = this.f19159g.F();
                String str2 = c1470c.f16197b;
                Bundle bundle5 = c1470c.f16198c;
                if (bundle5 == null) {
                    bundle5 = Bundle.EMPTY;
                }
                c1904fF5.f19983a.playFromSearch(str2, bundle5);
            } else {
                C1904F c1904fF6 = this.f19159g.F();
                String str3 = c1470c.f16197b;
                Bundle bundle6 = c1470c.f16198c;
                if (bundle6 == null) {
                    bundle6 = Bundle.EMPTY;
                }
                c1904fF6.I(str3, bundle6);
            }
        } else if (((n1) this.f19163m.f749a).f19306t) {
            this.f19159g.F().f19983a.play();
        } else {
            this.f19159g.F().G();
        }
        if (((n1) this.f19163m.f749a).f19291c.f19418a.f16368f != 0) {
            this.f19159g.F().f19983a.seekTo(((n1) this.f19163m.f749a).f19291c.f19418a.f16368f);
        }
        if (((t2.T) this.f19163m.f752d).a(20)) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < t1Var.o(); i8++) {
                if (i8 != i7 && t1Var.r(i8) == -1) {
                    t1Var.m(i8, g0Var, 0L);
                    arrayList.add(g0Var.f16456c);
                }
            }
            N0(0, arrayList);
        }
    }

    @Override // w3.InterfaceC1758x
    public final C1476e T() {
        return ((n1) this.f19163m.f749a).f19301o;
    }

    public final boolean T0() {
        return ((n1) this.f19163m.f749a).f19311y != 1;
    }

    @Override // w3.InterfaceC1758x
    public final int U() {
        return -1;
    }

    public final void U0() {
        C1911M c1911m;
        int i7;
        if (this.f19160i || this.f19161j) {
            return;
        }
        this.f19161j = true;
        C1903E c1903eB = this.f19159g.B();
        x3.m0 m0VarP0 = P0(this.f19159g.C());
        MediaMetadata metadata = ((C1901C) this.f19159g.f7389o).f19973a.getMetadata();
        if (metadata != null) {
            C1450e c1450e = C1911M.f19993q;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            C1911M c1911mCreateFromParcel = C1911M.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            c1911mCreateFromParcel.f19996p = metadata;
            c1911m = c1911mCreateFromParcel;
        } else {
            c1911m = null;
        }
        List<MediaSession.QueueItem> queue = ((C1901C) this.f19159g.f7389o).f19973a.getQueue();
        List listO0 = O0(queue != null ? x3.W.a(queue) : null);
        CharSequence queueTitle = ((C1901C) this.f19159g.f7389o).f19973a.getQueueTitle();
        InterfaceC1923h interfaceC1923hA = ((C1901C) this.f19159g.f7389o).f19977e.a();
        int iR = -1;
        if (interfaceC1923hA != null) {
            try {
                i7 = interfaceC1923hA.i();
            } catch (RemoteException unused) {
                i7 = -1;
            }
        } else {
            i7 = -1;
        }
        InterfaceC1923h interfaceC1923hA2 = ((C1901C) this.f19159g.f7389o).f19977e.a();
        if (interfaceC1923hA2 != null) {
            try {
                iR = interfaceC1923hA2.R();
            } catch (RemoteException unused2) {
            }
        }
        R0(true, new C1713b0(c1903eB, m0VarP0, c1911m, listO0, queueTitle, i7, iR, ((C1901C) this.f19159g.f7389o).f19973a.getExtras()));
    }

    @Override // w3.InterfaceC1758x
    public final int V() {
        return ((n1) this.f19163m.f749a).f19291c.f19418a.f16364b;
    }

    public final void V0(long j3, int i7) {
        Integer num;
        Integer num2;
        int i8;
        long j7;
        long j8;
        long j9;
        long j10 = j3;
        int i9 = i7;
        AbstractC1697a.d(i9 >= 0);
        int iV = V();
        t2.h0 h0Var = ((n1) this.f19163m.f749a).f19297j;
        if ((h0Var.p() || i9 < h0Var.o()) && !r()) {
            if (i9 != iV) {
                long jR = ((t1) ((n1) this.f19163m.f749a).f19297j).r(i9);
                if (jR != -1) {
                    this.f19159g.F().f19983a.skipToQueueItem(jR);
                    num = 2;
                } else {
                    n1.c.x(i9, "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=");
                    i9 = iV;
                    num = null;
                }
            } else {
                i9 = iV;
                num = null;
            }
            long jF0 = F0();
            if (j10 == -9223372036854775807L) {
                j10 = jF0;
                num2 = null;
            } else {
                this.f19159g.F().f19983a.seekTo(j10);
                num2 = 1;
            }
            if (num == null) {
                long jB = B();
                long jL0 = l0();
                long jMax = j10 < jF0 ? j10 : Math.max(j10, jB);
                j7 = jMax;
                i8 = jL0 == -9223372036854775807L ? 0 : (int) ((100 * jMax) / jL0);
                j8 = jMax - j10;
                j9 = jL0;
            } else {
                i8 = 0;
                j7 = 0;
                j8 = 0;
                j9 = -9223372036854775807L;
            }
            n1 n1VarJ = ((n1) this.f19163m.f749a).j(new y1(Q0(i9, !h0Var.p() ? h0Var.m(i9, new t2.g0(), 0L).f16456c : null, j10, false), false, SystemClock.elapsedRealtime(), j9, j7, i8, j8, -9223372036854775807L, j9, j7));
            if (n1VarJ.f19311y != 1) {
                n1VarJ = n1VarJ.f(2, null);
            }
            n1 n1Var = n1VarJ;
            B2.h hVar = this.f19163m;
            X0(new B2.h(n1Var, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), num2, num);
        }
    }

    @Override // w3.InterfaceC1758x
    public final void W(int i7, boolean z6) {
        if (w2.t.f18881a < 23) {
            AbstractC1697a.w("Session doesn't support setting mute state at API level less than 23");
            return;
        }
        if (z6 != n0()) {
            n1 n1VarC = ((n1) this.f19163m.f749a).c(o(), z6);
            B2.h hVar = this.f19163m;
            X0(new B2.h(n1VarC, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), null, null);
        }
        ((C1901C) this.f19159g.f7389o).f19973a.adjustVolume(z6 ? -100 : 100, i7);
    }

    public final void W0(boolean z6, C1713b0 c1713b0, final B2.h hVar, Integer num, Integer num2) {
        C1713b0 c1713b02 = this.f19162k;
        B2.h hVar2 = this.f19163m;
        if (c1713b02 != c1713b0) {
            this.f19162k = new C1713b0(c1713b0);
        }
        this.l = this.f19162k;
        this.f19163m = hVar;
        C1760y c1760y = this.f19154b;
        E4.I i7 = (E4.I) hVar.f750b;
        if (z6) {
            c1760y.P0();
            if (((E4.I) hVar2.f750b).equals(i7)) {
                return;
            }
            AbstractC1697a.i(Looper.myLooper() == c1760y.f19401e.getLooper());
            InterfaceC1756w interfaceC1756w = c1760y.f19400d;
            interfaceC1756w.m(c1760y, i7);
            interfaceC1756w.k();
            return;
        }
        t2.h0 h0Var = ((n1) hVar2.f749a).f19297j;
        n1 n1Var = (n1) hVar.f749a;
        boolean zEquals = h0Var.equals(n1Var.f19297j);
        w2.j jVar = this.f19156d;
        if (!zEquals) {
            final int i8 = 4;
            jVar.c(0, new w2.g() { // from class: w3.V
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i8) {
                        case 0:
                            v3.P(((n1) hVar.f749a).f19301o);
                            break;
                        case 1:
                            v3.S(((n1) hVar.f749a).f19303q);
                            break;
                        case 2:
                            n1 n1Var2 = (n1) hVar.f749a;
                            v3.U(n1Var2.f19304r, n1Var2.f19305s);
                            break;
                        case 3:
                            v3.d((t2.T) hVar.f752d);
                            break;
                        case 4:
                            n1 n1Var3 = (n1) hVar.f749a;
                            v3.J(n1Var3.f19297j, n1Var3.f19298k);
                            break;
                        case 5:
                            v3.q(((n1) hVar.f749a).f19299m);
                            break;
                        case 6:
                            v3.G(((n1) hVar.f749a).f19311y);
                            break;
                        case 7:
                            v3.x(4, ((n1) hVar.f749a).f19306t);
                            break;
                        case 8:
                            v3.V(((n1) hVar.f749a).f19308v);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.O(((n1) hVar.f749a).f19295g);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.c(((n1) hVar.f749a).h);
                            break;
                        default:
                            v3.K(((n1) hVar.f749a).f19296i);
                            break;
                    }
                }
            });
        }
        if (!w2.t.a(c1713b02.f19144e, c1713b0.f19144e)) {
            final int i9 = 5;
            jVar.c(15, new w2.g() { // from class: w3.V
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i9) {
                        case 0:
                            v3.P(((n1) hVar.f749a).f19301o);
                            break;
                        case 1:
                            v3.S(((n1) hVar.f749a).f19303q);
                            break;
                        case 2:
                            n1 n1Var2 = (n1) hVar.f749a;
                            v3.U(n1Var2.f19304r, n1Var2.f19305s);
                            break;
                        case 3:
                            v3.d((t2.T) hVar.f752d);
                            break;
                        case 4:
                            n1 n1Var3 = (n1) hVar.f749a;
                            v3.J(n1Var3.f19297j, n1Var3.f19298k);
                            break;
                        case 5:
                            v3.q(((n1) hVar.f749a).f19299m);
                            break;
                        case 6:
                            v3.G(((n1) hVar.f749a).f19311y);
                            break;
                        case 7:
                            v3.x(4, ((n1) hVar.f749a).f19306t);
                            break;
                        case 8:
                            v3.V(((n1) hVar.f749a).f19308v);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.O(((n1) hVar.f749a).f19295g);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.c(((n1) hVar.f749a).h);
                            break;
                        default:
                            v3.K(((n1) hVar.f749a).f19296i);
                            break;
                    }
                }
            });
        }
        if (num != null) {
            jVar.c(11, new c6.d(hVar2, hVar, num, 1));
        }
        if (num2 != null) {
            jVar.c(1, new B2.b(hVar, 12, num2));
        }
        x3.m0 m0Var = c1713b02.f19141b;
        boolean z7 = m0Var != null && m0Var.f20068o == 7;
        x3.m0 m0Var2 = c1713b0.f19141b;
        boolean z8 = m0Var2 != null && m0Var2.f20068o == 7;
        if (!z7 || !z8 ? z7 != z8 : m0Var.f20073t != m0Var2.f20073t || !TextUtils.equals(m0Var.f20074u, m0Var2.f20074u)) {
            t2.P pM = AbstractC1748s.m(m0Var2);
            jVar.c(10, new B2.c(3, pM));
            if (pM != null) {
                jVar.c(10, new B2.c(4, pM));
            }
        }
        if (c1713b02.f19142c != c1713b0.f19142c) {
            jVar.c(14, new W(this));
        }
        n1 n1Var2 = (n1) hVar2.f749a;
        if (n1Var2.f19311y != n1Var.f19311y) {
            final int i10 = 6;
            jVar.c(4, new w2.g() { // from class: w3.V
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i10) {
                        case 0:
                            v3.P(((n1) hVar.f749a).f19301o);
                            break;
                        case 1:
                            v3.S(((n1) hVar.f749a).f19303q);
                            break;
                        case 2:
                            n1 n1Var22 = (n1) hVar.f749a;
                            v3.U(n1Var22.f19304r, n1Var22.f19305s);
                            break;
                        case 3:
                            v3.d((t2.T) hVar.f752d);
                            break;
                        case 4:
                            n1 n1Var3 = (n1) hVar.f749a;
                            v3.J(n1Var3.f19297j, n1Var3.f19298k);
                            break;
                        case 5:
                            v3.q(((n1) hVar.f749a).f19299m);
                            break;
                        case 6:
                            v3.G(((n1) hVar.f749a).f19311y);
                            break;
                        case 7:
                            v3.x(4, ((n1) hVar.f749a).f19306t);
                            break;
                        case 8:
                            v3.V(((n1) hVar.f749a).f19308v);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.O(((n1) hVar.f749a).f19295g);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.c(((n1) hVar.f749a).h);
                            break;
                        default:
                            v3.K(((n1) hVar.f749a).f19296i);
                            break;
                    }
                }
            });
        }
        if (n1Var2.f19306t != n1Var.f19306t) {
            final int i11 = 7;
            jVar.c(5, new w2.g() { // from class: w3.V
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i11) {
                        case 0:
                            v3.P(((n1) hVar.f749a).f19301o);
                            break;
                        case 1:
                            v3.S(((n1) hVar.f749a).f19303q);
                            break;
                        case 2:
                            n1 n1Var22 = (n1) hVar.f749a;
                            v3.U(n1Var22.f19304r, n1Var22.f19305s);
                            break;
                        case 3:
                            v3.d((t2.T) hVar.f752d);
                            break;
                        case 4:
                            n1 n1Var3 = (n1) hVar.f749a;
                            v3.J(n1Var3.f19297j, n1Var3.f19298k);
                            break;
                        case 5:
                            v3.q(((n1) hVar.f749a).f19299m);
                            break;
                        case 6:
                            v3.G(((n1) hVar.f749a).f19311y);
                            break;
                        case 7:
                            v3.x(4, ((n1) hVar.f749a).f19306t);
                            break;
                        case 8:
                            v3.V(((n1) hVar.f749a).f19308v);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.O(((n1) hVar.f749a).f19295g);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.c(((n1) hVar.f749a).h);
                            break;
                        default:
                            v3.K(((n1) hVar.f749a).f19296i);
                            break;
                    }
                }
            });
        }
        if (n1Var2.f19308v != n1Var.f19308v) {
            final int i12 = 8;
            jVar.c(7, new w2.g() { // from class: w3.V
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i12) {
                        case 0:
                            v3.P(((n1) hVar.f749a).f19301o);
                            break;
                        case 1:
                            v3.S(((n1) hVar.f749a).f19303q);
                            break;
                        case 2:
                            n1 n1Var22 = (n1) hVar.f749a;
                            v3.U(n1Var22.f19304r, n1Var22.f19305s);
                            break;
                        case 3:
                            v3.d((t2.T) hVar.f752d);
                            break;
                        case 4:
                            n1 n1Var3 = (n1) hVar.f749a;
                            v3.J(n1Var3.f19297j, n1Var3.f19298k);
                            break;
                        case 5:
                            v3.q(((n1) hVar.f749a).f19299m);
                            break;
                        case 6:
                            v3.G(((n1) hVar.f749a).f19311y);
                            break;
                        case 7:
                            v3.x(4, ((n1) hVar.f749a).f19306t);
                            break;
                        case 8:
                            v3.V(((n1) hVar.f749a).f19308v);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.O(((n1) hVar.f749a).f19295g);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.c(((n1) hVar.f749a).h);
                            break;
                        default:
                            v3.K(((n1) hVar.f749a).f19296i);
                            break;
                    }
                }
            });
        }
        if (!n1Var2.f19295g.equals(n1Var.f19295g)) {
            final int i13 = 9;
            jVar.c(12, new w2.g() { // from class: w3.V
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i13) {
                        case 0:
                            v3.P(((n1) hVar.f749a).f19301o);
                            break;
                        case 1:
                            v3.S(((n1) hVar.f749a).f19303q);
                            break;
                        case 2:
                            n1 n1Var22 = (n1) hVar.f749a;
                            v3.U(n1Var22.f19304r, n1Var22.f19305s);
                            break;
                        case 3:
                            v3.d((t2.T) hVar.f752d);
                            break;
                        case 4:
                            n1 n1Var3 = (n1) hVar.f749a;
                            v3.J(n1Var3.f19297j, n1Var3.f19298k);
                            break;
                        case 5:
                            v3.q(((n1) hVar.f749a).f19299m);
                            break;
                        case 6:
                            v3.G(((n1) hVar.f749a).f19311y);
                            break;
                        case 7:
                            v3.x(4, ((n1) hVar.f749a).f19306t);
                            break;
                        case 8:
                            v3.V(((n1) hVar.f749a).f19308v);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.O(((n1) hVar.f749a).f19295g);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.c(((n1) hVar.f749a).h);
                            break;
                        default:
                            v3.K(((n1) hVar.f749a).f19296i);
                            break;
                    }
                }
            });
        }
        if (n1Var2.h != n1Var.h) {
            final int i14 = 10;
            jVar.c(8, new w2.g() { // from class: w3.V
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i14) {
                        case 0:
                            v3.P(((n1) hVar.f749a).f19301o);
                            break;
                        case 1:
                            v3.S(((n1) hVar.f749a).f19303q);
                            break;
                        case 2:
                            n1 n1Var22 = (n1) hVar.f749a;
                            v3.U(n1Var22.f19304r, n1Var22.f19305s);
                            break;
                        case 3:
                            v3.d((t2.T) hVar.f752d);
                            break;
                        case 4:
                            n1 n1Var3 = (n1) hVar.f749a;
                            v3.J(n1Var3.f19297j, n1Var3.f19298k);
                            break;
                        case 5:
                            v3.q(((n1) hVar.f749a).f19299m);
                            break;
                        case 6:
                            v3.G(((n1) hVar.f749a).f19311y);
                            break;
                        case 7:
                            v3.x(4, ((n1) hVar.f749a).f19306t);
                            break;
                        case 8:
                            v3.V(((n1) hVar.f749a).f19308v);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.O(((n1) hVar.f749a).f19295g);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.c(((n1) hVar.f749a).h);
                            break;
                        default:
                            v3.K(((n1) hVar.f749a).f19296i);
                            break;
                    }
                }
            });
        }
        if (n1Var2.f19296i != n1Var.f19296i) {
            final int i15 = 11;
            jVar.c(9, new w2.g() { // from class: w3.V
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i15) {
                        case 0:
                            v3.P(((n1) hVar.f749a).f19301o);
                            break;
                        case 1:
                            v3.S(((n1) hVar.f749a).f19303q);
                            break;
                        case 2:
                            n1 n1Var22 = (n1) hVar.f749a;
                            v3.U(n1Var22.f19304r, n1Var22.f19305s);
                            break;
                        case 3:
                            v3.d((t2.T) hVar.f752d);
                            break;
                        case 4:
                            n1 n1Var3 = (n1) hVar.f749a;
                            v3.J(n1Var3.f19297j, n1Var3.f19298k);
                            break;
                        case 5:
                            v3.q(((n1) hVar.f749a).f19299m);
                            break;
                        case 6:
                            v3.G(((n1) hVar.f749a).f19311y);
                            break;
                        case 7:
                            v3.x(4, ((n1) hVar.f749a).f19306t);
                            break;
                        case 8:
                            v3.V(((n1) hVar.f749a).f19308v);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.O(((n1) hVar.f749a).f19295g);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.c(((n1) hVar.f749a).h);
                            break;
                        default:
                            v3.K(((n1) hVar.f749a).f19296i);
                            break;
                    }
                }
            });
        }
        if (!n1Var2.f19301o.equals(n1Var.f19301o)) {
            final int i16 = 0;
            jVar.c(20, new w2.g() { // from class: w3.V
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i16) {
                        case 0:
                            v3.P(((n1) hVar.f749a).f19301o);
                            break;
                        case 1:
                            v3.S(((n1) hVar.f749a).f19303q);
                            break;
                        case 2:
                            n1 n1Var22 = (n1) hVar.f749a;
                            v3.U(n1Var22.f19304r, n1Var22.f19305s);
                            break;
                        case 3:
                            v3.d((t2.T) hVar.f752d);
                            break;
                        case 4:
                            n1 n1Var3 = (n1) hVar.f749a;
                            v3.J(n1Var3.f19297j, n1Var3.f19298k);
                            break;
                        case 5:
                            v3.q(((n1) hVar.f749a).f19299m);
                            break;
                        case 6:
                            v3.G(((n1) hVar.f749a).f19311y);
                            break;
                        case 7:
                            v3.x(4, ((n1) hVar.f749a).f19306t);
                            break;
                        case 8:
                            v3.V(((n1) hVar.f749a).f19308v);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.O(((n1) hVar.f749a).f19295g);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.c(((n1) hVar.f749a).h);
                            break;
                        default:
                            v3.K(((n1) hVar.f749a).f19296i);
                            break;
                    }
                }
            });
        }
        if (!n1Var2.f19303q.equals(n1Var.f19303q)) {
            final int i17 = 1;
            jVar.c(29, new w2.g() { // from class: w3.V
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i17) {
                        case 0:
                            v3.P(((n1) hVar.f749a).f19301o);
                            break;
                        case 1:
                            v3.S(((n1) hVar.f749a).f19303q);
                            break;
                        case 2:
                            n1 n1Var22 = (n1) hVar.f749a;
                            v3.U(n1Var22.f19304r, n1Var22.f19305s);
                            break;
                        case 3:
                            v3.d((t2.T) hVar.f752d);
                            break;
                        case 4:
                            n1 n1Var3 = (n1) hVar.f749a;
                            v3.J(n1Var3.f19297j, n1Var3.f19298k);
                            break;
                        case 5:
                            v3.q(((n1) hVar.f749a).f19299m);
                            break;
                        case 6:
                            v3.G(((n1) hVar.f749a).f19311y);
                            break;
                        case 7:
                            v3.x(4, ((n1) hVar.f749a).f19306t);
                            break;
                        case 8:
                            v3.V(((n1) hVar.f749a).f19308v);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.O(((n1) hVar.f749a).f19295g);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.c(((n1) hVar.f749a).h);
                            break;
                        default:
                            v3.K(((n1) hVar.f749a).f19296i);
                            break;
                    }
                }
            });
        }
        if (n1Var2.f19304r != n1Var.f19304r || n1Var2.f19305s != n1Var.f19305s) {
            final int i18 = 2;
            jVar.c(30, new w2.g() { // from class: w3.V
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i18) {
                        case 0:
                            v3.P(((n1) hVar.f749a).f19301o);
                            break;
                        case 1:
                            v3.S(((n1) hVar.f749a).f19303q);
                            break;
                        case 2:
                            n1 n1Var22 = (n1) hVar.f749a;
                            v3.U(n1Var22.f19304r, n1Var22.f19305s);
                            break;
                        case 3:
                            v3.d((t2.T) hVar.f752d);
                            break;
                        case 4:
                            n1 n1Var3 = (n1) hVar.f749a;
                            v3.J(n1Var3.f19297j, n1Var3.f19298k);
                            break;
                        case 5:
                            v3.q(((n1) hVar.f749a).f19299m);
                            break;
                        case 6:
                            v3.G(((n1) hVar.f749a).f19311y);
                            break;
                        case 7:
                            v3.x(4, ((n1) hVar.f749a).f19306t);
                            break;
                        case 8:
                            v3.V(((n1) hVar.f749a).f19308v);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.O(((n1) hVar.f749a).f19295g);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.c(((n1) hVar.f749a).h);
                            break;
                        default:
                            v3.K(((n1) hVar.f749a).f19296i);
                            break;
                    }
                }
            });
        }
        if (!((t2.T) hVar2.f752d).equals((t2.T) hVar.f752d)) {
            final int i19 = 3;
            jVar.c(13, new w2.g() { // from class: w3.V
                @Override // w2.g
                public final void b(Object obj) {
                    t2.V v3 = (t2.V) obj;
                    switch (i19) {
                        case 0:
                            v3.P(((n1) hVar.f749a).f19301o);
                            break;
                        case 1:
                            v3.S(((n1) hVar.f749a).f19303q);
                            break;
                        case 2:
                            n1 n1Var22 = (n1) hVar.f749a;
                            v3.U(n1Var22.f19304r, n1Var22.f19305s);
                            break;
                        case 3:
                            v3.d((t2.T) hVar.f752d);
                            break;
                        case 4:
                            n1 n1Var3 = (n1) hVar.f749a;
                            v3.J(n1Var3.f19297j, n1Var3.f19298k);
                            break;
                        case 5:
                            v3.q(((n1) hVar.f749a).f19299m);
                            break;
                        case 6:
                            v3.G(((n1) hVar.f749a).f19311y);
                            break;
                        case 7:
                            v3.x(4, ((n1) hVar.f749a).f19306t);
                            break;
                        case 8:
                            v3.V(((n1) hVar.f749a).f19308v);
                            break;
                        case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            v3.O(((n1) hVar.f749a).f19295g);
                            break;
                        case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                            v3.c(((n1) hVar.f749a).h);
                            break;
                        default:
                            v3.K(((n1) hVar.f749a).f19296i);
                            break;
                    }
                }
            });
        }
        if (!((w1) hVar2.f751c).equals((w1) hVar.f751c)) {
            c1760y.getClass();
            AbstractC1697a.i(Looper.myLooper() == c1760y.f19401e.getLooper());
            c1760y.f19400d.u();
        }
        if (!((E4.I) hVar2.f750b).equals(i7)) {
            c1760y.getClass();
            AbstractC1697a.i(Looper.myLooper() == c1760y.f19401e.getLooper());
            InterfaceC1756w interfaceC1756w2 = c1760y.f19400d;
            interfaceC1756w2.m(c1760y, i7);
            interfaceC1756w2.k();
        }
        if (((x1) hVar.f754f) != null) {
            c1760y.getClass();
            AbstractC1697a.i(Looper.myLooper() == c1760y.f19401e.getLooper());
            c1760y.f19400d.getClass();
        }
        jVar.b();
    }

    @Override // w3.InterfaceC1758x
    public final C1482k X() {
        return ((n1) this.f19163m.f749a).f19303q;
    }

    public final void X0(B2.h hVar, Integer num, Integer num2) {
        W0(false, this.f19162k, hVar, num, num2);
    }

    @Override // w3.InterfaceC1758x
    public final void Y() {
        G(1);
    }

    @Override // w3.InterfaceC1758x
    public final void a() {
        Messenger messenger;
        if (this.f19160i) {
            return;
        }
        this.f19160i = true;
        C1928m c1928m = this.h;
        if (c1928m != null) {
            C1925j c1925j = c1928m.f20067a;
            V1.a aVar = c1925j.f20056f;
            if (aVar != null && (messenger = c1925j.f20057g) != null) {
                try {
                    aVar.M(7, null, messenger);
                } catch (RemoteException unused) {
                }
            }
            c1925j.f20052b.disconnect();
            this.h = null;
        }
        V1.a aVar2 = this.f19159g;
        if (aVar2 != null) {
            C1710a0 c1710a0 = this.f19157e;
            if (c1710a0 == null) {
                throw new IllegalArgumentException("callback must not be null");
            }
            if (((Set) aVar2.f7390p).remove(c1710a0)) {
                try {
                    ((C1901C) aVar2.f7389o).b(c1710a0);
                } finally {
                    c1710a0.j(null);
                }
            }
            c1710a0.f19133d.removeCallbacksAndMessages(null);
            this.f19159g = null;
        }
        this.f19161j = false;
        this.f19156d.d();
    }

    @Override // w3.InterfaceC1758x
    public final void a0(C1476e c1476e, boolean z6) {
        AbstractC1697a.w("Legacy session doesn't support setting audio attributes remotely");
    }

    @Override // w3.InterfaceC1758x
    public final void b() {
        n1 n1Var = (n1) this.f19163m.f749a;
        if (n1Var.f19311y != 1) {
            return;
        }
        n1 n1VarF = n1Var.f(n1Var.f19297j.p() ? 4 : 2, null);
        B2.h hVar = this.f19163m;
        X0(new B2.h(n1VarF, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), null, null);
        if (((n1) this.f19163m.f749a).f19297j.p()) {
            return;
        }
        S0();
    }

    @Override // w3.InterfaceC1758x
    public final void b0(int i7, int i8) {
        int i9;
        C1482k c1482kX = X();
        if (c1482kX.f16504b <= i7 && ((i9 = c1482kX.f16505c) == 0 || i7 <= i9)) {
            n1 n1VarC = ((n1) this.f19163m.f749a).c(i7, n0());
            B2.h hVar = this.f19163m;
            X0(new B2.h(n1VarC, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), null, null);
        }
        ((C1901C) this.f19159g.f7389o).f19973a.setVolumeTo(i7, i8);
    }

    @Override // w3.InterfaceC1758x
    public final boolean c() {
        return false;
    }

    @Override // w3.InterfaceC1758x
    public final void c0(boolean z6) {
        W(1, z6);
    }

    @Override // w3.InterfaceC1758x
    public final int d() {
        return ((n1) this.f19163m.f749a).f19311y;
    }

    @Override // w3.InterfaceC1758x
    public final void d0(int i7) {
        int iO = o();
        int i8 = X().f16505c;
        if (i8 == 0 || iO + 1 <= i8) {
            n1 n1VarC = ((n1) this.f19163m.f749a).c(iO + 1, n0());
            B2.h hVar = this.f19163m;
            X0(new B2.h(n1VarC, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), null, null);
        }
        ((C1901C) this.f19159g.f7389o).f19973a.adjustVolume(1, i7);
    }

    @Override // w3.InterfaceC1758x
    public final void e() {
        p(true);
    }

    @Override // w3.InterfaceC1758x
    public final int e0() {
        return -1;
    }

    @Override // w3.InterfaceC1758x
    public final void f(int i7) {
        if (i7 != i()) {
            n1 n1VarI = ((n1) this.f19163m.f749a).i(i7);
            B2.h hVar = this.f19163m;
            X0(new B2.h(n1VarI, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), null, null);
        }
        C1904F c1904fF = this.f19159g.F();
        int iN = AbstractC1748s.n(i7);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", iN);
        c1904fF.K("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
    }

    @Override // w3.InterfaceC1758x
    public final void f0(t2.J j3) {
        AbstractC1697a.w("Session doesn't support setting playlist metadata");
    }

    @Override // w3.InterfaceC1758x
    public final void g() {
        p(false);
    }

    @Override // w3.InterfaceC1758x
    public final void g0(int i7, int i8) {
        h0(i7, i7 + 1, i8);
    }

    @Override // w3.InterfaceC1758x
    public final void h(t2.Q q7) {
        if (!q7.equals(j())) {
            n1 n1VarE = ((n1) this.f19163m.f749a).e(q7);
            B2.h hVar = this.f19163m;
            X0(new B2.h(n1VarE, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), null, null);
        }
        this.f19159g.F().L(q7.f16348a);
    }

    @Override // w3.InterfaceC1758x
    public final void h0(int i7, int i8, int i9) {
        AbstractC1697a.d(i7 >= 0 && i7 <= i8 && i9 >= 0);
        t1 t1Var = (t1) ((n1) this.f19163m.f749a).f19297j;
        int iO = t1Var.o();
        int iMin = Math.min(i8, iO);
        int i10 = iMin - i7;
        int i11 = iO - i10;
        int i12 = i11 - 1;
        int iMin2 = Math.min(i9, i11);
        if (i7 >= iO || i7 == iMin || i7 == iMin2) {
            return;
        }
        int iV = V();
        if (iV >= i7) {
            iV = iV < iMin ? -1 : iV - i10;
        }
        if (iV == -1) {
            iV = w2.t.g(i7, 0, i12);
            AbstractC1697a.w("Currently playing item will be removed and added back to mimic move. Assumes item at " + iV + " would be the new current item");
        }
        if (iV >= iMin2) {
            iV += i10;
        }
        ArrayList arrayList = new ArrayList(t1Var.f19365e);
        w2.t.C(arrayList, i7, iMin, iMin2);
        n1 n1VarM = ((n1) this.f19163m.f749a).m(new t1(E4.I.p(arrayList), t1Var.f19366f), iV);
        B2.h hVar = this.f19163m;
        X0(new B2.h(n1VarM, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), null, null);
        if (T0()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i13 = 0; i13 < i10; i13++) {
                arrayList2.add((x3.W) this.f19162k.f19143d.get(i7));
                this.f19159g.L(((x3.W) this.f19162k.f19143d.get(i7)).f20016o);
            }
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                this.f19159g.t(((x3.W) arrayList2.get(i14)).f20016o, i14 + iMin2);
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final int i() {
        return ((n1) this.f19163m.f749a).h;
    }

    @Override // w3.InterfaceC1758x
    public final int i0() {
        return 0;
    }

    @Override // w3.InterfaceC1758x
    public final t2.Q j() {
        return ((n1) this.f19163m.f749a).f19295g;
    }

    @Override // w3.InterfaceC1758x
    public final void j0(int i7, int i8, List list) {
        AbstractC1697a.d(i7 >= 0 && i7 <= i8);
        int iO = ((t1) ((n1) this.f19163m.f749a).f19297j).o();
        if (i7 > iO) {
            return;
        }
        int iMin = Math.min(i8, iO);
        x(iMin, list);
        u0(i7, iMin);
    }

    @Override // w3.InterfaceC1758x
    public final void k(long j3) {
        V0(j3, V());
    }

    @Override // w3.InterfaceC1758x
    public final void k0(List list) {
        x(Integer.MAX_VALUE, list);
    }

    @Override // w3.InterfaceC1758x
    public final void l(float f7) {
        if (f7 != j().f16348a) {
            n1 n1VarE = ((n1) this.f19163m.f749a).e(new t2.Q(f7));
            B2.h hVar = this.f19163m;
            X0(new B2.h(n1VarE, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), null, null);
        }
        this.f19159g.F().L(f7);
    }

    @Override // w3.InterfaceC1758x
    public final long l0() {
        return ((n1) this.f19163m.f749a).f19291c.f19421d;
    }

    @Override // w3.InterfaceC1758x
    public final void m(List list, int i7, long j3) {
        if (list.isEmpty()) {
            D();
            return;
        }
        n1 n1VarN = ((n1) this.f19163m.f749a).n(t1.f19364g.q(0, list), new y1(Q0(i7, (t2.G) list.get(i7), j3 == -9223372036854775807L ? 0L : j3, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L), 0);
        B2.h hVar = this.f19163m;
        X0(new B2.h(n1VarN, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), null, null);
        if (T0()) {
            S0();
        }
    }

    @Override // w3.InterfaceC1758x
    public final t2.h0 m0() {
        return ((n1) this.f19163m.f749a).f19297j;
    }

    @Override // w3.InterfaceC1758x
    public final t2.P n() {
        return ((n1) this.f19163m.f749a).f19289a;
    }

    @Override // w3.InterfaceC1758x
    public final boolean n0() {
        n1 n1Var = (n1) this.f19163m.f749a;
        if (n1Var.f19303q.f16503a == 1) {
            return n1Var.f19305s;
        }
        V1.a aVar = this.f19159g;
        if (aVar == null) {
            return false;
        }
        C1903E c1903eB = aVar.B();
        E4.M m7 = AbstractC1748s.f19344a;
        return c1903eB != null && c1903eB.f19982e == 0;
    }

    @Override // w3.InterfaceC1758x
    public final int o() {
        n1 n1Var = (n1) this.f19163m.f749a;
        if (n1Var.f19303q.f16503a == 1) {
            return n1Var.f19304r;
        }
        V1.a aVar = this.f19159g;
        if (aVar == null) {
            return 0;
        }
        C1903E c1903eB = aVar.B();
        E4.M m7 = AbstractC1748s.f19344a;
        if (c1903eB == null) {
            return 0;
        }
        return c1903eB.f19982e;
    }

    @Override // w3.InterfaceC1758x
    public final void o0(int i7) {
        u0(i7, i7 + 1);
    }

    @Override // w3.InterfaceC1758x
    public final void p(boolean z6) {
        n1 n1Var = (n1) this.f19163m.f749a;
        if (n1Var.f19306t == z6) {
            return;
        }
        this.f19164n = k1.f(n1Var, this.f19164n, this.f19165o, this.f19154b.f19402f);
        this.f19165o = SystemClock.elapsedRealtime();
        n1 n1VarD = ((n1) this.f19163m.f749a).d(1, 0, z6);
        B2.h hVar = this.f19163m;
        X0(new B2.h(n1VarD, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), null, null);
        if (!T0() || ((n1) this.f19163m.f749a).f19297j.p()) {
            return;
        }
        if (z6) {
            this.f19159g.F().f19983a.play();
        } else {
            this.f19159g.F().f19983a.pause();
        }
    }

    @Override // w3.InterfaceC1758x
    public final void p0(int i7, t2.G g6) {
        j0(i7, i7 + 1, E4.I.t(g6));
    }

    @Override // w3.InterfaceC1758x
    public final void q(Surface surface) {
        AbstractC1697a.w("Session doesn't support setting Surface");
    }

    @Override // w3.InterfaceC1758x
    public final void q0() {
        d0(1);
    }

    @Override // w3.InterfaceC1758x
    public final boolean r() {
        return ((n1) this.f19163m.f749a).f19291c.f19419b;
    }

    @Override // w3.InterfaceC1758x
    public final boolean r0() {
        return ((n1) this.f19163m.f749a).f19296i;
    }

    @Override // w3.InterfaceC1758x
    public final void s(int i7) {
        V0(0L, i7);
    }

    @Override // w3.InterfaceC1758x
    public final t2.n0 s0() {
        return t2.n0.f16553C;
    }

    @Override // w3.InterfaceC1758x
    public final void stop() {
        n1 n1Var = (n1) this.f19163m.f749a;
        if (n1Var.f19311y == 1) {
            return;
        }
        y1 y1Var = n1Var.f19291c;
        t2.W w7 = y1Var.f19418a;
        long j3 = w7.f16368f;
        long j7 = y1Var.f19421d;
        n1 n1VarJ = n1Var.j(new y1(w7, false, SystemClock.elapsedRealtime(), j7, j3, k1.e(j3, j7), 0L, -9223372036854775807L, j7, j3));
        n1 n1Var2 = (n1) this.f19163m.f749a;
        if (n1Var2.f19311y != 1) {
            n1VarJ = n1VarJ.f(1, n1Var2.f19289a);
        }
        n1 n1Var3 = n1VarJ;
        B2.h hVar = this.f19163m;
        X0(new B2.h(n1Var3, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), null, null);
        this.f19159g.F().f19983a.stop();
    }

    @Override // w3.InterfaceC1758x
    public final long t() {
        return ((n1) this.f19163m.f749a).f19285B;
    }

    @Override // w3.InterfaceC1758x
    public final long t0() {
        return B();
    }

    @Override // w3.InterfaceC1758x
    public final long u() {
        return -9223372036854775807L;
    }

    @Override // w3.InterfaceC1758x
    public final void u0(int i7, int i8) {
        AbstractC1697a.d(i7 >= 0 && i8 >= i7);
        int iO = m0().o();
        int iMin = Math.min(i8, iO);
        if (i7 >= iO || i7 == iMin) {
            return;
        }
        t1 t1Var = (t1) ((n1) this.f19163m.f749a).f19297j;
        t1Var.getClass();
        E4.F f7 = new E4.F(4);
        E4.I i9 = t1Var.f19365e;
        f7.c(i9.subList(0, i7));
        f7.c(i9.subList(iMin, i9.size()));
        t1 t1Var2 = new t1(f7.f(), t1Var.f19366f);
        int iV = V();
        int i10 = iMin - i7;
        if (iV >= i7) {
            iV = iV < iMin ? -1 : iV - i10;
        }
        if (iV == -1) {
            iV = w2.t.g(i7, 0, t1Var2.o() - 1);
            AbstractC1697a.w("Currently playing item is removed. Assumes item at " + iV + " is the new current item");
        }
        n1 n1VarM = ((n1) this.f19163m.f749a).m(t1Var2, iV);
        B2.h hVar = this.f19163m;
        X0(new B2.h(n1VarM, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), null, null);
        if (T0()) {
            while (i7 < iMin && i7 < this.f19162k.f19143d.size()) {
                this.f19159g.L(((x3.W) this.f19162k.f19143d.get(i7)).f20016o);
                i7++;
            }
        }
    }

    @Override // w3.InterfaceC1758x
    public final long v() {
        return F0();
    }

    @Override // w3.InterfaceC1758x
    public final void v0(int i7) {
        b0(i7, 1);
    }

    @Override // w3.InterfaceC1758x
    public final long w() {
        return ((n1) this.f19163m.f749a).f19291c.f19424g;
    }

    @Override // w3.InterfaceC1758x
    public final void w0() {
        this.f19159g.F().f19983a.skipToNext();
    }

    @Override // w3.InterfaceC1758x
    public final void x(int i7, List list) {
        AbstractC1697a.d(i7 >= 0);
        if (list.isEmpty()) {
            return;
        }
        t1 t1Var = (t1) ((n1) this.f19163m.f749a).f19297j;
        if (t1Var.p()) {
            m(list, 0, -9223372036854775807L);
            return;
        }
        int iMin = Math.min(i7, m0().o());
        t1 t1VarQ = t1Var.q(iMin, list);
        int iV = V();
        int size = list.size();
        if (iV >= iMin) {
            iV += size;
        }
        n1 n1VarM = ((n1) this.f19163m.f749a).m(t1VarQ, iV);
        B2.h hVar = this.f19163m;
        X0(new B2.h(n1VarM, (w1) hVar.f751c, (t2.T) hVar.f752d, (E4.I) hVar.f750b, (Bundle) hVar.f753e, null), null, null);
        if (T0()) {
            N0(iMin, list);
        }
    }

    @Override // w3.InterfaceC1758x
    public final void x0() {
        this.f19159g.F().f19983a.fastForward();
    }

    @Override // w3.InterfaceC1758x
    public final t2.T y() {
        return (t2.T) this.f19163m.f752d;
    }

    @Override // w3.InterfaceC1758x
    public final void y0() {
        this.f19159g.F().f19983a.rewind();
    }

    @Override // w3.InterfaceC1758x
    public final void z(t2.G g6) {
        E0(g6, -9223372036854775807L);
    }

    @Override // w3.InterfaceC1758x
    public final void z0(long j3, int i7) {
        V0(j3, i7);
    }

    @Override // w3.InterfaceC1758x
    public final void Z(t2.n0 n0Var) {
    }
}
