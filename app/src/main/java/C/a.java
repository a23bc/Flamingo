package C;

import android.os.Parcel;
import j5.AbstractC1109c;
import n1.p;
import n1.q;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcel f929a;

    public long a() {
        int i7 = C1987t.f20263k;
        long j3 = this.f929a.readLong();
        long j7 = 63 & j3;
        return j7 < 16 ? j3 : (j3 & (-64)) | (j7 + 1);
    }

    public long b() {
        Parcel parcel = this.f929a;
        byte b7 = parcel.readByte();
        long j3 = b7 == 1 ? 4294967296L : b7 == 2 ? 8589934592L : 0L;
        return q.a(j3, 0L) ? p.f14526c : AbstractC1109c.w(j3, parcel.readFloat());
    }

    public void c(byte b7) {
        this.f929a.writeByte(b7);
    }

    public void d(float f7) {
        this.f929a.writeFloat(f7);
    }

    public void e(long j3) {
        long jB = p.b(j3);
        byte b7 = 0;
        if (!q.a(jB, 0L)) {
            if (q.a(jB, 4294967296L)) {
                b7 = 1;
            } else if (q.a(jB, 8589934592L)) {
                b7 = 2;
            }
        }
        c(b7);
        if (q.a(p.b(j3), 0L)) {
            return;
        }
        d(p.c(j3));
    }
}
