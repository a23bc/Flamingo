package v;

import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f18018p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y f18019q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(Y y6, int i7) {
        super(0);
        this.f18018p = i7;
        this.f18019q = y6;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f18018p) {
        }
        return this.f18019q.D0();
    }
}
