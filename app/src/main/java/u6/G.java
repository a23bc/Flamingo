package u6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0894j0;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a */
    public int f17395a;

    /* JADX INFO: renamed from: b */
    public C1579w f17396b;

    /* JADX INFO: renamed from: c */
    public C0894j0 f17397c;

    /* JADX INFO: renamed from: d */
    public C0894j0 f17398d;

    public final Object a(int i7, int i8, boolean z6, AbstractC0871i abstractC0871i) {
        Object objH;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 >= 0 && i7 < this.f17395a) {
            new Integer(i7);
            float f7 = i8;
            new Float(f7);
            C1579w c1579w = this.f17396b;
            if (c1579w != null && (objH = c1579w.h(new Integer(i7), new Float(f7), Boolean.valueOf(z6), abstractC0871i)) == EnumC0830a.f11264o) {
                return objH;
            }
        }
        return oVar;
    }
}
