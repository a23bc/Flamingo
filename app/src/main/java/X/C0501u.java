package X;

import android.view.textclassifier.TextClassifier;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: X.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0501u extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8170o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ TextClassifier f8171p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f8172q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0501u(TextClassifier textClassifier, l5.e eVar, c5.d dVar) {
        super(2, dVar);
        this.f8171p = textClassifier;
        this.f8172q = (AbstractC0871i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0501u(this.f8171p, this.f8172q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0501u) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f8170o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return obj;
        }
        android.support.v4.media.session.b.K(obj);
        TextClassifier textClassifier = this.f8171p;
        if (textClassifier == null) {
            return null;
        }
        this.f8170o = 1;
        Object objInvoke = this.f8172q.invoke(textClassifier, this);
        return objInvoke == enumC0830a ? enumC0830a : objInvoke;
    }
}
