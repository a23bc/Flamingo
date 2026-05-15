package j4;

import e5.AbstractC0865c;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public l f13719o;

    /* JADX INFO: renamed from: p */
    public h4.h f13720p;

    /* JADX INFO: renamed from: q */
    public Object f13721q;

    /* JADX INFO: renamed from: r */
    public /* synthetic */ Object f13722r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ l f13723s;

    /* JADX INFO: renamed from: t */
    public int f13724t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f13723s = lVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f13722r = obj;
        this.f13724t |= Integer.MIN_VALUE;
        return this.f13723s.a(this);
    }
}
