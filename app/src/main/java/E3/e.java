package E3;

import A2.N;
import G.x;
import H.B;
import M.B0;
import M.Z;
import N5.l;
import P.g;
import Q0.AbstractC0347f;
import S.h;
import W.m;
import W.p;
import X.u0;
import Y4.o;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Y;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import f0.C0879c;
import f0.C0886f0;
import f0.C0894j0;
import f0.EnumC0917v0;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import o0.C1245b;
import o0.C1254k;
import o0.InterfaceC1255l;
import p0.t;
import p0.u;
import t.K;
import w.C1680m;
import w3.C1760y;
import w5.C1793k;
import w5.InterfaceC1791j;
import x0.C1892b;
import x0.C1893c;
import x0.C1895e;
import yos.music.player.CrashActivity;
import yos.music.player.MainActivity;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC1180a {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f1856o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f1857p;

    public /* synthetic */ e(int i7, Object obj) {
        this.f1856o = i7;
        this.f1857p = obj;
    }

    /* JADX WARN: Finally extract failed */
    private final Object e() {
        int i7;
        Object[] objArr;
        int i8;
        int i9;
        u uVar = (u) this.f1857p;
        do {
            synchronized (uVar.f14977g) {
                try {
                    if (!uVar.f14973c) {
                        uVar.f14973c = true;
                        try {
                            h0.e eVar = uVar.f14976f;
                            Object[] objArr2 = eVar.f12546o;
                            int i10 = eVar.f12548q;
                            int i11 = 0;
                            while (i11 < i10) {
                                t tVar = (t) objArr2[i11];
                                K k7 = tVar.f14967g;
                                Object[] objArr3 = k7.f16010b;
                                long[] jArr = k7.f16009a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i12 = 0;
                                    while (true) {
                                        long j3 = jArr[i12];
                                        objArr = objArr2;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8;
                                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j3 & 255) < 128) {
                                                    i9 = i13;
                                                    i8 = i10;
                                                    tVar.f14961a.b(objArr3[(i12 << 3) + i15]);
                                                } else {
                                                    i8 = i10;
                                                    i9 = i13;
                                                }
                                                j3 >>= i9;
                                                i15++;
                                                i10 = i8;
                                                i13 = i9;
                                            }
                                            i7 = i10;
                                            if (i14 != i13) {
                                                break;
                                            }
                                        } else {
                                            i7 = i10;
                                        }
                                        if (i12 == length) {
                                            break;
                                        }
                                        i12++;
                                        objArr2 = objArr;
                                        i10 = i7;
                                    }
                                } else {
                                    i7 = i10;
                                    objArr = objArr2;
                                }
                                k7.b();
                                i11++;
                                objArr2 = objArr;
                                i10 = i7;
                            }
                            uVar.f14973c = false;
                        } catch (Throwable th) {
                            uVar.f14973c = false;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (uVar.c());
        return o.f8736a;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() throws PendingIntent.CanceledException {
        InterfaceC1791j interfaceC1791jB;
        switch (this.f1856o) {
            case 0:
                f fVar = (f) this.f1857p;
                fVar.h().a(new b(fVar, 0));
                return o.f8736a;
            case 1:
                B b7 = ((androidx.compose.foundation.lazy.layout.b) this.f1857p).f9224j;
                if (b7 != null) {
                    AbstractC0347f.m(b7);
                }
                return o.f8736a;
            case 2:
                return (C1893c) this.f1857p;
            case 3:
                ((K.b) this.f1857p).a0.b(Boolean.valueOf(!r0.Z));
                return o.f8736a;
            case 4:
                AtomicLong atomicLong = ((u0) this.f1857p).f8176d;
                long andIncrement = atomicLong.getAndIncrement();
                while (andIncrement == 0) {
                    andIncrement = atomicLong.getAndIncrement();
                }
                return Long.valueOf(andIncrement);
            case 5:
                return new B0((EnumC2048l0) this.f1857p, 0.0f);
            case 6:
                return ((Z) this.f1857p).d();
            case 7:
                return ((T.e) this.f1857p).j0();
            case 8:
                ((g) this.f1857p).close();
                return o.f8736a;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                PendingIntent actionIntent = ((RemoteAction) this.f1857p).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e7) {
                        Objects.toString(actionIntent);
                        e7.toString();
                    }
                    break;
                } else {
                    actionIntent.send();
                }
                return o.f8736a;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                h hVar = (h) this.f1857p;
                return hVar.f15636B ? l.q(hVar) : P.c.f5688b;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                CrashActivity crashActivity = (CrashActivity) this.f1857p;
                AbstractC1209k.f(crashActivity, "this$0");
                crashActivity.startActivity(new Intent(crashActivity, (Class<?>) MainActivity.class));
                crashActivity.finish();
                return o.f8736a;
            case 12:
                String str = (String) this.f1857p;
                AbstractC1209k.f(str, "$defaultHome");
                return C0879c.t(str);
            case 13:
                Object systemService = ((View) ((V.o) this.f1857p).f7342p).getContext().getSystemService("input_method");
                AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 14:
                return new BaseInputConnection(((V.u) this.f1857p).f7368a, false);
            case 15:
                m mVar = (m) this.f1857p;
                mVar.f7704P = null;
                AbstractC0347f.o(mVar);
                AbstractC0347f.n(mVar);
                AbstractC0347f.m(mVar);
                return Boolean.TRUE;
            case 16:
                p pVar = (p) this.f1857p;
                pVar.f7722N = null;
                AbstractC0347f.o(pVar);
                AbstractC0347f.n(pVar);
                AbstractC0347f.m(pVar);
                return Boolean.TRUE;
            case 17:
                return new C1892b(((C1892b) ((C1680m) this.f1857p).f18710p.getValue()).f19867a);
            case 18:
                return androidx.lifecycle.K.k((Y) this.f1857p);
            case 19:
                f0.B0 b0 = (f0.B0) this.f1857p;
                synchronized (b0.f11623c) {
                    interfaceC1791jB = b0.B();
                    if (((EnumC0917v0) b0.f11639u.getValue()).compareTo(EnumC0917v0.f11937p) <= 0) {
                        Throwable th = b0.f11625e;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (interfaceC1791jB != null) {
                    ((C1793k) interfaceC1791jB).resumeWith(o.f8736a);
                }
                return o.f8736a;
            case BuildConfig.API_VERSION /* 20 */:
                C1760y c1760y = (C1760y) this.f1857p;
                AbstractC1209k.f(c1760y, "$this_fadePause");
                c1760y.g();
                return o.f8736a;
            case 21:
                ((N) this.f1857p).g();
                return o.f8736a;
            case 22:
                p0.p pVar2 = (p0.p) this.f1857p;
                AbstractC1209k.f(pVar2, "$pageStack");
                return pVar2.size() > 1 ? (String) pVar2.get(pVar2.size() - 2) : "Album";
            case 23:
                l1.b bVar = (l1.b) this.f1857p;
                if (((C1895e) bVar.f14159c.getValue()).f19880a != 9205357640488583168L) {
                    C0894j0 c0894j0 = bVar.f14159c;
                    if (!C1895e.e(((C1895e) c0894j0.getValue()).f19880a)) {
                        return bVar.f14157a.b(((C1895e) c0894j0.getValue()).f19880a);
                    }
                }
                return null;
            case 24:
                return (m1.o) this.f1857p;
            case 25:
                C1245b c1245b = (C1245b) this.f1857p;
                InterfaceC1255l interfaceC1255l = c1245b.f14629o;
                Object obj = c1245b.f14632r;
                if (obj != null) {
                    return interfaceC1255l.g(c1245b, obj);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 26:
                Bundle bundleF = android.support.v4.media.session.b.f((Y4.h[]) Arrays.copyOf(new Y4.h[0], 0));
                ((C1254k) this.f1857p).f14651p.E(bundleF);
                if (bundleF.isEmpty()) {
                    return null;
                }
                return bundleF;
            case 27:
                return e();
            case 28:
                C0886f0 c0886f0 = (C0886f0) this.f1857p;
                AbstractC1209k.f(c0886f0, "$cornerValue");
                return new n1.g(c0886f0.h());
            default:
                x xVar = (x) this.f1857p;
                AbstractC1209k.f(xVar, "$state");
                return xVar;
        }
    }
}
