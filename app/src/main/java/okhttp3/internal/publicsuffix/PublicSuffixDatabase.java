package okhttp3.internal.publicsuffix;

import I0.c;
import M3.a;
import N2.z;
import S5.o;
import S5.y;
import Z1.l;
import Z4.n;
import Z4.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.AbstractC1209k;
import t5.C1518b;
import t5.InterfaceC1519c;
import t5.InterfaceC1524h;
import t5.j;
import u5.AbstractC1545g;

/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e */
    public static final byte[] f14725e = {42};

    /* JADX INFO: renamed from: f */
    public static final List f14726f = c.G("*");

    /* JADX INFO: renamed from: g */
    public static final PublicSuffixDatabase f14727g = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f14728a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f14729b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c */
    public byte[] f14730c;

    /* JADX INFO: renamed from: d */
    public byte[] f14731d;

    public static List c(String str) {
        List listJ0 = AbstractC1545g.j0(str, new char[]{'.'});
        if (!AbstractC1209k.a(n.x0(listJ0), "")) {
            return listJ0;
        }
        int size = listJ0.size() - 1;
        return n.H0(size >= 0 ? size : 0, listJ0);
    }

    public final String a(String str) {
        String strA;
        String strA2;
        String strA3;
        List listJ0;
        String unicode = IDN.toUnicode(str);
        AbstractC1209k.e(unicode, "unicodeDomain");
        List listC = c(unicode);
        if (this.f14728a.get() || !this.f14728a.compareAndSet(false, true)) {
            try {
                this.f14729b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z6 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z6 = true;
                    } catch (IOException e7) {
                        N5.n nVar = N5.n.f5271a;
                        N5.n.f5271a.getClass();
                        N5.n.i("Failed to read public suffix list", 5, e7);
                        if (z6) {
                        }
                    }
                } finally {
                    if (z6) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f14730c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = listC.size();
        byte[][] bArr = new byte[size][];
        for (int i7 = 0; i7 < size; i7++) {
            String str2 = (String) listC.get(i7);
            Charset charset = StandardCharsets.UTF_8;
            AbstractC1209k.e(charset, "UTF_8");
            byte[] bytes = str2.getBytes(charset);
            AbstractC1209k.e(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i7] = bytes;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                strA = null;
                break;
            }
            byte[] bArr2 = this.f14730c;
            if (bArr2 == null) {
                AbstractC1209k.m("publicSuffixListBytes");
                throw null;
            }
            strA = z.a(bArr2, bArr, i8);
            if (strA != null) {
                break;
            }
            i8++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i9 = 0; i9 < length; i9++) {
                bArr3[i9] = f14725e;
                byte[] bArr4 = this.f14730c;
                if (bArr4 == null) {
                    AbstractC1209k.m("publicSuffixListBytes");
                    throw null;
                }
                strA2 = z.a(bArr4, bArr3, i9);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            int i10 = size - 1;
            for (int i11 = 0; i11 < i10; i11++) {
                byte[] bArr5 = this.f14731d;
                if (bArr5 == null) {
                    AbstractC1209k.m("publicSuffixExceptionListBytes");
                    throw null;
                }
                strA3 = z.a(bArr5, bArr, i11);
                if (strA3 != null) {
                    break;
                }
            }
            strA3 = null;
        } else {
            strA3 = null;
        }
        if (strA3 != null) {
            listJ0 = AbstractC1545g.j0("!".concat(strA3), new char[]{'.'});
        } else if (strA == null && strA2 == null) {
            listJ0 = f14726f;
        } else {
            List listJ02 = v.f8818o;
            List listJ03 = strA != null ? AbstractC1545g.j0(strA, new char[]{'.'}) : listJ02;
            if (strA2 != null) {
                listJ02 = AbstractC1545g.j0(strA2, new char[]{'.'});
            }
            listJ0 = listJ03.size() > listJ02.size() ? listJ03 : listJ02;
        }
        if (listC.size() == listJ0.size() && ((String) listJ0.get(0)).charAt(0) != '!') {
            return null;
        }
        int size2 = ((String) listJ0.get(0)).charAt(0) == '!' ? listC.size() - listJ0.size() : listC.size() - (listJ0.size() + 1);
        InterfaceC1524h interfaceC1524hM0 = n.m0(c(str));
        if (size2 < 0) {
            throw new IllegalArgumentException(l.o(size2, "Requested element count ", " is less than zero.").toString());
        }
        if (size2 != 0) {
            interfaceC1524hM0 = interfaceC1524hM0 instanceof InterfaceC1519c ? ((InterfaceC1519c) interfaceC1524hM0).a(size2) : new C1518b(interfaceC1524hM0, size2);
        }
        return j.I(interfaceC1524hM0, ".");
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                y yVarE = a.E(new o(a.g0(resourceAsStream)));
                try {
                    long jI = yVarE.i();
                    yVarE.t(jI);
                    byte[] bArrO = yVarE.f6823p.o(jI);
                    long jI2 = yVarE.i();
                    yVarE.t(jI2);
                    byte[] bArrO2 = yVarE.f6823p.o(jI2);
                    yVarE.close();
                    synchronized (this) {
                        this.f14730c = bArrO;
                        this.f14731d = bArrO2;
                    }
                } finally {
                }
            }
        } finally {
            this.f14729b.countDown();
        }
    }
}
