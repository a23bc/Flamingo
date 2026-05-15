package O1;

import e5.AbstractC0865c;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public F f5561o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f5562p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Serializable f5563q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f5564r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public x f5565s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Iterator f5566t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f5567u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ F f5568v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5569w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(F f7, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f5568v = f7;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f5567u = obj;
        this.f5569w |= Integer.MIN_VALUE;
        return this.f5568v.e(this);
    }
}
