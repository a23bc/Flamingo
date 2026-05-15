package g;

import a.AbstractC0509a;
import android.os.Build;
import android.os.Bundle;
import d.C0757j;
import java.util.LinkedHashMap;
import java.util.Objects;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: g.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0938e extends M3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0757j f12255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0509a f12257e;

    public C0938e(C0757j c0757j, String str, AbstractC0509a abstractC0509a) {
        this.f12255c = c0757j;
        this.f12256d = str;
        this.f12257e = abstractC0509a;
    }

    public final void k0() {
        Object parcelable;
        Integer num;
        C0757j c0757j = this.f12255c;
        c0757j.getClass();
        String str = this.f12256d;
        AbstractC1209k.f(str, "key");
        if (!c0757j.f10771d.contains(str) && (num = (Integer) c0757j.f10769b.remove(str)) != null) {
            c0757j.f10768a.remove(num);
        }
        c0757j.f10772e.remove(str);
        LinkedHashMap linkedHashMap = c0757j.f10773f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = c0757j.f10774g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = B1.c.a(str, bundle);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0934a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Objects.toString((C0934a) parcelable);
            bundle.remove(str);
        }
        if (c0757j.f10770c.get(str) != null) {
            throw new ClassCastException();
        }
    }
}
