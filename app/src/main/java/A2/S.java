package A2;

import java.util.Arrays;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f156e;

    public S(int i7) {
        this.f152a = i7;
        byte[] bArr = new byte[131];
        this.f156e = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i7, int i8) {
        if (this.f153b) {
            int i9 = i8 - i7;
            byte[] bArr2 = (byte[]) this.f156e;
            int length = bArr2.length;
            int i10 = this.f155d;
            if (length < i10 + i9) {
                this.f156e = Arrays.copyOf(bArr2, (i10 + i9) * 2);
            }
            System.arraycopy(bArr, i7, (byte[]) this.f156e, this.f155d, i9);
            this.f155d += i9;
        }
    }

    public boolean b(int i7) {
        if (!this.f153b) {
            return false;
        }
        this.f155d -= i7;
        this.f153b = false;
        this.f154c = true;
        return true;
    }

    public void c(int i7) {
        this.f153b |= i7 > 0;
        this.f152a += i7;
    }

    public void d() {
        this.f153b = false;
        this.f154c = false;
    }

    public void e(int i7) {
        AbstractC1697a.i(!this.f153b);
        boolean z6 = i7 == this.f152a;
        this.f153b = z6;
        if (z6) {
            this.f155d = 3;
            this.f154c = false;
        }
    }

    public S(o0 o0Var) {
        this.f156e = o0Var;
    }
}
