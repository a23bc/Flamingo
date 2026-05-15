package u5;

import Z4.A;
import j5.AbstractC1107a;
import java.util.List;
import java.util.regex.Matcher;
import m5.AbstractC1209k;
import r5.C1423d;

/* JADX INFO: renamed from: u5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1541c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f17319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A f17321c;

    public C1541c(Matcher matcher, String str) {
        AbstractC1209k.f(str, "input");
        this.f17319a = matcher;
        this.f17320b = str;
    }

    public final List a() {
        if (this.f17321c == null) {
            this.f17321c = new A(this);
        }
        A a4 = this.f17321c;
        AbstractC1209k.c(a4);
        return a4;
    }

    public final C1423d b() {
        Matcher matcher = this.f17319a;
        return i6.h.M(matcher.start(), matcher.end());
    }

    public final C1541c c() {
        Matcher matcher = this.f17319a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        String str = this.f17320b;
        if (iEnd > str.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(str);
        AbstractC1209k.e(matcher2, "matcher(...)");
        return AbstractC1107a.i(matcher2, iEnd, str);
    }
}
