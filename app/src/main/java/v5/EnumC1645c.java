package v5;

import java.util.concurrent.TimeUnit;
import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1645c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC1645c f18317p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1645c f18318q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1645c f18319r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC1645c f18320s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC1645c f18321t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final EnumC1645c f18322u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC1645c[] f18323v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TimeUnit f18324o;

    static {
        EnumC1645c enumC1645c = new EnumC1645c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f18317p = enumC1645c;
        EnumC1645c enumC1645c2 = new EnumC1645c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        EnumC1645c enumC1645c3 = new EnumC1645c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f18318q = enumC1645c3;
        EnumC1645c enumC1645c4 = new EnumC1645c("SECONDS", 3, TimeUnit.SECONDS);
        f18319r = enumC1645c4;
        EnumC1645c enumC1645c5 = new EnumC1645c("MINUTES", 4, TimeUnit.MINUTES);
        f18320s = enumC1645c5;
        EnumC1645c enumC1645c6 = new EnumC1645c("HOURS", 5, TimeUnit.HOURS);
        f18321t = enumC1645c6;
        EnumC1645c enumC1645c7 = new EnumC1645c("DAYS", 6, TimeUnit.DAYS);
        f18322u = enumC1645c7;
        EnumC1645c[] enumC1645cArr = {enumC1645c, enumC1645c2, enumC1645c3, enumC1645c4, enumC1645c5, enumC1645c6, enumC1645c7};
        f18323v = enumC1645cArr;
        AbstractC1267a.u(enumC1645cArr);
    }

    public EnumC1645c(String str, int i7, TimeUnit timeUnit) {
        this.f18324o = timeUnit;
    }

    public static EnumC1645c valueOf(String str) {
        return (EnumC1645c) Enum.valueOf(EnumC1645c.class, str);
    }

    public static EnumC1645c[] values() {
        return (EnumC1645c[]) f18323v.clone();
    }
}
