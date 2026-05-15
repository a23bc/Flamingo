package b2;

import android.content.Context;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10281p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f10282q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f10283r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Context context, String str, int i7) {
        super(0);
        this.f10281p = i7;
        this.f10282q = context;
        this.f10283r = str;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f10281p) {
            case 0:
                return android.support.v4.media.session.b.o(this.f10282q, this.f10283r);
            default:
                return AbstractC1267a.D(this.f10282q, this.f10283r);
        }
    }
}
