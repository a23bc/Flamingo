package R0;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import w0.C1696d;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f6523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1696d f6524q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(C1696d c1696d, int i7) {
        super(1);
        this.f6523p = i7;
        this.f6524q = c1696d;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f6523p) {
        }
        return Boolean.valueOf(((w0.u) obj).F0(this.f6524q.f18776a));
    }
}
