package y2;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC2005c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RandomAccessFile f20375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Uri f20376t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f20377u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20378v;

    @Override // y2.h
    public final void close() {
        this.f20376t = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f20375s;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e7) {
                throw new s(e7, 2000);
            }
        } finally {
            this.f20375s = null;
            if (this.f20378v) {
                this.f20378v = false;
                p();
            }
        }
    }

    @Override // y2.h
    public final long e(m mVar) throws s {
        Uri uri = mVar.f20345a;
        long j3 = mVar.f20349e;
        this.f20376t = uri;
        q();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f20375s = randomAccessFile;
            try {
                randomAccessFile.seek(j3);
                long length = mVar.f20350f;
                if (length == -1) {
                    length = this.f20375s.length() - j3;
                }
                this.f20377u = length;
                if (length < 0) {
                    throw new s(null, null, 2008);
                }
                this.f20378v = true;
                r(mVar);
                return this.f20377u;
            } catch (IOException e7) {
                throw new s(e7, 2000);
            }
        } catch (FileNotFoundException e8) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new s(e8, (w2.t.f18881a < 21 || !r.b(e8.getCause())) ? 2005 : 2006);
            }
            throw new s("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e8, 1004);
        } catch (SecurityException e9) {
            throw new s(e9, 2006);
        } catch (RuntimeException e10) {
            throw new s(e10, 2000);
        }
    }

    @Override // y2.h
    public final Uri h() {
        return this.f20376t;
    }

    @Override // t2.InterfaceC1481j
    public final int n(byte[] bArr, int i7, int i8) throws s {
        if (i8 == 0) {
            return 0;
        }
        long j3 = this.f20377u;
        if (j3 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f20375s;
            int i9 = w2.t.f18881a;
            int i10 = randomAccessFile.read(bArr, i7, (int) Math.min(j3, i8));
            if (i10 > 0) {
                this.f20377u -= (long) i10;
                k(i10);
            }
            return i10;
        } catch (IOException e7) {
            throw new s(e7, 2000);
        }
    }
}
