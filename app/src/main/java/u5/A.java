package U5;

import I.C0211c;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import m5.AbstractC1209k;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f7055o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0211c f7056p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ String f7057q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ String f7058r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f7059s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C0211c c0211c, String str, String str2, String str3, c5.d dVar) {
        super(2, dVar);
        this.f7056p = c0211c;
        this.f7057q = str;
        this.f7058r = str2;
        this.f7059s = str3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new A(this.f7056p, this.f7057q, this.f7058r, this.f7059s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f7055o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            String str = this.f7058r;
            String str2 = this.f7057q;
            int i8 = 0;
            if (!AbstractC1209k.a(str2, str) && AbstractC1209k.a(str2, this.f7059s)) {
                i8 = 1;
            }
            this.f7055o = 1;
            if (I.K.t(this.f7056p, i8, this) == enumC0830a) {
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
