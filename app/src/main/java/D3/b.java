package D3;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f1553e;

    public b(String str, String str2, String str3, List list, List list2) {
        this.f1549a = str;
        this.f1550b = str2;
        this.f1551c = str3;
        this.f1552d = Collections.unmodifiableList(list);
        this.f1553e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1549a.equals(bVar.f1549a) && this.f1550b.equals(bVar.f1550b) && this.f1551c.equals(bVar.f1551c) && this.f1552d.equals(bVar.f1552d)) {
            return this.f1553e.equals(bVar.f1553e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1553e.hashCode() + ((this.f1552d.hashCode() + A0.e.C(this.f1551c, A0.e.C(this.f1550b, this.f1549a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f1549a + "', onDelete='" + this.f1550b + "', onUpdate='" + this.f1551c + "', columnNames=" + this.f1552d + ", referenceColumnNames=" + this.f1553e + '}';
    }
}
