package y2;

import E4.g0;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC2005c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f20365A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f20366B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f20367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f20368t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final V1.a f20369u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final V1.a f20370v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HttpURLConnection f20371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InputStream f20372x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f20373y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f20374z;

    public q(int i7, int i8, V1.a aVar) {
        super(true);
        this.f20367s = i7;
        this.f20368t = i8;
        this.f20369u = aVar;
        this.f20370v = new V1.a(26);
    }

    public static void u(HttpURLConnection httpURLConnection, long j3) {
        if (httpURLConnection == null || w2.t.f18881a > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j3 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j3 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // y2.h
    public final void close() {
        try {
            InputStream inputStream = this.f20372x;
            if (inputStream != null) {
                long j3 = this.f20365A;
                long j7 = -1;
                if (j3 != -1) {
                    j7 = j3 - this.f20366B;
                }
                u(this.f20371w, j7);
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    int i7 = w2.t.f18881a;
                    throw new v(2000, 3, e7);
                }
            }
        } finally {
            this.f20372x = null;
            s();
            if (this.f20373y) {
                this.f20373y = false;
                p();
            }
        }
    }

    @Override // y2.AbstractC2005c, y2.h
    public final Map d() {
        HttpURLConnection httpURLConnection = this.f20371w;
        return httpURLConnection == null ? g0.f1938u : new p(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019d  */
    @Override // y2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(y2.m r25) throws y2.v {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.q.e(y2.m):long");
    }

    @Override // y2.h
    public final Uri h() {
        HttpURLConnection httpURLConnection = this.f20371w;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // t2.InterfaceC1481j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(byte[] r7, int r8, int r9) throws y2.v {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.f20365A     // Catch: java.io.IOException -> L32
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.f20366B     // Catch: java.io.IOException -> L32
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L27
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L32
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L32
            int r9 = (int) r0     // Catch: java.io.IOException -> L32
        L1d:
            java.io.InputStream r0 = r6.f20372x     // Catch: java.io.IOException -> L32
            int r1 = w2.t.f18881a     // Catch: java.io.IOException -> L32
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L32
            if (r7 != r3) goto L28
        L27:
            return r3
        L28:
            long r8 = r6.f20366B     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.f20366B = r8     // Catch: java.io.IOException -> L32
            r6.k(r7)     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r7 = move-exception
            int r8 = w2.t.f18881a
            r8 = 2
            y2.v r7 = y2.v.a(r8, r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.q.n(byte[], int, int):int");
    }

    public final void s() {
        HttpURLConnection httpURLConnection = this.f20371w;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                AbstractC1697a.n("Unexpected error while disconnecting", e7);
            }
            this.f20371w = null;
        }
    }

    public final HttpURLConnection t(URL url, int i7, byte[] bArr, long j3, long j7, boolean z6, boolean z7, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f20367s);
        httpURLConnection.setReadTimeout(this.f20368t);
        HashMap map2 = new HashMap();
        V1.a aVar = this.f20369u;
        if (aVar != null) {
            map2.putAll(aVar.D());
        }
        map2.putAll(this.f20370v.D());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = y.f20382a;
        if (j3 == 0 && j7 == -1) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(j3);
            sb.append("-");
            if (j7 != -1) {
                sb.append((j3 + j7) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z6 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z7);
        httpURLConnection.setDoOutput(bArr != null);
        int i8 = m.f20344i;
        if (i7 == 1) {
            str = "GET";
        } else if (i7 == 2) {
            str = "POST";
        } else {
            if (i7 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void v(long j3) throws IOException {
        if (j3 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j3 > 0) {
            int iMin = (int) Math.min(j3, 4096);
            InputStream inputStream = this.f20372x;
            int i7 = w2.t.f18881a;
            int i8 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new v(2000, 1, new InterruptedIOException());
            }
            if (i8 == -1) {
                throw new v();
            }
            j3 -= (long) i8;
            k(i8);
        }
    }
}
