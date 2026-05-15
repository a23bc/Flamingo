package i2;

import android.content.Context;
import b2.C0667k;
import b2.C0671m;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.B0;
import f0.C0924z;
import java.util.concurrent.CancellationException;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Throwable f13442o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0924z f13444q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0671m f13445r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f13446s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B0 f13447t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ K f13448u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0924z c0924z, C0671m c0671m, Context context, B0 b0, K k7, c5.d dVar) {
        super(2, dVar);
        this.f13444q = c0924z;
        this.f13445r = c0671m;
        this.f13446s = context;
        this.f13447t = b0;
        this.f13448u = k7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new z(this.f13444q, this.f13445r, this.f13446s, this.f13447t, this.f13448u, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13443p;
        Y4.o oVar = Y4.o.f8736a;
        Context context = this.f13446s;
        C0671m c0671m = this.f13445r;
        try {
        } catch (CancellationException unused) {
        } catch (Throwable th2) {
            this.f13442o = th2;
            this.f13443p = 2;
            c0671m.a(context, th2);
            if (oVar != enumC0830a) {
                th = th2;
            }
        }
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C0924z c0924z = this.f13444q;
            c0671m.getClass();
            c0924z.z(new n0.d(-1784282257, new C0667k(context, c0671m), true));
            B0 b0 = this.f13447t;
            this.f13443p = 1;
            return b0.O(this) == enumC0830a ? enumC0830a : oVar;
        }
        if (i7 == 1) {
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        if (i7 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        th = this.f13442o;
        android.support.v4.media.session.b.K(obj);
        CancellationException cancellationException = new CancellationException("Error in recomposition coroutine");
        cancellationException.initCause(th);
        AbstractC1767D.f(this.f13448u, cancellationException);
    }
}
