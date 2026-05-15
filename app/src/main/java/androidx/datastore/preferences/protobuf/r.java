package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class r implements Cloneable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC0546t f9517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AbstractC0546t f9518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9519q = false;

    public r(AbstractC0546t abstractC0546t) {
        this.f9517o = abstractC0546t;
        this.f9518p = (AbstractC0546t) abstractC0546t.d(4);
    }

    public static void d(AbstractC0546t abstractC0546t, AbstractC0546t abstractC0546t2) {
        U u7 = U.f9421c;
        u7.getClass();
        u7.a(abstractC0546t.getClass()).i(abstractC0546t, abstractC0546t2);
    }

    public final AbstractC0546t a() {
        AbstractC0546t abstractC0546tB = b();
        if (abstractC0546tB.g()) {
            return abstractC0546tB;
        }
        throw new A2.W();
    }

    public final AbstractC0546t b() {
        if (this.f9519q) {
            return this.f9518p;
        }
        AbstractC0546t abstractC0546t = this.f9518p;
        abstractC0546t.getClass();
        U u7 = U.f9421c;
        u7.getClass();
        u7.a(abstractC0546t.getClass()).a(abstractC0546t);
        this.f9519q = true;
        return this.f9518p;
    }

    public final void c() {
        if (this.f9519q) {
            AbstractC0546t abstractC0546t = (AbstractC0546t) this.f9518p.d(4);
            d(abstractC0546t, this.f9518p);
            this.f9518p = abstractC0546t;
            this.f9519q = false;
        }
    }

    public final Object clone() {
        r rVar = (r) this.f9517o.d(5);
        AbstractC0546t abstractC0546tB = b();
        rVar.c();
        d(rVar.f9518p, abstractC0546tB);
        return rVar;
    }
}
