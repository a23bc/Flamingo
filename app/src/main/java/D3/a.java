package D3;

import Z1.l;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1548g;

    public a(int i7, int i8, String str, String str2, String str3, boolean z6) {
        this.f1542a = str;
        this.f1543b = str2;
        this.f1545d = z6;
        this.f1546e = i7;
        int i9 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i9 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i9 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i9 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.f1544c = i9;
        this.f1547f = str3;
        this.f1548g = i8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f1546e != aVar.f1546e || !this.f1542a.equals(aVar.f1542a) || this.f1545d != aVar.f1545d) {
                return false;
            }
            String str = this.f1547f;
            int i7 = this.f1548g;
            int i8 = aVar.f1548g;
            String str2 = aVar.f1547f;
            if (i7 == 1 && i8 == 2 && str != null && !str.equals(str2)) {
                return false;
            }
            if (i7 == 2 && i8 == 1 && str2 != null && !str2.equals(str)) {
                return false;
            }
            if (i7 != 0 && i7 == i8) {
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
            }
            if (this.f1544c != aVar.f1544c) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f1542a.hashCode() * 31) + this.f1544c) * 31) + (this.f1545d ? 1231 : 1237)) * 31) + this.f1546e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f1542a);
        sb.append("', type='");
        sb.append(this.f1543b);
        sb.append("', affinity='");
        sb.append(this.f1544c);
        sb.append("', notNull=");
        sb.append(this.f1545d);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f1546e);
        sb.append(", defaultValue='");
        return l.t(sb, this.f1547f, "'}");
    }
}
