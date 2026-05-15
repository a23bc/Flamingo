package z4;

import java.util.NoSuchElementException;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import r5.C1422c;
import r5.C1423d;

/* JADX INFO: renamed from: z4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2082a extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f21197p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2097p[] f21198q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2082a(InterfaceC2097p[] interfaceC2097pArr, int i7) {
        super(0);
        this.f21197p = i7;
        this.f21198q = interfaceC2097pArr;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f21197p) {
            case 0:
                InterfaceC2087f.f21205m.getClass();
                InterfaceC2087f interfaceC2087fX = C2086e.f21204b;
                for (InterfaceC2097p interfaceC2097p : this.f21198q) {
                    interfaceC2087fX = AbstractC1113a.x(interfaceC2087fX, interfaceC2097p);
                }
                return interfaceC2087fX;
            case 1:
                InterfaceC2097p[] interfaceC2097pArr = this.f21198q;
                if (interfaceC2097pArr.length == 0) {
                    throw new NoSuchElementException();
                }
                float fT = interfaceC2097pArr[0].t();
                C1422c it = new C1423d(1, interfaceC2097pArr.length - 1, 1).iterator();
                while (it.f15786q) {
                    fT = Math.max(fT, interfaceC2097pArr[it.b()].t());
                }
                return Float.valueOf(fT);
            case 2:
                InterfaceC2097p[] interfaceC2097pArr2 = this.f21198q;
                int length = interfaceC2097pArr2.length;
                boolean z6 = false;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        if (interfaceC2097pArr2[i7].p()) {
                            z6 = true;
                        } else {
                            i7++;
                        }
                    }
                }
                return Boolean.valueOf(z6);
            case 3:
                InterfaceC2097p[] interfaceC2097pArr3 = this.f21198q;
                int length2 = interfaceC2097pArr3.length;
                boolean z7 = false;
                int i8 = 0;
                while (true) {
                    if (i8 >= length2) {
                        z7 = true;
                    } else if (interfaceC2097pArr3[i8].isVisible()) {
                        i8++;
                    }
                }
                return Boolean.valueOf(z7);
            default:
                InterfaceC2087f.f21205m.getClass();
                InterfaceC2087f interfaceC2087fX2 = C2086e.f21204b;
                for (InterfaceC2097p interfaceC2097p2 : this.f21198q) {
                    interfaceC2087fX2 = AbstractC1113a.x(interfaceC2087fX2, interfaceC2097p2);
                }
                return interfaceC2087fX2;
        }
    }
}
