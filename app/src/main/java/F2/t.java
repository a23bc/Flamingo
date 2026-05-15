package F2;

import A2.AbstractC0006g;
import A2.C0007h;
import A2.C0008i;
import A2.C0013n;
import A2.O;
import C2.W;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import t2.C1487p;
import w2.AbstractC1697a;
import z2.InterfaceC2080a;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends AbstractC0006g {
    public static final byte[] S0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f2242A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f2243B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f2244C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f2245D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f2246E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final i f2247F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f2248F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final u f2249G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f2250G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f2251H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public long f2252H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final float f2253I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public long f2254I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final z2.f f2255J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public boolean f2256J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final z2.f f2257K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public boolean f2258K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final z2.f f2259L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f2260L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final g f2261M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f2262M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final MediaCodec.BufferInfo f2263N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public C0013n f2264N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ArrayDeque f2265O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public C0007h f2266O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final W f2267P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public s f2268P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C1487p f2269Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public long f2270Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C1487p f2271R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f2272R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public D2.k f2273S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public D2.k f2274T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public O f2275U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public MediaCrypto f2276V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final long f2277W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public float f2278X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public float f2279Y;
    public j Z;
    public C1487p a0;
    public MediaFormat b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f2280c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f2281d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ArrayDeque f2282e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public q f2283f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public m f2284g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f2285h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f2286i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f2287j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f2288k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f2289l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f2290m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f2291n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f2292o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f2293p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f2294q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f2295r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f2296s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f2297t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ByteBuffer f2298u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f2299v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f2300w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f2301x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f2302y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f2303z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i7, i iVar, boolean z6, float f7) {
        super(i7);
        u uVar = u.f2304p;
        this.f2247F = iVar;
        this.f2249G = uVar;
        this.f2251H = z6;
        this.f2253I = f7;
        this.f2255J = new z2.f(0, 0);
        this.f2257K = new z2.f(0, 0);
        this.f2259L = new z2.f(2, 0);
        g gVar = new g(2, 0);
        gVar.f2216A = 32;
        this.f2261M = gVar;
        this.f2263N = new MediaCodec.BufferInfo();
        this.f2278X = 1.0f;
        this.f2279Y = 1.0f;
        this.f2277W = -9223372036854775807L;
        this.f2265O = new ArrayDeque();
        this.f2268P0 = s.f2237e;
        gVar.h(0);
        gVar.f21115s.order(ByteOrder.nativeOrder());
        W w7 = new W();
        w7.f1090a = u2.d.f17209a;
        w7.f1092c = 0;
        w7.f1091b = 2;
        this.f2267P = w7;
        this.f2281d0 = -1.0f;
        this.f2285h0 = 0;
        this.f2243B0 = 0;
        this.f2296s0 = -1;
        this.f2297t0 = -1;
        this.f2295r0 = -9223372036854775807L;
        this.f2252H0 = -9223372036854775807L;
        this.f2254I0 = -9223372036854775807L;
        this.f2270Q0 = -9223372036854775807L;
        this.f2244C0 = 0;
        this.f2245D0 = 0;
        this.f2266O0 = new C0007h();
    }

    @Override // A2.AbstractC0006g
    public final int A(C1487p c1487p) throws C0013n {
        try {
            return r0(this.f2249G, c1487p);
        } catch (x e7) {
            throw b(e7, c1487p, false, 4002);
        }
    }

    @Override // A2.AbstractC0006g
    public final int B() {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0312  */
    /* JADX WARN: Type inference failed for: r25v0, types: [A2.g, F2.t] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(long r26, long r28) throws A2.C0013n {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.t.C(long, long):boolean");
    }

    public abstract C0008i D(m mVar, C1487p c1487p, C1487p c1487p2);

    public l E(IllegalStateException illegalStateException, m mVar) {
        return new l(illegalStateException, mVar);
    }

    public final void F() {
        this.f2303z0 = false;
        this.f2261M.f();
        this.f2259L.f();
        this.f2302y0 = false;
        this.f2301x0 = false;
        W w7 = this.f2267P;
        w7.getClass();
        w7.f1090a = u2.d.f17209a;
        w7.f1092c = 0;
        w7.f1091b = 2;
    }

    public final boolean G() throws C0013n {
        if (!this.f2246E0) {
            t0();
            return true;
        }
        this.f2244C0 = 1;
        if (this.f2287j0 || this.f2289l0) {
            this.f2245D0 = 3;
            return false;
        }
        this.f2245D0 = 2;
        return true;
    }

    public final boolean H(long j3, long j7) throws C0013n {
        boolean z6;
        boolean z7;
        MediaCodec.BufferInfo bufferInfo;
        boolean zH0;
        int iE;
        j jVar = this.Z;
        jVar.getClass();
        boolean z8 = this.f2297t0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f2263N;
        if (!z8) {
            if (this.f2290m0 && this.f2248F0) {
                try {
                    iE = jVar.e(bufferInfo2);
                } catch (IllegalStateException unused) {
                    g0();
                    if (this.f2258K0) {
                        j0();
                    }
                }
            } else {
                iE = jVar.e(bufferInfo2);
            }
            if (iE < 0) {
                if (iE != -2) {
                    if (this.f2294q0 && (this.f2256J0 || this.f2244C0 == 2)) {
                        g0();
                        return false;
                    }
                    return false;
                }
                this.f2250G0 = true;
                j jVar2 = this.Z;
                jVar2.getClass();
                MediaFormat mediaFormatX = jVar2.x();
                if (this.f2285h0 != 0 && mediaFormatX.getInteger("width") == 32 && mediaFormatX.getInteger("height") == 32) {
                    this.f2293p0 = true;
                    return true;
                }
                this.b0 = mediaFormatX;
                this.f2280c0 = true;
                return true;
            }
            if (this.f2293p0) {
                this.f2293p0 = false;
                jVar.j(iE, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                g0();
                return false;
            }
            this.f2297t0 = iE;
            ByteBuffer byteBufferD = jVar.D(iE);
            this.f2298u0 = byteBufferD;
            if (byteBufferD != null) {
                byteBufferD.position(bufferInfo2.offset);
                this.f2298u0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f2291n0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0 && this.f2252H0 != -9223372036854775807L) {
                bufferInfo2.presentationTimeUs = this.f2254I0;
            }
            long j8 = bufferInfo2.presentationTimeUs;
            this.f2299v0 = j8 < this.f291z;
            long j9 = this.f2254I0;
            this.f2300w0 = j9 != -9223372036854775807L && j9 <= j8;
            u0(j8);
        }
        if (this.f2290m0 && this.f2248F0) {
            try {
                ByteBuffer byteBuffer = this.f2298u0;
                int i7 = this.f2297t0;
                int i8 = bufferInfo2.flags;
                long j10 = bufferInfo2.presentationTimeUs;
                boolean z9 = this.f2299v0;
                boolean z10 = this.f2300w0;
                C1487p c1487p = this.f2271R;
                c1487p.getClass();
                z6 = true;
                z7 = false;
                bufferInfo = bufferInfo2;
                try {
                    zH0 = h0(j3, j7, jVar, byteBuffer, i7, i8, 1, j10, z9, z10, c1487p);
                } catch (IllegalStateException unused2) {
                    g0();
                    if (!this.f2258K0) {
                        return z7;
                    }
                    j0();
                    return z7;
                }
            } catch (IllegalStateException unused3) {
                z7 = false;
            }
        } else {
            z6 = true;
            z7 = false;
            bufferInfo = bufferInfo2;
            ByteBuffer byteBuffer2 = this.f2298u0;
            int i9 = this.f2297t0;
            int i10 = bufferInfo.flags;
            long j11 = bufferInfo.presentationTimeUs;
            boolean z11 = this.f2299v0;
            boolean z12 = this.f2300w0;
            C1487p c1487p2 = this.f2271R;
            c1487p2.getClass();
            zH0 = h0(j3, j7, jVar, byteBuffer2, i9, i10, 1, j11, z11, z12, c1487p2);
        }
        if (!zH0) {
            return z7;
        }
        c0(bufferInfo.presentationTimeUs);
        boolean z13 = (bufferInfo.flags & 4) != 0 ? z6 : z7;
        this.f2297t0 = -1;
        this.f2298u0 = null;
        if (!z13) {
            return z6;
        }
        g0();
        return z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I() throws A2.C0013n {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.t.I():boolean");
    }

    public final void J() {
        try {
            j jVar = this.Z;
            AbstractC1697a.j(jVar);
            jVar.flush();
        } finally {
            l0();
        }
    }

    public final boolean K() {
        if (this.Z == null) {
            return false;
        }
        int i7 = this.f2245D0;
        if (i7 == 3 || this.f2287j0 || ((this.f2288k0 && !this.f2250G0) || (this.f2289l0 && this.f2248F0))) {
            j0();
            return true;
        }
        if (i7 == 2) {
            int i8 = w2.t.f18881a;
            AbstractC1697a.i(i8 >= 23);
            if (i8 >= 23) {
                try {
                    t0();
                } catch (C0013n e7) {
                    AbstractC1697a.x("Failed to update the DRM session, releasing the codec instead.", e7);
                    j0();
                    return true;
                }
            }
        }
        J();
        return false;
    }

    public final List L(boolean z6) {
        C1487p c1487p = this.f2269Q;
        c1487p.getClass();
        u uVar = this.f2249G;
        ArrayList arrayListP = P(uVar, c1487p, z6);
        if (!arrayListP.isEmpty() || !z6) {
            return arrayListP;
        }
        ArrayList arrayListP2 = P(uVar, c1487p, false);
        if (!arrayListP2.isEmpty()) {
            AbstractC1697a.w("Drm session requires secure decoder for " + c1487p.f16701m + ", but no secure decoder available. Trying to proceed with " + arrayListP2 + ".");
        }
        return arrayListP2;
    }

    public int M(z2.f fVar) {
        return 0;
    }

    public boolean N() {
        return false;
    }

    public abstract float O(float f7, C1487p[] c1487pArr);

    public abstract ArrayList P(u uVar, C1487p c1487p, boolean z6);

    public abstract h Q(m mVar, C1487p c1487p, MediaCrypto mediaCrypto, float f7);

    public abstract void R(z2.f fVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(F2.m r22, android.media.MediaCrypto r23) {
        /*
            Method dump skipped, instruction units count: 1349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.t.S(F2.m, android.media.MediaCrypto):void");
    }

    public final boolean T(long j3, long j7) {
        if (j7 >= j3) {
            return false;
        }
        C1487p c1487p = this.f2271R;
        return c1487p == null || !Objects.equals(c1487p.f16701m, "audio/opus") || j3 - j7 > 80000;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2 A[Catch: q -> 0x00bc, TryCatch #1 {q -> 0x00bc, blocks: (B:56:0x00ae, B:58:0x00b2, B:64:0x00bf), top: B:76:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U() throws A2.C0013n {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.t.U():void");
    }

    public final void V(MediaCrypto mediaCrypto, boolean z6) throws q {
        String diagnosticInfo;
        C1487p c1487p = this.f2269Q;
        c1487p.getClass();
        if (this.f2282e0 == null) {
            try {
                List listL = L(z6);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f2282e0 = arrayDeque;
                if (this.f2251H) {
                    arrayDeque.addAll(listL);
                } else {
                    ArrayList arrayList = (ArrayList) listL;
                    if (!arrayList.isEmpty()) {
                        this.f2282e0.add((m) arrayList.get(0));
                    }
                }
                this.f2283f0 = null;
            } catch (x e7) {
                throw new q(c1487p, e7, z6, -49998);
            }
        }
        if (this.f2282e0.isEmpty()) {
            throw new q(c1487p, null, z6, -49999);
        }
        ArrayDeque arrayDeque2 = this.f2282e0;
        arrayDeque2.getClass();
        while (this.Z == null) {
            m mVar = (m) arrayDeque2.peekFirst();
            mVar.getClass();
            if (!p0(mVar)) {
                return;
            }
            try {
                S(mVar, mediaCrypto);
            } catch (Exception e8) {
                AbstractC1697a.x("Failed to initialize decoder: " + mVar, e8);
                arrayDeque2.removeFirst();
                String str = "Decoder init failed: " + mVar.f2225a + ", " + c1487p;
                if (w2.t.f18881a >= 21) {
                    diagnosticInfo = e8 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e8).getDiagnosticInfo() : null;
                } else {
                    diagnosticInfo = null;
                }
                q qVar = new q(str, e8, c1487p.f16701m, z6, mVar, diagnosticInfo);
                W(qVar);
                q qVar2 = this.f2283f0;
                if (qVar2 == null) {
                    this.f2283f0 = qVar;
                } else {
                    this.f2283f0 = new q(qVar2.getMessage(), qVar2.getCause(), qVar2.f2232o, qVar2.f2233p, qVar2.f2234q, qVar2.f2235r);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f2283f0;
                }
            }
        }
        this.f2282e0 = null;
    }

    public abstract void W(Exception exc);

    public abstract void X(long j3, String str, long j7);

    public abstract void Y(String str);

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        if (r4.f(r3) != false) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public A2.C0008i Z(V.o r13) throws A2.C0013n {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.t.Z(V.o):A2.i");
    }

    public abstract void a0(C1487p c1487p, MediaFormat mediaFormat);

    public void c0(long j3) {
        this.f2270Q0 = j3;
        while (true) {
            ArrayDeque arrayDeque = this.f2265O;
            if (arrayDeque.isEmpty() || j3 < ((s) arrayDeque.peek()).f2238a) {
                return;
            }
            s sVar = (s) arrayDeque.poll();
            sVar.getClass();
            o0(sVar);
            d0();
        }
    }

    public abstract void d0();

    public final void g0() throws C0013n {
        int i7 = this.f2245D0;
        if (i7 == 1) {
            J();
            return;
        }
        if (i7 == 2) {
            J();
            t0();
        } else if (i7 != 3) {
            this.f2258K0 = true;
            k0();
        } else {
            j0();
            U();
        }
    }

    public abstract boolean h0(long j3, long j7, j jVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j8, boolean z6, boolean z7, C1487p c1487p);

    @Override // A2.AbstractC0006g
    public boolean i() {
        if (this.f2269Q == null) {
            return false;
        }
        if (m() || this.f2297t0 >= 0) {
            return true;
        }
        if (this.f2295r0 == -9223372036854775807L) {
            return false;
        }
        this.f286u.getClass();
        return SystemClock.elapsedRealtime() < this.f2295r0;
    }

    public final boolean i0(int i7) throws C0013n {
        V.o oVar = this.f282q;
        oVar.e();
        z2.f fVar = this.f2255J;
        fVar.f();
        int iV = v(oVar, fVar, i7 | 4);
        if (iV == -5) {
            Z(oVar);
            return true;
        }
        if (iV != -4 || !fVar.c(4)) {
            return false;
        }
        this.f2256J0 = true;
        g0();
        return false;
    }

    public final void j0() {
        try {
            j jVar = this.Z;
            if (jVar != null) {
                jVar.a();
                this.f2266O0.f294b++;
                m mVar = this.f2284g0;
                mVar.getClass();
                Y(mVar.f2225a);
            }
            this.Z = null;
            try {
                MediaCrypto mediaCrypto = this.f2276V;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.Z = null;
            try {
                MediaCrypto mediaCrypto2 = this.f2276V;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void l0() {
        this.f2296s0 = -1;
        this.f2257K.f21115s = null;
        this.f2297t0 = -1;
        this.f2298u0 = null;
        this.f2295r0 = -9223372036854775807L;
        this.f2248F0 = false;
        this.f2246E0 = false;
        this.f2292o0 = false;
        this.f2293p0 = false;
        this.f2299v0 = false;
        this.f2300w0 = false;
        this.f2252H0 = -9223372036854775807L;
        this.f2254I0 = -9223372036854775807L;
        this.f2270Q0 = -9223372036854775807L;
        this.f2244C0 = 0;
        this.f2245D0 = 0;
        this.f2243B0 = this.f2242A0 ? 1 : 0;
    }

    public final void m0() {
        l0();
        this.f2264N0 = null;
        this.f2282e0 = null;
        this.f2284g0 = null;
        this.a0 = null;
        this.b0 = null;
        this.f2280c0 = false;
        this.f2250G0 = false;
        this.f2281d0 = -1.0f;
        this.f2285h0 = 0;
        this.f2286i0 = false;
        this.f2287j0 = false;
        this.f2288k0 = false;
        this.f2289l0 = false;
        this.f2290m0 = false;
        this.f2291n0 = false;
        this.f2294q0 = false;
        this.f2242A0 = false;
        this.f2243B0 = 0;
    }

    @Override // A2.AbstractC0006g
    public void n() {
        this.f2269Q = null;
        o0(s.f2237e);
        this.f2265O.clear();
        K();
    }

    public final void n0(D2.k kVar) {
        A0.e.K(this.f2273S, kVar);
        this.f2273S = kVar;
    }

    public final void o0(s sVar) {
        this.f2268P0 = sVar;
        if (sVar.f2240c != -9223372036854775807L) {
            this.f2272R0 = true;
            b0();
        }
    }

    @Override // A2.AbstractC0006g
    public void p(long j3, boolean z6) throws C0013n {
        this.f2256J0 = false;
        this.f2258K0 = false;
        this.f2262M0 = false;
        if (this.f2301x0) {
            this.f2261M.f();
            this.f2259L.f();
            this.f2302y0 = false;
            W w7 = this.f2267P;
            w7.getClass();
            w7.f1090a = u2.d.f17209a;
            w7.f1092c = 0;
            w7.f1091b = 2;
        } else if (K()) {
            U();
        }
        if (this.f2268P0.f2241d.t() > 0) {
            this.f2260L0 = true;
        }
        this.f2268P0.f2241d.d();
        this.f2265O.clear();
    }

    public boolean p0(m mVar) {
        return true;
    }

    public boolean q0(C1487p c1487p) {
        return false;
    }

    public abstract int r0(u uVar, C1487p c1487p);

    public final boolean s0(C1487p c1487p) throws C0013n {
        if (w2.t.f18881a >= 23 && this.Z != null && this.f2245D0 != 3 && this.f287v != 0) {
            float f7 = this.f2279Y;
            c1487p.getClass();
            C1487p[] c1487pArr = this.f289x;
            c1487pArr.getClass();
            float fO = O(f7, c1487pArr);
            float f8 = this.f2281d0;
            if (f8 != fO) {
                if (fO == -1.0f) {
                    if (this.f2246E0) {
                        this.f2244C0 = 1;
                        this.f2245D0 = 3;
                        return false;
                    }
                    j0();
                    U();
                    return false;
                }
                if (f8 != -1.0f || fO > this.f2253I) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fO);
                    j jVar = this.Z;
                    jVar.getClass();
                    jVar.d(bundle);
                    this.f2281d0 = fO;
                }
            }
        }
        return true;
    }

    public final void t0() throws C0013n {
        D2.k kVar = this.f2274T;
        kVar.getClass();
        InterfaceC2080a interfaceC2080aH = kVar.h();
        if (interfaceC2080aH instanceof D2.x) {
            try {
                MediaCrypto mediaCrypto = this.f2276V;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((D2.x) interfaceC2080aH).f1539b);
            } catch (MediaCryptoException e7) {
                throw b(e7, this.f2269Q, false, 6006);
            }
        }
        n0(this.f2274T);
        this.f2244C0 = 0;
        this.f2245D0 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // A2.AbstractC0006g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(t2.C1487p[] r13, long r14, long r16) {
        /*
            r12 = this;
            F2.s r13 = r12.f2268P0
            long r0 = r13.f2240c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            F2.s r4 = new F2.s
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.o0(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.f2265O
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L52
            long r0 = r12.f2252H0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L36
            long r4 = r12.f2270Q0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L52
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L52
        L36:
            F2.s r5 = new F2.s
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.o0(r5)
            F2.s r13 = r12.f2268P0
            long r13 = r13.f2240c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.d0()
        L51:
            return
        L52:
            F2.s r5 = new F2.s
            long r6 = r12.f2252H0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.t.u(t2.p[], long, long):void");
    }

    public final void u0(long j3) {
        C1487p c1487p = (C1487p) this.f2268P0.f2241d.p(j3);
        if (c1487p == null && this.f2272R0 && this.b0 != null) {
            c1487p = (C1487p) this.f2268P0.f2241d.o();
        }
        if (c1487p != null) {
            this.f2271R = c1487p;
        } else if (!this.f2280c0 || this.f2271R == null) {
            return;
        }
        C1487p c1487p2 = this.f2271R;
        c1487p2.getClass();
        a0(c1487p2, this.b0);
        this.f2280c0 = false;
        this.f2272R0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0075 A[LOOP:1: B:29:0x0050->B:39:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096 A[LOOP:2: B:40:0x0076->B:50:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0076 A[EDGE_INSN: B:87:0x0076->B:91:? BREAK  A[LOOP:1: B:29:0x0050->B:39:0x0075], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0097 A[EDGE_INSN: B:89:0x0097->B:51:0x0097 BREAK  A[LOOP:2: B:40:0x0076->B:50:0x0096], SYNTHETIC] */
    @Override // A2.AbstractC0006g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(long r12, long r14) throws A2.C0013n {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.t.w(long, long):void");
    }

    @Override // A2.AbstractC0006g
    public void z(float f7, float f8) throws C0013n {
        this.f2278X = f7;
        this.f2279Y = f8;
        s0(this.a0);
    }

    public void b0() {
    }

    public void k0() {
    }

    public void e0(z2.f fVar) {
    }

    public void f0(C1487p c1487p) {
    }
}
