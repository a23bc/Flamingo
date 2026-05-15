package H;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List[] f2884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0 f2888f;

    public i0(j0 j0Var, List list) {
        this.f2888f = j0Var;
        this.f2883a = list;
        this.f2884b = new List[list.size()];
        if (list.isEmpty()) {
            C.b.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
