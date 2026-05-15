package X;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassifier;
import f0.C0879c;
import f0.C0894j0;
import i1.AbstractC1061d;
import i1.C1058a;
import i1.C1059b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: X.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0505y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5.i f8205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f8207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1059b f8208d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextClassifier f8210f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E5.d f8209e = new E5.d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0894j0 f8211g = C0879c.t(null);
    public final Object h = new Object();

    public C0505y(c5.i iVar, Context context, C c7, C1059b c1059b) {
        this.f8205a = iVar;
        this.f8206b = context;
        this.f8207c = c7;
        this.f8208d = c1059b;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(X.C0505y r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, e5.AbstractC0865c r21) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0505y.a(X.y, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, e5.c):java.lang.Object");
    }

    public final LocaleList b() {
        C1059b c1059b = this.f8208d;
        if (c1059b == null) {
            T1.x.m();
            return T1.x.e(new Locale[]{AbstractC1061d.f13292a.s().b().f13288a});
        }
        ArrayList arrayList = new ArrayList(Z4.p.j0(c1059b));
        Iterator it = c1059b.f13290o.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1058a) it.next()).f13288a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return T1.x.e((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
