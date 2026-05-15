package A0;

import A2.W;
import A2.x0;
import B3.m;
import B5.u;
import C2.X;
import D2.B;
import E4.AbstractC0119q;
import E4.F;
import E4.G;
import E4.I;
import E4.K;
import E4.M;
import E4.S;
import E4.T;
import E4.b0;
import E4.p0;
import F2.C0132a;
import F2.j;
import F2.r;
import H.C0159a;
import H2.N;
import H2.h0;
import L2.C0247a;
import M5.y;
import N2.C0293j;
import N2.H;
import N2.o;
import N2.z;
import N3.q;
import N3.v;
import Q0.B0;
import Q0.EnumC0367x;
import T1.s;
import T1.w;
import a.AbstractC0509a;
import android.content.ClipDescription;
import android.content.Context;
import android.database.Cursor;
import android.location.LocationManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import androidx.lifecycle.AbstractServiceC0600x;
import androidx.lifecycle.C0599w;
import androidx.lifecycle.EnumC0592o;
import androidx.lifecycle.P;
import androidx.work.OverwritingInputMerger;
import androidx.work.impl.WorkDatabase_Impl;
import b2.C0642L;
import b2.C0651c;
import b2.F0;
import b2.J0;
import b2.K0;
import d.C0746L;
import d2.C0821i;
import d5.EnumC0830a;
import e4.C0862k;
import e5.AbstractC0865c;
import f0.AbstractC0875a;
import f0.AbstractC0914u;
import f0.C0899m;
import f0.InterfaceC0881d;
import f0.InterfaceC0895k;
import i1.C1058a;
import i1.C1059b;
import i1.InterfaceC1060c;
import i2.p;
import j2.C1105h;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k3.k;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1223y;
import n0.l;
import n1.n;
import o0.InterfaceC1250g;
import o5.AbstractC1267a;
import t.C1444F;
import t.C1465u;
import t.J;
import t.Q;
import t.x;
import t2.AbstractC1479h;
import t2.C1495y;
import w2.AbstractC1697a;
import w2.t;
import y0.InterfaceC1985r;
import y1.AbstractC1994c;
import z2.C2081b;

/* JADX INFO: loaded from: classes.dex */
public final class b implements j, I1.h, InterfaceC0881d, InterfaceC1060c, o, InterfaceC1250g, o4.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static b f48s;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f49o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f50p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f51q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f52r;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i7) {
        this.f49o = i7;
        this.f50p = obj;
        this.f51q = obj2;
        this.f52r = obj3;
    }

    public static final void J(b bVar, Network network, boolean z6) {
        Y4.o oVar;
        boolean z7;
        Network[] allNetworks = ((ConnectivityManager) bVar.f50p).getAllNetworks();
        int length = allNetworks.length;
        boolean z8 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            Network network2 = allNetworks[i7];
            if (AbstractC1209k.a(network2, network)) {
                z7 = z6;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) bVar.f50p).getNetworkCapabilities(network2);
                z7 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z7) {
                z8 = true;
                break;
            }
            i7++;
        }
        s4.j jVar = (s4.j) bVar.f51q;
        if (((C0862k) jVar.f15934p.get()) != null) {
            jVar.f15936r = z8;
            oVar = Y4.o.f8736a;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            jVar.a();
        }
    }

    public static D2.i N(C1495y c1495y) {
        y yVar = new y(5);
        Uri uri = c1495y.f16766b;
        B b7 = new B(uri == null ? null : uri.toString(), c1495y.f16770f, yVar);
        K k7 = c1495y.f16767c;
        M mC = k7.f1874o;
        if (mC == null) {
            mC = k7.c();
            k7.f1874o = mC;
        }
        p0 p0VarK = mC.iterator();
        while (p0VarK.hasNext()) {
            Map.Entry entry = (Map.Entry) p0VarK.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) b7.f1461r)) {
                ((HashMap) b7.f1461r).put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = AbstractC1479h.f16467a;
        x0 x0Var = new x0(17);
        UUID uuid2 = c1495y.f16765a;
        uuid2.getClass();
        boolean z6 = c1495y.f16768d;
        boolean z7 = c1495y.f16769e;
        int[] iArrN = AbstractC1267a.N(c1495y.f16771g);
        int length = iArrN.length;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = iArrN[i7];
            AbstractC1697a.d(i8 == 2 || i8 == 1);
        }
        D2.i iVar = new D2.i(uuid2, b7, map, z6, (int[]) iArrN.clone(), z7, x0Var);
        byte[] bArr = c1495y.h;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        AbstractC1697a.i(iVar.f1520z.isEmpty());
        iVar.f1506I = bArrCopyOf;
        return iVar;
    }

    public static boolean O(Editable editable, KeyEvent keyEvent, boolean z6) {
        w[] wVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (wVarArr = (w[]) editable.getSpans(selectionStart, selectionEnd, w.class)) != null && wVarArr.length > 0) {
                for (w wVar : wVarArr) {
                    int spanStart = editable.getSpanStart(wVar);
                    int spanEnd = editable.getSpanEnd(wVar);
                    if ((z6 && spanStart == selectionStart) || ((!z6 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static Object r0(b bVar, Context context, int i7, AbstractC0865c abstractC0865c) {
        bVar.getClass();
        AtomicBoolean atomicBoolean = J0.f10073a;
        if (Build.VERSION.SDK_INT >= 29 && J0.f10073a.get()) {
            K0.f10078a.a("GlanceAppWidget::update", 0);
        }
        Object objA = ((p) bVar.f50p).a(new C0642L(bVar, context, new C0651c(i7), null), abstractC0865c);
        return objA == EnumC0830a.f11264o ? objA : Y4.o.f8736a;
    }

    @Override // F2.j
    public void B(Surface surface) {
        ((MediaCodec) this.f50p).setOutputSurface(surface);
    }

    @Override // I1.h
    public Uri C() {
        return (Uri) this.f52r;
    }

    @Override // F2.j
    public ByteBuffer D(int i7) {
        return t.f18881a >= 21 ? ((MediaCodec) this.f50p).getOutputBuffer(i7) : ((ByteBuffer[]) this.f52r)[i7];
    }

    @Override // N2.o
    public H E(int i7, int i8) {
        o oVar = (o) this.f50p;
        if (i8 != 3) {
            return oVar.E(i7, i8);
        }
        SparseArray sparseArray = (SparseArray) this.f52r;
        k3.o oVar2 = (k3.o) sparseArray.get(i7);
        if (oVar2 != null) {
            return oVar2;
        }
        k3.o oVar3 = new k3.o(oVar.E(i7, i8), (k) this.f51q);
        sparseArray.put(i7, oVar3);
        return oVar3;
    }

    @Override // F2.j
    public int F() {
        return ((MediaCodec) this.f50p).dequeueInputBuffer(0L);
    }

    @Override // f0.InterfaceC0881d
    public void G() {
        ((x) this.f50p).a(0);
    }

    @Override // N2.o
    public void H(N2.B b7) {
        ((o) this.f50p).H(b7);
    }

    @Override // i1.InterfaceC1060c
    public Locale I(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        AbstractC1209k.a(localeForLanguageTag.toLanguageTag(), "und");
        return localeForLanguageTag;
    }

    public void K(Q0.K k7, EnumC0367x enumC0367x) {
        int iOrdinal = enumC0367x.ordinal();
        C0247a c0247a = (C0247a) this.f50p;
        C0247a c0247a2 = (C0247a) this.f52r;
        if (iOrdinal == 0) {
            c0247a.c(k7);
            c0247a2.c(k7);
            return;
        }
        C0247a c0247a3 = (C0247a) this.f51q;
        if (iOrdinal == 1) {
            c0247a3.c(k7);
            c0247a2.c(k7);
            return;
        }
        if (iOrdinal == 2) {
            if (k7.f5837v != null) {
                c0247a2.c(k7);
                return;
            } else {
                c0247a.c(k7);
                return;
            }
        }
        if (iOrdinal != 3) {
            throw new W();
        }
        if (k7.f5837v != null) {
            c0247a2.c(k7);
        } else {
            c0247a3.c(k7);
        }
    }

    public q L() {
        UUID uuid = (UUID) this.f50p;
        W3.i iVar = (W3.i) this.f51q;
        HashSet hashSet = (HashSet) this.f52r;
        q qVar = new q();
        qVar.f5145a = uuid;
        qVar.f5146b = iVar;
        qVar.f5147c = hashSet;
        N3.c cVar = iVar.f7813j;
        boolean z6 = (Build.VERSION.SDK_INT >= 24 && cVar.h.f5127a.size() > 0) || cVar.f5121d || cVar.f5119b || cVar.f5120c;
        W3.i iVar2 = (W3.i) this.f51q;
        if (iVar2.f7819q) {
            if (z6) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (iVar2.f7811g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        this.f50p = UUID.randomUUID();
        W3.i iVar3 = (W3.i) this.f51q;
        W3.i iVar4 = new W3.i();
        iVar4.f7806b = v.f5150o;
        N3.h hVar = N3.h.f5134b;
        iVar4.f7809e = hVar;
        iVar4.f7810f = hVar;
        iVar4.f7813j = N3.c.f5117i;
        iVar4.l = 1;
        iVar4.f7815m = 30000L;
        iVar4.f7818p = -1L;
        iVar4.f7820r = 1;
        iVar4.f7805a = iVar3.f7805a;
        iVar4.f7807c = iVar3.f7807c;
        iVar4.f7806b = iVar3.f7806b;
        iVar4.f7808d = iVar3.f7808d;
        iVar4.f7809e = new N3.h(iVar3.f7809e);
        iVar4.f7810f = new N3.h(iVar3.f7810f);
        iVar4.f7811g = iVar3.f7811g;
        iVar4.h = iVar3.h;
        iVar4.f7812i = iVar3.f7812i;
        N3.c cVar2 = iVar3.f7813j;
        N3.c cVar3 = new N3.c();
        cVar3.f5118a = 1;
        cVar3.f5123f = -1L;
        cVar3.f5124g = -1L;
        cVar3.h = new N3.e();
        cVar3.f5119b = cVar2.f5119b;
        cVar3.f5120c = cVar2.f5120c;
        cVar3.f5118a = cVar2.f5118a;
        cVar3.f5121d = cVar2.f5121d;
        cVar3.f5122e = cVar2.f5122e;
        cVar3.h = cVar2.h;
        iVar4.f7813j = cVar3;
        iVar4.f7814k = iVar3.f7814k;
        iVar4.l = iVar3.l;
        iVar4.f7815m = iVar3.f7815m;
        iVar4.f7816n = iVar3.f7816n;
        iVar4.f7817o = iVar3.f7817o;
        iVar4.f7818p = iVar3.f7818p;
        iVar4.f7819q = iVar3.f7819q;
        iVar4.f7820r = iVar3.f7820r;
        this.f51q = iVar4;
        iVar4.f7805a = ((UUID) this.f50p).toString();
        return qVar;
    }

    public boolean M(Q0.K k7) {
        return !(k7.f5837v == null) && (((B0) ((C0247a) this.f50p).f4105p).contains(k7) || ((B0) ((C0247a) this.f51q).f4105p).contains(k7));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object P(android.content.Context r7, int r8, e5.AbstractC0865c r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.b.P(android.content.Context, int, e5.c):java.lang.Object");
    }

    public void Q(Runnable runnable) {
        ((X3.g) this.f50p).execute(runnable);
    }

    public Object R() {
        long jC = n0.e.c();
        if (jC == l.f14504a) {
            return this.f52r;
        }
        n0.k kVar = (n0.k) ((AtomicReference) this.f50p).get();
        int iA = kVar.a(jC);
        if (iA >= 0) {
            return kVar.f14503c[iA];
        }
        return null;
    }

    public InterfaceC1985r S() {
        return ((c) this.f52r).f53o.f46c;
    }

    public long T() {
        C0293j c0293j = (C0293j) this.f52r;
        if (c0293j != null) {
            return c0293j.f5054r;
        }
        return -1L;
    }

    public n1.d U() {
        return ((c) this.f52r).f53o.f44a;
    }

    public n V() {
        return ((c) this.f52r).f53o.f45b;
    }

    public long W() {
        return ((c) this.f52r).f53o.f47d;
    }

    public W3.d X(String str) {
        m mVarB = m.b(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            mVarB.h(1);
        } else {
            mVarB.i(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f50p;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(mVarB);
        try {
            return cursorG.moveToFirst() ? new W3.d(cursorG.getString(AbstractC0509a.z(cursorG, "work_spec_id")), cursorG.getInt(AbstractC0509a.z(cursorG, "system_id"))) : null;
        } finally {
            cursorG.close();
            mVarB.j();
        }
    }

    public boolean Y(CharSequence charSequence, int i7, int i8, T1.v vVar) {
        if ((vVar.f6903c & 3) == 0) {
            T1.d dVar = (T1.d) this.f52r;
            U1.a aVarB = vVar.b();
            int iB = aVarB.b(8);
            if (iB != 0) {
                ((ByteBuffer) aVarB.f2745r).getShort(iB + aVarB.f2742o);
            }
            dVar.getClass();
            ThreadLocal threadLocal = T1.d.f6849b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i7 < i8) {
                sb.append(charSequence.charAt(i7));
                i7++;
            }
            TextPaint textPaint = dVar.f6850a;
            String string = sb.toString();
            int i9 = AbstractC1994c.f20275a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i10 = vVar.f6903c & 4;
            vVar.f6903c = zHasGlyph ? i10 | 2 : i10 | 1;
        }
        return (vVar.f6903c & 3) == 2;
    }

    public void Z(y2.h hVar, Uri uri, Map map, long j3, long j7, N n7) throws h0 {
        boolean z6;
        boolean z7 = true;
        C0293j c0293j = new C0293j(hVar, j3, j7);
        this.f52r = c0293j;
        if (((N2.m) this.f51q) != null) {
            return;
        }
        N2.m[] mVarArrG = ((N2.p) this.f50p).g(uri, map);
        int length = mVarArrG.length;
        G g6 = I.f1870p;
        AbstractC0119q.d(length, "expectedSize");
        F f7 = new F(length);
        if (mVarArrG.length == 1) {
            this.f51q = mVarArrG[0];
        } else {
            int length2 = mVarArrG.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length2) {
                    break;
                }
                N2.m mVar = mVarArrG[i7];
                try {
                    if (mVar.m(c0293j)) {
                        this.f51q = mVar;
                        c0293j.f5056t = 0;
                        break;
                    } else {
                        f7.c(mVar.f());
                        z6 = ((N2.m) this.f51q) != null || c0293j.f5054r == j3;
                    }
                } catch (EOFException unused) {
                    z6 = ((N2.m) this.f51q) != null || c0293j.f5054r == j3;
                } catch (Throwable th) {
                    if (((N2.m) this.f51q) == null && c0293j.f5054r != j3) {
                        z7 = false;
                    }
                    AbstractC1697a.i(z7);
                    c0293j.f5056t = 0;
                    throw th;
                }
                AbstractC1697a.i(z6);
                c0293j.f5056t = 0;
                i7++;
            }
            if (((N2.m) this.f51q) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                u uVar = new u(", ");
                b0 b0VarQ = I.q(mVarArrG);
                B2.g gVar = new B2.g(9);
                Iterator it = (b0VarQ instanceof RandomAccess ? new S(gVar, b0VarQ) : new T(gVar, b0VarQ)).iterator();
                StringBuilder sb2 = new StringBuilder();
                uVar.e(sb2, it);
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String string = sb.toString();
                uri.getClass();
                b0 b0VarF = f7.f();
                h0 h0Var = new h0(string, null, false, 1);
                I.p(b0VarF);
                throw h0Var;
            }
        }
        ((N2.m) this.f51q).c(n7);
    }

    @Override // F2.j
    public void a() {
        MediaCodec mediaCodec = (MediaCodec) this.f50p;
        this.f51q = null;
        this.f52r = null;
        try {
            int i7 = t.f18881a;
            if (i7 >= 30 && i7 < 33) {
                mediaCodec.stop();
            }
        } finally {
            mediaCodec.release();
        }
    }

    public void a0(W3.d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f50p;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((W3.b) this.f51q).e(dVar);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    @Override // F2.j
    public void b(int i7, int i8, int i9, long j3) {
        ((MediaCodec) this.f50p).queueInputBuffer(i7, 0, i8, j3, i9);
    }

    public boolean b0() {
        return !(((B0) ((C0247a) this.f50p).f4105p).isEmpty() && ((B0) ((C0247a) this.f52r).f4105p).isEmpty() && ((B0) ((C0247a) this.f51q).f4105p).isEmpty());
    }

    @Override // F2.j
    public void c(int i7, C2081b c2081b, long j3, int i8) {
        ((MediaCodec) this.f50p).queueSecureInputBuffer(i7, 0, c2081b.f21111i, j3, i8);
    }

    public boolean c0() {
        if (((f1.p) this.f50p).f12020o != this.f52r) {
            return true;
        }
        b bVar = (b) this.f51q;
        return bVar != null && bVar.c0();
    }

    @Override // F2.j
    public void d(Bundle bundle) {
        ((MediaCodec) this.f50p).setParameters(bundle);
    }

    public void d0() {
        Iterator it = ((CopyOnWriteArrayList) this.f51q).iterator();
        while (it.hasNext()) {
            Y1.q qVar = ((Y1.m) it.next()).f8612a;
            if (qVar.f8638q >= 1) {
                Iterator it2 = qVar.f8626c.U().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                }
            }
        }
    }

    @Override // F2.j
    public int e(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.f50p;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && t.f18881a < 21) {
                this.f52r = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    public void e0() {
        Iterator it = ((CopyOnWriteArrayList) this.f51q).iterator();
        while (it.hasNext()) {
            Y1.q qVar = ((Y1.m) it.next()).f8612a;
            if (qVar.f8638q >= 1) {
                Iterator it2 = qVar.f8626c.U().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                }
            }
        }
    }

    @Override // F2.j
    public void f(L2.l lVar, Handler handler) {
        ((MediaCodec) this.f50p).setOnFrameRenderedListener(new C0132a(this, lVar, 1), handler);
    }

    public void f0() {
        Iterator it = ((CopyOnWriteArrayList) this.f51q).iterator();
        while (it.hasNext()) {
            Y1.q qVar = ((Y1.m) it.next()).f8612a;
            if (qVar.f8638q >= 1) {
                Iterator it2 = qVar.f8626c.U().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                }
            }
        }
    }

    @Override // F2.j
    public void flush() {
        ((MediaCodec) this.f50p).flush();
    }

    @Override // F2.j
    public void g(long j3, int i7) {
        ((MediaCodec) this.f50p).releaseOutputBuffer(i7, j3);
    }

    public void g0(AbstractC0875a abstractC0875a, n0.j jVar) {
        Exception exc;
        int i7;
        int i8;
        x xVar = (x) this.f50p;
        int i9 = xVar.f16127b;
        C1444F c1444f = new C1444F();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            C1444F c1444f2 = (C1444F) this.f51q;
            if (i10 >= i9) {
                if (i11 != c1444f2.f15984b) {
                    AbstractC0914u.c("Applier operation size mismatch");
                }
                c1444f2.c();
                xVar.f16127b = 0;
                abstractC0875a.q();
                return;
            }
            int i12 = i10 + 1;
            try {
                try {
                    switch (xVar.b(i10)) {
                        case 0:
                            abstractC0875a.G();
                            i10 = i12;
                            break;
                        case 1:
                            int i13 = i11 + 1;
                            abstractC0875a.l(c1444f2.e(i11));
                            i11 = i13;
                            i10 = i12;
                            break;
                        case 2:
                            int i14 = i10 + 2;
                            i10 += 3;
                            abstractC0875a.t(xVar.b(i12), xVar.b(i14));
                            break;
                        case 3:
                            int i15 = i10 + 2;
                            try {
                                int i16 = i10 + 3;
                                try {
                                    i10 += 4;
                                    abstractC0875a.r(xVar.b(i12), xVar.b(i15), xVar.b(i16));
                                } catch (Exception e7) {
                                    exc = e7;
                                    i7 = i16;
                                }
                            } catch (Exception e8) {
                                exc = e8;
                                i7 = i15;
                            }
                            break;
                        case 4:
                            abstractC0875a.a();
                            i10 = i12;
                            break;
                        case 5:
                            i10 += 2;
                            i8 = i11 + 1;
                            abstractC0875a.i(xVar.b(i12), c1444f2.e(i11));
                            i11 = i8;
                            break;
                        case 6:
                            i10 += 2;
                            try {
                                i8 = i11 + 1;
                                abstractC0875a.p(xVar.b(i12), c1444f2.e(i11));
                                i11 = i8;
                            } catch (Exception e9) {
                                exc = e9;
                                i7 = i10;
                            }
                            break;
                        case 7:
                            int i17 = i11 + 1;
                            Object objE = c1444f2.e(i11);
                            AbstractC1209k.d(objE, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            AbstractC1223y.c(2, objE);
                            i11 += 2;
                            ((l5.e) objE).invoke(abstractC0875a.b(), c1444f2.e(i17));
                            i10 = i12;
                            break;
                        case 8:
                            Object obj = abstractC0875a.f11788q;
                            if (obj instanceof InterfaceC0895k) {
                                InterfaceC0895k interfaceC0895k = (InterfaceC0895k) obj;
                                if (jVar.f14496f.k(interfaceC0895k)) {
                                    interfaceC0895k.h();
                                }
                            }
                            c1444f.a(obj);
                            abstractC0875a.m();
                            i10 = i12;
                            break;
                        default:
                            i10 = i12;
                            break;
                    }
                } catch (Throwable th) {
                    abstractC0875a.q();
                    throw th;
                }
            } catch (Exception e10) {
                exc = e10;
                i7 = i12;
            }
            exc = e9;
            i7 = i10;
            throw new C0899m(c1444f2, c1444f, xVar, i7, exc);
        }
    }

    @Override // F2.j
    public /* synthetic */ boolean h(r rVar) {
        return false;
    }

    public void h0(EnumC0592o enumC0592o) {
        P p7 = (P) this.f52r;
        if (p7 != null) {
            p7.run();
        }
        P p8 = new P((C0599w) this.f50p, enumC0592o);
        this.f52r = p8;
        ((Handler) this.f51q).postAtFrontOfQueue(p8);
    }

    @Override // f0.InterfaceC0881d
    public void i(int i7, Object obj) {
        x xVar = (x) this.f50p;
        xVar.a(5);
        xVar.a(i7);
        ((C1444F) this.f51q).a(obj);
    }

    public Object i0(CharSequence charSequence, int i7, int i8, int i9, boolean z6, T1.n nVar) {
        int i10;
        char c7;
        T1.p pVar = new T1.p((s) ((U3.h) this.f51q).f7044q);
        int iCodePointAt = Character.codePointAt(charSequence, i7);
        boolean zA = true;
        int i11 = 0;
        int iCharCount = i7;
        loop0: while (true) {
            i10 = iCharCount;
            while (iCharCount < i8 && i11 < i9 && zA) {
                SparseArray sparseArray = pVar.f6878c.f6894a;
                s sVar = sparseArray == null ? null : (s) sparseArray.get(iCodePointAt);
                if (pVar.f6876a == 2) {
                    if (sVar != null) {
                        pVar.f6878c = sVar;
                        pVar.f6881f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            pVar.a();
                        } else if (iCodePointAt != 65039) {
                            s sVar2 = pVar.f6878c;
                            if (sVar2.f6895b != null) {
                                if (pVar.f6881f != 1) {
                                    pVar.f6879d = sVar2;
                                    pVar.a();
                                } else if (pVar.b()) {
                                    pVar.f6879d = pVar.f6878c;
                                    pVar.a();
                                } else {
                                    pVar.a();
                                }
                                c7 = 3;
                            } else {
                                pVar.a();
                            }
                        }
                        c7 = 1;
                    }
                    c7 = 2;
                } else if (sVar == null) {
                    pVar.a();
                    c7 = 1;
                } else {
                    pVar.f6876a = 2;
                    pVar.f6878c = sVar;
                    pVar.f6881f = 1;
                    c7 = 2;
                }
                pVar.f6880e = iCodePointAt;
                if (c7 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i10)) + i10;
                    if (iCharCount < i8) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c7 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i8) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c7 == 3) {
                    if (z6 || !Y(charSequence, i10, iCharCount, pVar.f6879d.f6895b)) {
                        zA = nVar.a(charSequence, i10, iCharCount, pVar.f6879d.f6895b);
                        i11++;
                    }
                }
            }
            break loop0;
        }
        if (pVar.f6876a == 2 && pVar.f6878c.f6895b != null && ((pVar.f6881f > 1 || pVar.b()) && i11 < i9 && zA && (z6 || !Y(charSequence, i10, iCharCount, pVar.f6878c.f6895b)))) {
            nVar.a(charSequence, i10, iCharCount, pVar.f6878c.f6895b);
        }
        return nVar.b();
    }

    @Override // F2.j
    public void j(int i7, boolean z6) {
        ((MediaCodec) this.f50p).releaseOutputBuffer(i7, z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j0(e5.AbstractC0865c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof W5.i
            if (r0 == 0) goto L13
            r0 = r5
            W5.i r0 = (W5.i) r0
            int r1 = r0.f7867q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7867q = r1
            goto L18
        L13:
            W5.i r0 = new W5.i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f7865o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r1 = r0.f7867q
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2b:
            android.support.v4.media.session.b.K(r5)
            A2.W r5 = new A2.W
            r5.<init>()
            throw r5
        L34:
            android.support.v4.media.session.b.K(r5)
            n0.d r5 = W5.c.f7834b
            r0.f7867q = r2
            N5.l.M(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.b.j0(e5.c):void");
    }

    @Override // N2.o
    public void k() {
        ((o) this.f50p).k();
    }

    public void k0(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f50p;
        workDatabase_Impl.b();
        W3.e eVar = (W3.e) this.f52r;
        I3.f fVarA = eVar.a();
        if (str == null) {
            fVarA.g(1);
        } else {
            fVarA.h(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.r();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    @Override // f0.InterfaceC0881d
    public void l(Object obj) {
        ((x) this.f50p).a(1);
        ((C1444F) this.f51q).a(obj);
    }

    public void l0(Object obj) {
        long jC = n0.e.c();
        if (jC == l.f14504a) {
            this.f52r = obj;
            return;
        }
        synchronized (this.f51q) {
            n0.k kVar = (n0.k) ((AtomicReference) this.f50p).get();
            int iA = kVar.a(jC);
            if (iA < 0) {
                ((AtomicReference) this.f50p).set(kVar.b(jC, obj));
            } else {
                kVar.f14503c[iA] = obj;
            }
        }
    }

    @Override // f0.InterfaceC0881d
    public void m() {
        ((x) this.f50p).a(8);
    }

    public void m0(InterfaceC1985r interfaceC1985r) {
        ((c) this.f52r).f53o.f46c = interfaceC1985r;
    }

    @Override // F2.j
    public void n(int i7) {
        ((MediaCodec) this.f50p).setVideoScalingMode(i7);
    }

    public void n0(n1.d dVar) {
        ((c) this.f52r).f53o.f44a = dVar;
    }

    @Override // I1.h
    public ClipDescription o() {
        return (ClipDescription) this.f51q;
    }

    public void o0(n nVar) {
        ((c) this.f52r).f53o.f45b = nVar;
    }

    @Override // f0.InterfaceC0881d
    public void p(int i7, Object obj) {
        x xVar = (x) this.f50p;
        xVar.a(6);
        xVar.a(i7);
        ((C1444F) this.f51q).a(obj);
    }

    public void p0(long j3) {
        ((c) this.f52r).f53o.f47d = j3;
    }

    @Override // f0.InterfaceC0881d
    public /* synthetic */ void q() {
    }

    public void q0() {
        J j3 = (J) this.f50p;
        String str = (String) this.f51q;
        List list = (List) j3.k(str);
        if (list != null) {
            list.remove((InterfaceC1180a) this.f52r);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        j3.m(str, list);
    }

    @Override // f0.InterfaceC0881d
    public void r(int i7, int i8, int i9) {
        x xVar = (x) this.f50p;
        xVar.a(3);
        xVar.a(i7);
        xVar.a(i8);
        xVar.a(i9);
    }

    @Override // i1.InterfaceC1060c
    public C1059b s() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((C0746L) this.f52r)) {
            try {
                C1059b c1059b = (C1059b) this.f51q;
                if (c1059b != null && localeList == ((LocaleList) this.f50p)) {
                    return c1059b;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList.add(new C1058a(localeList.get(i7)));
                }
                C1059b c1059b2 = new C1059b(arrayList);
                this.f50p = localeList;
                this.f51q = c1059b2;
                return c1059b2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o4.e
    public void shutdown() {
        ((ConnectivityManager) this.f50p).unregisterNetworkCallback((U3.e) this.f52r);
    }

    @Override // f0.InterfaceC0881d
    public void t(int i7, int i8) {
        x xVar = (x) this.f50p;
        xVar.a(2);
        xVar.a(i7);
        xVar.a(i8);
    }

    public String toString() {
        switch (this.f49o) {
            case 3:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f50p);
                sb.append('{');
                V.o oVar = (V.o) ((V.o) this.f51q).f7342p;
                String str = "";
                while (oVar != null) {
                    Object obj = oVar.f7343q;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    oVar = (V.o) oVar.f7342p;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // I1.h
    public Object u() {
        return null;
    }

    @Override // o4.e
    public boolean v() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f50p;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // I1.h
    public Uri w() {
        return (Uri) this.f50p;
    }

    @Override // F2.j
    public MediaFormat x() {
        return ((MediaCodec) this.f50p).getOutputFormat();
    }

    @Override // F2.j
    public ByteBuffer y(int i7) {
        return t.f18881a >= 21 ? ((MediaCodec) this.f50p).getInputBuffer(i7) : ((ByteBuffer[]) this.f51q)[i7];
    }

    @Override // f0.InterfaceC0881d
    public void z(Object obj, l5.e eVar) {
        ((x) this.f50p).a(7);
        C1444F c1444f = (C1444F) this.f51q;
        c1444f.a(eVar);
        c1444f.a(obj);
    }

    public b(WorkDatabase_Impl workDatabase_Impl, int i7) {
        this.f49o = i7;
        switch (i7) {
            case 13:
                this.f50p = workDatabase_Impl;
                new AtomicBoolean(false);
                this.f51q = new W3.e(workDatabase_Impl, 1);
                this.f52r = new W3.e(workDatabase_Impl, 2);
                break;
            default:
                this.f50p = workDatabase_Impl;
                this.f51q = new W3.b(workDatabase_Impl, 2);
                this.f52r = new W3.e(workDatabase_Impl, 0);
                break;
        }
    }

    public b(AbstractServiceC0600x abstractServiceC0600x) {
        this.f49o = 16;
        this.f50p = new C0599w(abstractServiceC0600x, true);
        this.f51q = new Handler();
    }

    public b(ExecutorService executorService) {
        this.f49o = 15;
        this.f51q = new Handler(Looper.getMainLooper());
        this.f52r = new C1.o(1, this);
        this.f50p = new X3.g(executorService);
    }

    public b(int i7) {
        this.f49o = i7;
        switch (i7) {
            case 6:
                long[] jArr = Q.f16032a;
                this.f50p = new J();
                break;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                this.f50p = new C0247a(8);
                this.f51q = new C0247a(8);
                this.f52r = new C0247a(8);
                break;
            case 14:
                this.f49o = 14;
                this.f50p = i2.q.f13411a;
                this.f51q = C1105h.f13701a;
                this.f52r = F0.f10046a;
                break;
            case 17:
                this.f50p = new C1465u(32);
                break;
            case 22:
                this.f52r = new C0746L(9);
                break;
            case 24:
                this.f50p = new WeakHashMap();
                this.f51q = new WeakHashMap();
                this.f52r = new WeakHashMap();
                break;
            case 27:
                this.f50p = new AtomicReference(n0.e.f14485c);
                this.f51q = new Object();
                break;
            default:
                this.f50p = new Object();
                break;
        }
    }

    @Override // I1.h
    public void A() {
    }

    public b(o oVar, k kVar) {
        this.f49o = 26;
        this.f50p = oVar;
        this.f51q = kVar;
        this.f52r = new SparseArray();
    }

    public b(N2.p pVar) {
        this.f49o = 7;
        this.f50p = pVar;
    }

    public b(View view) {
        this.f49o = 21;
        this.f50p = view;
        this.f51q = AbstractC0509a.N(Y4.f.f8724p, new E0.K(25, this));
        this.f52r = new A.b(view);
    }

    public b(c cVar) {
        this.f49o = 0;
        this.f52r = cVar;
        this.f50p = new A.b(2, this);
    }

    public b(Runnable runnable) {
        this.f49o = 5;
        this.f51q = new CopyOnWriteArrayList();
        this.f52r = new HashMap();
        this.f50p = runnable;
    }

    public b(Context context, LocationManager locationManager) {
        this.f49o = 25;
        this.f52r = new C0159a();
        this.f50p = context;
        this.f51q = locationManager;
    }

    public b(ConnectivityManager connectivityManager, s4.j jVar) {
        this.f49o = 29;
        this.f50p = connectivityManager;
        this.f51q = jVar;
        U3.e eVar = new U3.e(1, this);
        this.f52r = eVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), eVar);
    }

    public b(MediaCodec mediaCodec) {
        this.f49o = 4;
        this.f50p = mediaCodec;
        if (t.f18881a < 21) {
            this.f51q = mediaCodec.getInputBuffers();
            this.f52r = mediaCodec.getOutputBuffers();
        }
    }

    public b(Context context) {
        this.f49o = 19;
        this.f50p = context.getApplicationContext();
        this.f51q = s4.d.f15918a;
        this.f52r = new s4.h();
    }

    public b(Class cls) {
        this.f49o = 9;
        HashSet hashSet = new HashSet();
        this.f52r = hashSet;
        this.f50p = UUID.randomUUID();
        this.f51q = new W3.i(((UUID) this.f50p).toString(), cls.getName());
        hashSet.add(cls.getName());
        ((W3.i) this.f51q).f7808d = OverwritingInputMerger.class.getName();
    }

    public b(U3.h hVar, z zVar, T1.d dVar, Set set) {
        this.f49o = 11;
        this.f50p = zVar;
        this.f51q = hVar;
        this.f52r = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            i0(str, 0, str.length(), 1, true, new u(str, 7));
        }
    }

    public b(u2.d[] dVarArr) {
        this.f49o = 1;
        X x6 = new X();
        u2.g gVar = new u2.g();
        gVar.f17237c = 1.0f;
        gVar.f17238d = 1.0f;
        u2.b bVar = u2.b.f17204e;
        gVar.f17239e = bVar;
        gVar.f17240f = bVar;
        gVar.f17241g = bVar;
        gVar.h = bVar;
        ByteBuffer byteBuffer = u2.d.f17209a;
        gVar.f17244k = byteBuffer;
        gVar.l = byteBuffer.asShortBuffer();
        gVar.f17245m = byteBuffer;
        gVar.f17236b = -1;
        u2.d[] dVarArr2 = new u2.d[dVarArr.length + 2];
        this.f50p = dVarArr2;
        System.arraycopy(dVarArr, 0, dVarArr2, 0, dVarArr.length);
        this.f51q = x6;
        this.f52r = gVar;
        dVarArr2[dVarArr.length] = x6;
        dVarArr2[dVarArr.length + 1] = gVar;
    }

    public b(String str) {
        this.f49o = 3;
        V.o oVar = new V.o((char) 0, 10);
        this.f51q = oVar;
        this.f52r = oVar;
        this.f50p = str;
    }

    public b(f1.p pVar, b bVar) {
        this.f49o = 23;
        this.f50p = pVar;
        this.f51q = bVar;
        this.f52r = pVar.f12020o;
    }

    public b(Object obj) {
        this.f49o = 20;
        this.f50p = new x();
        this.f51q = new C1444F();
        this.f52r = obj;
    }
}
