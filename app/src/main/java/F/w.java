package F;

import H.V;
import d.C0746L;
import f0.C0886f0;
import java.util.Collection;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import p0.AbstractC1289f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2156o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2157p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f2158q;

    public /* synthetic */ w(int i7, int i8, Object obj) {
        this.f2156o = i8;
        this.f2158q = obj;
        this.f2157p = i7;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f2156o) {
            case 0:
                V v3 = (V) obj;
                C0128a c0128a = ((A) this.f2158q).f2024a;
                AbstractC1289f abstractC1289fQ = C0746L.q();
                C0746L.z(abstractC1289fQ, C0746L.w(abstractC1289fQ), abstractC1289fQ != null ? abstractC1289fQ.e() : null);
                int i7 = v3.f2826a;
                if (i7 == -1) {
                    i7 = 2;
                }
                for (int i8 = 0; i8 < i7; i8++) {
                    v3.a(this.f2157p + i8);
                }
                return Y4.o.f8736a;
            case 1:
                V v7 = (V) obj;
                C0128a c0128a2 = ((G.x) this.f2158q).f2611a;
                AbstractC1289f abstractC1289fQ2 = C0746L.q();
                C0746L.z(abstractC1289fQ2, C0746L.w(abstractC1289fQ2), abstractC1289fQ2 != null ? abstractC1289fQ2.e() : null);
                c0128a2.getClass();
                int i9 = v7.f2826a;
                if (i9 == -1) {
                    i9 = 2;
                }
                for (int i10 = 0; i10 < i9; i10++) {
                    v7.a(this.f2157p + i10);
                }
                return Y4.o.f8736a;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                C0886f0 c0886f0 = (C0886f0) this.f2158q;
                AbstractC1209k.f(c0886f0, "$sliderPosition");
                c0886f0.j(iIntValue / this.f2157p);
                return Y4.o.f8736a;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.f2157p, (Collection) this.f2158q));
        }
    }

    public /* synthetic */ w(int i7, Collection collection) {
        this.f2156o = 3;
        this.f2157p = i7;
        this.f2158q = collection;
    }
}
