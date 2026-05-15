package e5;

import c5.j;

/* JADX INFO: renamed from: e5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0869g extends AbstractC0863a {
    public AbstractC0869g(c5.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != j.f10685o) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // c5.d
    public final c5.i getContext() {
        return j.f10685o;
    }
}
