package V1;

import T1.u;
import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f7391a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile b f7392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f7393c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f7393c;
        return cls != null ? new u(cls, charSequence) : super.newEditable(charSequence);
    }
}
