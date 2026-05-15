package z;

import e5.AbstractC0865c;
import l5.InterfaceC1180a;

/* JADX INFO: loaded from: classes.dex */
public final class s1 extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public Y4.c f20951o;

    /* JADX INFO: renamed from: p */
    public InterfaceC1180a f20952p;

    /* JADX INFO: renamed from: q */
    public float f20953q;

    /* JADX INFO: renamed from: r */
    public /* synthetic */ Object f20954r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ t1 f20955s;

    /* JADX INFO: renamed from: t */
    public int f20956t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f20955s = t1Var;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f20954r = obj;
        this.f20956t |= Integer.MIN_VALUE;
        return this.f20955s.a(null, null, this);
    }
}
