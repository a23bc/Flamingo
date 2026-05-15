package X;

import A2.AbstractC0002c;
import android.view.textclassifier.TextClassifier;
import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: renamed from: X.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0500t extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f8163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0505y f8164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CharSequence f8165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f8166s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0500t(long j3, C0505y c0505y, c5.d dVar, CharSequence charSequence) {
        super(2, dVar);
        this.f8164q = c0505y;
        this.f8165r = charSequence;
        this.f8166s = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0500t c0500t = new C0500t(this.f8166s, this.f8164q, dVar, this.f8165r);
        c0500t.f8163p = obj;
        return c0500t;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0500t) create(AbstractC0002c.p(obj), (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f8162o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            TextClassifier textClassifierP = AbstractC0002c.p(this.f8163p);
            this.f8162o = 1;
            if (C0505y.a(this.f8164q, this.f8165r, this.f8166s, textClassifierP, this) == enumC0830a) {
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
