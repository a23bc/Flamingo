package R0;

import android.view.View;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: R0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0409u extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f6534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6535q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0409u(int i7, int i8) {
        super(1);
        this.f6534p = i8;
        this.f6535q = i7;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f6534p) {
            case 0:
                return Boolean.valueOf(((w0.u) obj).F0(this.f6535q));
            case 1:
                return Boolean.valueOf(((View) obj).getId() == this.f6535q);
            case 2:
                ((Number) obj).intValue();
                throw new IndexOutOfBoundsException(Z1.l.r(new StringBuilder("Collection doesn't contain element at index "), this.f6535q, '.'));
            default:
                return Boolean.valueOf(((w0.u) obj).F0(this.f6535q));
        }
    }
}
