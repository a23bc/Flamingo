package O1;

import e5.AbstractC0865c;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0865c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public F f5497o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public File f5498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public FileOutputStream f5499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FileOutputStream f5500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ F f5502t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5503u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f7, AbstractC0865c abstractC0865c) {
        super(abstractC0865c);
        this.f5502t = f7;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        this.f5501s = obj;
        this.f5503u |= Integer.MIN_VALUE;
        return this.f5502t.k(null, this);
    }
}
