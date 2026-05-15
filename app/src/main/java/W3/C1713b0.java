package w3;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import x3.C1903E;
import x3.C1911M;

/* JADX INFO: renamed from: w3.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1713b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1903E f19140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x3.m0 f19141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1911M f19142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f19143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f19144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19146g;
    public final Bundle h;

    public C1713b0() {
        this.f19140a = null;
        this.f19141b = null;
        this.f19142c = null;
        this.f19143d = Collections.EMPTY_LIST;
        this.f19144e = null;
        this.f19145f = 0;
        this.f19146g = 0;
        this.h = Bundle.EMPTY;
    }

    public C1713b0(C1903E c1903e, x3.m0 m0Var, C1911M c1911m, List list, CharSequence charSequence, int i7, int i8, Bundle bundle) {
        this.f19140a = c1903e;
        this.f19141b = m0Var;
        this.f19142c = c1911m;
        list.getClass();
        this.f19143d = list;
        this.f19144e = charSequence;
        this.f19145f = i7;
        this.f19146g = i8;
        this.h = bundle == null ? Bundle.EMPTY : bundle;
    }

    public C1713b0(C1713b0 c1713b0) {
        this.f19140a = c1713b0.f19140a;
        this.f19141b = c1713b0.f19141b;
        this.f19142c = c1713b0.f19142c;
        this.f19143d = c1713b0.f19143d;
        this.f19144e = c1713b0.f19144e;
        this.f19145f = c1713b0.f19145f;
        this.f19146g = c1713b0.f19146g;
        this.h = c1713b0.h;
    }
}
