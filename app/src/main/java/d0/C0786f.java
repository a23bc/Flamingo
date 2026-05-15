package d0;

import e5.AbstractC0865c;

/* JADX INFO: renamed from: d0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0786f extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public A5.D f10989o;

    /* JADX INFO: renamed from: p */
    public Object f10990p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f10991q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ A5.D f10992r;

    /* JADX INFO: renamed from: s */
    public int f10993s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0786f(A5.D d4, c5.d dVar) {
        super(dVar);
        this.f10992r = d4;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f10991q = obj;
        this.f10993s |= Integer.MIN_VALUE;
        return this.f10992r.f(null, this);
    }
}
