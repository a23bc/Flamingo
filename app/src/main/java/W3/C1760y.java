package w3;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.List;
import t2.C1476e;
import t2.C1482k;
import t2.C1488q;
import v2.C1636c;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: w3.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1760y implements t2.X {

    /* JADX INFO: renamed from: a */
    public final t2.g0 f19397a;

    /* JADX INFO: renamed from: b */
    public boolean f19398b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1758x f19399c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1756w f19400d;

    /* JADX INFO: renamed from: e */
    public final Handler f19401e;

    /* JADX INFO: renamed from: f */
    public final long f19402f;

    /* JADX INFO: renamed from: g */
    public boolean f19403g;
    public final C1762z h;

    public C1760y(Context context, B1 b12, Bundle bundle, InterfaceC1756w interfaceC1756w, Looper looper, C1762z c1762z, V1.a aVar) {
        C1760y c1760y;
        InterfaceC1758x u7;
        AbstractC1697a.g(context, "context must not be null");
        AbstractC1697a.g(b12, "token must not be null");
        AbstractC1697a.q("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + w2.t.f18885e + "]");
        this.f19397a = new t2.g0();
        this.f19402f = -9223372036854775807L;
        this.f19400d = interfaceC1756w;
        this.f19401e = new Handler(looper);
        this.h = c1762z;
        if (b12.f18932a.o()) {
            aVar.getClass();
            u7 = new C1716c0(context, this, b12, looper, aVar);
            c1760y = this;
        } else {
            c1760y = this;
            u7 = new U(context, c1760y, b12, bundle, looper);
        }
        c1760y.f19399c = u7;
        u7.K0();
    }

    @Override // t2.X
    public final void A(t2.V v3) {
        this.f19399c.A(v3);
    }

    @Override // t2.X
    public final void A0(float f7) {
        R0();
        AbstractC1697a.c("volume must be between 0 and 1", f7 >= 0.0f && f7 <= 1.0f);
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.A0(f7);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setVolume().");
        }
    }

    @Override // t2.X
    public final long B() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.B();
        }
        return 0L;
    }

    @Override // t2.X
    public final t2.J B0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return interfaceC1758x.H0() ? interfaceC1758x.B0() : t2.J.f16263J;
    }

    @Override // t2.X
    public final boolean C() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return interfaceC1758x.H0() && interfaceC1758x.C();
    }

    @Override // t2.X
    public final void C0(List list) {
        R0();
        AbstractC1697a.g(list, "mediaItems must not be null");
        for (int i7 = 0; i7 < list.size(); i7++) {
            AbstractC1697a.c("items must not contain null, index=" + i7, list.get(i7) != null);
        }
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.C0(list);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // t2.X
    public final void D() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.D();
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring clearMediaItems().");
        }
    }

    @Override // t2.X
    public final void D0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.D0();
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring seekToPrevious().");
        }
    }

    @Override // t2.X
    public final void E(boolean z6) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.E(z6);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setShuffleMode().");
        }
    }

    @Override // t2.X
    public final void E0(t2.G g6, long j3) {
        R0();
        AbstractC1697a.g(g6, "mediaItems must not be null");
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.E0(g6, j3);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // t2.X
    public final void F() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.F();
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring seekToNextMediaItem().");
        }
    }

    @Override // t2.X
    public final long F0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.F0();
        }
        return 0L;
    }

    @Override // t2.X
    public final void G(int i7) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.G(i7);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // t2.X
    public final long G0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.G0();
        }
        return 0L;
    }

    @Override // t2.X
    public final t2.p0 H() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return interfaceC1758x.H0() ? interfaceC1758x.H() : t2.p0.f16715b;
    }

    @Override // t2.X
    public final boolean H0() {
        R0();
        t2.h0 h0VarM0 = m0();
        return !h0VarM0.p() && h0VarM0.m(V(), this.f19397a, 0L).f16460g;
    }

    @Override // t2.X
    public final int I() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.I();
        }
        return 0;
    }

    @Override // t2.X
    public final t2.G I0() {
        t2.h0 h0VarM0 = m0();
        if (h0VarM0.p()) {
            return null;
        }
        return h0VarM0.m(V(), this.f19397a, 0L).f16456c;
    }

    @Override // t2.X
    public final long J() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.J();
        }
        return 0L;
    }

    @Override // t2.X
    public final void J0(t2.V v3) {
        R0();
        this.f19399c.M0((C1488q) v3);
    }

    @Override // t2.X
    public final t2.J K() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return interfaceC1758x.H0() ? interfaceC1758x.K() : t2.J.f16263J;
    }

    @Override // t2.X
    public final boolean K0(int i7) {
        return y().a(i7);
    }

    @Override // t2.X
    public final boolean L() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return interfaceC1758x.H0() && interfaceC1758x.L();
    }

    @Override // t2.X
    public final boolean L0() {
        R0();
        t2.h0 h0VarM0 = m0();
        return !h0VarM0.p() && h0VarM0.m(V(), this.f19397a, 0L).h;
    }

    @Override // t2.X
    public final long M() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.M();
        }
        return -9223372036854775807L;
    }

    @Override // t2.X
    public final Looper M0() {
        return this.f19401e.getLooper();
    }

    @Override // t2.X
    public final int N() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.N();
        }
        return -1;
    }

    @Override // t2.X
    public final boolean N0() {
        return false;
    }

    @Override // t2.X
    public final C1636c O() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return interfaceC1758x.H0() ? interfaceC1758x.O() : C1636c.f18271c;
    }

    @Override // t2.X
    public final boolean O0() {
        R0();
        t2.h0 h0VarM0 = m0();
        return !h0VarM0.p() && h0VarM0.m(V(), this.f19397a, 0L).a();
    }

    @Override // t2.X
    public final t2.s0 P() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return interfaceC1758x.H0() ? interfaceC1758x.P() : t2.s0.f16725e;
    }

    public final void P0() {
        AbstractC1697a.i(Looper.myLooper() == this.f19401e.getLooper());
        AbstractC1697a.i(!this.f19403g);
        this.f19403g = true;
        C1762z c1762z = this.h;
        c1762z.f19429x = true;
        C1760y c1760y = c1762z.f19428w;
        if (c1760y != null) {
            c1762z.l(c1760y);
        }
    }

    @Override // t2.X
    public final void Q() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.Q();
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring seekToPreviousMediaItem().");
        }
    }

    public final void Q0(Runnable runnable) {
        w2.t.G(this.f19401e, runnable);
    }

    @Override // t2.X
    public final float R() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.R();
        }
        return 1.0f;
    }

    public final void R0() {
        AbstractC1697a.h("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.f19401e.getLooper());
    }

    @Override // t2.X
    public final void S() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.S();
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // t2.X
    public final C1476e T() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return !interfaceC1758x.H0() ? C1476e.f16413g : interfaceC1758x.T();
    }

    @Override // t2.X
    public final int U() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.U();
        }
        return -1;
    }

    @Override // t2.X
    public final int V() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.V();
        }
        return -1;
    }

    @Override // t2.X
    public final void W(int i7, boolean z6) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.W(i7, z6);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // t2.X
    public final C1482k X() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return !interfaceC1758x.H0() ? C1482k.f16499e : interfaceC1758x.X();
    }

    @Override // t2.X
    public final void Y() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.Y();
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // t2.X
    public final void Z(t2.n0 n0Var) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (!interfaceC1758x.H0()) {
            AbstractC1697a.w("The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        interfaceC1758x.Z(n0Var);
    }

    @Override // t2.X
    public final void a() {
        R0();
        if (this.f19398b) {
            return;
        }
        AbstractC1697a.q("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + w2.t.f18885e + "] [" + t2.H.b() + "]");
        this.f19398b = true;
        Handler handler = this.f19401e;
        handler.removeCallbacksAndMessages(null);
        try {
            this.f19399c.a();
        } catch (Exception e7) {
            synchronized (AbstractC1697a.f18830c) {
                AbstractC1697a.a("Exception while releasing impl", e7);
            }
        }
        if (this.f19403g) {
            AbstractC1697a.i(Looper.myLooper() == handler.getLooper());
            this.f19400d.a();
        } else {
            this.f19403g = true;
            C1762z c1762z = this.h;
            c1762z.getClass();
            c1762z.m(new SecurityException("Session rejected the connection request."));
        }
    }

    @Override // t2.X
    public final void a0(C1476e c1476e, boolean z6) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.a0(c1476e, z6);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setAudioAttributes().");
        }
    }

    @Override // t2.X
    public final void b() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.b();
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring prepare().");
        }
    }

    @Override // t2.X
    public final void b0(int i7, int i8) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.b0(i7, i8);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // t2.X
    public final boolean c() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return interfaceC1758x.H0() && interfaceC1758x.c();
    }

    @Override // t2.X
    public final void c0(boolean z6) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.c0(z6);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // t2.X
    public final int d() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.d();
        }
        return 1;
    }

    @Override // t2.X
    public final void d0(int i7) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.d0(i7);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // t2.X
    public final void e() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.e();
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring play().");
        }
    }

    @Override // t2.X
    public final int e0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.e0();
        }
        return -1;
    }

    @Override // t2.X
    public final void f(int i7) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.f(i7);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setRepeatMode().");
        }
    }

    @Override // t2.X
    public final void f0(t2.J j3) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.f0(j3);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setPlaylistMetadata().");
        }
    }

    @Override // t2.X
    public final void g() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.g();
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring pause().");
        }
    }

    @Override // t2.X
    public final void g0(int i7, int i8) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.g0(i7, i8);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring moveMediaItem().");
        }
    }

    @Override // t2.X
    public final void h(t2.Q q7) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.h(q7);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setPlaybackParameters().");
        }
    }

    @Override // t2.X
    public final void h0(int i7, int i8, int i9) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.h0(i7, i8, i9);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring moveMediaItems().");
        }
    }

    @Override // t2.X
    public final int i() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.i();
        }
        return 0;
    }

    @Override // t2.X
    public final int i0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.i0();
        }
        return 0;
    }

    @Override // t2.X
    public final t2.Q j() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return interfaceC1758x.H0() ? interfaceC1758x.j() : t2.Q.f16345d;
    }

    @Override // t2.X
    public final void j0(int i7, int i8, List list) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.j0(i7, i8, list);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring replaceMediaItems().");
        }
    }

    @Override // t2.X
    public final void k(long j3) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.k(j3);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // t2.X
    public final void k0(List list) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.k0(list);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // t2.X
    public final void l(float f7) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.l(f7);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setPlaybackSpeed().");
        }
    }

    @Override // t2.X
    public final long l0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.l0();
        }
        return -9223372036854775807L;
    }

    @Override // t2.X
    public final void m(List list, int i7, long j3) {
        R0();
        AbstractC1697a.g(list, "mediaItems must not be null");
        for (int i8 = 0; i8 < list.size(); i8++) {
            AbstractC1697a.c("items must not contain null, index=" + i8, list.get(i8) != null);
        }
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.m(list, i7, j3);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // t2.X
    public final t2.h0 m0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return interfaceC1758x.H0() ? interfaceC1758x.m0() : t2.h0.f16472a;
    }

    @Override // t2.X
    public final t2.P n() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.n();
        }
        return null;
    }

    @Override // t2.X
    public final boolean n0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.n0();
        }
        return false;
    }

    @Override // t2.X
    public final int o() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.o();
        }
        return 0;
    }

    @Override // t2.X
    public final void o0(int i7) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.o0(i7);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring removeMediaItem().");
        }
    }

    @Override // t2.X
    public final void p(boolean z6) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.p(z6);
        }
    }

    @Override // t2.X
    public final void p0(int i7, t2.G g6) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.p0(i7, g6);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring replaceMediaItem().");
        }
    }

    @Override // t2.X
    public final void q(Surface surface) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.q(surface);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setVideoSurface().");
        }
    }

    @Override // t2.X
    public final void q0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.q0();
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // t2.X
    public final boolean r() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return interfaceC1758x.H0() && interfaceC1758x.r();
    }

    @Override // t2.X
    public final boolean r0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return interfaceC1758x.H0() && interfaceC1758x.r0();
    }

    @Override // t2.X
    public final void s(int i7) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.s(i7);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // t2.X
    public final t2.n0 s0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return !interfaceC1758x.H0() ? t2.n0.f16553C : interfaceC1758x.s0();
    }

    @Override // t2.X
    public final void stop() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.stop();
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring stop().");
        }
    }

    @Override // t2.X
    public final long t() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.t();
        }
        return 0L;
    }

    @Override // t2.X
    public final long t0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.t0();
        }
        return 0L;
    }

    @Override // t2.X
    public final long u() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.u();
        }
        return -9223372036854775807L;
    }

    @Override // t2.X
    public final void u0(int i7, int i8) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.u0(i7, i8);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring removeMediaItems().");
        }
    }

    @Override // t2.X
    public final long v() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.v();
        }
        return 0L;
    }

    @Override // t2.X
    public final void v0(int i7) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.v0(i7);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // t2.X
    public final long w() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            return interfaceC1758x.w();
        }
        return 0L;
    }

    @Override // t2.X
    public final void w0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.w0();
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring seekToNext().");
        }
    }

    @Override // t2.X
    public final void x(int i7, List list) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.x(i7, list);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // t2.X
    public final void x0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.x0();
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring seekForward().");
        }
    }

    @Override // t2.X
    public final t2.T y() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        return !interfaceC1758x.H0() ? t2.T.f16353b : interfaceC1758x.y();
    }

    @Override // t2.X
    public final void y0() {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.y0();
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring seekBack().");
        }
    }

    @Override // t2.X
    public final void z(t2.G g6) {
        R0();
        AbstractC1697a.g(g6, "mediaItems must not be null");
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.z(g6);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // t2.X
    public final void z0(long j3, int i7) {
        R0();
        InterfaceC1758x interfaceC1758x = this.f19399c;
        if (interfaceC1758x.H0()) {
            interfaceC1758x.z0(j3, i7);
        } else {
            AbstractC1697a.w("The controller is not connected. Ignoring seekTo().");
        }
    }
}
