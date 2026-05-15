package androidx.work.impl;

import A0.b;
import B3.f;
import D2.B;
import L2.C0247a;
import V.o;
import V1.a;
import W3.j;
import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f9851s = 0;
    public volatile j l;

    /* JADX INFO: renamed from: m */
    public volatile a f9852m;

    /* JADX INFO: renamed from: n */
    public volatile a f9853n;

    /* JADX INFO: renamed from: o */
    public volatile b f9854o;

    /* JADX INFO: renamed from: p */
    public volatile a f9855p;

    /* JADX INFO: renamed from: q */
    public volatile b f9856q;

    /* JADX INFO: renamed from: r */
    public volatile a f9857r;

    @Override // B3.k
    public final f d() {
        return new f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // B3.k
    public final H3.b e(B3.a aVar) {
        o oVar = new o(aVar, 5, new C0247a(7, this));
        Context context = (Context) aVar.f815e;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return ((H3.a) aVar.f814d).n(new B(context, (String) aVar.f816f, oVar, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final a i() {
        a aVar;
        if (this.f9852m != null) {
            return this.f9852m;
        }
        synchronized (this) {
            try {
                if (this.f9852m == null) {
                    this.f9852m = new a(this, 1);
                }
                aVar = this.f9852m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final a j() {
        a aVar;
        if (this.f9857r != null) {
            return this.f9857r;
        }
        synchronized (this) {
            try {
                if (this.f9857r == null) {
                    this.f9857r = new a(this, 2);
                }
                aVar = this.f9857r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b k() {
        b bVar;
        if (this.f9854o != null) {
            return this.f9854o;
        }
        synchronized (this) {
            try {
                if (this.f9854o == null) {
                    this.f9854o = new b(this, 12);
                }
                bVar = this.f9854o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final a l() {
        a aVar;
        if (this.f9855p != null) {
            return this.f9855p;
        }
        synchronized (this) {
            try {
                if (this.f9855p == null) {
                    this.f9855p = new a(this, 3);
                }
                aVar = this.f9855p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b m() {
        b bVar;
        if (this.f9856q != null) {
            return this.f9856q;
        }
        synchronized (this) {
            try {
                if (this.f9856q == null) {
                    this.f9856q = new b(this, 13);
                }
                bVar = this.f9856q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final j n() {
        j jVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new j(this);
                }
                jVar = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final a o() {
        a aVar;
        if (this.f9853n != null) {
            return this.f9853n;
        }
        synchronized (this) {
            try {
                if (this.f9853n == null) {
                    this.f9853n = new a(this, 4);
                }
                aVar = this.f9853n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }
}
