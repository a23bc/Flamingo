package o0;

import f0.I;
import java.util.Map;
import p0.p;
import t.J;
import v.C1618o;

/* JADX INFO: renamed from: o0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1248e implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14640d;

    public /* synthetic */ C1248e(Object obj, Object obj2, Object obj3, int i7) {
        this.f14637a = i7;
        this.f14639c = obj;
        this.f14638b = obj2;
        this.f14640d = obj3;
    }

    @Override // f0.I
    public final void a() {
        switch (this.f14637a) {
            case 0:
                C1249f c1249f = (C1249f) this.f14639c;
                J j3 = c1249f.f14643p;
                Object obj = this.f14638b;
                Object objK = j3.k(obj);
                C1254k c1254k = (C1254k) this.f14640d;
                if (objK == c1254k) {
                    Map mapE = c1254k.e();
                    boolean zIsEmpty = mapE.isEmpty();
                    Map map = c1249f.f14642o;
                    if (!zIsEmpty) {
                        map.put(obj, mapE);
                    } else {
                        map.remove(obj);
                    }
                }
                break;
            default:
                p pVar = (p) this.f14639c;
                Object obj2 = this.f14638b;
                pVar.remove(obj2);
                ((C1618o) this.f14640d).f18135d.k(obj2);
                break;
        }
    }
}
