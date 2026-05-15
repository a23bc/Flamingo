package i2;

import K0.C0236d;
import android.content.Context;
import d0.C0798m;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: i2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1071f extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13366o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f13367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f13368q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0798m f13369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f13370s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1071f(Context context, C0798m c0798m, s sVar, c5.d dVar) {
        super(2, dVar);
        this.f13368q = context;
        this.f13369r = c0798m;
        this.f13370s = sVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1071f c1071f = new C1071f(this.f13368q, this.f13369r, this.f13370s, dVar);
        c1071f.f13367p = obj;
        return c1071f;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1071f) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1069d c1069d;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13366o;
        Context context = this.f13368q;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1069d = (C1069d) this.f13367p;
            try {
                android.support.v4.media.session.b.K(obj);
                context.unregisterReceiver(c1069d);
                return obj;
            } catch (Throwable th) {
                th = th;
                context.unregisterReceiver(c1069d);
                throw th;
            }
        }
        android.support.v4.media.session.b.K(obj);
        C1069d c1069d2 = new C1069d(new C0236d((InterfaceC1765B) this.f13367p, 9, this.f13370s));
        context.registerReceiver(c1069d2, C1069d.f13362c);
        try {
            c1069d2.a(context);
            C0798m c0798m = this.f13369r;
            this.f13367p = c1069d2;
            this.f13366o = 1;
            obj = c0798m.b(this);
            if (obj == enumC0830a) {
                return enumC0830a;
            }
            c1069d = c1069d2;
            context.unregisterReceiver(c1069d);
            return obj;
        } catch (Throwable th2) {
            th = th2;
            c1069d = c1069d2;
            context.unregisterReceiver(c1069d);
            throw th;
        }
    }
}
