package y3;

import android.os.Bundle;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f20442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Bundle f20443q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i7, Bundle bundle) {
        super(1);
        this.f20442p = i7;
        this.f20443q = bundle;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f20442p) {
            case 0:
                AbstractC1209k.f((String) obj, "argName");
                return Boolean.valueOf(!this.f20443q.containsKey(r2));
            default:
                AbstractC1209k.f((String) obj, "key");
                return Boolean.valueOf(!this.f20443q.containsKey(r2));
        }
    }
}
