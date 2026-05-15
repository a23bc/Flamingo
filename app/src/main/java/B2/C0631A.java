package b2;

import android.content.BroadcastReceiver;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.concurrent.CancellationException;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: b2.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0631A extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10021o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f10022p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f10023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.d f10024r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f10025s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0631A(l5.e eVar, B5.d dVar, BroadcastReceiver.PendingResult pendingResult, c5.d dVar2) {
        super(2, dVar2);
        this.f10023q = (AbstractC0871i) eVar;
        this.f10024r = dVar;
        this.f10025s = pendingResult;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0631A c0631a = new C0631A(this.f10023q, this.f10024r, this.f10025s, dVar);
        c0631a.f10022p = obj;
        return c0631a;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0631A) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10021o;
        B5.d dVar = this.f10024r;
        BroadcastReceiver.PendingResult pendingResult = this.f10025s;
        try {
            try {
                if (i7 == 0) {
                    android.support.v4.media.session.b.K(obj);
                    InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f10022p;
                    ?? r12 = this.f10023q;
                    this.f10021o = 1;
                    if (r12.invoke(interfaceC1765B, this) == enumC0830a) {
                        return enumC0830a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    android.support.v4.media.session.b.K(obj);
                }
            } catch (CancellationException e7) {
                try {
                    throw e7;
                } finally {
                    AbstractC1767D.f(dVar, null);
                }
            } catch (Throwable unused) {
            }
            return Y4.o.f8736a;
        } finally {
            try {
                pendingResult.finish();
            } catch (IllegalStateException unused2) {
            }
        }
    }
}
