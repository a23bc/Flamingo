package v;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.InterfaceC1386d;
import w.InterfaceC1652A;

/* JADX INFO: renamed from: v.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1584B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1386d f17945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1182c f17946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1652A f17947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17948d;

    public C1584B(InterfaceC1182c interfaceC1182c, InterfaceC1386d interfaceC1386d, InterfaceC1652A interfaceC1652A, boolean z6) {
        this.f17945a = interfaceC1386d;
        this.f17946b = interfaceC1182c;
        this.f17947c = interfaceC1652A;
        this.f17948d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1584B)) {
            return false;
        }
        C1584B c1584b = (C1584B) obj;
        return AbstractC1209k.a(this.f17945a, c1584b.f17945a) && AbstractC1209k.a(this.f17946b, c1584b.f17946b) && AbstractC1209k.a(this.f17947c, c1584b.f17947c) && this.f17948d == c1584b.f17948d;
    }

    public final int hashCode() {
        return ((this.f17947c.hashCode() + ((this.f17946b.hashCode() + (this.f17945a.hashCode() * 31)) * 31)) * 31) + (this.f17948d ? 1231 : 1237);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f17945a + ", size=" + this.f17946b + ", animationSpec=" + this.f17947c + ", clip=" + this.f17948d + ')';
    }
}
