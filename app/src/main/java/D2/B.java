package D2;

import E4.g0;
import H.H;
import H.k0;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.net.Uri;
import android.text.TextUtils;
import h4.C1003b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import m5.AbstractC1209k;
import t2.AbstractC1479h;
import t2.C1476e;
import t2.C1487p;
import t2.T;
import w2.AbstractC1697a;
import w3.A0;
import w3.C1747r0;
import w3.C1749s0;
import w3.k1;

/* JADX INFO: loaded from: classes.dex */
public final class B implements I4.s {

    /* JADX INFO: renamed from: o */
    public boolean f1458o;

    /* JADX INFO: renamed from: p */
    public final Object f1459p;

    /* JADX INFO: renamed from: q */
    public Object f1460q;

    /* JADX INFO: renamed from: r */
    public Object f1461r;

    public B() {
        this.f1459p = new Object();
        this.f1460q = new ArrayList();
        this.f1461r = new ArrayList();
        this.f1458o = true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:65|101|66|(1:78)|(6:80|81|95|82|107|83)(2:105|84)) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0039, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x003c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x003d, code lost:
    
        r7 = r0.f20380r;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0042, code lost:
    
        if (r7 == 307) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x005f, code lost:
    
        r9 = (java.lang.String) r7.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0066, code lost:
    
        if (r9 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0068, code lost:
    
        r5 = r5 + 1;
        r0 = r4.a();
        r4 = android.net.Uri.parse(r9);
        r0.f17265e = r4;
        w2.AbstractC1697a.k(r4, "The uri must be set.");
        r14 = new y2.m((android.net.Uri) r0.f17265e, r0.f17261a, (byte[]) r0.f17266f, (java.util.Map) r0.f17267g, r0.f17262b, r0.f17263c, (java.lang.String) r0.h, r0.f17264d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00a5, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00a8, code lost:
    
        r4 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ab, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ac, code lost:
    
        r3 = w2.t.f18881a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ae, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00b1, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] d(M5.y r25, java.lang.String r26, byte[] r27, java.util.Map r28) throws D2.D {
        /*
            y2.B r1 = new y2.B
            y2.h r0 = r25.g()
            r1.<init>(r0)
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            android.net.Uri r3 = android.net.Uri.parse(r26)
            java.lang.String r13 = "The uri must be set."
            w2.AbstractC1697a.k(r3, r13)
            y2.m r2 = new y2.m
            r11 = 0
            r12 = 1
            r4 = 2
            r7 = 0
            r9 = -1
            r5 = r27
            r6 = r28
            r2.<init>(r3, r4, r5, r6, r7, r9, r11, r12)
            r3 = 0
            r4 = r2
            r5 = r3
        L27:
            y2.l r6 = new y2.l     // Catch: java.lang.Exception -> Lb2
            r6.<init>(r1, r4)     // Catch: java.lang.Exception -> Lb2
            byte[] r0 = F4.b.b(r6)     // Catch: java.lang.Throwable -> L39 y2.x -> L3c
            int r3 = w2.t.f18881a     // Catch: java.lang.Exception -> Lb2
            r6.close()     // Catch: java.io.IOException -> L35 java.lang.Exception -> Lb2
        L35:
            return r0
        L36:
            r10 = r0
            goto Lb4
        L39:
            r0 = move-exception
            goto Lac
        L3c:
            r0 = move-exception
            int r7 = r0.f20380r     // Catch: java.lang.Throwable -> L39
            r8 = 307(0x133, float:4.3E-43)
            r9 = 0
            if (r7 == r8) goto L48
            r8 = 308(0x134, float:4.32E-43)
            if (r7 != r8) goto L66
        L48:
            r7 = 5
            if (r5 >= r7) goto L66
            java.util.Map r7 = r0.f20381s     // Catch: java.lang.Throwable -> L39
            if (r7 == 0) goto L66
            java.lang.String r8 = "Location"
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Throwable -> L39
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L39
            if (r7 == 0) goto L66
            boolean r8 = r7.isEmpty()     // Catch: java.lang.Throwable -> L39
            if (r8 != 0) goto L66
            java.lang.Object r7 = r7.get(r3)     // Catch: java.lang.Throwable -> L39
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L39
        L66:
            if (r9 == 0) goto Lab
            int r5 = r5 + 1
            u3.c r0 = r4.a()     // Catch: java.lang.Throwable -> L39
            android.net.Uri r4 = android.net.Uri.parse(r9)     // Catch: java.lang.Throwable -> L39
            r0.f17265e = r4     // Catch: java.lang.Throwable -> L39
            w2.AbstractC1697a.k(r4, r13)     // Catch: java.lang.Throwable -> L39
            y2.m r14 = new y2.m     // Catch: java.lang.Throwable -> L39
            java.lang.Object r4 = r0.f17265e     // Catch: java.lang.Throwable -> L39
            r15 = r4
            android.net.Uri r15 = (android.net.Uri) r15     // Catch: java.lang.Throwable -> L39
            int r4 = r0.f17261a     // Catch: java.lang.Throwable -> L39
            java.lang.Object r7 = r0.f17266f     // Catch: java.lang.Throwable -> L39
            r17 = r7
            byte[] r17 = (byte[]) r17     // Catch: java.lang.Throwable -> L39
            java.lang.Object r7 = r0.f17267g     // Catch: java.lang.Throwable -> L39
            r18 = r7
            java.util.Map r18 = (java.util.Map) r18     // Catch: java.lang.Throwable -> L39
            long r7 = r0.f17262b     // Catch: java.lang.Throwable -> L39
            java.lang.Object r9 = r0.h     // Catch: java.lang.Throwable -> L39
            r23 = r9
            java.lang.String r23 = (java.lang.String) r23     // Catch: java.lang.Throwable -> L39
            int r9 = r0.f17264d     // Catch: java.lang.Throwable -> L39
            long r10 = r0.f17263c     // Catch: java.lang.Throwable -> L39
            r16 = r4
            r19 = r7
            r24 = r9
            r21 = r10
            r14.<init>(r15, r16, r17, r18, r19, r21, r23, r24)     // Catch: java.lang.Throwable -> L39
            int r0 = w2.t.f18881a     // Catch: java.lang.Exception -> Lb2
            r6.close()     // Catch: java.io.IOException -> La8 java.lang.Exception -> Lb2
        La8:
            r4 = r14
            goto L27
        Lab:
            throw r0     // Catch: java.lang.Throwable -> L39
        Lac:
            int r3 = w2.t.f18881a     // Catch: java.lang.Exception -> Lb2
            r6.close()     // Catch: java.io.IOException -> Lb1 java.lang.Exception -> Lb2
        Lb1:
            throw r0     // Catch: java.lang.Exception -> Lb2
        Lb2:
            r0 = move-exception
            goto L36
        Lb4:
            D2.D r4 = new D2.D
            android.net.Uri r6 = r1.f20302q
            r6.getClass()
            y2.h r0 = r1.f20300o
            java.util.Map r7 = r0.d()
            long r8 = r1.f20301p
            r5 = r2
            r4.<init>(r5, r6, r7, r8, r10)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.B.d(M5.y, java.lang.String, byte[], java.util.Map):byte[]");
    }

    public boolean a(C1476e c1476e, C1487p c1487p) {
        boolean zEquals = "audio/eac3-joc".equals(c1487p.f16701m);
        int i7 = c1487p.f16680A;
        if (zEquals && i7 == 16) {
            i7 = 12;
        }
        int iN = w2.t.n(i7);
        if (iN == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iN);
        int i8 = c1487p.f16681B;
        if (i8 != -1) {
            channelMask.setSampleRate(i8);
        }
        return ((Spatializer) this.f1459p).canBeSpatialized((AudioAttributes) c1476e.b().f16352a, channelMask.build());
    }

    public void b(boolean z6) {
        h4.f fVar = (h4.f) this.f1461r;
        synchronized (fVar) {
            try {
                if (this.f1458o) {
                    throw new IllegalStateException("editor is closed");
                }
                if (AbstractC1209k.a(((C1003b) this.f1459p).f12716g, this)) {
                    h4.f.b(fVar, this, z6);
                }
                this.f1458o = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public byte[] c(UUID uuid, u uVar) throws D {
        String str = uVar.f1534b;
        if (this.f1458o || TextUtils.isEmpty(str)) {
            str = (String) this.f1460q;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            AbstractC1697a.k(uri, "The uri must be set.");
            throw new D(new y2.m(uri, 1, null, map, 0L, -1L, null, 0), uri, g0.f1938u, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = AbstractC1479h.f16471e;
        map2.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : AbstractC1479h.f16469c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.f1461r)) {
            map2.putAll((HashMap) this.f1461r);
        }
        return d((M5.y) this.f1459p, str, uVar.f1533a, map2);
    }

    public byte[] e(v vVar) {
        return d((M5.y) this.f1459p, vVar.f1536b + "&signedRequest=" + w2.t.k(vVar.f1535a), null, Collections.EMPTY_MAP);
    }

    @Override // I4.s
    public void f(Throwable th) {
        if (th instanceof UnsupportedOperationException) {
            AbstractC1697a.x("UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
        } else {
            AbstractC1697a.n("Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
        }
        A0 a0 = (A0) this.f1461r;
        w2.t.x(a0.f18914s);
        if (this.f1458o) {
            a0.o((C1747r0) this.f1459p, (T) this.f1460q);
        }
    }

    @Override // I4.s
    public void g(Object obj) {
        T t7 = (T) this.f1460q;
        A0 a0 = (A0) this.f1461r;
        a0.getClass();
        k1.i(a0.f18914s, (C1749s0) obj);
        w2.t.x(a0.f18914s);
        if (this.f1458o) {
            a0.o((C1747r0) this.f1459p, t7);
        }
    }

    public S5.u h(int i7) {
        S5.u uVar;
        h4.f fVar = (h4.f) this.f1461r;
        synchronized (fVar) {
            if (this.f1458o) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f1460q)[i7] = true;
            Object obj = ((C1003b) this.f1459p).f12713d.get(i7);
            h4.d dVar = fVar.f12727D;
            S5.u uVar2 = (S5.u) obj;
            if (!dVar.c(uVar2)) {
                s4.e.a(dVar.h(uVar2));
            }
            uVar = (S5.u) obj;
        }
        return uVar;
    }

    public boolean i() {
        boolean z6;
        synchronized (this.f1459p) {
            z6 = this.f1458o;
        }
        return z6;
    }

    public B(String str, boolean z6, M5.y yVar) {
        AbstractC1697a.d((z6 && TextUtils.isEmpty(str)) ? false : true);
        this.f1459p = yVar;
        this.f1460q = str;
        this.f1458o = z6;
        this.f1461r = new HashMap();
    }

    public B(Context context, String str, V.o oVar, boolean z6) {
        this.f1459p = context;
        this.f1460q = str;
        this.f1461r = oVar;
        this.f1458o = z6;
    }

    public B(H h, O0.A0 a0, k0 k0Var) {
        this.f1459p = h;
        this.f1460q = a0;
        this.f1461r = k0Var;
        this.f1458o = true;
    }

    public B(h4.f fVar, C1003b c1003b) {
        this.f1461r = fVar;
        this.f1459p = c1003b;
        fVar.getClass();
        this.f1460q = new boolean[2];
    }

    public B(A0 a0, C1747r0 c1747r0, boolean z6, T t7) {
        this.f1461r = a0;
        this.f1459p = c1747r0;
        this.f1458o = z6;
        this.f1460q = t7;
    }

    public B(Spatializer spatializer) {
        this.f1459p = spatializer;
        this.f1458o = spatializer.getImmersiveAudioLevel() != 0;
    }
}
