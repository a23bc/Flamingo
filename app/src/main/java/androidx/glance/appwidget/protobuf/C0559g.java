package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0559g extends G1.P {

    /* JADX INFO: renamed from: q */
    public final byte[] f9621q;

    /* JADX INFO: renamed from: r */
    public int f9622r;

    /* JADX INFO: renamed from: s */
    public int f9623s;

    /* JADX INFO: renamed from: t */
    public int f9624t;

    /* JADX INFO: renamed from: u */
    public final int f9625u;

    /* JADX INFO: renamed from: v */
    public int f9626v;

    /* JADX INFO: renamed from: w */
    public int f9627w = Integer.MAX_VALUE;

    public C0559g(byte[] bArr, int i7, int i8, boolean z6) {
        this.f9621q = bArr;
        this.f9622r = i8 + i7;
        this.f9624t = i7;
        this.f9625u = i7;
    }

    @Override // G1.P
    public final int A() {
        return E();
    }

    @Override // G1.P
    public final long B() {
        return F();
    }

    public final int C() throws C0574w {
        int i7 = this.f9624t;
        if (this.f9622r - i7 < 4) {
            throw C0574w.e();
        }
        this.f9624t = i7 + 4;
        byte[] bArr = this.f9621q;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long D() throws C0574w {
        int i7 = this.f9624t;
        if (this.f9622r - i7 < 8) {
            throw C0574w.e();
        }
        this.f9624t = i7 + 8;
        byte[] bArr = this.f9621q;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public final int E() {
        int i7;
        int i8 = this.f9624t;
        int i9 = this.f9622r;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f9621q;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f9624t = i10;
                return b7;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b7;
                if (i12 < 0) {
                    i7 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i7 = i14 ^ 16256;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i7 = (-2080896) ^ i16;
                        } else {
                            i13 = i8 + 5;
                            byte b8 = bArr[i15];
                            int i17 = (i16 ^ (b8 << 28)) ^ 266354560;
                            if (b8 < 0) {
                                i15 = i8 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i8 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i8 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i8 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i8 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i18;
                                                    i7 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i17;
                            }
                            i7 = i17;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.f9624t = i11;
                return i7;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j3;
        long j7;
        long j8;
        long j9;
        int i7 = this.f9624t;
        int i8 = this.f9622r;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f9621q;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.f9624t = i9;
                return b7;
            }
            if (i8 - i9 >= 9) {
                int i10 = i7 + 2;
                int i11 = (bArr[i9] << 7) ^ b7;
                if (i11 < 0) {
                    j3 = i11 ^ (-128);
                } else {
                    int i12 = i7 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j3 = i13 ^ 16256;
                        i10 = i12;
                    } else {
                        int i14 = i7 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            j9 = (-2080896) ^ i15;
                        } else {
                            long j10 = i15;
                            i10 = i7 + 5;
                            long j11 = j10 ^ (((long) bArr[i14]) << 28);
                            if (j11 >= 0) {
                                j8 = 266354560;
                            } else {
                                i14 = i7 + 6;
                                long j12 = j11 ^ (((long) bArr[i10]) << 35);
                                if (j12 < 0) {
                                    j7 = -34093383808L;
                                } else {
                                    i10 = i7 + 7;
                                    j11 = j12 ^ (((long) bArr[i14]) << 42);
                                    if (j11 >= 0) {
                                        j8 = 4363953127296L;
                                    } else {
                                        i14 = i7 + 8;
                                        j12 = j11 ^ (((long) bArr[i10]) << 49);
                                        if (j12 < 0) {
                                            j7 = -558586000294016L;
                                        } else {
                                            i10 = i7 + 9;
                                            long j13 = (j12 ^ (((long) bArr[i14]) << 56)) ^ 71499008037633920L;
                                            if (j13 < 0) {
                                                int i16 = i7 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i10 = i16;
                                                }
                                            }
                                            j3 = j13;
                                        }
                                    }
                                }
                                j9 = j7 ^ j12;
                            }
                            j3 = j8 ^ j11;
                        }
                        i10 = i14;
                        j3 = j9;
                    }
                }
                this.f9624t = i10;
                return j3;
            }
        }
        return G();
    }

    public final long G() throws C0574w {
        long j3 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            int i8 = this.f9624t;
            if (i8 == this.f9622r) {
                throw C0574w.e();
            }
            this.f9624t = i8 + 1;
            byte b7 = this.f9621q[i8];
            j3 |= ((long) (b7 & 127)) << i7;
            if ((b7 & 128) == 0) {
                return j3;
            }
        }
        throw C0574w.c();
    }

    public final void H() {
        int i7 = this.f9622r + this.f9623s;
        this.f9622r = i7;
        int i8 = i7 - this.f9625u;
        int i9 = this.f9627w;
        if (i8 <= i9) {
            this.f9623s = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f9623s = i10;
        this.f9622r = i7 - i10;
    }

    @Override // G1.P
    public final void a(int i7) throws C0574w {
        if (this.f9626v != i7) {
            throw new C0574w("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // G1.P
    public final int b() {
        return this.f9624t - this.f9625u;
    }

    @Override // G1.P
    public final boolean c() {
        return this.f9624t == this.f9622r;
    }

    @Override // G1.P
    public final void h(int i7) {
        this.f9627w = i7;
        H();
    }

    @Override // G1.P
    public final int i(int i7) throws C0574w {
        if (i7 < 0) {
            throw C0574w.d();
        }
        int iB = b() + i7;
        if (iB < 0) {
            throw new C0574w("Failed to parse the message.");
        }
        int i8 = this.f9627w;
        if (iB > i8) {
            throw C0574w.e();
        }
        this.f9627w = iB;
        H();
        return i8;
    }

    @Override // G1.P
    public final boolean k() {
        return F() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
    @Override // G1.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.glance.appwidget.protobuf.C0558f l() throws androidx.glance.appwidget.protobuf.C0574w {
        /*
            r4 = this;
            int r0 = r4.E()
            byte[] r1 = r4.f9621q
            if (r0 <= 0) goto L19
            int r2 = r4.f9622r
            int r3 = r4.f9624t
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            androidx.glance.appwidget.protobuf.f r1 = androidx.glance.appwidget.protobuf.C0558f.c(r1, r3, r0)
            int r2 = r4.f9624t
            int r2 = r2 + r0
            r4.f9624t = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            androidx.glance.appwidget.protobuf.f r0 = androidx.glance.appwidget.protobuf.C0558f.f9617q
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f9622r
            int r3 = r4.f9624t
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f9624t = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = androidx.glance.appwidget.protobuf.AbstractC0572u.f9657b
        L35:
            androidx.glance.appwidget.protobuf.f r1 = androidx.glance.appwidget.protobuf.C0558f.f9617q
            androidx.glance.appwidget.protobuf.f r1 = new androidx.glance.appwidget.protobuf.f
            r1.<init>(r0)
            return r1
        L3d:
            androidx.glance.appwidget.protobuf.w r0 = androidx.glance.appwidget.protobuf.C0574w.d()
            throw r0
        L42:
            androidx.glance.appwidget.protobuf.w r0 = androidx.glance.appwidget.protobuf.C0574w.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.protobuf.C0559g.l():androidx.glance.appwidget.protobuf.f");
    }

    @Override // G1.P
    public final double m() {
        return Double.longBitsToDouble(D());
    }

    @Override // G1.P
    public final int n() {
        return E();
    }

    @Override // G1.P
    public final int o() {
        return C();
    }

    @Override // G1.P
    public final long p() {
        return D();
    }

    @Override // G1.P
    public final float q() {
        return Float.intBitsToFloat(C());
    }

    @Override // G1.P
    public final int r() {
        return E();
    }

    @Override // G1.P
    public final long s() {
        return F();
    }

    @Override // G1.P
    public final int t() {
        return C();
    }

    @Override // G1.P
    public final long u() {
        return D();
    }

    @Override // G1.P
    public final int v() {
        int iE = E();
        return (-(iE & 1)) ^ (iE >>> 1);
    }

    @Override // G1.P
    public final long w() {
        long jF = F();
        return (-(jF & 1)) ^ (jF >>> 1);
    }

    @Override // G1.P
    public final String x() throws C0574w {
        int iE = E();
        if (iE > 0) {
            int i7 = this.f9622r;
            int i8 = this.f9624t;
            if (iE <= i7 - i8) {
                String str = new String(this.f9621q, i8, iE, AbstractC0572u.f9656a);
                this.f9624t += iE;
                return str;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE < 0) {
            throw C0574w.d();
        }
        throw C0574w.e();
    }

    @Override // G1.P
    public final String y() throws C0574w {
        int iE = E();
        if (iE > 0) {
            int i7 = this.f9622r;
            int i8 = this.f9624t;
            if (iE <= i7 - i8) {
                String strT = c0.f9613a.t(this.f9621q, i8, iE);
                this.f9624t += iE;
                return strT;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE <= 0) {
            throw C0574w.d();
        }
        throw C0574w.e();
    }

    @Override // G1.P
    public final int z() throws C0574w {
        if (c()) {
            this.f9626v = 0;
            return 0;
        }
        int iE = E();
        this.f9626v = iE;
        if ((iE >>> 3) != 0) {
            return iE;
        }
        throw new C0574w("Protocol message contained an invalid tag (zero).");
    }
}
