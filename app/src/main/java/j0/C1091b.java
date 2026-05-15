package j0;

import java.util.Collection;
import java.util.List;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: j0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1091b implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13620o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Collection f13621p;

    public /* synthetic */ C1091b(int i7, Collection collection) {
        this.f13620o = i7;
        this.f13621p = collection;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f13620o) {
            case 0:
                return Boolean.valueOf(this.f13621p.contains(obj));
            case 1:
                return Boolean.valueOf(this.f13621p.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.f13621p));
        }
    }
}
