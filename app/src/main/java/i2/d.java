package I2;

import A2.AbstractC0006g;
import A2.K;
import A2.N;
import E0.C0096g;
import E4.F;
import E4.I;
import E4.b0;
import V.o;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import d.C0746L;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import k3.C1145a;
import k3.e;
import k3.i;
import k3.j;
import t2.C1487p;
import t2.M;
import v2.C1635b;
import v2.C1636c;
import w2.AbstractC1697a;
import w2.t;
import z2.f;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0006g implements Handler.Callback {

    /* JADX INFO: renamed from: F */
    public final C0746L f3451F;

    /* JADX INFO: renamed from: G */
    public final f f3452G;

    /* JADX INFO: renamed from: H */
    public a f3453H;

    /* JADX INFO: renamed from: I */
    public final A.b f3454I;

    /* JADX INFO: renamed from: J */
    public boolean f3455J;

    /* JADX INFO: renamed from: K */
    public int f3456K;

    /* JADX INFO: renamed from: L */
    public e f3457L;

    /* JADX INFO: renamed from: M */
    public i f3458M;

    /* JADX INFO: renamed from: N */
    public j f3459N;

    /* JADX INFO: renamed from: O */
    public j f3460O;

    /* JADX INFO: renamed from: P */
    public int f3461P;

    /* JADX INFO: renamed from: Q */
    public final Handler f3462Q;

    /* JADX INFO: renamed from: R */
    public final K f3463R;

    /* JADX INFO: renamed from: S */
    public final o f3464S;

    /* JADX INFO: renamed from: T */
    public boolean f3465T;

    /* JADX INFO: renamed from: U */
    public boolean f3466U;

    /* JADX INFO: renamed from: V */
    public C1487p f3467V;

    /* JADX INFO: renamed from: W */
    public long f3468W;

    /* JADX INFO: renamed from: X */
    public long f3469X;

    /* JADX INFO: renamed from: Y */
    public long f3470Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(K k7, Looper looper) {
        Handler handler;
        super(3);
        A.b bVar = c.f3450d;
        this.f3463R = k7;
        if (looper == null) {
            handler = null;
        } else {
            int i7 = t.f18881a;
            handler = new Handler(looper, this);
        }
        this.f3462Q = handler;
        this.f3454I = bVar;
        this.f3451F = new C0746L(10);
        this.f3452G = new f(1, 0);
        this.f3464S = new o((char) 0, 2);
        this.f3470Y = -9223372036854775807L;
        this.f3468W = -9223372036854775807L;
        this.f3469X = -9223372036854775807L;
    }

    @Override // A2.AbstractC0006g
    public final int A(C1487p c1487p) {
        if (!Objects.equals(c1487p.f16701m, "application/x-media3-cues")) {
            A.b bVar = this.f3454I;
            bVar.getClass();
            if (!((C0746L) bVar.f3p).g(c1487p)) {
                String str = c1487p.f16701m;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return M.h(str) ? A0.e.r(1, 0, 0, 0) : A0.e.r(0, 0, 0, 0);
                }
            }
        }
        return A0.e.r(c1487p.f16689J == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void C() {
        AbstractC1697a.h("Legacy decoding is disabled, can't handle " + this.f3467V.f16701m + " samples (expected application/x-media3-cues).", Objects.equals(this.f3467V.f16701m, "application/cea-608") || Objects.equals(this.f3467V.f16701m, "application/x-mp4-cea-608") || Objects.equals(this.f3467V.f16701m, "application/cea-708"));
    }

    public final long D() {
        if (this.f3461P == -1) {
            return Long.MAX_VALUE;
        }
        this.f3459N.getClass();
        if (this.f3461P >= this.f3459N.D()) {
            return Long.MAX_VALUE;
        }
        return this.f3459N.j(this.f3461P);
    }

    public final long E(long j3) {
        AbstractC1697a.i(j3 != -9223372036854775807L);
        AbstractC1697a.i(this.f3468W != -9223372036854775807L);
        return j3 - this.f3468W;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F() {
        /*
            r7 = this;
            r0 = 1
            r7.f3455J = r0
            t2.p r1 = r7.f3467V
            r1.getClass()
            A.b r2 = r7.f3454I
            r2.getClass()
            java.lang.String r3 = r1.f16701m
            if (r3 == 0) goto L4d
            int r4 = r1.f16685F
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L31;
                case 1566015601: goto L28;
                case 1566016562: goto L1d;
                default: goto L1b;
            }
        L1b:
            r0 = r5
            goto L3b
        L1d:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L26
            goto L1b
        L26:
            r0 = 2
            goto L3b
        L28:
            java.lang.String r6 = "application/cea-608"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L3b
            goto L1b
        L31:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3a
            goto L1b
        L3a:
            r0 = 0
        L3b:
            switch(r0) {
                case 0: goto L47;
                case 1: goto L47;
                case 2: goto L3f;
                default: goto L3e;
            }
        L3e:
            goto L4d
        L3f:
            l3.f r0 = new l3.f
            java.util.List r1 = r1.f16704p
            r0.<init>(r4, r1)
            goto L6f
        L47:
            l3.c r0 = new l3.c
            r0.<init>(r3, r4)
            goto L6f
        L4d:
            java.lang.Object r0 = r2.f3p
            d.L r0 = (d.C0746L) r0
            boolean r2 = r0.g(r1)
            if (r2 == 0) goto L77
            k3.m r0 = r0.d(r1)
            E2.b r1 = new E2.b
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2, r0)
            r0 = r1
        L6f:
            r7.f3457L = r0
            long r1 = r7.f291z
            r0.b(r1)
            return
        L77:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempted to create decoder for unsupported MIME type: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.d.F():void");
    }

    public final void G(C1636c c1636c) {
        I i7 = c1636c.f18274a;
        K k7 = this.f3463R;
        k7.f83a.f129m.f(27, new A2.I(3, i7));
        N n7 = k7.f83a;
        n7.f113Y = c1636c;
        n7.f129m.f(27, new A2.I(0, c1636c));
    }

    public final void H() {
        this.f3458M = null;
        this.f3461P = -1;
        j jVar = this.f3459N;
        if (jVar != null) {
            jVar.g();
            this.f3459N = null;
        }
        j jVar2 = this.f3460O;
        if (jVar2 != null) {
            jVar2.g();
            this.f3460O = null;
        }
    }

    @Override // A2.AbstractC0006g
    public final String e() {
        return "TextRenderer";
    }

    @Override // A2.AbstractC0006g
    public final boolean g() {
        return this.f3466U;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        G((C1636c) message.obj);
        return true;
    }

    @Override // A2.AbstractC0006g
    public final boolean i() {
        return true;
    }

    @Override // A2.AbstractC0006g
    public final void n() {
        this.f3467V = null;
        this.f3470Y = -9223372036854775807L;
        C1636c c1636c = new C1636c(b0.f1913s, E(this.f3469X));
        Handler handler = this.f3462Q;
        if (handler != null) {
            handler.obtainMessage(1, c1636c).sendToTarget();
        } else {
            G(c1636c);
        }
        this.f3468W = -9223372036854775807L;
        this.f3469X = -9223372036854775807L;
        if (this.f3457L != null) {
            H();
            e eVar = this.f3457L;
            eVar.getClass();
            eVar.a();
            this.f3457L = null;
            this.f3456K = 0;
        }
    }

    @Override // A2.AbstractC0006g
    public final void p(long j3, boolean z6) {
        this.f3469X = j3;
        a aVar = this.f3453H;
        if (aVar != null) {
            aVar.clear();
        }
        C1636c c1636c = new C1636c(b0.f1913s, E(this.f3469X));
        Handler handler = this.f3462Q;
        if (handler != null) {
            handler.obtainMessage(1, c1636c).sendToTarget();
        } else {
            G(c1636c);
        }
        this.f3465T = false;
        this.f3466U = false;
        this.f3470Y = -9223372036854775807L;
        C1487p c1487p = this.f3467V;
        if (c1487p == null || Objects.equals(c1487p.f16701m, "application/x-media3-cues")) {
            return;
        }
        if (this.f3456K == 0) {
            H();
            e eVar = this.f3457L;
            eVar.getClass();
            eVar.flush();
            eVar.b(this.f291z);
            return;
        }
        H();
        e eVar2 = this.f3457L;
        eVar2.getClass();
        eVar2.a();
        this.f3457L = null;
        this.f3456K = 0;
        F();
    }

    @Override // A2.AbstractC0006g
    public final void u(C1487p[] c1487pArr, long j3, long j7) {
        this.f3468W = j7;
        C1487p c1487p = c1487pArr[0];
        this.f3467V = c1487p;
        if (Objects.equals(c1487p.f16701m, "application/x-media3-cues")) {
            this.f3453H = this.f3467V.f16686G == 1 ? new b() : new C0096g(2);
            return;
        }
        C();
        if (this.f3457L != null) {
            this.f3456K = 1;
        } else {
            F();
        }
    }

    @Override // A2.AbstractC0006g
    public final void w(long j3, long j7) {
        boolean z6;
        long j8;
        if (this.f276B) {
            long j9 = this.f3470Y;
            if (j9 != -9223372036854775807L && j3 >= j9) {
                H();
                this.f3466U = true;
            }
        }
        if (this.f3466U) {
            return;
        }
        C1487p c1487p = this.f3467V;
        c1487p.getClass();
        boolean zEquals = Objects.equals(c1487p.f16701m, "application/x-media3-cues");
        Handler handler = this.f3462Q;
        boolean zC = false;
        zC = false;
        zC = false;
        o oVar = this.f3464S;
        if (zEquals) {
            this.f3453H.getClass();
            if (!this.f3465T) {
                f fVar = this.f3452G;
                if (v(oVar, fVar, 0) == -4) {
                    if (fVar.c(4)) {
                        this.f3465T = true;
                    } else {
                        fVar.i();
                        ByteBuffer byteBuffer = fVar.f21115s;
                        byteBuffer.getClass();
                        long j10 = fVar.f21117u;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f3451F.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        F fO = I.o();
                        for (int i7 = 0; i7 < parcelableArrayList.size(); i7++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i7);
                            bundle2.getClass();
                            fO.a(C1635b.a(bundle2));
                        }
                        C1145a c1145a = new C1145a(fO.f(), j10, bundle.getLong("d"));
                        fVar.f();
                        zC = this.f3453H.c(c1145a, j3);
                    }
                }
            }
            long jB = this.f3453H.b(this.f3469X);
            if (jB == Long.MIN_VALUE && this.f3465T && !zC) {
                this.f3466U = true;
            }
            if (jB != Long.MIN_VALUE && jB <= j3) {
                zC = true;
            }
            if (zC) {
                I iA = this.f3453H.a(j3);
                long jD = this.f3453H.d(j3);
                C1636c c1636c = new C1636c(iA, E(jD));
                if (handler != null) {
                    handler.obtainMessage(1, c1636c).sendToTarget();
                } else {
                    G(c1636c);
                }
                this.f3453H.e(jD);
            }
            this.f3469X = j3;
            return;
        }
        C();
        this.f3469X = j3;
        if (this.f3460O == null) {
            e eVar = this.f3457L;
            eVar.getClass();
            eVar.d(j3);
            try {
                e eVar2 = this.f3457L;
                eVar2.getClass();
                this.f3460O = (j) eVar2.e();
            } catch (k3.f e7) {
                AbstractC1697a.n("Subtitle decoding failed. streamFormat=" + this.f3467V, e7);
                C1636c c1636c2 = new C1636c(b0.f1913s, E(this.f3469X));
                if (handler != null) {
                    handler.obtainMessage(1, c1636c2).sendToTarget();
                } else {
                    G(c1636c2);
                }
                H();
                e eVar3 = this.f3457L;
                eVar3.getClass();
                eVar3.a();
                this.f3457L = null;
                this.f3456K = 0;
                F();
                return;
            }
        }
        if (this.f287v != 2) {
            return;
        }
        if (this.f3459N != null) {
            long jD2 = D();
            z6 = false;
            while (jD2 <= j3) {
                this.f3461P++;
                jD2 = D();
                z6 = true;
            }
        } else {
            z6 = false;
        }
        j jVar = this.f3460O;
        boolean z7 = z6;
        if (jVar != null) {
            z7 = z6;
            if (!jVar.c(4)) {
                z7 = z6;
                if (jVar.f21121q <= j3) {
                    j jVar2 = this.f3459N;
                    if (jVar2 != null) {
                        jVar2.g();
                    }
                    this.f3461P = jVar.d(j3);
                    this.f3459N = jVar;
                    this.f3460O = null;
                    z7 = true;
                }
            } else if (!z6) {
                z7 = z6;
                if (D() == Long.MAX_VALUE) {
                    if (this.f3456K == 2) {
                        H();
                        e eVar4 = this.f3457L;
                        eVar4.getClass();
                        eVar4.a();
                        this.f3457L = null;
                        this.f3456K = 0;
                        F();
                        z7 = z6;
                    } else {
                        H();
                        this.f3466U = true;
                        z7 = z6;
                    }
                }
            }
        }
        if (z7) {
            this.f3459N.getClass();
            int iD = this.f3459N.d(j3);
            if (iD == 0 || this.f3459N.D() == 0) {
                j8 = this.f3459N.f21121q;
            } else if (iD == -1) {
                j jVar3 = this.f3459N;
                j8 = jVar3.j(jVar3.D() - 1);
            } else {
                j8 = this.f3459N.j(iD - 1);
            }
            C1636c c1636c3 = new C1636c(this.f3459N.s(j3), E(j8));
            if (handler != null) {
                handler.obtainMessage(1, c1636c3).sendToTarget();
            } else {
                G(c1636c3);
            }
        }
        if (this.f3456K == 2) {
            return;
        }
        while (!this.f3465T) {
            try {
                i iVar = this.f3458M;
                if (iVar == null) {
                    e eVar5 = this.f3457L;
                    eVar5.getClass();
                    iVar = (i) eVar5.f();
                    if (iVar == null) {
                        return;
                    } else {
                        this.f3458M = iVar;
                    }
                }
                if (this.f3456K == 1) {
                    iVar.f12566p = 4;
                    e eVar6 = this.f3457L;
                    eVar6.getClass();
                    eVar6.c(iVar);
                    this.f3458M = null;
                    this.f3456K = 2;
                    return;
                }
                int iV = v(oVar, iVar, 0);
                if (iV == -4) {
                    if (iVar.c(4)) {
                        this.f3465T = true;
                        this.f3455J = false;
                    } else {
                        C1487p c1487p2 = (C1487p) oVar.f7343q;
                        if (c1487p2 == null) {
                            return;
                        }
                        iVar.f14040y = c1487p2.f16706r;
                        iVar.i();
                        this.f3455J &= !iVar.c(1);
                    }
                    if (!this.f3455J) {
                        e eVar7 = this.f3457L;
                        eVar7.getClass();
                        eVar7.c(iVar);
                        this.f3458M = null;
                    }
                } else if (iV == -3) {
                    return;
                }
            } catch (k3.f e8) {
                AbstractC1697a.n("Subtitle decoding failed. streamFormat=" + this.f3467V, e8);
                C1636c c1636c4 = new C1636c(b0.f1913s, E(this.f3469X));
                if (handler != null) {
                    handler.obtainMessage(1, c1636c4).sendToTarget();
                } else {
                    G(c1636c4);
                }
                H();
                e eVar8 = this.f3457L;
                eVar8.getClass();
                eVar8.a();
                this.f3457L = null;
                this.f3456K = 0;
                F();
                return;
            }
        }
    }
}
