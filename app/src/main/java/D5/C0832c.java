package d5;

import c5.i;
import e5.AbstractC0865c;
import m5.AbstractC1209k;
import m5.AbstractC1223y;

/* JADX INFO: renamed from: d5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0832c extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l5.e f11272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c5.d f11273q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0832c(c5.d dVar, i iVar, l5.e eVar, c5.d dVar2) {
        super(dVar, iVar);
        this.f11272p = eVar;
        this.f11273q = dVar2;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f11271o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f11271o = 2;
            android.support.v4.media.session.b.K(obj);
            return obj;
        }
        this.f11271o = 1;
        android.support.v4.media.session.b.K(obj);
        l5.e eVar = this.f11272p;
        AbstractC1209k.d(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        AbstractC1223y.c(2, eVar);
        return eVar.invoke(this.f11273q, this);
    }
}
