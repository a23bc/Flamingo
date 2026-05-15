package U5;

import I.C0211c;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import m5.AbstractC1209k;
import w.AbstractC1671d;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: U5.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0453z extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f7294o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0211c f7295p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ String f7296q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ String f7297r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f7298s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0453z(C0211c c0211c, String str, String str2, String str3, c5.d dVar) {
        super(2, dVar);
        this.f7295p = c0211c;
        this.f7296q = str;
        this.f7297r = str2;
        this.f7298s = str3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0453z(this.f7295p, this.f7296q, this.f7297r, this.f7298s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0453z) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f7294o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            String str = this.f7297r;
            String str2 = this.f7296q;
            int i8 = 0;
            if (!AbstractC1209k.a(str2, str) && AbstractC1209k.a(str2, this.f7298s)) {
                i8 = 1;
            }
            this.f7294o = 1;
            if (this.f7295p.f(i8, AbstractC1671d.k(0.0f, 0.0f, null, 7), this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return Y4.o.f8736a;
    }
}
