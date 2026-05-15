package y2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class n implements h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f20352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f20353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h f20354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public t f20355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C2004b f20356s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C2007e f20357t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h f20358u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public E f20359v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f f20360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C2002A f20361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h f20362y;

    public n(Context context, h hVar) {
        this.f20352o = context.getApplicationContext();
        hVar.getClass();
        this.f20354q = hVar;
        this.f20353p = new ArrayList();
    }

    public static void p(h hVar, C c7) {
        if (hVar != null) {
            hVar.a(c7);
        }
    }

    @Override // y2.h
    public final void a(C c7) {
        c7.getClass();
        this.f20354q.a(c7);
        this.f20353p.add(c7);
        p(this.f20355r, c7);
        p(this.f20356s, c7);
        p(this.f20357t, c7);
        p(this.f20358u, c7);
        p(this.f20359v, c7);
        p(this.f20360w, c7);
        p(this.f20361x, c7);
    }

    @Override // y2.h
    public final void close() {
        h hVar = this.f20362y;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f20362y = null;
            }
        }
    }

    @Override // y2.h
    public final Map d() {
        h hVar = this.f20362y;
        return hVar == null ? Collections.EMPTY_MAP : hVar.d();
    }

    @Override // y2.h
    public final long e(m mVar) {
        AbstractC1697a.i(this.f20362y == null);
        String scheme = mVar.f20345a.getScheme();
        int i7 = w2.t.f18881a;
        Uri uri = mVar.f20345a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f20352o;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f20355r == null) {
                    t tVar = new t(false);
                    this.f20355r = tVar;
                    k(tVar);
                }
                this.f20362y = this.f20355r;
            } else {
                if (this.f20356s == null) {
                    C2004b c2004b = new C2004b(context);
                    this.f20356s = c2004b;
                    k(c2004b);
                }
                this.f20362y = this.f20356s;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f20356s == null) {
                C2004b c2004b2 = new C2004b(context);
                this.f20356s = c2004b2;
                k(c2004b2);
            }
            this.f20362y = this.f20356s;
        } else if ("content".equals(scheme)) {
            if (this.f20357t == null) {
                C2007e c2007e = new C2007e(context);
                this.f20357t = c2007e;
                k(c2007e);
            }
            this.f20362y = this.f20357t;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            h hVar = this.f20354q;
            if (zEquals) {
                if (this.f20358u == null) {
                    try {
                        h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f20358u = hVar2;
                        k(hVar2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC1697a.w("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e7) {
                        throw new RuntimeException("Error instantiating RTMP extension", e7);
                    }
                    if (this.f20358u == null) {
                        this.f20358u = hVar;
                    }
                }
                this.f20362y = this.f20358u;
            } else if ("udp".equals(scheme)) {
                if (this.f20359v == null) {
                    E e8 = new E();
                    this.f20359v = e8;
                    k(e8);
                }
                this.f20362y = this.f20359v;
            } else if ("data".equals(scheme)) {
                if (this.f20360w == null) {
                    f fVar = new f(false);
                    this.f20360w = fVar;
                    k(fVar);
                }
                this.f20362y = this.f20360w;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f20361x == null) {
                    C2002A c2002a = new C2002A(context);
                    this.f20361x = c2002a;
                    k(c2002a);
                }
                this.f20362y = this.f20361x;
            } else {
                this.f20362y = hVar;
            }
        }
        return this.f20362y.e(mVar);
    }

    @Override // y2.h
    public final Uri h() {
        h hVar = this.f20362y;
        if (hVar == null) {
            return null;
        }
        return hVar.h();
    }

    public final void k(h hVar) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f20353p;
            if (i7 >= arrayList.size()) {
                return;
            }
            hVar.a((C) arrayList.get(i7));
            i7++;
        }
    }

    @Override // t2.InterfaceC1481j
    public final int n(byte[] bArr, int i7, int i8) {
        h hVar = this.f20362y;
        hVar.getClass();
        return hVar.n(bArr, i7, i8);
    }
}
