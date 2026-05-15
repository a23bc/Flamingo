package e4;

import android.graphics.Bitmap;
import e5.AbstractC0865c;

/* JADX INFO: renamed from: e4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0859h extends AbstractC0865c {

    /* JADX INFO: renamed from: o */
    public C0862k f11579o;

    /* JADX INFO: renamed from: p */
    public T1.k f11580p;

    /* JADX INFO: renamed from: q */
    public p4.h f11581q;

    /* JADX INFO: renamed from: r */
    public C0854c f11582r;

    /* JADX INFO: renamed from: s */
    public Bitmap f11583s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f11584t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0862k f11585u;

    /* JADX INFO: renamed from: v */
    public int f11586v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0859h(C0862k c0862k, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f11585u = c0862k;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f11584t = obj;
        this.f11586v |= Integer.MIN_VALUE;
        return C0862k.a(this.f11585u, null, 0, this);
    }
}
