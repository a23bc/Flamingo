package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0568p implements Cloneable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f9654o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r f9655p;

    public AbstractC0568p(r rVar) {
        this.f9654o = rVar;
        if (rVar.f()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f9655p = rVar.h();
    }

    public static void d(Object obj, Object obj2) {
        M m7 = M.f9581c;
        m7.getClass();
        m7.a(obj.getClass()).e(obj, obj2);
    }

    public final r a() {
        r rVarB = b();
        rVarB.getClass();
        if (r.e(rVarB, true)) {
            return rVarB;
        }
        throw new S();
    }

    public final r b() {
        if (!this.f9655p.f()) {
            return this.f9655p;
        }
        r rVar = this.f9655p;
        rVar.getClass();
        M m7 = M.f9581c;
        m7.getClass();
        m7.a(rVar.getClass()).a(rVar);
        rVar.g();
        return this.f9655p;
    }

    public final void c() {
        if (this.f9655p.f()) {
            return;
        }
        r rVarH = this.f9654o.h();
        d(rVarH, this.f9655p);
        this.f9655p = rVarH;
    }

    public final Object clone() {
        AbstractC0568p abstractC0568p = (AbstractC0568p) this.f9654o.b(5);
        abstractC0568p.f9655p = b();
        return abstractC0568p;
    }
}
