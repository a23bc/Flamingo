package D3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1560c;

    public d(String str, boolean z6, List list) {
        this.f1558a = str;
        this.f1559b = z6;
        this.f1560c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1559b != dVar.f1559b || !this.f1560c.equals(dVar.f1560c)) {
            return false;
        }
        String str = this.f1558a;
        boolean zStartsWith = str.startsWith("index_");
        String str2 = dVar.f1558a;
        return zStartsWith ? str2.startsWith("index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f1558a;
        return this.f1560c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f1559b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f1558a + "', unique=" + this.f1559b + ", columns=" + this.f1560c + '}';
    }
}
