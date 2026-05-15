package z0;

import w3.V0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f21033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f21034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f21035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f21036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f21037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f21038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f21039g;
    public static final q h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f21040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f21041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f21042k;
    public static final q l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q f21043m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q f21044n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q f21045o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q f21046p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f21047q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q f21048r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f21049s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f21050t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q f21051u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q f21052v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q f21053w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final l f21054x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c[] f21055y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f21033a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f21034b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar3 = new r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f21035c = rVar3;
        r rVar4 = new r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f21036d = rVar4;
        s sVar = j.f21067d;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        f21037e = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        f21038f = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new V0(13), new V0(14), -0.799f, 2.399f, rVar, 2);
        f21039g = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        h = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f21040i = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f21041j = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f21042k = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        l = qVar8;
        q qVar9 = new q("NTSC (1953)", fArr2, j.f21064a, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f21043m = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f21044n = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        f21045o = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f21065b, new r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f21046p = qVar12;
        s sVar2 = j.f21066c;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f21047q = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f21048r = qVar14;
        k kVar = new k(AbstractC2077b.f21026b, "Generic XYZ", 14, 1);
        f21049s = kVar;
        long j3 = AbstractC2077b.f21027c;
        k kVar2 = new k(j3, "Generic L*a*b*", 15, 0);
        f21050t = kVar2;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        f21051u = qVar15;
        q qVar16 = new q("Hybrid Log Gamma encoding", fArr3, sVar, null, new V0(15), new V0(16), 0.0f, 1.0f, rVar3, 17);
        f21052v = qVar16;
        q qVar17 = new q("Perceptual Quantizer encoding", fArr3, sVar, null, new V0(17), new V0(18), 0.0f, 1.0f, rVar4, 18);
        f21053w = qVar17;
        l lVar = new l(j3, "Oklab", 19);
        f21054x = lVar;
        f21055y = new c[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, kVar, kVar2, qVar15, qVar16, qVar17, lVar};
    }

    public static double a(r rVar, double d4) {
        double d7 = d4 < 0.0d ? -1.0d : 1.0d;
        double d8 = d4 * d7;
        double d9 = rVar.f21096b;
        double d10 = d9 * d8;
        return (rVar.f21101g + 1.0d) * d7 * (d10 <= 1.0d ? Math.pow(d10, rVar.f21097c) : Math.exp((d8 - rVar.f21100f) * rVar.f21098d) + rVar.f21099e);
    }

    public static double b(r rVar, double d4) {
        double d7 = d4 < 0.0d ? -1.0d : 1.0d;
        double d8 = 1.0d / rVar.f21096b;
        double d9 = 1.0d / rVar.f21097c;
        double d10 = 1.0d / rVar.f21098d;
        double d11 = (d4 * d7) / (rVar.f21101g + 1.0d);
        return d7 * (d11 <= 1.0d ? Math.pow(d11, d9) * d8 : (Math.log(d11 - rVar.f21099e) * d10) + rVar.f21100f);
    }

    public static double c(r rVar, double d4) {
        double d7 = d4 < 0.0d ? -1.0d : 1.0d;
        double d8 = d4 * d7;
        double d9 = rVar.f21096b;
        double d10 = rVar.f21098d;
        double dPow = (Math.pow(d8, d10) * rVar.f21097c) + d9;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d8, d10) * rVar.f21100f) + rVar.f21099e), rVar.f21101g) * d7;
    }

    public static double d(r rVar, double d4) {
        double d7 = d4 < 0.0d ? -1.0d : 1.0d;
        double d8 = d4 * d7;
        double d9 = -rVar.f21096b;
        double d10 = 1.0d / rVar.f21101g;
        return Math.pow(Math.max((Math.pow(d8, d10) * rVar.f21099e) + d9, 0.0d) / ((Math.pow(d8, d10) * (-rVar.f21100f)) + rVar.f21097c), 1.0d / rVar.f21098d) * d7;
    }
}
