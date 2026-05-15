package V1;

import D.h0;
import G1.AbstractC0158z;
import G1.I;
import G1.N;
import I4.A;
import N2.InterfaceC0291h;
import N2.o;
import Z4.n;
import Z4.p;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase_Impl;
import b1.AbstractC0607C;
import b1.C0622g;
import b1.L;
import d.C0746L;
import d2.C0821i;
import f0.AbstractC0876a0;
import f0.L0;
import g0.K;
import g1.C0966h;
import g1.C0980v;
import g1.InterfaceC0965g;
import j5.AbstractC1110d;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import k.LayoutInflaterFactory2C1111A;
import k.r;
import k3.m;
import m5.AbstractC1209k;
import n4.C1230a;
import n4.C1231b;
import n4.C1233d;
import n4.C1234e;
import n4.InterfaceC1236g;
import o.AbstractC1243a;
import o0.C1245b;
import o0.InterfaceC1255l;
import p.MenuC1268A;
import p.l;
import q.S0;
import s3.C1431a;
import t.C1444F;
import t.C1465u;
import t.T;
import t2.J;
import t3.C1498B;
import t3.C1500D;
import t3.y;
import t3.z;
import w.InterfaceC1690x;
import w2.AbstractC1697a;
import w2.t;
import x3.C1901C;
import x3.C1902D;
import x3.C1903E;
import x3.C1904F;
import x3.C1906H;
import x3.C1907I;
import x3.C1910L;
import x3.C1919d;
import x3.InterfaceC1923h;
import x3.Y;
import x3.m0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d1.d, K, InterfaceC1236g, InterfaceC1255l, m, InterfaceC0291h, y, InterfaceC1690x, y2.g {

    /* JADX INFO: renamed from: o */
    public Object f7389o;

    /* JADX INFO: renamed from: p */
    public Object f7390p;

    public /* synthetic */ a(Object obj, Object obj2) {
        this.f7389o = obj;
        this.f7390p = obj2;
    }

    public static p4.d x(p4.h hVar, Throwable th) {
        Drawable drawableB;
        if (th instanceof p4.k) {
            hVar.f15052F.getClass();
            drawableB = s4.d.b(hVar, hVar.f15050D);
            if (drawableB == null) {
                hVar.f15052F.getClass();
                drawableB = s4.d.b(hVar, hVar.f15049C);
            }
        } else {
            hVar.f15052F.getClass();
            drawableB = s4.d.b(hVar, hVar.f15049C);
        }
        return new p4.d(drawableB, hVar, th);
    }

    @Override // n4.InterfaceC1236g
    public void A() {
        ((C1234e) this.f7390p).h(-1);
    }

    public C1903E B() {
        MediaController.PlaybackInfo playbackInfo = ((C1901C) this.f7389o).f19973a.getPlaybackInfo();
        if (playbackInfo != null) {
            return new C1903E(playbackInfo.getPlaybackType(), C1919d.a(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
        return null;
    }

    public m0 C() {
        C1901C c1901c = (C1901C) this.f7389o;
        InterfaceC1923h interfaceC1923hA = c1901c.f19977e.a();
        if (interfaceC1923hA != null) {
            try {
                return interfaceC1923hA.d();
            } catch (RemoteException unused) {
            }
        }
        PlaybackState playbackState = c1901c.f19973a.getPlaybackState();
        if (playbackState != null) {
            return m0.a(playbackState);
        }
        return null;
    }

    public synchronized Map D() {
        try {
            if (((Map) this.f7390p) == null) {
                this.f7390p = Collections.unmodifiableMap(new HashMap((HashMap) this.f7389o));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f7390p;
    }

    public ArrayList E(String str) {
        B3.m mVarB = B3.m.b(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            mVarB.h(1);
        } else {
            mVarB.i(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7389o;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(mVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            mVarB.j();
        }
    }

    public C1904F F() {
        MediaController.TransportControls transportControls = ((C1901C) this.f7389o).f19973a.getTransportControls();
        int i7 = Build.VERSION.SDK_INT;
        return i7 >= 29 ? new C1907I(transportControls) : i7 >= 24 ? new C1906H(transportControls) : new C1904F(transportControls);
    }

    public void G(W3.c cVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7389o;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((W3.b) this.f7390p).e(cVar);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public I4.y H(J j3) {
        Uri uri;
        byte[] bArr = j3.f16313k;
        if (bArr != null) {
            return w(bArr);
        }
        Uri uri2 = j3.f16314m;
        if (uri2 == null) {
            return null;
        }
        S0 s02 = (S0) this.f7390p;
        if (s02 != null && (uri = (Uri) s02.f15226q) != null && uri.equals(uri2)) {
            I4.y yVar = (I4.y) ((S0) this.f7390p).f15227r;
            AbstractC1697a.j(yVar);
            return yVar;
        }
        y2.j jVar = (y2.j) this.f7389o;
        jVar.getClass();
        I4.y yVarA = ((A) jVar.f20335a).a(new y2.i(jVar, uri2, 1));
        this.f7390p = new S0(uri2, yVarA);
        return yVarA;
    }

    public void I(AbstractC1243a abstractC1243a) {
        U3.h hVar = (U3.h) this.f7389o;
        ((ActionMode.Callback) hVar.f7042o).onDestroyActionMode(hVar.L(abstractC1243a));
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) this.f7390p;
        if (layoutInflaterFactory2C1111A.f13789K != null) {
            layoutInflaterFactory2C1111A.f13826z.getDecorView().removeCallbacks(layoutInflaterFactory2C1111A.f13790L);
        }
        if (layoutInflaterFactory2C1111A.f13788J != null) {
            N n7 = layoutInflaterFactory2C1111A.f13791M;
            if (n7 != null) {
                n7.b();
            }
            N nA = I.a(layoutInflaterFactory2C1111A.f13788J);
            nA.a(0.0f);
            layoutInflaterFactory2C1111A.f13791M = nA;
            nA.d(new r(2, this));
        }
        layoutInflaterFactory2C1111A.f13787I = null;
        ViewGroup viewGroup = layoutInflaterFactory2C1111A.f13794P;
        WeakHashMap weakHashMap = I.f2641a;
        AbstractC0158z.c(viewGroup);
        layoutInflaterFactory2C1111A.H();
    }

    public boolean J(AbstractC1243a abstractC1243a, l lVar) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C1111A) this.f7390p).f13794P;
        WeakHashMap weakHashMap = I.f2641a;
        AbstractC0158z.c(viewGroup);
        U3.h hVar = (U3.h) this.f7389o;
        o.e eVarL = hVar.L(abstractC1243a);
        T t7 = (T) hVar.f7045r;
        Menu menuC1268A = (Menu) t7.get(lVar);
        if (menuC1268A == null) {
            menuC1268A = new MenuC1268A((Context) hVar.f7043p, lVar);
            t7.put(lVar, menuC1268A);
        }
        return ((ActionMode.Callback) hVar.f7042o).onPrepareActionMode(eVarL, menuC1268A);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p4.l K(p4.h r18, q4.h r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r4 = r19
            Z4.v r2 = r1.h
            r2.getClass()
            android.graphics.Bitmap$Config r2 = r1.f15058f
            boolean r2 = i6.h.D(r2)
            if (r2 != 0) goto L14
            goto L2c
        L14:
            android.graphics.Bitmap$Config r2 = r1.f15058f
            boolean r2 = i6.h.D(r2)
            if (r2 != 0) goto L1d
            goto L22
        L1d:
            boolean r2 = r1.f15063m
            if (r2 != 0) goto L22
            goto L30
        L22:
            java.lang.Object r2 = r0.f7390p
            s4.g r2 = (s4.g) r2
            boolean r2 = r2.b(r4)
            if (r2 == 0) goto L30
        L2c:
            android.graphics.Bitmap$Config r2 = r1.f15058f
        L2e:
            r3 = r2
            goto L33
        L30:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L2e
        L33:
            java.lang.Object r2 = r0.f7389o
            s4.j r2 = (s4.j) r2
            boolean r2 = r2.f15936r
            if (r2 == 0) goto L3f
            p4.a r2 = r1.f15068r
        L3d:
            r15 = r2
            goto L42
        L3f:
            p4.a r2 = p4.EnumC1295a.f15001r
            goto L3d
        L42:
            j0.k r2 = r4.f15594a
            q4.b r5 = q4.C1378b.f15583a
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L59
            j0.k r2 = r4.f15595b
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L55
            goto L59
        L55:
            q4.g r2 = r1.f15075y
        L57:
            r5 = r2
            goto L5c
        L59:
            q4.g r2 = q4.g.f15591p
            goto L57
        L5c:
            boolean r2 = r1.f15064n
            if (r2 == 0) goto L6c
            Z4.v r2 = r1.h
            r2.getClass()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ALPHA_8
            if (r3 == r2) goto L6c
            r2 = 1
        L6a:
            r7 = r2
            goto L6e
        L6c:
            r2 = 0
            goto L6a
        L6e:
            p4.l r2 = new p4.l
            r6 = r2
            android.content.Context r2 = r1.f15053a
            r8 = r6
            boolean r6 = s4.d.a(r1)
            r9 = r8
            boolean r8 = r1.f15065o
            r10 = r9
            java.lang.String r9 = r1.f15057e
            r11 = r10
            F5.m r10 = r1.f15061j
            r12 = r11
            p4.o r11 = r1.f15062k
            r13 = r12
            p4.m r12 = r1.f15076z
            r14 = r13
            p4.a r13 = r1.f15066p
            p4.a r1 = r1.f15067q
            r16 = r14
            r14 = r1
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r13 = r1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.a.K(p4.h, q4.h):p4.l");
    }

    public void L(C1910L c1910l) {
        C1901C c1901c = (C1901C) this.f7389o;
        if ((c1901c.f19973a.getFlags() & 4) == 0) {
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", j0.k.s(c1910l, MediaDescriptionCompat.CREATOR));
        c1901c.f19973a.sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
    }

    public void M(int i7, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i7;
        messageObtain.arg1 = 1;
        if (bundle != null) {
            messageObtain.setData(bundle);
        }
        messageObtain.replyTo = messenger;
        ((Messenger) this.f7389o).send(messageObtain);
    }

    public void N(AbstractC0876a0 abstractC0876a0) {
        Object objG = ((t.J) this.f7390p).g(abstractC0876a0);
        if (objG != null) {
            if (!(objG instanceof C1444F)) {
                throw new ClassCastException();
            }
            C1444F c1444f = (C1444F) objG;
            Object[] objArr = c1444f.f15983a;
            if (c1444f.f15984b <= 0) {
                return;
            }
            AbstractC1209k.d(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0118 A[EDGE_INSN: B:140:0x0118->B:125:0x0118 BREAK  A[LOOP:1: B:111:0x00df->B:124:0x0107], SYNTHETIC] */
    @Override // N2.InterfaceC0291h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public N2.C0290g a(N2.C0293j r17, long r18) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.a.a(N2.j, long):N2.g");
    }

    @Override // t3.y
    public void b(w2.m mVar) {
        if (mVar.u() != 0 || (mVar.u() & 128) == 0) {
            return;
        }
        mVar.H(6);
        int iA = mVar.a() / 4;
        int i7 = 0;
        while (true) {
            C1498B c1498b = (C1498B) this.f7390p;
            if (i7 >= iA) {
                c1498b.getClass();
                c1498b.f16786g.remove(0);
                return;
            }
            N2.J j3 = (N2.J) this.f7389o;
            mVar.e(j3.f4989d, 0, 4);
            j3.q(0);
            int i8 = j3.i(16);
            j3.t(3);
            if (i8 == 0) {
                j3.t(13);
            } else {
                int i9 = j3.i(13);
                if (c1498b.f16786g.get(i9) == null) {
                    c1498b.f16786g.put(i9, new z(new i3.j(c1498b, i9)));
                    c1498b.f16790m++;
                }
            }
            i7++;
        }
    }

    @Override // k3.m
    public /* synthetic */ void d() {
    }

    @Override // g0.K
    public List e(Integer num) {
        List listE = ((K) this.f7389o).e(null);
        L0 l02 = (L0) this.f7390p;
        int i7 = l02.f11713v;
        return i7 < 0 ? listE : n.B0(AbstractC1110d.q(l02, num, i7, Integer.valueOf(l02.D(l02.f11695b, i7))), listE);
    }

    @Override // d1.d
    public int f(int i7) {
        do {
            i7 = ((d1.e) this.f7390p).r(i7);
            if (i7 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f7389o).charAt(i7)));
        return i7;
    }

    @Override // o0.InterfaceC1255l
    public Object g(C1245b c1245b, Object obj) {
        return ((l5.e) this.f7389o).invoke(c1245b, obj);
    }

    @Override // n4.InterfaceC1236g
    public C1231b h(C1230a c1230a) {
        C1233d c1233d = (C1233d) ((C1234e) this.f7390p).c(c1230a);
        if (c1233d != null) {
            return new C1231b(c1233d.f14545a, c1233d.f14546b);
        }
        return null;
    }

    @Override // k3.m
    public /* synthetic */ k3.d i(byte[] bArr, int i7, int i8) {
        return Z1.l.e(this, bArr, i8);
    }

    @Override // d1.d
    public int j(int i7) {
        do {
            i7 = ((d1.e) this.f7390p).m(i7);
            if (i7 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f7389o).charAt(i7 - 1)));
        return i7;
    }

    @Override // w.InterfaceC1690x
    public float k(float f7) {
        ArrayList arrayList = (ArrayList) this.f7390p;
        int size = arrayList.size();
        ArrayList arrayList2 = (ArrayList) this.f7389o;
        double dDoubleValue = ((Number) arrayList2.get(size - 1)).doubleValue();
        for (int i7 = size - 2; -1 < i7; i7--) {
            dDoubleValue = ((Number) arrayList2.get(i7)).doubleValue() + ((((double) f7) - ((Number) arrayList.get(i7)).doubleValue()) * dDoubleValue);
        }
        return (float) dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // k3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(byte[] r20, int r21, int r22, k3.l r23, w2.c r24) {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.a.l(byte[], int, int, k3.l, w2.c):void");
    }

    @Override // N2.InterfaceC0291h
    public void m() {
        byte[] bArr = t.f18886f;
        w2.m mVar = (w2.m) this.f7390p;
        mVar.getClass();
        mVar.E(bArr.length, bArr);
    }

    @Override // d1.d
    public int n(int i7) {
        CharSequence charSequence;
        do {
            i7 = ((d1.e) this.f7390p).m(i7);
            if (i7 != -1) {
                charSequence = (CharSequence) this.f7389o;
                if (i7 == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i7)));
        return i7;
    }

    @Override // d1.d
    public int o(int i7) {
        do {
            i7 = ((d1.e) this.f7390p).r(i7);
            if (i7 == -1 || i7 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f7389o).charAt(i7 - 1)));
        return i7;
    }

    @Override // n4.InterfaceC1236g
    public void p(C1230a c1230a, Bitmap bitmap, Map map) {
        int i7;
        int iY = i6.h.y(bitmap);
        C1234e c1234e = (C1234e) this.f7390p;
        synchronized (c1234e.f16112c) {
            i7 = c1234e.f16110a;
        }
        if (iY <= i7) {
            ((C1234e) this.f7390p).d(c1230a, new C1233d(bitmap, map, iY));
        } else {
            ((C1234e) this.f7390p).e(c1230a);
            ((C1.k) this.f7389o).h(c1230a, bitmap, map, iY);
        }
    }

    @Override // n4.InterfaceC1236g
    public void q(int i7) {
        int i8;
        if (i7 >= 40) {
            A();
            return;
        }
        if (10 > i7 || i7 >= 20) {
            return;
        }
        C1234e c1234e = (C1234e) this.f7390p;
        synchronized (c1234e.f16112c) {
            i8 = c1234e.f16113d;
        }
        c1234e.h(i8 / 2);
    }

    @Override // k3.m
    public /* synthetic */ void r(byte[] bArr, k3.l lVar, A2.I i7) {
        Z1.l.d(this, bArr, lVar, i7);
    }

    @Override // k3.m
    public int s() {
        return 1;
    }

    public void t(C1910L c1910l, int i7) {
        C1901C c1901c = (C1901C) this.f7389o;
        if ((c1901c.f19973a.getFlags() & 4) == 0) {
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", j0.k.s(c1910l, MediaDescriptionCompat.CREATOR));
        bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i7);
        c1901c.f19973a.sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
    }

    public C0980v u(List list) {
        InterfaceC0965g interfaceC0965g;
        Exception e7;
        try {
            int size = list.size();
            int i7 = 0;
            interfaceC0965g = null;
            while (i7 < size) {
                try {
                    InterfaceC0965g interfaceC0965g2 = (InterfaceC0965g) list.get(i7);
                    try {
                        interfaceC0965g2.a((C0966h) this.f7390p);
                        i7++;
                        interfaceC0965g = interfaceC0965g2;
                    } catch (Exception e8) {
                        e7 = e8;
                        interfaceC0965g = interfaceC0965g2;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(((d1.e) ((C0966h) this.f7390p).f12359t).f());
                        sb2.append(", composition=");
                        sb2.append(((C0966h) this.f7390p).f());
                        sb2.append(", selection=");
                        C0966h c0966h = (C0966h) this.f7390p;
                        sb2.append((Object) L.h(AbstractC0607C.b(c0966h.f12355p, c0966h.f12356q)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        n.v0(list, sb, new h0(interfaceC0965g, 19, this), 60);
                        String string = sb.toString();
                        AbstractC1209k.e(string, "toString(...)");
                        throw new RuntimeException(string, e7);
                    }
                } catch (Exception e9) {
                    e7 = e9;
                }
            }
            C0966h c0966h2 = (C0966h) this.f7390p;
            c0966h2.getClass();
            C0622g c0622g = new C0622g(((d1.e) c0966h2.f12359t).toString());
            C0966h c0966h3 = (C0966h) this.f7390p;
            long jB = AbstractC0607C.b(c0966h3.f12355p, c0966h3.f12356q);
            L l = L.g(((C0980v) this.f7389o).f12385b) ? null : new L(jB);
            C0980v c0980v = new C0980v(c0622g, l != null ? l.f9945a : AbstractC0607C.b(L.e(jB), L.f(jB)), ((C0966h) this.f7390p).f());
            this.f7389o = c0980v;
            return c0980v;
        } catch (Exception e10) {
            interfaceC0965g = null;
            e7 = e10;
        }
    }

    public y2.h v() {
        return new y2.n((Context) this.f7389o, ((M5.y) this.f7390p).g());
    }

    public I4.y w(byte[] bArr) {
        byte[] bArr2;
        S0 s02 = (S0) this.f7390p;
        if (s02 != null && (bArr2 = (byte[]) s02.f15225p) != null && Arrays.equals(bArr2, bArr)) {
            I4.y yVar = (I4.y) ((S0) this.f7390p).f15227r;
            AbstractC1697a.j(yVar);
            return yVar;
        }
        y2.j jVar = (y2.j) this.f7389o;
        jVar.getClass();
        I4.y yVarA = ((A) jVar.f20335a).a(new y2.i(jVar, bArr, 0));
        this.f7390p = new S0(bArr, yVarA);
        return yVarA;
    }

    public ArrayList y(String str) {
        B3.m mVarB = B3.m.b(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            mVarB.h(1);
        } else {
            mVarB.i(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7389o;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(mVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            mVarB.j();
        }
    }

    public Long z(String str) {
        B3.m mVarB = B3.m.b(1, "SELECT long_value FROM Preference where `key`=?");
        mVarB.i(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7389o;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(mVarB);
        try {
            Long lValueOf = null;
            if (cursorG.moveToFirst() && !cursorG.isNull(0)) {
                lValueOf = Long.valueOf(cursorG.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorG.close();
            mVarB.j();
        }
    }

    public a(Y4.h... hVarArr) {
        List listP0 = Z4.l.p0(hVarArr);
        ArrayList arrayList = new ArrayList(p.j0(listP0));
        Iterator it = listP0.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) ((Y4.h) it.next()).f8726o).doubleValue()));
        }
        if (n.O0(arrayList).size() != listP0.size()) {
            throw new IllegalArgumentException("All x-coordinates of the points must be unique.");
        }
        int size = listP0.size();
        ArrayList arrayList2 = new ArrayList(p.j0(listP0));
        Iterator it2 = listP0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Double.valueOf(((Number) ((Y4.h) it2.next()).f8726o).doubleValue()));
        }
        this.f7390p = arrayList2;
        ArrayList arrayList3 = new ArrayList(p.j0(listP0));
        Iterator it3 = listP0.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Double.valueOf(((Number) ((Y4.h) it3.next()).f8727p).doubleValue()));
        }
        ArrayList arrayListL0 = n.L0(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int i7 = 0;
        while (i7 < size) {
            arrayList4.add(arrayListL0.get(i7));
            int i8 = i7 + 1;
            for (int i9 = i8; i9 < size; i9++) {
                arrayListL0.set(i9, Double.valueOf((((Number) arrayListL0.get(i9)).doubleValue() - ((Number) arrayListL0.get(i9 - 1)).doubleValue()) / (((Number) ((ArrayList) this.f7390p).get(i9)).doubleValue() - ((Number) ((ArrayList) this.f7390p).get((i9 - i7) - 1)).doubleValue())));
            }
            i7 = i8;
        }
        this.f7389o = arrayList4;
    }

    public a(WorkDatabase_Impl workDatabase_Impl, int i7) {
        switch (i7) {
            case 2:
                this.f7389o = workDatabase_Impl;
                this.f7390p = new W3.b(workDatabase_Impl, 1);
                break;
            case 3:
                this.f7389o = workDatabase_Impl;
                this.f7390p = new W3.b(workDatabase_Impl, 3);
                break;
            case 4:
                this.f7389o = workDatabase_Impl;
                this.f7390p = new W3.b(workDatabase_Impl, 5);
                break;
            default:
                this.f7389o = workDatabase_Impl;
                this.f7390p = new W3.b(workDatabase_Impl, 0);
                break;
        }
    }

    public a(int i7) {
        switch (i7) {
            case 6:
                this.f7389o = new LinkedHashMap();
                this.f7390p = new LinkedHashMap();
                break;
            case 8:
                this.f7389o = new t.J();
                this.f7390p = new t.J();
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                this.f7389o = new C0746L(9);
                this.f7390p = new C1465u(16);
                break;
            case 17:
                this.f7389o = new w2.m();
                this.f7390p = new C1431a();
                break;
            case 26:
                this.f7389o = new HashMap();
                break;
            case 27:
                this.f7389o = new L0.d(0);
                this.f7390p = new L0.d(0);
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f7389o = byteArrayOutputStream;
                this.f7390p = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    public a(y2.j jVar) {
        this.f7389o = jVar;
    }

    public a(Context context) {
        M5.y yVar = new M5.y(5);
        this.f7389o = context.getApplicationContext();
        this.f7390p = yVar;
    }

    public a(Context context, Y y6) {
        if (y6 != null) {
            this.f7390p = Collections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f7389o = new C1902D(context, y6);
                return;
            } else {
                this.f7389o = new C1901C(context, y6);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    @Override // t3.y
    public void c(w2.r rVar, o oVar, C1500D c1500d) {
    }
}
