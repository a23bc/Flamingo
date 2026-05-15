package o3;

import android.graphics.Color;
import d2.C0821i;
import o5.AbstractC1267a;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: o3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1265e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f14689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f14690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14693g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f14694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14695j;

    public C1265e(String str, int i7, Integer num, Integer num2, float f7, boolean z6, boolean z7, boolean z8, boolean z9, int i8) {
        this.f14687a = str;
        this.f14688b = i7;
        this.f14689c = num;
        this.f14690d = num2;
        this.f14691e = f7;
        this.f14692f = z6;
        this.f14693g = z7;
        this.h = z8;
        this.f14694i = z9;
        this.f14695j = i8;
    }

    public static int a(String str) {
        int i7;
        try {
            i7 = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                return i7;
            default:
                A0.e.H("Ignoring unknown alignment: ", str);
                return -1;
        }
    }

    public static boolean b(String str) {
        try {
            int i7 = Integer.parseInt(str);
            return i7 == 1 || i7 == -1;
        } catch (NumberFormatException e7) {
            AbstractC1697a.x("Failed to parse boolean value: '" + str + "'", e7);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j3 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC1697a.d(j3 <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC1267a.p(((j3 >> 24) & 255) ^ 255), AbstractC1267a.p(j3 & 255), AbstractC1267a.p((j3 >> 8) & 255), AbstractC1267a.p((j3 >> 16) & 255)));
        } catch (IllegalArgumentException e7) {
            AbstractC1697a.x("Failed to parse color expression: '" + str + "'", e7);
            return null;
        }
    }
}
