package V;

import A2.C0007h;
import A2.RunnableC0022x;
import A2.d0;
import A2.h0;
import A2.i0;
import A2.j0;
import A2.k0;
import A2.m0;
import A2.n0;
import A2.t0;
import A2.x0;
import C2.I;
import D2.C0086b;
import D2.C0089e;
import D2.HandlerC0085a;
import H.H;
import H.Z;
import H.a0;
import H2.A;
import H2.C0205w;
import H2.E;
import I.C;
import I.C0211c;
import I.C0224p;
import L2.y;
import O0.C0;
import O0.D0;
import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.G;
import Q0.InterfaceC0361q;
import Q0.K;
import T1.w;
import T1.z;
import a.AbstractC0509a;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.os.Trace;
import android.provider.DocumentsContract;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Pair;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0589l;
import androidx.lifecycle.EnumC0593p;
import d.C0746L;
import f0.C0879c;
import f0.C0894j0;
import java.io.File;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import p0.AbstractC1289f;
import r.C1380a;
import r0.AbstractC1397o;
import t.C1443E;
import t.C1445G;
import t.N;
import t2.C1487p;
import t2.M;
import t2.s0;
import w.AbstractC1671d;
import w.C1680m;
import w.C1681n;
import w.p0;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.w0;
import y1.C1993b;

/* JADX INFO: loaded from: classes.dex */
public class o implements E, D2.o, F2.i, D0, N3.u, T1.n {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f7341o;

    /* JADX INFO: renamed from: p */
    public Object f7342p;

    /* JADX INFO: renamed from: q */
    public Object f7343q;

    public /* synthetic */ o(char c7, int i7) {
        this.f7341o = i7;
    }

    public static void h(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    private final void j(C0007h c0007h) {
        synchronized (c0007h) {
        }
        Handler handler = (Handler) this.f7342p;
        if (handler != null) {
            handler.post(new RunnableC0022x(this, 2, c0007h));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void l(K k7) {
        if (k7.f5828d0 > 0) {
            if (k7.f5822U.f5859d == G.f5791s && !k7.q() && !k7.r() && !k7.f5829e0 && k7.J()) {
                AbstractC1397o abstractC1397o = k7.f5821T.f6005f;
                if ((abstractC1397o.f15640r & 256) != 0) {
                    while (abstractC1397o != null) {
                        if ((abstractC1397o.f15639q & 256) != 0) {
                            ?? F6 = abstractC1397o;
                            ?? eVar = 0;
                            while (F6 != 0) {
                                if (F6 instanceof InterfaceC0361q) {
                                    InterfaceC0361q interfaceC0361q = (InterfaceC0361q) F6;
                                    interfaceC0361q.z(AbstractC0347f.v(interfaceC0361q, 256));
                                } else if ((F6.f15639q & 256) != 0 && (F6 instanceof AbstractC0358n)) {
                                    AbstractC1397o abstractC1397o2 = ((AbstractC0358n) F6).f6056D;
                                    int i7 = 0;
                                    F6 = F6;
                                    eVar = eVar;
                                    while (abstractC1397o2 != null) {
                                        if ((abstractC1397o2.f15639q & 256) != 0) {
                                            i7++;
                                            eVar = eVar;
                                            if (i7 == 1) {
                                                F6 = abstractC1397o2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new h0.e(new AbstractC1397o[16]);
                                                }
                                                if (F6 != 0) {
                                                    eVar.b(F6);
                                                    F6 = 0;
                                                }
                                                eVar.b(abstractC1397o2);
                                            }
                                        }
                                        abstractC1397o2 = abstractC1397o2.f15642t;
                                        F6 = F6;
                                        eVar = eVar;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                F6 = AbstractC0347f.f(eVar);
                            }
                        }
                        if ((abstractC1397o.f15640r & 256) == 0) {
                            break;
                        } else {
                            abstractC1397o = abstractC1397o.f15642t;
                        }
                    }
                }
            }
            k7.f5827c0 = false;
            h0.e eVarA = k7.A();
            Object[] objArr = eVarA.f12546o;
            int i8 = eVarA.f12548q;
            for (int i9 = 0; i9 < i8; i9++) {
                l((K) objArr[i9]);
            }
        }
    }

    public static o o(Context context, Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(context, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        if (treeDocumentId == null) {
            throw new IllegalArgumentException("Could not get document ID from Uri: " + uri);
        }
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId);
        if (uriBuildDocumentUriUsingTree != null) {
            return new o(context, 28, uriBuildDocumentUriUsingTree);
        }
        throw new NullPointerException("Failed to build documentUri from a tree: " + uri);
    }

    @Override // D2.o
    public void A(int i7, A a4, int i8) {
        Pair pairP = p(i7, a4);
        if (pairP != null) {
            ((n0) this.f7343q).f383i.c(new k0(this, pairP, i8, 0));
        }
    }

    @Override // D2.o
    public void B(int i7, A a4) {
        Pair pairP = p(i7, a4);
        if (pairP != null) {
            ((n0) this.f7343q).f383i.c(new h0(this, pairP, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0071 A[EDGE_INSN: B:205:0x0071->B:145:0x0071 BREAK  A[LOOP:3: B:122:0x0024->B:208:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C(I3.b r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V.o.C(I3.b, int, int):void");
    }

    public void D(Bundle bundle) {
        I i7 = (I) this.f7342p;
        if (!i7.f981a) {
            i7.b();
        }
        E3.f fVar = (E3.f) i7.f984d;
        if (fVar.h().i().compareTo(EnumC0593p.f9748r) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + fVar.h().i()).toString());
        }
        if (i7.f982b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleS = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleS = android.support.v4.media.session.b.s("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        i7.h = bundleS;
        i7.f982b = true;
    }

    public void E(Bundle bundle) {
        I i7 = (I) this.f7342p;
        Bundle bundleF = android.support.v4.media.session.b.f((Y4.h[]) Arrays.copyOf(new Y4.h[0], 0));
        Bundle bundle2 = (Bundle) i7.h;
        if (bundle2 != null) {
            bundleF.putAll(bundle2);
        }
        synchronized (((x0) i7.f986f)) {
            for (Map.Entry entry : ((LinkedHashMap) i7.f987g).entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((E3.d) entry.getValue()).a();
                AbstractC1209k.f(str, "key");
                bundleF.putBundle(str, bundleA);
            }
        }
        if (bundleF.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleF);
    }

    public void F(C0089e c0089e) {
        ((HashSet) this.f7342p).add(c0089e);
        if (((C0089e) this.f7343q) != null) {
            return;
        }
        this.f7343q = c0089e;
        D2.v vVarS = c0089e.f1472b.s();
        c0089e.f1492x = vVarS;
        HandlerC0085a handlerC0085a = c0089e.f1486r;
        int i7 = w2.t.f18881a;
        vVarS.getClass();
        handlerC0085a.getClass();
        handlerC0085a.obtainMessage(1, new C0086b(H2.r.f3226a.getAndIncrement(), true, SystemClock.elapsedRealtime(), vVarS)).sendToTarget();
    }

    public void G(String str, E3.d dVar) {
        AbstractC1209k.f(dVar, "provider");
        I i7 = (I) this.f7342p;
        synchronized (((x0) i7.f986f)) {
            if (((LinkedHashMap) i7.f987g).containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            ((LinkedHashMap) i7.f987g).put(str, dVar);
        }
    }

    public void H() {
        if (!((I) this.f7342p).f983c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        E3.a aVar = (E3.a) this.f7343q;
        if (aVar == null) {
            aVar = new E3.a(this);
        }
        this.f7343q = aVar;
        try {
            C0589l.class.getDeclaredConstructor(new Class[0]);
            E3.a aVar2 = (E3.a) this.f7343q;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f1853b).add(C0589l.class.getName());
            }
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException("Class " + C0589l.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
        }
    }

    @Override // H2.E
    public void I(int i7, A a4, H2.r rVar, C0205w c0205w) {
        Pair pairP = p(i7, a4);
        if (pairP != null) {
            ((n0) this.f7343q).f383i.c(new i0(this, pairP, rVar, c0205w, 2));
        }
    }

    public void J(AbstractC1267a abstractC1267a) {
        boolean z6;
        androidx.lifecycle.A a4 = (androidx.lifecycle.A) this.f7342p;
        synchronized (a4.f9677a) {
            z6 = a4.f9680d == androidx.lifecycle.A.h;
            a4.f9680d = abstractC1267a;
        }
        if (z6) {
            C1380a.L().M(a4.f9683g);
        }
        if (abstractC1267a instanceof N3.t) {
            ((Y3.j) this.f7343q).j((N3.t) abstractC1267a);
        } else if (abstractC1267a instanceof N3.r) {
            ((Y3.j) this.f7343q).k(((N3.r) abstractC1267a).f5148d);
        }
    }

    public void K(I3.b bVar) {
        bVar.j("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.j("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public void L(float f7, n1.d dVar, InterfaceC1765B interfaceC1765B) {
        if (f7 <= dVar.v(a0.f2840a)) {
            return;
        }
        AbstractC1289f abstractC1289fQ = C0746L.q();
        InterfaceC1182c interfaceC1182cE = abstractC1289fQ != null ? abstractC1289fQ.e() : null;
        AbstractC1289f abstractC1289fW = C0746L.w(abstractC1289fQ);
        try {
            float fFloatValue = ((Number) ((C1680m) this.f7343q).f18710p.getValue()).floatValue();
            w0 w0Var = (w0) this.f7342p;
            if (w0Var != null) {
                w0Var.c(null);
            }
            C1680m c1680m = (C1680m) this.f7343q;
            if (c1680m.f18714t) {
                this.f7343q = AbstractC1671d.h(c1680m, fFloatValue - f7, 0.0f, 30);
            } else {
                this.f7343q = new C1680m(p0.f18727a, Float.valueOf(-f7), null, 60);
            }
            this.f7342p = AbstractC1767D.t(interfaceC1765B, null, new Z(this, null), 3);
            C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
        } catch (Throwable th) {
            C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
            throw th;
        }
    }

    @Override // H2.E
    public void M(int i7, A a4, H2.r rVar, C0205w c0205w, IOException iOException, boolean z6) {
        Pair pairP = p(i7, a4);
        if (pairP != null) {
            ((n0) this.f7343q).f383i.c(new j0(this, pairP, rVar, c0205w, iOException, z6, 0));
        }
    }

    @Override // D2.o
    public void N(int i7, A a4, Exception exc) {
        Pair pairP = p(i7, a4);
        if (pairP != null) {
            ((n0) this.f7343q).f383i.c(new d0(this, pairP, exc, 2));
        }
    }

    public void O(s0 s0Var) {
        Handler handler = (Handler) this.f7342p;
        if (handler != null) {
            handler.post(new RunnableC0022x(this, 6, s0Var));
        }
    }

    @Override // H2.E
    public void Q(int i7, A a4, H2.r rVar, C0205w c0205w) {
        Pair pairP = p(i7, a4);
        if (pairP != null) {
            ((n0) this.f7343q).f383i.c(new i0(this, pairP, rVar, c0205w, 0));
        }
    }

    @Override // D2.o
    public void T(int i7, A a4) {
        Pair pairP = p(i7, a4);
        if (pairP != null) {
            ((n0) this.f7343q).f383i.c(new h0(this, pairP, 0));
        }
    }

    @Override // T1.n
    public boolean a(CharSequence charSequence, int i7, int i8, T1.v vVar) {
        if ((vVar.f6903c & 4) > 0) {
            return true;
        }
        if (((z) this.f7342p) == null) {
            this.f7342p = new z(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((N2.z) this.f7343q).getClass();
        ((z) this.f7342p).setSpan(new w(vVar), i7, i8, 33);
        return true;
    }

    @Override // T1.n
    public Object b() {
        return (z) this.f7342p;
    }

    @Override // O0.D0
    public void c(C0 c02) {
        C1443E c1443e = (C1443E) this.f7343q;
        c1443e.a();
        C1445G c1445g = (C1445G) c02.f5286p;
        Object[] objArr = c1445g.f15987b;
        long[] jArr = c1445g.f15988c;
        int i7 = c1445g.f15990e;
        while (i7 != Integer.MAX_VALUE) {
            int i8 = (int) ((jArr[i7] >> 31) & 2147483647L);
            Object obj = objArr[i7];
            Object objB = ((H) this.f7342p).b(obj);
            int iD = c1443e.d(objB);
            int i9 = iD >= 0 ? c1443e.f15979c[iD] : 0;
            if (i9 == 7) {
                c02.remove(obj);
            } else {
                c1443e.h(i9 + 1, objB);
            }
            i7 = i8;
        }
    }

    @Override // O0.D0
    public boolean d(Object obj, Object obj2) {
        H h = (H) this.f7342p;
        return AbstractC1209k.a(h.b(obj), h.b(obj2));
    }

    public void e() {
        this.f7342p = null;
        this.f7343q = null;
    }

    public Bundle f(String str) {
        AbstractC1209k.f(str, "key");
        I i7 = (I) this.f7342p;
        if (!i7.f982b) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = (Bundle) i7.h;
        if (bundle == null) {
            return null;
        }
        Bundle bundleS = bundle.containsKey(str) ? android.support.v4.media.session.b.s(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            i7.h = null;
        }
        return bundleS;
    }

    @Override // F2.i
    /* JADX INFO: renamed from: g */
    public F2.c v(F2.h hVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        F2.k bVar;
        int i7;
        F2.c cVar;
        String str = hVar.f2219a.f2225a;
        F2.c cVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C1487p c1487p = hVar.f2221c;
                int i8 = w2.t.f18881a;
                if (i8 >= 34 && (i8 >= 35 || M.i(c1487p.f16701m))) {
                    bVar = new A.b(13, mediaCodecCreateByCodecName);
                    i7 = 4;
                } else {
                    bVar = new F2.e(mediaCodecCreateByCodecName, (HandlerThread) ((F2.b) this.f7343q).get());
                    i7 = 0;
                }
                cVar = new F2.c(mediaCodecCreateByCodecName, (HandlerThread) ((F2.b) this.f7342p).get(), bVar);
            } catch (Exception e7) {
                e = e7;
            }
            try {
                Trace.endSection();
                F2.c.i(cVar, hVar.f2220b, hVar.f2222d, hVar.f2223e, i7);
                return cVar;
            } catch (Exception e8) {
                e = e8;
                cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.a();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        } catch (Exception e9) {
            e = e9;
            mediaCodecCreateByCodecName = null;
        }
    }

    public void i(C0007h c0007h) {
        switch (this.f7341o) {
            case 7:
                j(c0007h);
                break;
            default:
                synchronized (c0007h) {
                }
                Handler handler = (Handler) this.f7342p;
                if (handler != null) {
                    handler.post(new RunnableC0022x(this, 7, c0007h));
                }
                break;
        }
    }

    @Override // D2.o
    public void k(int i7, A a4) {
        Pair pairP = p(i7, a4);
        if (pairP != null) {
            ((n0) this.f7343q).f383i.c(new h0(this, pairP, 2));
        }
    }

    @Override // H2.E
    public void m(int i7, A a4, C0205w c0205w) {
        Pair pairP = p(i7, a4);
        if (pairP != null) {
            ((n0) this.f7343q).f383i.c(new d0(this, pairP, c0205w, 1));
        }
    }

    public boolean n() {
        Cursor cursorQuery = null;
        try {
            cursorQuery = ((Context) this.f7342p).getContentResolver().query((Uri) this.f7343q, new String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e7) {
            e7.toString();
            return false;
        } finally {
            android.support.v4.media.session.b.h(cursorQuery);
        }
    }

    public Pair p(int i7, A a4) {
        A a7;
        m0 m0Var = (m0) this.f7342p;
        A a8 = null;
        if (a4 != null) {
            int i8 = 0;
            while (true) {
                if (i8 >= m0Var.f360c.size()) {
                    a7 = null;
                    break;
                }
                if (((A) m0Var.f360c.get(i8)).f2976d == a4.f2976d) {
                    Object obj = m0Var.f359b;
                    int i9 = t0.f443n;
                    a7 = a4.a(Pair.create(obj, a4.f2973a));
                    break;
                }
                i8++;
            }
            if (a7 == null) {
                return null;
            }
            a8 = a7;
        }
        return Pair.create(Integer.valueOf(i7 + m0Var.f361d), a8);
    }

    public N2.m q(Object... objArr) {
        Constructor constructorE;
        synchronized (((AtomicBoolean) this.f7343q)) {
            if (!((AtomicBoolean) this.f7343q).get()) {
                try {
                    constructorE = ((B2.g) this.f7342p).e();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f7343q).set(true);
                    constructorE = null;
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating extension", e7);
                }
            }
            constructorE = null;
        }
        if (constructorE == null) {
            return null;
        }
        try {
            return (N2.m) constructorE.newInstance(objArr);
        } catch (Exception e8) {
            throw new IllegalStateException("Unexpected error creating extractor", e8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y4.e, java.lang.Object] */
    public InputMethodManager r() {
        return (InputMethodManager) this.f7343q.getValue();
    }

    public O0.Z s() {
        return (O0.Z) ((C0894j0) this.f7343q).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    public String t() throws Throwable {
        Cursor cursorQuery;
        Uri uri = (Uri) this.f7343q;
        ContentResolver contentResolver = ((Context) this.f7342p).getContentResolver();
        ?? r7 = 0;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{"_display_name"}, null, null, null);
            } catch (Exception e7) {
                e = e7;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                android.support.v4.media.session.b.h(r7);
                throw th;
            }
            try {
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    android.support.v4.media.session.b.h(cursorQuery);
                    return null;
                }
                String string = cursorQuery.getString(0);
                android.support.v4.media.session.b.h(cursorQuery);
                return string;
            } catch (Exception e8) {
                e = e8;
                e.toString();
                android.support.v4.media.session.b.h(cursorQuery);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            r7 = contentResolver;
            android.support.v4.media.session.b.h(r7);
            throw th;
        }
    }

    public String toString() {
        switch (this.f7341o) {
            case 14:
                return "Bounds{lower=" + ((C1993b) this.f7342p) + " upper=" + ((C1993b) this.f7343q) + "}";
            default:
                return super.toString();
        }
    }

    @Override // H2.E
    public void u(int i7, A a4, H2.r rVar, C0205w c0205w) {
        Pair pairP = p(i7, a4);
        if (pairP != null) {
            ((n0) this.f7343q).f383i.c(new i0(this, pairP, rVar, c0205w, 1));
        }
    }

    public E3.d w() {
        E3.d dVar;
        I i7 = (I) this.f7342p;
        synchronized (((x0) i7.f986f)) {
            Iterator it = ((LinkedHashMap) i7.f987g).entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                E3.d dVar2 = (E3.d) entry.getValue();
                if (AbstractC1209k.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x005e A[LOOP:1: B:70:0x005b->B:72:0x005e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V.o[] x() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f7342p
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            android.content.ContentResolver r2 = r1.getContentResolver()
            java.lang.Object r0 = r11.f7343q
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r3 = android.provider.DocumentsContract.getDocumentId(r0)
            android.net.Uri r3 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r0, r3)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
            r10 = 0
            java.lang.String r4 = "document_id"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r7 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
        L29:
            boolean r2 = r10.moveToNext()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            if (r2 == 0) goto L3f
            java.lang.String r2 = r10.getString(r9)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            android.net.Uri r2 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r0, r2)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r8.add(r2)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            goto L29
        L3b:
            r0 = move-exception
            goto L6d
        L3d:
            r0 = move-exception
            goto L45
        L3f:
            r10.close()     // Catch: java.lang.RuntimeException -> L43 java.lang.Exception -> L50
            goto L50
        L43:
            r0 = move-exception
            throw r0
        L45:
            r0.toString()     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L50
            r10.close()     // Catch: java.lang.RuntimeException -> L4e java.lang.Exception -> L50
            goto L50
        L4e:
            r0 = move-exception
            throw r0
        L50:
            android.net.Uri[] r0 = new android.net.Uri[r9]
            java.lang.Object[] r0 = r8.toArray(r0)
            android.net.Uri[] r0 = (android.net.Uri[]) r0
            int r2 = r0.length
            V.o[] r2 = new V.o[r2]
        L5b:
            int r3 = r0.length
            if (r9 >= r3) goto L6c
            V.o r3 = new V.o
            r4 = r0[r9]
            r5 = 28
            r3.<init>(r1, r5, r4)
            r2[r9] = r3
            int r9 = r9 + 1
            goto L5b
        L6c:
            return r2
        L6d:
            if (r10 == 0) goto L75
            r10.close()     // Catch: java.lang.RuntimeException -> L73 java.lang.Exception -> L75
            goto L75
        L73:
            r0 = move-exception
            throw r0
        L75:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V.o.x():V.o[]");
    }

    public void y(Exception exc, boolean z6) {
        this.f7343q = null;
        HashSet hashSet = (HashSet) this.f7342p;
        E4.I iP = E4.I.p(hashSet);
        hashSet.clear();
        E4.G gListIterator = iP.listIterator(0);
        while (gListIterator.hasNext()) {
            C0089e c0089e = (C0089e) gListIterator.next();
            c0089e.getClass();
            c0089e.l(exc, z6 ? 1 : 3);
        }
    }

    public void z(C1.i iVar) {
        int i7 = iVar.f954b;
        C1.o oVar = (C1.o) this.f7343q;
        k.I i8 = (k.I) this.f7342p;
        if (i7 == 0) {
            oVar.execute(new I4.t(i8, 2, iVar.f953a));
        } else {
            oVar.execute(new C1.a(i8, i7));
        }
    }

    public /* synthetic */ o(int i7, Object obj) {
        this.f7341o = i7;
        this.f7342p = obj;
    }

    public /* synthetic */ o(Object obj, int i7, Object obj2) {
        this.f7341o = i7;
        this.f7342p = obj;
        this.f7343q = obj2;
    }

    public o(I i7) {
        this.f7341o = 12;
        this.f7342p = i7;
        this.f7343q = new o(11, i7);
    }

    public o(K k7, O0.Z z6) {
        this.f7341o = 24;
        this.f7342p = k7;
        this.f7343q = C0879c.t(z6);
    }

    public o(C0211c c0211c, C0224p c0224p, C c7) {
        this.f7341o = 1;
        this.f7342p = c0211c;
        this.f7343q = c0224p;
    }

    public o(View view) {
        this.f7341o = 0;
        this.f7342p = view;
        this.f7343q = AbstractC0509a.N(Y4.f.f8724p, new E3.e(13, this));
    }

    public o(int i7) {
        this.f7341o = 13;
        F2.b bVar = new F2.b(i7, 0);
        F2.b bVar2 = new F2.b(i7, 1);
        this.f7342p = bVar;
        this.f7343q = bVar2;
    }

    public o(H h) {
        this.f7341o = 15;
        this.f7342p = h;
        C1443E c1443e = N.f16028a;
        this.f7343q = new C1443E();
    }

    public o(Handler handler, y yVar) {
        this.f7341o = 19;
        if (yVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f7342p = handler;
        this.f7343q = yVar;
    }

    public o(Handler handler, C2.r rVar) {
        this.f7341o = 7;
        if (rVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f7342p = handler;
        this.f7343q = rVar;
    }

    public o(WindowInsetsAnimation.Bounds bounds) {
        this.f7341o = 14;
        this.f7342p = C1993b.c(bounds.getLowerBound());
        this.f7343q = C1993b.c(bounds.getUpperBound());
    }

    public o(n0 n0Var, m0 m0Var) {
        this.f7341o = 3;
        this.f7343q = n0Var;
        this.f7342p = m0Var;
    }

    public o(B2.g gVar) {
        this.f7341o = 21;
        this.f7342p = gVar;
        this.f7343q = new AtomicBoolean(false);
    }

    public o(int i7, byte b7) {
        this.f7341o = i7;
        switch (i7) {
            case 16:
                this.f7343q = new C1680m(p0.f18727a, Float.valueOf(0.0f), new C1681n(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
            case 23:
                this.f7342p = new androidx.lifecycle.A();
                this.f7343q = new Y3.j();
                J(N3.u.h);
                break;
            case 26:
                this.f7342p = new h0.e(new K[16]);
                break;
            case 27:
                this.f7342p = new h0.e(new Reference[16]);
                this.f7343q = new ReferenceQueue();
                break;
            default:
                this.f7342p = new HashSet();
                break;
        }
    }
}
