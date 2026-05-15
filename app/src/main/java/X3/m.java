package X3;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0.b f8302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O3.b f8303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W3.j f8304c;

    static {
        N3.p.i("WMFgUpdater");
    }

    public m(WorkDatabase workDatabase, O3.b bVar, A0.b bVar2) {
        this.f8303b = bVar;
        this.f8302a = bVar2;
        this.f8304c = workDatabase.n();
    }
}
