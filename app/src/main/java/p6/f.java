package p6;

import M.C0251b0;
import O0.C;
import Y4.o;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f0.C0888g0;
import g.C0934a;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import x.C1817E0;
import x0.C1892b;
import x0.C1893c;
import y0.C1960J;
import y0.InterfaceC1963M;
import z.C2039h;
import z.H0;
import z.P0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15114o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f15115p;

    public /* synthetic */ f(int i7, Object obj) {
        this.f15114o = i7;
        this.f15115p = obj;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Intent intent;
        Uri data;
        C1893c c1893cC0;
        switch (this.f15114o) {
            case 0:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                List list = (List) this.f15115p;
                AbstractC1209k.f(list, "$logs");
                return new Y4.h(num, Integer.valueOf(((String) list.get(iIntValue)).hashCode()));
            case 1:
                C0934a c0934a = (C0934a) obj;
                Context context = (Context) this.f15115p;
                AbstractC1209k.f(context, "$context");
                AbstractC1209k.f(c0934a, "result");
                if (c0934a.f12250o == -1 && (intent = c0934a.f12251p) != null && (data = intent.getData()) != null) {
                    context.getContentResolver().takePersistableUriPermission(data, 1);
                }
                return o.f8736a;
            case 2:
                C c7 = (C) obj;
                C0888g0 c0888g0 = (C0888g0) this.f15115p;
                AbstractC1209k.f(c7, "coordinates");
                if (c0888g0.h() == 0 && ((int) (c7.G() & 4294967295L)) != 0) {
                    c0888g0.j((int) (c7.G() & 4294967295L));
                }
                return o.f8736a;
            case 3:
                C1960J c1960j = (C1960J) obj;
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.m((InterfaceC1963M) this.f15115p);
                c1960j.d(true);
                return o.f8736a;
            case 4:
                float fFloatValue = ((Float) obj).floatValue();
                C1817E0 c1817e0 = (C1817E0) this.f15115p;
                float fH = c1817e0.f19619a.h() + fFloatValue + c1817e0.f19623e;
                float fP = i6.h.p(fH, 0.0f, c1817e0.f19622d.h());
                boolean z6 = fH == fP;
                C0888g0 c0888g02 = c1817e0.f19619a;
                float fH2 = fP - c0888g02.h();
                int iRound = Math.round(fH2);
                c0888g02.j(c0888g02.h() + iRound);
                c1817e0.f19623e = fH2 - iRound;
                if (!z6) {
                    fFloatValue = fH2;
                }
                return Float.valueOf(fFloatValue);
            case 5:
                ((C0251b0) this.f15115p).a();
                return o.f8736a;
            case 6:
                C2039h c2039h = ((H0) this.f15115p).f20649U;
                c2039h.f20847H = (C) obj;
                if (c2039h.f20849J && (c1893cC0 = c2039h.C0()) != null && !c2039h.D0(c1893cC0, c2039h.f20850K)) {
                    c2039h.f20848I = true;
                    c2039h.E0();
                }
                c2039h.f20849J = false;
                return o.f8736a;
            default:
                P0 p02 = (P0) this.f15115p;
                return new C1892b(p02.c(p02.f20720k, ((C1892b) obj).f19867a, p02.f20719j));
        }
    }
}
