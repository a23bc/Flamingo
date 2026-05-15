package A3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f509d;

    public j(int i7, int i8, long j3, long j7) {
        this.f506a = i7;
        this.f507b = i8;
        this.f508c = j3;
        this.f509d = j7;
    }

    public static j a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return jVar;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f506a);
            dataOutputStream.writeInt(this.f507b);
            dataOutputStream.writeLong(this.f508c);
            dataOutputStream.writeLong(this.f509d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof j)) {
            j jVar = (j) obj;
            if (this.f507b == jVar.f507b && this.f508c == jVar.f508c && this.f506a == jVar.f506a && this.f509d == jVar.f509d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f507b), Long.valueOf(this.f508c), Integer.valueOf(this.f506a), Long.valueOf(this.f509d));
    }
}
