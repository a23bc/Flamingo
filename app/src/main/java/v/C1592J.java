package v;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import y0.C1960J;

/* JADX INFO: renamed from: v.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1592J extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f17981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f17982q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1592J(int i7, boolean z6) {
        super(1);
        this.f17981p = i7;
        this.f17982q = z6;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f17981p) {
            case 0:
                ((C1960J) obj).d(!this.f17982q && Boolean.TRUE.booleanValue());
                return Y4.o.f8736a;
            default:
                return Boolean.valueOf(this.f17982q);
        }
    }
}
