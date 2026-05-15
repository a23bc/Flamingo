package x1;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f19907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f19908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19909c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f19907a = colorStateList;
        this.f19908b = configuration;
        this.f19909c = theme == null ? 0 : theme.hashCode();
    }
}
