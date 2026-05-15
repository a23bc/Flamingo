package u2;

import Z1.l;
import java.util.Arrays;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e */
    public static final b f17204e = new b(-1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f17205a;

    /* JADX INFO: renamed from: b */
    public final int f17206b;

    /* JADX INFO: renamed from: c */
    public final int f17207c;

    /* JADX INFO: renamed from: d */
    public final int f17208d;

    public b(int i7, int i8, int i9) {
        this.f17205a = i7;
        this.f17206b = i8;
        this.f17207c = i9;
        this.f17208d = t.z(i9) ? t.u(i9, i8) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17205a == bVar.f17205a && this.f17206b == bVar.f17206b && this.f17207c == bVar.f17207c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17205a), Integer.valueOf(this.f17206b), Integer.valueOf(this.f17207c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.f17205a);
        sb.append(", channelCount=");
        sb.append(this.f17206b);
        sb.append(", encoding=");
        return l.r(sb, this.f17207c, ']');
    }
}
