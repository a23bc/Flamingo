package H;

import Q0.InterfaceC0360p;
import a.AbstractC0509a;
import java.util.ArrayList;
import m5.AbstractC1209k;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC1397o implements InterfaceC0360p {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.b f2772C;

    @Override // Q0.InterfaceC0360p
    public final void a(Q0.N n7) {
        ArrayList arrayList = this.f2772C.f9223i;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0183z c0183z = (C0183z) arrayList.get(i7);
            B0.d dVar = c0183z.l;
            if (dVar != null) {
                long j3 = c0183z.f2949k;
                long j7 = dVar.f632t;
                float f7 = ((int) (j3 >> 32)) - ((int) (j7 >> 32));
                float f8 = ((int) (j3 & 4294967295L)) - ((int) (4294967295L & j7));
                A0.c cVar = n7.f5853o;
                ((A.b) cVar.f54p.f50p).J(f7, f8);
                try {
                    AbstractC0509a.t(n7, dVar);
                } finally {
                    ((A.b) cVar.f54p.f50p).J(-f7, -f8);
                }
            }
        }
        n7.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && AbstractC1209k.a(this.f2772C, ((B) obj).f2772C);
    }

    @Override // Q0.InterfaceC0360p
    public final /* synthetic */ void f0() {
    }

    public final int hashCode() {
        return this.f2772C.hashCode();
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        this.f2772C.f9224j = this;
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        androidx.compose.foundation.lazy.layout.b bVar = this.f2772C;
        bVar.e();
        bVar.f9217b = null;
        bVar.f9218c = -1;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f2772C + ')';
    }
}
