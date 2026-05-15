package k0;

import i0.InterfaceC1054b;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: k0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1132i extends Z4.i implements InterfaceC1054b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1126c f13990p;

    public /* synthetic */ C1132i(C1126c c1126c, int i7) {
        this.f13989o = i7;
        this.f13990p = c1126c;
    }

    @Override // Z4.AbstractC0507a
    public final int b() {
        switch (this.f13989o) {
            case 0:
                C1126c c1126c = this.f13990p;
                c1126c.getClass();
                return c1126c.f13973p;
            default:
                C1126c c1126c2 = this.f13990p;
                c1126c2.getClass();
                return c1126c2.f13973p;
        }
    }

    @Override // Z4.AbstractC0507a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f13989o) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!(entry instanceof Map.Entry)) {
                    return false;
                }
                Object key = entry.getKey();
                C1126c c1126c = this.f13990p;
                Object obj2 = c1126c.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && c1126c.containsKey(entry.getKey());
            default:
                return this.f13990p.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f13989o) {
            case 0:
                C1126c c1126c = this.f13990p;
                AbstractC1136m[] abstractC1136mArr = new AbstractC1136m[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    abstractC1136mArr[i7] = new C1137n(0);
                }
                return new C1133j(c1126c.f13972o, abstractC1136mArr);
            default:
                C1126c c1126c2 = this.f13990p;
                AbstractC1136m[] abstractC1136mArr2 = new AbstractC1136m[8];
                for (int i8 = 0; i8 < 8; i8++) {
                    abstractC1136mArr2[i8] = new C1137n(1);
                }
                return new C1133j(c1126c2.f13972o, abstractC1136mArr2);
        }
    }
}
