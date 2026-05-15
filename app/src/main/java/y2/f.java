package y2;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import t2.N;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC2005c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m f20327s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte[] f20328t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f20329u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20330v;

    @Override // y2.h
    public final void close() {
        if (this.f20328t != null) {
            this.f20328t = null;
            p();
        }
        this.f20327s = null;
    }

    @Override // y2.h
    public final long e(m mVar) throws k, N {
        q();
        this.f20327s = mVar;
        Uri uriNormalizeScheme = mVar.f20345a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC1697a.c("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i7 = w2.t.f18881a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new N("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f20328t = Base64.decode(str, 0);
            } catch (IllegalArgumentException e7) {
                throw new N("Error while parsing Base64 encoded string: " + str, e7, true, 0);
            }
        } else {
            this.f20328t = URLDecoder.decode(str, D4.d.f1567a.name()).getBytes(D4.d.f1569c);
        }
        byte[] bArr = this.f20328t;
        long length = bArr.length;
        long j3 = mVar.f20349e;
        if (j3 > length) {
            this.f20328t = null;
            throw new k(2008);
        }
        int i8 = (int) j3;
        this.f20329u = i8;
        int length2 = bArr.length - i8;
        this.f20330v = length2;
        long j7 = mVar.f20350f;
        if (j7 != -1) {
            this.f20330v = (int) Math.min(length2, j7);
        }
        r(mVar);
        return j7 != -1 ? j7 : this.f20330v;
    }

    @Override // y2.h
    public final Uri h() {
        m mVar = this.f20327s;
        if (mVar != null) {
            return mVar.f20345a;
        }
        return null;
    }

    @Override // t2.InterfaceC1481j
    public final int n(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f20330v;
        if (i9 == 0) {
            return -1;
        }
        int iMin = Math.min(i8, i9);
        byte[] bArr2 = this.f20328t;
        int i10 = w2.t.f18881a;
        System.arraycopy(bArr2, this.f20329u, bArr, i7, iMin);
        this.f20329u += iMin;
        this.f20330v -= iMin;
        k(iMin);
        return iMin;
    }
}
