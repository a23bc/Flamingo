package d0;

import androidx.glance.session.SessionWorker;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: d0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0798m extends AbstractC0871i implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11041o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f11042p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11043q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f11044r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f11045s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0798m(SessionWorker sessionWorker, i2.K k7, c5.d dVar) {
        super(1, dVar);
        this.f11044r = sessionWorker;
        this.f11045s = k7;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        c5.d dVar = (c5.d) obj;
        switch (this.f11041o) {
            case 0:
                return new C0798m((C0801p) this.f11044r, this.f11042p, (C0780c) this.f11045s, dVar).invokeSuspend(Y4.o.f8736a);
            default:
                return new C0798m((SessionWorker) this.f11044r, (i2.K) this.f11045s, dVar).invokeSuspend(Y4.o.f8736a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C0798m.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0798m(C0801p c0801p, Object obj, C0780c c0780c, c5.d dVar) {
        super(1, dVar);
        this.f11044r = c0801p;
        this.f11042p = obj;
        this.f11045s = c0780c;
    }
}
