package b6;

import android.net.Uri;
import m5.AbstractC1209k;
import m5.C1220v;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements l5.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1220v f10427o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1220v f10428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1220v f10429q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1220v f10430r;

    public /* synthetic */ j(C1220v c1220v, C1220v c1220v2, C1220v c1220v3, C1220v c1220v4) {
        this.f10427o = c1220v;
        this.f10428p = c1220v2;
        this.f10429q = c1220v3;
        this.f10430r = c1220v4;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        Uri uri = (Uri) obj4;
        C1220v c1220v = this.f10427o;
        AbstractC1209k.f(c1220v, "$title");
        C1220v c1220v2 = this.f10428p;
        AbstractC1209k.f(c1220v2, "$artist");
        C1220v c1220v3 = this.f10429q;
        AbstractC1209k.f(c1220v3, "$album");
        C1220v c1220v4 = this.f10430r;
        AbstractC1209k.f(c1220v4, "$artworkUri");
        AbstractC1209k.f(str, "titleBack");
        if (str.equals("<unknown>")) {
            str = null;
        }
        if (str == null) {
            str = "Unknown Work";
        }
        c1220v.f14439o = str;
        if (AbstractC1209k.a(str2, "<unknown>")) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "Unknown Artist";
        }
        c1220v2.f14439o = str2;
        if (AbstractC1209k.a(str3, "<unknown>")) {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "Unknown Album";
        }
        c1220v3.f14439o = str3;
        c1220v4.f14439o = uri;
        return Y4.o.f8736a;
    }
}
