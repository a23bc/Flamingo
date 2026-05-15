package f4;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: f4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0931b extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0931b f12175q = new C0931b(1, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0931b f12176r = new C0931b(1, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f12177p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0931b(int i7, int i8) {
        super(i7);
        this.f12177p = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f12177p) {
            case 0:
                return Y4.o.f8736a;
            default:
                return (i) obj;
        }
    }
}
